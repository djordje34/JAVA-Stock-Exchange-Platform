// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stock_exchange.proto

// Protobuf Java Version: 3.25.1
package rs.raf.pds.v5.z2.gRPC;

public interface TradeListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TradeList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Trade trades = 1;</code>
   */
  java.util.List<rs.raf.pds.v5.z2.gRPC.Trade> 
      getTradesList();
  /**
   * <code>repeated .Trade trades = 1;</code>
   */
  rs.raf.pds.v5.z2.gRPC.Trade getTrades(int index);
  /**
   * <code>repeated .Trade trades = 1;</code>
   */
  int getTradesCount();
  /**
   * <code>repeated .Trade trades = 1;</code>
   */
  java.util.List<? extends rs.raf.pds.v5.z2.gRPC.TradeOrBuilder> 
      getTradesOrBuilderList();
  /**
   * <code>repeated .Trade trades = 1;</code>
   */
  rs.raf.pds.v5.z2.gRPC.TradeOrBuilder getTradesOrBuilder(
      int index);
}
