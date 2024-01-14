package rs.raf.pds.v5.z2;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import rs.raf.pds.v5.z2.gRPC.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class StockExchangeGRPCServer extends StockExchangeServiceGrpc.StockExchangeServiceImplBase {

	private List<StockData> stockDataList;
	private List<StockData> dummyStockDataList;
	private List<List<StockData>> history;
    private List<OrderData> buyOrders;
    private List<OrderData> sellOrders;
    private List<Trade> tradeList;
    private Map<String, Socket> clientSockets = new ConcurrentHashMap<>();
    private Map<String, Integer> userPortfolios;
    private Map<Socket, Set<String>> clientStockSelections = new HashMap<>();
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final long INTERVAL_DURATION = 1 * 300 * 1000;
    private static long lastUpdateTimestamp = 0L;
    private int currentHour = 8;
    LocalDateTime currentDate = LocalDateTime.now();
    private Timer updateTimer;	//keep dummyStockDataLists price and price change updated constantly
    							//mora da se namesti da korisnik bira kompanije za upadte preko tcpa
    public StockExchangeGRPCServer() {
    	updateTimer = new Timer();
    	String temp = currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        stockDataList = new ArrayList<>();
        stockDataList.add(createStockData("AAPL", "Apple Inc.", 181.91, -2.34, temp,currentHour));
        stockDataList.add(createStockData("MSFT", "Microsoft Corporation", 367.94, -2.66, temp,currentHour));
        stockDataList.add(createStockData("NVDA", "NVIDIA", 479.98, 4.29, temp,currentHour));
        stockDataList.add(createStockData("META", "Meta Platforms, Inc.", 347.12, 2.65, temp,currentHour));
        stockDataList.add(createStockData("AMZN", "Amazon.com", 144.57, -3.90, temp,currentHour));
        stockDataList.add(createStockData("GOOGL", "Alphabet Inc.", 136.39, -2.53, temp,currentHour));
        stockDataList.add(createStockData("JPM", "JP Morgan Chase & Co.", 171.41, 0.08, temp,currentHour));
        stockDataList.add(createStockData("TSLA", "Tesla, Inc.", 237.93, -0.52, temp,currentHour));
        stockDataList.add(createStockData("V", "Visa Inc.", 259.61, 1.63, temp,currentHour));
        stockDataList.add(createStockData("ORCL", "Oracle Corporation", 102.59, 0.13, temp,currentHour));
        dummyStockDataList = new ArrayList<>();
        for(StockData ord : stockDataList) {
        	dummyStockDataList.add(ord);
        }
        buyOrders = new ArrayList<>();
        sellOrders = new ArrayList<>();
        tradeList = new ArrayList<>();
        history = new ArrayList<>();
        history.add(new ArrayList<>(dummyStockDataList));
        clientSockets = new ConcurrentHashMap<>();
        userPortfolios = new ConcurrentHashMap<>();
        updateTimer.scheduleAtFixedRate(new UpdateTask(), INTERVAL_DURATION, INTERVAL_DURATION);
        }
    
    private void updateDummy() {
    	
    	for(int i=0;i<stockDataList.size();i++) {
    		
    		double stock_diff = stockDataList.get(i).getCurrentPrice()-dummyStockDataList.get(i).getCurrentPrice();
        	String symbol = stockDataList.get(i).getSymbol();
        	String name = stockDataList.get(i).getCompanyName();
        	double newPrice = stockDataList.get(i).getCurrentPrice();
        	String date = currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    		dummyStockDataList.set(i,createStockData(symbol,name,newPrice,stock_diff,date,currentHour));
    		stockDataList.set(i,createStockData(symbol,name,newPrice,stock_diff,date,currentHour));
        }
    	history.add(new ArrayList<>(dummyStockDataList));
    }
    
    private void processPendingUpdates() {
        System.out.println("UPDATING...");

        synchronized (stockDataList) {
            for (int i = 0; i < stockDataList.size(); i++) {
                double stock_diff = stockDataList.get(i).getCurrentPrice() - dummyStockDataList.get(i).getCurrentPrice();
                String symbol = stockDataList.get(i).getSymbol();
                String name = stockDataList.get(i).getCompanyName();
                double newPrice = stockDataList.get(i).getCurrentPrice();
                String date = currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                // Use set method to update the stock element
                dummyStockDataList.set(i, createStockData(symbol, name, newPrice, stock_diff, date, currentHour));
                stockDataList.set(i, createStockData(symbol, name, newPrice, stock_diff, date, currentHour));
            }
        }
        history.add(new ArrayList<>(dummyStockDataList));
    }
    
    private class UpdateTask extends TimerTask {
        @Override
        public void run() {
            currentHour = (currentHour + 1) % 18;
            if(currentHour<8) currentHour = 8;
            if (currentHour == 18) {
                currentDate = currentDate.plusDays(1);
                currentHour = 8;
            }
                processPendingUpdates();
        }
    }
    
    @Override
    public void getTradeList(TradeListRequest request, StreamObserver<TradeList> responseObserver) {
        String symbol = request.getSymbol();
        String date = request.getDate();

        TradeList.Builder tradeListBuilder = TradeList.newBuilder();
        List<Trade> filteredTrades = tradeList.stream()
                .filter(trade -> trade.getSymbol().equals(symbol) && trade.getDate().equals(date))
                .collect(Collectors.toList());

        tradeListBuilder.addAllTrades(filteredTrades);

        responseObserver.onNext(tradeListBuilder.build());
        responseObserver.onCompleted();
    }
    
    private void notifyStockPriceChange(String symbol, double newPrice, double priceChange) {
        String stockUpdate;
        String change = String.format("%.2f",priceChange);
        String np = String.format("%.2f",newPrice);
        if (priceChange > 0)
            stockUpdate = symbol + " " + np + " " + ANSI_GREEN + "↑+" + change + ANSI_RESET;
        else
            stockUpdate = symbol + " " + np + " " + ANSI_RED + "↓" + change + ANSI_RESET;

        for (Map.Entry<Socket, Set<String>> entry : clientStockSelections.entrySet()) {
            Socket clientSocket = entry.getKey();
            Set<String> selectedStocks = entry.getValue();

            if (selectedStocks.contains(symbol)) {
                try {
                    PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                    writer.println(stockUpdate);           
                    //clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    
    private void saveTradesToFile(List<Trade> trades) {
        String fileName = "trades_log.txt";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            for (Trade trade : trades) {
                String timestamp = LocalDateTime.now().format(formatter);
                String logEntry = String.format("[%s] Symbol: %s, Price: %.2f, Quantity: %d, Buyer: %s, Seller: %s",
                        timestamp, trade.getSymbol(), trade.getPrice(), trade.getQuantity(),
                        trade.getBuyerClientId(), trade.getSellerClientId());

                writer.write(logEntry);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
  //temp method
    private void notifyClientsInTrade(Trade trade) {
        String buyerClientId = trade.getBuyerClientId();
        String sellerClientId = trade.getSellerClientId();
        String buyerNotification = String.format("Congratulations! Your buy order for %d shares of %s at $%.2f was successful.",
                trade.getQuantity(), trade.getSymbol(), trade.getPrice());

        String sellerNotification = String.format("Congratulations! Your sell order for %d shares of %s at $%.2f was successful.",
                trade.getQuantity(), trade.getSymbol(), trade.getPrice());

        notifyClient(buyerClientId, buyerNotification);
        notifyClient(sellerClientId, sellerNotification);
    }
    
    private void handleTrade(Trade trade) {
        tradeList.add(trade);
        NotifyAllClients(trade);
        //notifyStockPriceChange(trade.getSymbol(), trade.getPrice(), trade.getQuantity());
        //removeOrder(trade.getBuyerClientId(), trade.getSymbol(), trade.getPrice(), trade.getQuantity(), true);
        //removeOrder(trade.getSellerClientId(), trade.getSymbol(), trade.getPrice(), trade.getQuantity(), false);
        updateUserPortfolio(trade.getBuyerClientId(), trade.getSymbol(), trade.getQuantity(), true);
        updateUserPortfolio(trade.getSellerClientId(), trade.getSymbol(), trade.getQuantity(), false);
        notifyClientsInTrade(trade);
        
        saveTradesToFile(Collections.singletonList(trade));
    }

    private void removeOrder(String clientId, String symbol, double price, int quantity, boolean isBuyOrder) {
        List<OrderData> orders = isBuyOrder ? buyOrders : sellOrders;
        orders.removeIf(order -> {
            boolean shouldRemove = order.getClientId().equals(clientId)
                    && order.getSymbol().equals(symbol)
                    && order.getPrice() == price
                    && order.getQuantity() == quantity;
            if (shouldRemove) {
                System.out.println("Removed order - Symbol: " + symbol + ", Price: " + price + ", Quantity: " + quantity);
            }
            return shouldRemove;
        });
    }
    @Override
    public void getClientPortfolio(ClientPortfolioRequest request, StreamObserver<ClientPortfolio> responseObserver) {
        String clientId = request.getClientId();
        List<ClientStock> portfolioItems = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : userPortfolios.entrySet()) {
            String entryClientId = entry.getKey().substring(0, clientId.length());

            if (entryClientId.equals(clientId)) {
                String symbol = entry.getKey().substring(clientId.length());
                int quantity = entry.getValue();
                ClientStock clientStock = ClientStock.newBuilder()
                        .setSymbol(symbol)
                        .setQuantity(quantity)
                        .build();
                portfolioItems.add(clientStock);
            }
        }
        ClientPortfolio portfolio = ClientPortfolio.newBuilder()
                .setClientId(clientId)
                .addAllStocks(portfolioItems)
                .build();
        responseObserver.onNext(portfolio);
        responseObserver.onCompleted();
    }
    
    private void updateUserPortfolio(String clientId, String symbol, int quantity, boolean isBuyOrder) {
        
        int currentQuantity = userPortfolios.getOrDefault(clientId + symbol, 0);

        if (isBuyOrder) {
            userPortfolios.put(clientId + symbol, currentQuantity + quantity);
        } else {
            userPortfolios.put(clientId + symbol, currentQuantity - quantity);
        }
    }
    
    private void NotifyAllClients(Trade trade) {
        String notification = String.format("User %s bought %d shares of %s at $%.2f",// from User %s",
                trade.getBuyerClientId(), trade.getQuantity(), trade.getSymbol(), trade.getPrice());//, trade.getSellerClientId());

        for (Socket clientSocket : clientSockets.values()) {
            try {
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                writer.println(notification);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void notifyClient(String clientId, String notification) {
        Socket clientSocket = clientSockets.get(clientId);
        if (clientSocket != null) {
            try {
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                writer.println(notification);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void getStockData(Empty request, StreamObserver<StockDataList> responseObserver) {
        StockDataList.Builder stockDataListBuilder = StockDataList.newBuilder();

        for (StockData stockData : stockDataList) {
            StockData dummyStockData = dummyStockDataList.stream()
                    .filter(dummyData -> dummyData.getSymbol().equals(stockData.getSymbol()))
                    .findFirst()
                    .orElse(null);
            double updatedPriceChange;
           if(history.size()>1) updatedPriceChange = stockData.getPriceChange();
           else updatedPriceChange = stockData.getPriceChange();
            StockData updatedStockData = stockData.toBuilder()
                    .setPriceChange(updatedPriceChange)
                    .build();

            stockDataListBuilder.addStocks(updatedStockData);
        }
        responseObserver.onNext(stockDataListBuilder.build());
        responseObserver.onCompleted();
    }
    
    @Override
    public void getStockDataByDateTime(StockDataByDateTimeRequest request, StreamObserver<StockDataList> responseObserver) {
        String date = request.getDate();
        int hour = request.getHour();

        Optional<List<StockData>> matchingStockDataList = history.stream()
                .filter(stockDataList -> !stockDataList.isEmpty() && 
                        stockDataList.get(0).getDate().equals(date) && stockDataList.get(0).getHour() == hour)
                .findFirst();

        matchingStockDataList.ifPresent(stockDataList -> 
                responseObserver.onNext(StockDataList.newBuilder().addAllStocks(stockDataList).build()));

        responseObserver.onCompleted();
    }
    @Override
    public void getAskList(AskListRequest request, StreamObserver<AskList> responseObserver) {
        String symbol = request.getSymbol();
        int numberOfOffers = request.getNumberOfOffers();

        AskList.Builder askListBuilder = AskList.newBuilder();
        List<OrderData> filteredSellOrders = sellOrders.stream()
                .filter(order -> order.getSymbol().equals(symbol))
                .limit(numberOfOffers)
                .collect(Collectors.toList());

        for (OrderData orderData : filteredSellOrders) {
            AskData askData = createAskData(orderData.getSymbol(), orderData.getPrice(), orderData.getQuantity());
            askListBuilder.addAsks(askData);
        }
        responseObserver.onNext(askListBuilder.build());
        responseObserver.onCompleted();
    }
    @Override
    public void getBidList(BidListRequest request, StreamObserver<BidList> responseObserver) {
        String symbol = request.getSymbol();
        int numberOfOffers = request.getNumberOfOffers();
        BidList.Builder bidListBuilder = BidList.newBuilder();
        List<OrderData> filteredBuyOrders = buyOrders.stream()
                .filter(order -> order.getSymbol().equals(symbol))
                .limit(numberOfOffers)
                .collect(Collectors.toList());
        for (OrderData orderData : filteredBuyOrders) {
            BidData bidData = createBidData(orderData.getSymbol(), orderData.getPrice(), orderData.getQuantity());
            bidListBuilder.addBids(bidData);
        }
        responseObserver.onNext(bidListBuilder.build());
        responseObserver.onCompleted();
    }
    @Override
    public void submitOrder(OrderRequest request, StreamObserver<OrderResponse> responseObserver) {
        OrderData orderData = request.getOrder();
        String symbol = orderData.getSymbol();
        double price = orderData.getPrice();
        int quantity = orderData.getQuantity();
        boolean isBuyOrder = orderData.getIsBuyOrder();
        boolean orderSuccess = true;
        String clientId = orderData.getClientId();
        double newPrice = price;
        if (isBuyOrder) {
        	buyOrders.add(orderData);
        	try {
				updateStockPriceForBuyOrder(orderData);
			} catch (Exception e) {
				e.printStackTrace();
			}
        } else {
        	sellOrders.add(orderData);
        	try {
				updateStockPriceForSellOrder(orderData);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        Collections.sort(buyOrders, Comparator.comparingDouble(OrderData::getPrice).reversed());
        Collections.sort(sellOrders, Comparator.comparingDouble(OrderData::getPrice));
        responseObserver.onNext(OrderResponse.newBuilder().setSuccess(orderSuccess).build());
        responseObserver.onCompleted();
    }
    
    private StockData createStockData(String symbol, String companyName, double currentPrice, double priceChange, String date, int hour) {
        return StockData.newBuilder()
                .setSymbol(symbol)
                .setCompanyName(companyName)
                .setCurrentPrice(currentPrice)
                .setPriceChange(priceChange)
                .setDate(date)
                .setHour(hour)
                .build();
    }
    private AskData createAskData(String symbol, double askPrice, int availableShares) {
        return AskData.newBuilder()
                .setSymbol(symbol)
                .setAskPrice(askPrice)
                .setAvailableShares(availableShares)
                .build();
    }
    private BidData createBidData(String symbol, double bidPrice, int requestedShares) {
        return BidData.newBuilder()
                .setSymbol(symbol)
                .setBidPrice(bidPrice)
                .setRequestedShares(requestedShares)
                .build();
    }
    
    private void initializeDummyPortfolio(String clientId) {
        for (int i = 0; i < 20; i++) {
            String symbol = "AAPL";
            int quantity = 1; 
            updateUserPortfolio(clientId, symbol, quantity, true);
        }
    }
  
    
    private void handleSocketClient(Socket clientSocket) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {
            
        	String userId = reader.readLine();
            clientSockets.put(userId, clientSocket);
            initializeDummyPortfolio(userId);
            
            
            String symbols = "";
            for(StockData sd : stockDataList) {
            	symbols+=sd.getSymbol()+"~";
            }
              
            writer.println("Enter the symbols of stocks you want to track (comma-separated):~"+symbols+"~Example usage:*(symbol_1,symbol_2,...symbol_n)*");
            String selectedStocks = reader.readLine();
            List<String> selected = new ArrayList<>();
            List<String> validSymbols = Arrays.asList(symbols.split("~"));
            for(String sel : selectedStocks.split(",")) {
            	String trimmedSymbol = sel.trim().toUpperCase();
            	if (validSymbols.contains(trimmedSymbol)) {
            		selected.add(sel.trim().toUpperCase());
            	 } else {
            	        writer.println("Invalid symbol: " + trimmedSymbol);
            	    }
            }
            clientStockSelections.put(clientSocket, new HashSet<>(selected));

            writer.println("You are now tracking: " + selectedStocks);
            

            while (true) {
                if (clientSocket.isClosed()) {
                    System.out.println("Client disconnected: " + clientSocket.getInetAddress() + " User: " + userId);
                    clientSockets.remove(userId);
                    break;
                }
                
                Thread.sleep(1000);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
   
    
    private void updateStockPriceForBuyOrder(OrderData orderData) throws Exception {
    	String symbol = orderData.getSymbol();
    	double orderPrice = orderData.getPrice();
    	int quantity = orderData.getQuantity();
    	String buyerClientId = orderData.getClientId();
    	
    	StockData stockData = getStockDataBySymbol(symbol);
        if (stockData != null) {
            double currentPrice = stockData.getCurrentPrice();
            double newPrice = currentPrice + ((orderPrice-currentPrice) * quantity) / 100.0; //new price sample function
            String np = String.format("%.2f", newPrice);
            newPrice = Double.parseDouble(np);
            double priceChange = newPrice - currentPrice;
            updateStockData(symbol, newPrice, priceChange);

            notifyStockPriceChange(symbol, newPrice,priceChange);
            checkAndCreateTrades(orderData);
        }
        else {
        	throw new Exception();
        }
    }
    private void updateStockPriceForSellOrder(OrderData orderData) throws Exception {
    	String symbol = orderData.getSymbol();
    	double orderPrice = orderData.getPrice();
    	int quantity = orderData.getQuantity();
    	String buyerClientId = orderData.getClientId();
    	
        StockData stockData = getStockDataBySymbol(symbol);
        if (stockData != null) {
            double currentPrice = stockData.getCurrentPrice();
            double newPrice = currentPrice - ((orderPrice-currentPrice) * quantity) / 100.0;
            String np = String.format("%.2f", newPrice);
            newPrice = Double.parseDouble(np);
            
            double priceChange = newPrice - currentPrice;
            updateStockData(symbol, newPrice, priceChange);
            notifyStockPriceChange(symbol, newPrice,priceChange);
            checkAndCreateTrades(orderData);
        }
        else {
        	throw new Exception();
        }
    }
    
    
    private void updateOrderQuantity(List<OrderData> orders, OrderData orderToUpdate, int newQuantity) {
        // Find the index of the order to update
        int index = orders.indexOf(orderToUpdate);

        if (index != -1) {
            OrderData updatedOrder = OrderData.newBuilder(orderToUpdate)
                                              .setQuantity(newQuantity)
                                              .build();
            orders.set(index, updatedOrder);
        }
    }
    
    //Само Бог и ја сада знамо како ради ова метода. Нажалост, ја имам проблема са памћењем
    private void checkAndCreateTrades(OrderData orderData) {
        String symbol = orderData.getSymbol();
        double orderPrice = orderData.getPrice();
        int quantity = orderData.getQuantity();
        boolean isBuyOrder = orderData.getIsBuyOrder();
        String clientId = orderData.getClientId();

        List<OrderData> matchingOrders = isBuyOrder ? sellOrders : buyOrders;
        List<OrderData> otherOrders = isBuyOrder ? buyOrders : sellOrders;

        if (quantity <= 0) {
            return;
        }

        Iterator<OrderData> matchingOrderIterator = matchingOrders.iterator();
        while (matchingOrderIterator.hasNext()) {
            OrderData matchingOrder = matchingOrderIterator.next();

            if (matchingOrder.getSymbol().equals(symbol) && matchingOrder.getPrice() == orderPrice) {
                int availableQuantity = matchingOrder.getQuantity();
                if (availableQuantity >= quantity) {
                    Trade trade = Trade.newBuilder()
                            .setSymbol(symbol)
                            .setPrice(orderPrice)
                            .setQuantity(quantity)
                            .setDate(currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                            .setBuyerClientId(isBuyOrder ? clientId : matchingOrder.getClientId())
                            .setSellerClientId(isBuyOrder ? matchingOrder.getClientId() : clientId)
                            .build();

                    handleTrade(trade);
                    int index = matchingOrders.indexOf(matchingOrder);
                    updateOrderQuantity(matchingOrders, matchingOrder, availableQuantity - quantity);
                    matchingOrder = matchingOrders.get(index);
                    System.out.println(availableQuantity - quantity + " " + matchingOrder.getQuantity());
                    if (matchingOrder.getQuantity() == 0) {
                        matchingOrderIterator.remove();
                    }

                    removeOrder(clientId, trade.getSymbol(), trade.getPrice(), trade.getQuantity(), isBuyOrder);

                    break;
                } else {
                    Trade trade = Trade.newBuilder()
                            .setSymbol(symbol)
                            .setPrice(orderPrice)
                            .setQuantity(availableQuantity)
                            .setDate(currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                            .setBuyerClientId(isBuyOrder ? clientId : matchingOrder.getClientId())
                            .setSellerClientId(isBuyOrder ? matchingOrder.getClientId() : clientId)
                            .build();
                    handleTrade(trade);

                    matchingOrderIterator.remove();

                    int index = otherOrders.indexOf(orderData);
                    updateOrderQuantity(otherOrders, orderData, quantity - availableQuantity);
                    orderData = otherOrders.get(index);

                    checkAndCreateTrades(orderData);
                    break;
                }
            }
        }
    }
    
    private StockData getStockDataBySymbol(String symbol) {
        return stockDataList.stream()
                .filter(stockData -> stockData.getSymbol().equals(symbol))
                .findFirst()
                .orElse(null);
    }

    private void updateStockData(String symbol, double newPrice, double priceChange) {
        stockDataList.stream()
                .filter(stockData -> stockData.getSymbol().equals(symbol))
                .forEach(stockData -> {
                    StockData.Builder stockDataBuilder = stockData.toBuilder();
                    stockDataBuilder.setCurrentPrice(newPrice);
                    stockDataBuilder.setPriceChange(priceChange);
                    StockData updatedStockData = stockDataBuilder.build();
                    int index = stockDataList.indexOf(stockData);
                    if (index != -1) {
                        stockDataList.set(index, updatedStockData);
                    }
                });
    }
    
    
    public void sendTcpStockUpdates() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();

                // Check if the elapsed time since the last update is greater than INTERVAL_DURATION
                if (currentTimeMillis - lastUpdateTimestamp >= INTERVAL_DURATION) {
                    lastUpdateTimestamp = currentTimeMillis;

                    for (Map.Entry<Socket, Set<String>> entry : clientStockSelections.entrySet()) {
                        Socket clientSocket = entry.getKey();
                        Set<String> selectedStocks = entry.getValue();

                        try {
                            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                            StringBuilder updateMessage = new StringBuilder("Stock data periodical update:~");

                            for (StockData stockData : stockDataList) {//dummy se izlgeda prebrzo updatuje
                                if (selectedStocks.contains(stockData.getSymbol())) {
                                    StockData dummyStockData = dummyStockDataList.stream()
                                            .filter(dummyData -> dummyData.getSymbol().equals(stockData.getSymbol()))
                                            .findFirst()
                                            .orElse(null);
                                    double updatedPriceChange;
                                    if (history.size() > 1) {
                                        updatedPriceChange = stockData.getPriceChange();
                                    } else {
                                        updatedPriceChange = stockData.getPriceChange();
                                    }

                                    String color = updatedPriceChange > 0 ? ANSI_GREEN + "↑+" : ANSI_RED + "↓";
                                    String RESET = "\u001B[0m";
                                    String dataString = stockData.getSymbol() + " " + stockData.getCompanyName() + " " +
                                            " " + stockData.getCurrentPrice() + " " +
                                            color + String.format("%.2f", updatedPriceChange) + RESET +
                                            " " + stockData.getDate() + " " + stockData.getHour() + "h";

                                    updateMessage.append(dataString).append("~");
                                }
                            }
                            writer.println(updateMessage.toString());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }, 300000, 300000);
    }
    

    private void startSocketServer() {
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            System.out.println("Socket server started on port 8888");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket.getInetAddress());
                new Thread(() -> handleSocketClient(clientSocket)).start();
                sendTcpStockUpdates();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws IOException, InterruptedException {
        StockExchangeGRPCServer stockExchangeServer = new StockExchangeGRPCServer();
        Server server = ServerBuilder.forPort(7999).addService(stockExchangeServer).build();
        server.start();
        
        System.out.println("Stock Exchange gRPC Server started on port 7999");
        new Thread(stockExchangeServer::startSocketServer).start();

        server.awaitTermination();
    }
}