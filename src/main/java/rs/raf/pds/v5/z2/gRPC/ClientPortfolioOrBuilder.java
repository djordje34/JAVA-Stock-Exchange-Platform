// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stock_exchange.proto

// Protobuf Java Version: 3.25.1
package rs.raf.pds.v5.z2.gRPC;

public interface ClientPortfolioOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ClientPortfolio)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string clientId = 1;</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <code>string clientId = 1;</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>repeated .ClientStock stocks = 2;</code>
   */
  java.util.List<rs.raf.pds.v5.z2.gRPC.ClientStock> 
      getStocksList();
  /**
   * <code>repeated .ClientStock stocks = 2;</code>
   */
  rs.raf.pds.v5.z2.gRPC.ClientStock getStocks(int index);
  /**
   * <code>repeated .ClientStock stocks = 2;</code>
   */
  int getStocksCount();
  /**
   * <code>repeated .ClientStock stocks = 2;</code>
   */
  java.util.List<? extends rs.raf.pds.v5.z2.gRPC.ClientStockOrBuilder> 
      getStocksOrBuilderList();
  /**
   * <code>repeated .ClientStock stocks = 2;</code>
   */
  rs.raf.pds.v5.z2.gRPC.ClientStockOrBuilder getStocksOrBuilder(
      int index);
}
