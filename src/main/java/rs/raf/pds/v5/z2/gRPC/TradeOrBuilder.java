// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stock_exchange.proto

// Protobuf Java Version: 3.25.1
package rs.raf.pds.v5.z2.gRPC;

public interface TradeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Trade)
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
   * <code>double price = 2;</code>
   * @return The price.
   */
  double getPrice();

  /**
   * <code>int32 quantity = 3;</code>
   * @return The quantity.
   */
  int getQuantity();

  /**
   * <code>string buyerClientId = 4;</code>
   * @return The buyerClientId.
   */
  java.lang.String getBuyerClientId();
  /**
   * <code>string buyerClientId = 4;</code>
   * @return The bytes for buyerClientId.
   */
  com.google.protobuf.ByteString
      getBuyerClientIdBytes();

  /**
   * <code>string sellerClientId = 5;</code>
   * @return The sellerClientId.
   */
  java.lang.String getSellerClientId();
  /**
   * <code>string sellerClientId = 5;</code>
   * @return The bytes for sellerClientId.
   */
  com.google.protobuf.ByteString
      getSellerClientIdBytes();

  /**
   * <code>string date = 6;</code>
   * @return The date.
   */
  java.lang.String getDate();
  /**
   * <code>string date = 6;</code>
   * @return The bytes for date.
   */
  com.google.protobuf.ByteString
      getDateBytes();
}
