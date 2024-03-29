// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stock_exchange.proto

// Protobuf Java Version: 3.25.1
package rs.raf.pds.v5.z2.gRPC;

/**
 * Protobuf type {@code BidList}
 */
public final class BidList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BidList)
    BidListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BidList.newBuilder() to construct.
  private BidList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BidList() {
    bids_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BidList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return rs.raf.pds.v5.z2.gRPC.StockExchange.internal_static_BidList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return rs.raf.pds.v5.z2.gRPC.StockExchange.internal_static_BidList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            rs.raf.pds.v5.z2.gRPC.BidList.class, rs.raf.pds.v5.z2.gRPC.BidList.Builder.class);
  }

  public static final int BIDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<rs.raf.pds.v5.z2.gRPC.BidData> bids_;
  /**
   * <code>repeated .BidData bids = 1;</code>
   */
  @java.lang.Override
  public java.util.List<rs.raf.pds.v5.z2.gRPC.BidData> getBidsList() {
    return bids_;
  }
  /**
   * <code>repeated .BidData bids = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends rs.raf.pds.v5.z2.gRPC.BidDataOrBuilder> 
      getBidsOrBuilderList() {
    return bids_;
  }
  /**
   * <code>repeated .BidData bids = 1;</code>
   */
  @java.lang.Override
  public int getBidsCount() {
    return bids_.size();
  }
  /**
   * <code>repeated .BidData bids = 1;</code>
   */
  @java.lang.Override
  public rs.raf.pds.v5.z2.gRPC.BidData getBids(int index) {
    return bids_.get(index);
  }
  /**
   * <code>repeated .BidData bids = 1;</code>
   */
  @java.lang.Override
  public rs.raf.pds.v5.z2.gRPC.BidDataOrBuilder getBidsOrBuilder(
      int index) {
    return bids_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < bids_.size(); i++) {
      output.writeMessage(1, bids_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < bids_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, bids_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof rs.raf.pds.v5.z2.gRPC.BidList)) {
      return super.equals(obj);
    }
    rs.raf.pds.v5.z2.gRPC.BidList other = (rs.raf.pds.v5.z2.gRPC.BidList) obj;

    if (!getBidsList()
        .equals(other.getBidsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getBidsCount() > 0) {
      hash = (37 * hash) + BIDS_FIELD_NUMBER;
      hash = (53 * hash) + getBidsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static rs.raf.pds.v5.z2.gRPC.BidList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.v5.z2.gRPC.BidList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.BidList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.v5.z2.gRPC.BidList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.BidList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rs.raf.pds.v5.z2.gRPC.BidList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.BidList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rs.raf.pds.v5.z2.gRPC.BidList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static rs.raf.pds.v5.z2.gRPC.BidList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static rs.raf.pds.v5.z2.gRPC.BidList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static rs.raf.pds.v5.z2.gRPC.BidList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rs.raf.pds.v5.z2.gRPC.BidList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(rs.raf.pds.v5.z2.gRPC.BidList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code BidList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BidList)
      rs.raf.pds.v5.z2.gRPC.BidListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return rs.raf.pds.v5.z2.gRPC.StockExchange.internal_static_BidList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return rs.raf.pds.v5.z2.gRPC.StockExchange.internal_static_BidList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              rs.raf.pds.v5.z2.gRPC.BidList.class, rs.raf.pds.v5.z2.gRPC.BidList.Builder.class);
    }

    // Construct using rs.raf.pds.v5.z2.gRPC.BidList.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (bidsBuilder_ == null) {
        bids_ = java.util.Collections.emptyList();
      } else {
        bids_ = null;
        bidsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return rs.raf.pds.v5.z2.gRPC.StockExchange.internal_static_BidList_descriptor;
    }

    @java.lang.Override
    public rs.raf.pds.v5.z2.gRPC.BidList getDefaultInstanceForType() {
      return rs.raf.pds.v5.z2.gRPC.BidList.getDefaultInstance();
    }

    @java.lang.Override
    public rs.raf.pds.v5.z2.gRPC.BidList build() {
      rs.raf.pds.v5.z2.gRPC.BidList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public rs.raf.pds.v5.z2.gRPC.BidList buildPartial() {
      rs.raf.pds.v5.z2.gRPC.BidList result = new rs.raf.pds.v5.z2.gRPC.BidList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(rs.raf.pds.v5.z2.gRPC.BidList result) {
      if (bidsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          bids_ = java.util.Collections.unmodifiableList(bids_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bids_ = bids_;
      } else {
        result.bids_ = bidsBuilder_.build();
      }
    }

    private void buildPartial0(rs.raf.pds.v5.z2.gRPC.BidList result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof rs.raf.pds.v5.z2.gRPC.BidList) {
        return mergeFrom((rs.raf.pds.v5.z2.gRPC.BidList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(rs.raf.pds.v5.z2.gRPC.BidList other) {
      if (other == rs.raf.pds.v5.z2.gRPC.BidList.getDefaultInstance()) return this;
      if (bidsBuilder_ == null) {
        if (!other.bids_.isEmpty()) {
          if (bids_.isEmpty()) {
            bids_ = other.bids_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBidsIsMutable();
            bids_.addAll(other.bids_);
          }
          onChanged();
        }
      } else {
        if (!other.bids_.isEmpty()) {
          if (bidsBuilder_.isEmpty()) {
            bidsBuilder_.dispose();
            bidsBuilder_ = null;
            bids_ = other.bids_;
            bitField0_ = (bitField0_ & ~0x00000001);
            bidsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBidsFieldBuilder() : null;
          } else {
            bidsBuilder_.addAllMessages(other.bids_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              rs.raf.pds.v5.z2.gRPC.BidData m =
                  input.readMessage(
                      rs.raf.pds.v5.z2.gRPC.BidData.parser(),
                      extensionRegistry);
              if (bidsBuilder_ == null) {
                ensureBidsIsMutable();
                bids_.add(m);
              } else {
                bidsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<rs.raf.pds.v5.z2.gRPC.BidData> bids_ =
      java.util.Collections.emptyList();
    private void ensureBidsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bids_ = new java.util.ArrayList<rs.raf.pds.v5.z2.gRPC.BidData>(bids_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        rs.raf.pds.v5.z2.gRPC.BidData, rs.raf.pds.v5.z2.gRPC.BidData.Builder, rs.raf.pds.v5.z2.gRPC.BidDataOrBuilder> bidsBuilder_;

    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public java.util.List<rs.raf.pds.v5.z2.gRPC.BidData> getBidsList() {
      if (bidsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bids_);
      } else {
        return bidsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public int getBidsCount() {
      if (bidsBuilder_ == null) {
        return bids_.size();
      } else {
        return bidsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public rs.raf.pds.v5.z2.gRPC.BidData getBids(int index) {
      if (bidsBuilder_ == null) {
        return bids_.get(index);
      } else {
        return bidsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public Builder setBids(
        int index, rs.raf.pds.v5.z2.gRPC.BidData value) {
      if (bidsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBidsIsMutable();
        bids_.set(index, value);
        onChanged();
      } else {
        bidsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public Builder setBids(
        int index, rs.raf.pds.v5.z2.gRPC.BidData.Builder builderForValue) {
      if (bidsBuilder_ == null) {
        ensureBidsIsMutable();
        bids_.set(index, builderForValue.build());
        onChanged();
      } else {
        bidsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public Builder addBids(rs.raf.pds.v5.z2.gRPC.BidData value) {
      if (bidsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBidsIsMutable();
        bids_.add(value);
        onChanged();
      } else {
        bidsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public Builder addBids(
        int index, rs.raf.pds.v5.z2.gRPC.BidData value) {
      if (bidsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBidsIsMutable();
        bids_.add(index, value);
        onChanged();
      } else {
        bidsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public Builder addBids(
        rs.raf.pds.v5.z2.gRPC.BidData.Builder builderForValue) {
      if (bidsBuilder_ == null) {
        ensureBidsIsMutable();
        bids_.add(builderForValue.build());
        onChanged();
      } else {
        bidsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public Builder addBids(
        int index, rs.raf.pds.v5.z2.gRPC.BidData.Builder builderForValue) {
      if (bidsBuilder_ == null) {
        ensureBidsIsMutable();
        bids_.add(index, builderForValue.build());
        onChanged();
      } else {
        bidsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public Builder addAllBids(
        java.lang.Iterable<? extends rs.raf.pds.v5.z2.gRPC.BidData> values) {
      if (bidsBuilder_ == null) {
        ensureBidsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bids_);
        onChanged();
      } else {
        bidsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public Builder clearBids() {
      if (bidsBuilder_ == null) {
        bids_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        bidsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public Builder removeBids(int index) {
      if (bidsBuilder_ == null) {
        ensureBidsIsMutable();
        bids_.remove(index);
        onChanged();
      } else {
        bidsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public rs.raf.pds.v5.z2.gRPC.BidData.Builder getBidsBuilder(
        int index) {
      return getBidsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public rs.raf.pds.v5.z2.gRPC.BidDataOrBuilder getBidsOrBuilder(
        int index) {
      if (bidsBuilder_ == null) {
        return bids_.get(index);  } else {
        return bidsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public java.util.List<? extends rs.raf.pds.v5.z2.gRPC.BidDataOrBuilder> 
         getBidsOrBuilderList() {
      if (bidsBuilder_ != null) {
        return bidsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bids_);
      }
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public rs.raf.pds.v5.z2.gRPC.BidData.Builder addBidsBuilder() {
      return getBidsFieldBuilder().addBuilder(
          rs.raf.pds.v5.z2.gRPC.BidData.getDefaultInstance());
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public rs.raf.pds.v5.z2.gRPC.BidData.Builder addBidsBuilder(
        int index) {
      return getBidsFieldBuilder().addBuilder(
          index, rs.raf.pds.v5.z2.gRPC.BidData.getDefaultInstance());
    }
    /**
     * <code>repeated .BidData bids = 1;</code>
     */
    public java.util.List<rs.raf.pds.v5.z2.gRPC.BidData.Builder> 
         getBidsBuilderList() {
      return getBidsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        rs.raf.pds.v5.z2.gRPC.BidData, rs.raf.pds.v5.z2.gRPC.BidData.Builder, rs.raf.pds.v5.z2.gRPC.BidDataOrBuilder> 
        getBidsFieldBuilder() {
      if (bidsBuilder_ == null) {
        bidsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            rs.raf.pds.v5.z2.gRPC.BidData, rs.raf.pds.v5.z2.gRPC.BidData.Builder, rs.raf.pds.v5.z2.gRPC.BidDataOrBuilder>(
                bids_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        bids_ = null;
      }
      return bidsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:BidList)
  }

  // @@protoc_insertion_point(class_scope:BidList)
  private static final rs.raf.pds.v5.z2.gRPC.BidList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new rs.raf.pds.v5.z2.gRPC.BidList();
  }

  public static rs.raf.pds.v5.z2.gRPC.BidList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BidList>
      PARSER = new com.google.protobuf.AbstractParser<BidList>() {
    @java.lang.Override
    public BidList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<BidList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BidList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public rs.raf.pds.v5.z2.gRPC.BidList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

