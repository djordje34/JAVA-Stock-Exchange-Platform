// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stock_exchange.proto

// Protobuf Java Version: 3.25.1
package rs.raf.pds.v5.z2.gRPC;

public interface BidListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BidList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .BidData bids = 1;</code>
   */
  java.util.List<rs.raf.pds.v5.z2.gRPC.BidData> 
      getBidsList();
  /**
   * <code>repeated .BidData bids = 1;</code>
   */
  rs.raf.pds.v5.z2.gRPC.BidData getBids(int index);
  /**
   * <code>repeated .BidData bids = 1;</code>
   */
  int getBidsCount();
  /**
   * <code>repeated .BidData bids = 1;</code>
   */
  java.util.List<? extends rs.raf.pds.v5.z2.gRPC.BidDataOrBuilder> 
      getBidsOrBuilderList();
  /**
   * <code>repeated .BidData bids = 1;</code>
   */
  rs.raf.pds.v5.z2.gRPC.BidDataOrBuilder getBidsOrBuilder(
      int index);
}