# JAVA-Stock-Exchange-Platform
This project demonstrates a Stock Exchange Platform with a client-server architecture. It utilizes gRPC for communication between the client and server, and TCP for real-time stock price updates.

## Features

* gRPC Communication: Client-server communication using gRPC protocol.
* TCP Updates: Real-time stock price updates over TCP.
* Client Portfolio: View and manage your stock portfolio.
* Place Orders: Submit buy or sell orders for selected stocks.
* Retrieve Data: Get real-time stock data, ask and bid lists, historical stock data, and more.

## Getting Started

### Prerequisites

* Java Development Kit (JDK)
* Maven
* protobuf (optional)

### Build

```bash
git clone https://github.com/djordje34/JAVA-Stock-Exchange-Platform.git
```

Build project using Maven:
```bash
mvn clean install
```

### Client Commands

The client supports the following commands:

- **Get Stock Data:**
```
GET STOCKS
```
- **Get Ask List:**
```
GET ASK
```
- **Get Bid List:**
```
GET BID
```
- **Place Buy Order:**
```
BUY {stock_symbol} {price} {quantity}
```
- **Place Sell Order:**
```
SELL {stock_symbol} {price} {quantity}
```
- **Get History:**
```
HISTORY {date} {hour (8-18)}
```
- **Get Portfolio:**
```
PORTFOLIO
```
- **Get Balance:**
```
BALANCE
```
- **Get Help For Commands:**
```
HELP
```
