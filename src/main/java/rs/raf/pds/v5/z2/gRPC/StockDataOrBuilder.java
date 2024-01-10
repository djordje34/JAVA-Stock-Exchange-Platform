// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stock_exchange.proto

// Protobuf Java Version: 3.25.1
package rs.raf.pds.v5.z2.gRPC;

public interface StockDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:StockData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string symbol = 1;</code>
   * @return The symbol.
   */
  java.lang.String getSymbol();
  /**
   * <code>string symbol = 1;</code>
   * @return The bytes for symbol.
   */
  com.google.protobuf.ByteString
      getSymbolBytes();

  /**
   * <code>string companyName = 2;</code>
   * @return The companyName.
   */
  java.lang.String getCompanyName();
  /**
   * <code>string companyName = 2;</code>
   * @return The bytes for companyName.
   */
  com.google.protobuf.ByteString
      getCompanyNameBytes();

  /**
   * <code>double currentPrice = 3;</code>
   * @return The currentPrice.
   */
  double getCurrentPrice();

  /**
   * <code>double priceChange = 4;</code>
   * @return The priceChange.
   */
  double getPriceChange();

  /**
   * <code>string date = 5;</code>
   * @return The date.
   */
  java.lang.String getDate();
  /**
   * <code>string date = 5;</code>
   * @return The bytes for date.
   */
  com.google.protobuf.ByteString
      getDateBytes();

  /**
   * <code>int32 hour = 6;</code>
   * @return The hour.
   */
  int getHour();
}
