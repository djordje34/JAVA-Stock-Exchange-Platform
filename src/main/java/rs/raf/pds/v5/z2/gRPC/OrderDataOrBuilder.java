// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stock_exchange.proto

// Protobuf Java Version: 3.25.1
package rs.raf.pds.v5.z2.gRPC;

public interface OrderDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:OrderData)
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
   * <code>bool isBuyOrder = 4;</code>
   * @return The isBuyOrder.
   */
  boolean getIsBuyOrder();

  /**
   * <code>string clientId = 5;</code>
   * @return The clientId.
   */
  java.lang.String getClientId();
  /**
   * <code>string clientId = 5;</code>
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString
      getClientIdBytes();
}
