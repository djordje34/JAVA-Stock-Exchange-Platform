package rs.raf.pds.v5.z2.gRPC;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: stock_exchange.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StockExchangeServiceGrpc {

  private StockExchangeServiceGrpc() {}

  public static final String SERVICE_NAME = "StockExchangeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Empty,
      rs.raf.pds.v5.z2.gRPC.StockDataList> getGetStockDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStockData",
      requestType = rs.raf.pds.v5.z2.gRPC.Empty.class,
      responseType = rs.raf.pds.v5.z2.gRPC.StockDataList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Empty,
      rs.raf.pds.v5.z2.gRPC.StockDataList> getGetStockDataMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Empty, rs.raf.pds.v5.z2.gRPC.StockDataList> getGetStockDataMethod;
    if ((getGetStockDataMethod = StockExchangeServiceGrpc.getGetStockDataMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getGetStockDataMethod = StockExchangeServiceGrpc.getGetStockDataMethod) == null) {
          StockExchangeServiceGrpc.getGetStockDataMethod = getGetStockDataMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.Empty, rs.raf.pds.v5.z2.gRPC.StockDataList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStockData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.StockDataList.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("GetStockData"))
              .build();
        }
      }
    }
    return getGetStockDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.AskListRequest,
      rs.raf.pds.v5.z2.gRPC.AskList> getGetAskListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAskList",
      requestType = rs.raf.pds.v5.z2.gRPC.AskListRequest.class,
      responseType = rs.raf.pds.v5.z2.gRPC.AskList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.AskListRequest,
      rs.raf.pds.v5.z2.gRPC.AskList> getGetAskListMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.AskListRequest, rs.raf.pds.v5.z2.gRPC.AskList> getGetAskListMethod;
    if ((getGetAskListMethod = StockExchangeServiceGrpc.getGetAskListMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getGetAskListMethod = StockExchangeServiceGrpc.getGetAskListMethod) == null) {
          StockExchangeServiceGrpc.getGetAskListMethod = getGetAskListMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.AskListRequest, rs.raf.pds.v5.z2.gRPC.AskList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAskList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.AskListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.AskList.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("GetAskList"))
              .build();
        }
      }
    }
    return getGetAskListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.BidListRequest,
      rs.raf.pds.v5.z2.gRPC.BidList> getGetBidListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBidList",
      requestType = rs.raf.pds.v5.z2.gRPC.BidListRequest.class,
      responseType = rs.raf.pds.v5.z2.gRPC.BidList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.BidListRequest,
      rs.raf.pds.v5.z2.gRPC.BidList> getGetBidListMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.BidListRequest, rs.raf.pds.v5.z2.gRPC.BidList> getGetBidListMethod;
    if ((getGetBidListMethod = StockExchangeServiceGrpc.getGetBidListMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getGetBidListMethod = StockExchangeServiceGrpc.getGetBidListMethod) == null) {
          StockExchangeServiceGrpc.getGetBidListMethod = getGetBidListMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.BidListRequest, rs.raf.pds.v5.z2.gRPC.BidList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBidList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.BidListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.BidList.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("GetBidList"))
              .build();
        }
      }
    }
    return getGetBidListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.OrderRequest,
      rs.raf.pds.v5.z2.gRPC.OrderResponse> getSubmitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitOrder",
      requestType = rs.raf.pds.v5.z2.gRPC.OrderRequest.class,
      responseType = rs.raf.pds.v5.z2.gRPC.OrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.OrderRequest,
      rs.raf.pds.v5.z2.gRPC.OrderResponse> getSubmitOrderMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.OrderRequest, rs.raf.pds.v5.z2.gRPC.OrderResponse> getSubmitOrderMethod;
    if ((getSubmitOrderMethod = StockExchangeServiceGrpc.getSubmitOrderMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getSubmitOrderMethod = StockExchangeServiceGrpc.getSubmitOrderMethod) == null) {
          StockExchangeServiceGrpc.getSubmitOrderMethod = getSubmitOrderMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.OrderRequest, rs.raf.pds.v5.z2.gRPC.OrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.OrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.OrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("SubmitOrder"))
              .build();
        }
      }
    }
    return getSubmitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.TradeListRequest,
      rs.raf.pds.v5.z2.gRPC.TradeList> getGetTradeListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTradeList",
      requestType = rs.raf.pds.v5.z2.gRPC.TradeListRequest.class,
      responseType = rs.raf.pds.v5.z2.gRPC.TradeList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.TradeListRequest,
      rs.raf.pds.v5.z2.gRPC.TradeList> getGetTradeListMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.TradeListRequest, rs.raf.pds.v5.z2.gRPC.TradeList> getGetTradeListMethod;
    if ((getGetTradeListMethod = StockExchangeServiceGrpc.getGetTradeListMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getGetTradeListMethod = StockExchangeServiceGrpc.getGetTradeListMethod) == null) {
          StockExchangeServiceGrpc.getGetTradeListMethod = getGetTradeListMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.TradeListRequest, rs.raf.pds.v5.z2.gRPC.TradeList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTradeList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.TradeListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.TradeList.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("GetTradeList"))
              .build();
        }
      }
    }
    return getGetTradeListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.ClientPortfolioRequest,
      rs.raf.pds.v5.z2.gRPC.ClientPortfolio> getGetClientPortfolioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClientPortfolio",
      requestType = rs.raf.pds.v5.z2.gRPC.ClientPortfolioRequest.class,
      responseType = rs.raf.pds.v5.z2.gRPC.ClientPortfolio.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.ClientPortfolioRequest,
      rs.raf.pds.v5.z2.gRPC.ClientPortfolio> getGetClientPortfolioMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.ClientPortfolioRequest, rs.raf.pds.v5.z2.gRPC.ClientPortfolio> getGetClientPortfolioMethod;
    if ((getGetClientPortfolioMethod = StockExchangeServiceGrpc.getGetClientPortfolioMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getGetClientPortfolioMethod = StockExchangeServiceGrpc.getGetClientPortfolioMethod) == null) {
          StockExchangeServiceGrpc.getGetClientPortfolioMethod = getGetClientPortfolioMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.ClientPortfolioRequest, rs.raf.pds.v5.z2.gRPC.ClientPortfolio>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetClientPortfolio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.ClientPortfolioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.ClientPortfolio.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("GetClientPortfolio"))
              .build();
        }
      }
    }
    return getGetClientPortfolioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Trade,
      rs.raf.pds.v5.z2.gRPC.Empty> getNotifyTradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NotifyTrade",
      requestType = rs.raf.pds.v5.z2.gRPC.Trade.class,
      responseType = rs.raf.pds.v5.z2.gRPC.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Trade,
      rs.raf.pds.v5.z2.gRPC.Empty> getNotifyTradeMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Trade, rs.raf.pds.v5.z2.gRPC.Empty> getNotifyTradeMethod;
    if ((getNotifyTradeMethod = StockExchangeServiceGrpc.getNotifyTradeMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getNotifyTradeMethod = StockExchangeServiceGrpc.getNotifyTradeMethod) == null) {
          StockExchangeServiceGrpc.getNotifyTradeMethod = getNotifyTradeMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.Trade, rs.raf.pds.v5.z2.gRPC.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NotifyTrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.Trade.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("NotifyTrade"))
              .build();
        }
      }
    }
    return getNotifyTradeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Empty,
      rs.raf.pds.v5.z2.gRPC.Trade> getSubscribeToTradeUpdatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "subscribeToTradeUpdates",
      requestType = rs.raf.pds.v5.z2.gRPC.Empty.class,
      responseType = rs.raf.pds.v5.z2.gRPC.Trade.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Empty,
      rs.raf.pds.v5.z2.gRPC.Trade> getSubscribeToTradeUpdatesMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.Empty, rs.raf.pds.v5.z2.gRPC.Trade> getSubscribeToTradeUpdatesMethod;
    if ((getSubscribeToTradeUpdatesMethod = StockExchangeServiceGrpc.getSubscribeToTradeUpdatesMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getSubscribeToTradeUpdatesMethod = StockExchangeServiceGrpc.getSubscribeToTradeUpdatesMethod) == null) {
          StockExchangeServiceGrpc.getSubscribeToTradeUpdatesMethod = getSubscribeToTradeUpdatesMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.Empty, rs.raf.pds.v5.z2.gRPC.Trade>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "subscribeToTradeUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.Trade.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("subscribeToTradeUpdates"))
              .build();
        }
      }
    }
    return getSubscribeToTradeUpdatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.StockDataByDateTimeRequest,
      rs.raf.pds.v5.z2.gRPC.StockDataList> getGetStockDataByDateTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStockDataByDateTime",
      requestType = rs.raf.pds.v5.z2.gRPC.StockDataByDateTimeRequest.class,
      responseType = rs.raf.pds.v5.z2.gRPC.StockDataList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.StockDataByDateTimeRequest,
      rs.raf.pds.v5.z2.gRPC.StockDataList> getGetStockDataByDateTimeMethod() {
    io.grpc.MethodDescriptor<rs.raf.pds.v5.z2.gRPC.StockDataByDateTimeRequest, rs.raf.pds.v5.z2.gRPC.StockDataList> getGetStockDataByDateTimeMethod;
    if ((getGetStockDataByDateTimeMethod = StockExchangeServiceGrpc.getGetStockDataByDateTimeMethod) == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        if ((getGetStockDataByDateTimeMethod = StockExchangeServiceGrpc.getGetStockDataByDateTimeMethod) == null) {
          StockExchangeServiceGrpc.getGetStockDataByDateTimeMethod = getGetStockDataByDateTimeMethod =
              io.grpc.MethodDescriptor.<rs.raf.pds.v5.z2.gRPC.StockDataByDateTimeRequest, rs.raf.pds.v5.z2.gRPC.StockDataList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStockDataByDateTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.StockDataByDateTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rs.raf.pds.v5.z2.gRPC.StockDataList.getDefaultInstance()))
              .setSchemaDescriptor(new StockExchangeServiceMethodDescriptorSupplier("GetStockDataByDateTime"))
              .build();
        }
      }
    }
    return getGetStockDataByDateTimeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StockExchangeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StockExchangeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StockExchangeServiceStub>() {
        @java.lang.Override
        public StockExchangeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StockExchangeServiceStub(channel, callOptions);
        }
      };
    return StockExchangeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StockExchangeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StockExchangeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StockExchangeServiceBlockingStub>() {
        @java.lang.Override
        public StockExchangeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StockExchangeServiceBlockingStub(channel, callOptions);
        }
      };
    return StockExchangeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StockExchangeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StockExchangeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StockExchangeServiceFutureStub>() {
        @java.lang.Override
        public StockExchangeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StockExchangeServiceFutureStub(channel, callOptions);
        }
      };
    return StockExchangeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getStockData(rs.raf.pds.v5.z2.gRPC.Empty request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.StockDataList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStockDataMethod(), responseObserver);
    }

    /**
     */
    default void getAskList(rs.raf.pds.v5.z2.gRPC.AskListRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.AskList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAskListMethod(), responseObserver);
    }

    /**
     */
    default void getBidList(rs.raf.pds.v5.z2.gRPC.BidListRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.BidList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBidListMethod(), responseObserver);
    }

    /**
     */
    default void submitOrder(rs.raf.pds.v5.z2.gRPC.OrderRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.OrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitOrderMethod(), responseObserver);
    }

    /**
     */
    default void getTradeList(rs.raf.pds.v5.z2.gRPC.TradeListRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.TradeList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTradeListMethod(), responseObserver);
    }

    /**
     */
    default void getClientPortfolio(rs.raf.pds.v5.z2.gRPC.ClientPortfolioRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.ClientPortfolio> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClientPortfolioMethod(), responseObserver);
    }

    /**
     */
    default void notifyTrade(rs.raf.pds.v5.z2.gRPC.Trade request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNotifyTradeMethod(), responseObserver);
    }

    /**
     */
    default void subscribeToTradeUpdates(rs.raf.pds.v5.z2.gRPC.Empty request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.Trade> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeToTradeUpdatesMethod(), responseObserver);
    }

    /**
     */
    default void getStockDataByDateTime(rs.raf.pds.v5.z2.gRPC.StockDataByDateTimeRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.StockDataList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStockDataByDateTimeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StockExchangeService.
   */
  public static abstract class StockExchangeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StockExchangeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StockExchangeService.
   */
  public static final class StockExchangeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StockExchangeServiceStub> {
    private StockExchangeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockExchangeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StockExchangeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStockData(rs.raf.pds.v5.z2.gRPC.Empty request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.StockDataList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStockDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAskList(rs.raf.pds.v5.z2.gRPC.AskListRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.AskList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAskListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBidList(rs.raf.pds.v5.z2.gRPC.BidListRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.BidList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBidListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitOrder(rs.raf.pds.v5.z2.gRPC.OrderRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.OrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTradeList(rs.raf.pds.v5.z2.gRPC.TradeListRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.TradeList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTradeListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClientPortfolio(rs.raf.pds.v5.z2.gRPC.ClientPortfolioRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.ClientPortfolio> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClientPortfolioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void notifyTrade(rs.raf.pds.v5.z2.gRPC.Trade request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNotifyTradeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeToTradeUpdates(rs.raf.pds.v5.z2.gRPC.Empty request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.Trade> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeToTradeUpdatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStockDataByDateTime(rs.raf.pds.v5.z2.gRPC.StockDataByDateTimeRequest request,
        io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.StockDataList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStockDataByDateTimeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StockExchangeService.
   */
  public static final class StockExchangeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StockExchangeServiceBlockingStub> {
    private StockExchangeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockExchangeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StockExchangeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public rs.raf.pds.v5.z2.gRPC.StockDataList getStockData(rs.raf.pds.v5.z2.gRPC.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStockDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.v5.z2.gRPC.AskList getAskList(rs.raf.pds.v5.z2.gRPC.AskListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAskListMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.v5.z2.gRPC.BidList getBidList(rs.raf.pds.v5.z2.gRPC.BidListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBidListMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.v5.z2.gRPC.OrderResponse submitOrder(rs.raf.pds.v5.z2.gRPC.OrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.v5.z2.gRPC.TradeList getTradeList(rs.raf.pds.v5.z2.gRPC.TradeListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTradeListMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.v5.z2.gRPC.ClientPortfolio getClientPortfolio(rs.raf.pds.v5.z2.gRPC.ClientPortfolioRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClientPortfolioMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.v5.z2.gRPC.Empty notifyTrade(rs.raf.pds.v5.z2.gRPC.Trade request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNotifyTradeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<rs.raf.pds.v5.z2.gRPC.Trade> subscribeToTradeUpdates(
        rs.raf.pds.v5.z2.gRPC.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeToTradeUpdatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public rs.raf.pds.v5.z2.gRPC.StockDataList getStockDataByDateTime(rs.raf.pds.v5.z2.gRPC.StockDataByDateTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStockDataByDateTimeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StockExchangeService.
   */
  public static final class StockExchangeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StockExchangeServiceFutureStub> {
    private StockExchangeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockExchangeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StockExchangeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.v5.z2.gRPC.StockDataList> getStockData(
        rs.raf.pds.v5.z2.gRPC.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStockDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.v5.z2.gRPC.AskList> getAskList(
        rs.raf.pds.v5.z2.gRPC.AskListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAskListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.v5.z2.gRPC.BidList> getBidList(
        rs.raf.pds.v5.z2.gRPC.BidListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBidListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.v5.z2.gRPC.OrderResponse> submitOrder(
        rs.raf.pds.v5.z2.gRPC.OrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.v5.z2.gRPC.TradeList> getTradeList(
        rs.raf.pds.v5.z2.gRPC.TradeListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTradeListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.v5.z2.gRPC.ClientPortfolio> getClientPortfolio(
        rs.raf.pds.v5.z2.gRPC.ClientPortfolioRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClientPortfolioMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.v5.z2.gRPC.Empty> notifyTrade(
        rs.raf.pds.v5.z2.gRPC.Trade request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNotifyTradeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rs.raf.pds.v5.z2.gRPC.StockDataList> getStockDataByDateTime(
        rs.raf.pds.v5.z2.gRPC.StockDataByDateTimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStockDataByDateTimeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STOCK_DATA = 0;
  private static final int METHODID_GET_ASK_LIST = 1;
  private static final int METHODID_GET_BID_LIST = 2;
  private static final int METHODID_SUBMIT_ORDER = 3;
  private static final int METHODID_GET_TRADE_LIST = 4;
  private static final int METHODID_GET_CLIENT_PORTFOLIO = 5;
  private static final int METHODID_NOTIFY_TRADE = 6;
  private static final int METHODID_SUBSCRIBE_TO_TRADE_UPDATES = 7;
  private static final int METHODID_GET_STOCK_DATA_BY_DATE_TIME = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STOCK_DATA:
          serviceImpl.getStockData((rs.raf.pds.v5.z2.gRPC.Empty) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.StockDataList>) responseObserver);
          break;
        case METHODID_GET_ASK_LIST:
          serviceImpl.getAskList((rs.raf.pds.v5.z2.gRPC.AskListRequest) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.AskList>) responseObserver);
          break;
        case METHODID_GET_BID_LIST:
          serviceImpl.getBidList((rs.raf.pds.v5.z2.gRPC.BidListRequest) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.BidList>) responseObserver);
          break;
        case METHODID_SUBMIT_ORDER:
          serviceImpl.submitOrder((rs.raf.pds.v5.z2.gRPC.OrderRequest) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.OrderResponse>) responseObserver);
          break;
        case METHODID_GET_TRADE_LIST:
          serviceImpl.getTradeList((rs.raf.pds.v5.z2.gRPC.TradeListRequest) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.TradeList>) responseObserver);
          break;
        case METHODID_GET_CLIENT_PORTFOLIO:
          serviceImpl.getClientPortfolio((rs.raf.pds.v5.z2.gRPC.ClientPortfolioRequest) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.ClientPortfolio>) responseObserver);
          break;
        case METHODID_NOTIFY_TRADE:
          serviceImpl.notifyTrade((rs.raf.pds.v5.z2.gRPC.Trade) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.Empty>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TO_TRADE_UPDATES:
          serviceImpl.subscribeToTradeUpdates((rs.raf.pds.v5.z2.gRPC.Empty) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.Trade>) responseObserver);
          break;
        case METHODID_GET_STOCK_DATA_BY_DATE_TIME:
          serviceImpl.getStockDataByDateTime((rs.raf.pds.v5.z2.gRPC.StockDataByDateTimeRequest) request,
              (io.grpc.stub.StreamObserver<rs.raf.pds.v5.z2.gRPC.StockDataList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetStockDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.Empty,
              rs.raf.pds.v5.z2.gRPC.StockDataList>(
                service, METHODID_GET_STOCK_DATA)))
        .addMethod(
          getGetAskListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.AskListRequest,
              rs.raf.pds.v5.z2.gRPC.AskList>(
                service, METHODID_GET_ASK_LIST)))
        .addMethod(
          getGetBidListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.BidListRequest,
              rs.raf.pds.v5.z2.gRPC.BidList>(
                service, METHODID_GET_BID_LIST)))
        .addMethod(
          getSubmitOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.OrderRequest,
              rs.raf.pds.v5.z2.gRPC.OrderResponse>(
                service, METHODID_SUBMIT_ORDER)))
        .addMethod(
          getGetTradeListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.TradeListRequest,
              rs.raf.pds.v5.z2.gRPC.TradeList>(
                service, METHODID_GET_TRADE_LIST)))
        .addMethod(
          getGetClientPortfolioMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.ClientPortfolioRequest,
              rs.raf.pds.v5.z2.gRPC.ClientPortfolio>(
                service, METHODID_GET_CLIENT_PORTFOLIO)))
        .addMethod(
          getNotifyTradeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.Trade,
              rs.raf.pds.v5.z2.gRPC.Empty>(
                service, METHODID_NOTIFY_TRADE)))
        .addMethod(
          getSubscribeToTradeUpdatesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.Empty,
              rs.raf.pds.v5.z2.gRPC.Trade>(
                service, METHODID_SUBSCRIBE_TO_TRADE_UPDATES)))
        .addMethod(
          getGetStockDataByDateTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              rs.raf.pds.v5.z2.gRPC.StockDataByDateTimeRequest,
              rs.raf.pds.v5.z2.gRPC.StockDataList>(
                service, METHODID_GET_STOCK_DATA_BY_DATE_TIME)))
        .build();
  }

  private static abstract class StockExchangeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StockExchangeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return rs.raf.pds.v5.z2.gRPC.StockExchange.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StockExchangeService");
    }
  }

  private static final class StockExchangeServiceFileDescriptorSupplier
      extends StockExchangeServiceBaseDescriptorSupplier {
    StockExchangeServiceFileDescriptorSupplier() {}
  }

  private static final class StockExchangeServiceMethodDescriptorSupplier
      extends StockExchangeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StockExchangeServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StockExchangeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StockExchangeServiceFileDescriptorSupplier())
              .addMethod(getGetStockDataMethod())
              .addMethod(getGetAskListMethod())
              .addMethod(getGetBidListMethod())
              .addMethod(getSubmitOrderMethod())
              .addMethod(getGetTradeListMethod())
              .addMethod(getGetClientPortfolioMethod())
              .addMethod(getNotifyTradeMethod())
              .addMethod(getSubscribeToTradeUpdatesMethod())
              .addMethod(getGetStockDataByDateTimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
