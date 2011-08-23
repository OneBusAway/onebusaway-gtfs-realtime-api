/**
 * Copyright (C) 2011 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Portions of this code are modifications based on work created and shared by Google:
 * 
 *  http://code.google.com/policies.html
 *
 * and used according to terms described in the Creative Commons 3.0 Attribution License:
 *
 *   http://creativecommons.org/licenses/by/3.0/
 *  
 * Specifically, the gtfs-realtime.proto:
 *
 *   http://code.google.com/transit/realtime/docs/gtfs-realtime_proto.html
 *
 * was used to generate this source file.
 */
package com.google.transit.realtime;

public final class GtfsRealtime {
  private GtfsRealtime() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface FeedMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .transit_realtime.FeedHeader header = 1;
    boolean hasHeader();
    com.google.transit.realtime.GtfsRealtime.FeedHeader getHeader();
    com.google.transit.realtime.GtfsRealtime.FeedHeaderOrBuilder getHeaderOrBuilder();
    
    // repeated .transit_realtime.FeedEntity entity = 2;
    java.util.List<com.google.transit.realtime.GtfsRealtime.FeedEntity> 
        getEntityList();
    com.google.transit.realtime.GtfsRealtime.FeedEntity getEntity(int index);
    int getEntityCount();
    java.util.List<? extends com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder> 
        getEntityOrBuilderList();
    com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder getEntityOrBuilder(
        int index);
  }
  public static final class FeedMessage extends
      com.google.protobuf.GeneratedMessage
      implements FeedMessageOrBuilder {
    // Use FeedMessage.newBuilder() to construct.
    private FeedMessage(Builder builder) {
      super(builder);
    }
    private FeedMessage(boolean noInit) {}
    
    private static final FeedMessage defaultInstance;
    public static FeedMessage getDefaultInstance() {
      return defaultInstance;
    }
    
    public FeedMessage getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedMessage_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedMessage_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required .transit_realtime.FeedHeader header = 1;
    public static final int HEADER_FIELD_NUMBER = 1;
    private com.google.transit.realtime.GtfsRealtime.FeedHeader header_;
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.google.transit.realtime.GtfsRealtime.FeedHeader getHeader() {
      return header_;
    }
    public com.google.transit.realtime.GtfsRealtime.FeedHeaderOrBuilder getHeaderOrBuilder() {
      return header_;
    }
    
    // repeated .transit_realtime.FeedEntity entity = 2;
    public static final int ENTITY_FIELD_NUMBER = 2;
    private java.util.List<com.google.transit.realtime.GtfsRealtime.FeedEntity> entity_;
    public java.util.List<com.google.transit.realtime.GtfsRealtime.FeedEntity> getEntityList() {
      return entity_;
    }
    public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder> 
        getEntityOrBuilderList() {
      return entity_;
    }
    public int getEntityCount() {
      return entity_.size();
    }
    public com.google.transit.realtime.GtfsRealtime.FeedEntity getEntity(int index) {
      return entity_.get(index);
    }
    public com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder getEntityOrBuilder(
        int index) {
      return entity_.get(index);
    }
    
    private void initFields() {
      header_ = com.google.transit.realtime.GtfsRealtime.FeedHeader.getDefaultInstance();
      entity_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasHeader()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getHeader().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getEntityCount(); i++) {
        if (!getEntity(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, header_);
      }
      for (int i = 0; i < entity_.size(); i++) {
        output.writeMessage(2, entity_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, header_);
      }
      for (int i = 0; i < entity_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, entity_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.FeedMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.google.transit.realtime.GtfsRealtime.FeedMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedMessage_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedMessage_fieldAccessorTable;
      }
      
      // Construct using com.google.transit.realtime.GtfsRealtime.FeedMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getHeaderFieldBuilder();
          getEntityFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (headerBuilder_ == null) {
          header_ = com.google.transit.realtime.GtfsRealtime.FeedHeader.getDefaultInstance();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (entityBuilder_ == null) {
          entity_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          entityBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.FeedMessage.getDescriptor();
      }
      
      public com.google.transit.realtime.GtfsRealtime.FeedMessage getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.FeedMessage.getDefaultInstance();
      }
      
      public com.google.transit.realtime.GtfsRealtime.FeedMessage build() {
        com.google.transit.realtime.GtfsRealtime.FeedMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.google.transit.realtime.GtfsRealtime.FeedMessage buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.transit.realtime.GtfsRealtime.FeedMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.google.transit.realtime.GtfsRealtime.FeedMessage buildPartial() {
        com.google.transit.realtime.GtfsRealtime.FeedMessage result = new com.google.transit.realtime.GtfsRealtime.FeedMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (headerBuilder_ == null) {
          result.header_ = header_;
        } else {
          result.header_ = headerBuilder_.build();
        }
        if (entityBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            entity_ = java.util.Collections.unmodifiableList(entity_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.entity_ = entity_;
        } else {
          result.entity_ = entityBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.FeedMessage) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.FeedMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.FeedMessage other) {
        if (other == com.google.transit.realtime.GtfsRealtime.FeedMessage.getDefaultInstance()) return this;
        if (other.hasHeader()) {
          mergeHeader(other.getHeader());
        }
        if (entityBuilder_ == null) {
          if (!other.entity_.isEmpty()) {
            if (entity_.isEmpty()) {
              entity_ = other.entity_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureEntityIsMutable();
              entity_.addAll(other.entity_);
            }
            onChanged();
          }
        } else {
          if (!other.entity_.isEmpty()) {
            if (entityBuilder_.isEmpty()) {
              entityBuilder_.dispose();
              entityBuilder_ = null;
              entity_ = other.entity_;
              bitField0_ = (bitField0_ & ~0x00000002);
              entityBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getEntityFieldBuilder() : null;
            } else {
              entityBuilder_.addAllMessages(other.entity_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasHeader()) {
          
          return false;
        }
        if (!getHeader().isInitialized()) {
          
          return false;
        }
        for (int i = 0; i < getEntityCount(); i++) {
          if (!getEntity(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              com.google.transit.realtime.GtfsRealtime.FeedHeader.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.FeedHeader.newBuilder();
              if (hasHeader()) {
                subBuilder.mergeFrom(getHeader());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setHeader(subBuilder.buildPartial());
              break;
            }
            case 18: {
              com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.FeedEntity.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addEntity(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .transit_realtime.FeedHeader header = 1;
      private com.google.transit.realtime.GtfsRealtime.FeedHeader header_ = com.google.transit.realtime.GtfsRealtime.FeedHeader.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.FeedHeader, com.google.transit.realtime.GtfsRealtime.FeedHeader.Builder, com.google.transit.realtime.GtfsRealtime.FeedHeaderOrBuilder> headerBuilder_;
      public boolean hasHeader() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.google.transit.realtime.GtfsRealtime.FeedHeader getHeader() {
        if (headerBuilder_ == null) {
          return header_;
        } else {
          return headerBuilder_.getMessage();
        }
      }
      public Builder setHeader(com.google.transit.realtime.GtfsRealtime.FeedHeader value) {
        if (headerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          header_ = value;
          onChanged();
        } else {
          headerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder setHeader(
          com.google.transit.realtime.GtfsRealtime.FeedHeader.Builder builderForValue) {
        if (headerBuilder_ == null) {
          header_ = builderForValue.build();
          onChanged();
        } else {
          headerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder mergeHeader(com.google.transit.realtime.GtfsRealtime.FeedHeader value) {
        if (headerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              header_ != com.google.transit.realtime.GtfsRealtime.FeedHeader.getDefaultInstance()) {
            header_ =
              com.google.transit.realtime.GtfsRealtime.FeedHeader.newBuilder(header_).mergeFrom(value).buildPartial();
          } else {
            header_ = value;
          }
          onChanged();
        } else {
          headerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder clearHeader() {
        if (headerBuilder_ == null) {
          header_ = com.google.transit.realtime.GtfsRealtime.FeedHeader.getDefaultInstance();
          onChanged();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.FeedHeader.Builder getHeaderBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHeaderFieldBuilder().getBuilder();
      }
      public com.google.transit.realtime.GtfsRealtime.FeedHeaderOrBuilder getHeaderOrBuilder() {
        if (headerBuilder_ != null) {
          return headerBuilder_.getMessageOrBuilder();
        } else {
          return header_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.FeedHeader, com.google.transit.realtime.GtfsRealtime.FeedHeader.Builder, com.google.transit.realtime.GtfsRealtime.FeedHeaderOrBuilder> 
          getHeaderFieldBuilder() {
        if (headerBuilder_ == null) {
          headerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.FeedHeader, com.google.transit.realtime.GtfsRealtime.FeedHeader.Builder, com.google.transit.realtime.GtfsRealtime.FeedHeaderOrBuilder>(
                  header_,
                  getParentForChildren(),
                  isClean());
          header_ = null;
        }
        return headerBuilder_;
      }
      
      // repeated .transit_realtime.FeedEntity entity = 2;
      private java.util.List<com.google.transit.realtime.GtfsRealtime.FeedEntity> entity_ =
        java.util.Collections.emptyList();
      private void ensureEntityIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          entity_ = new java.util.ArrayList<com.google.transit.realtime.GtfsRealtime.FeedEntity>(entity_);
          bitField0_ |= 0x00000002;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.FeedEntity, com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder, com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder> entityBuilder_;
      
      public java.util.List<com.google.transit.realtime.GtfsRealtime.FeedEntity> getEntityList() {
        if (entityBuilder_ == null) {
          return java.util.Collections.unmodifiableList(entity_);
        } else {
          return entityBuilder_.getMessageList();
        }
      }
      public int getEntityCount() {
        if (entityBuilder_ == null) {
          return entity_.size();
        } else {
          return entityBuilder_.getCount();
        }
      }
      public com.google.transit.realtime.GtfsRealtime.FeedEntity getEntity(int index) {
        if (entityBuilder_ == null) {
          return entity_.get(index);
        } else {
          return entityBuilder_.getMessage(index);
        }
      }
      public Builder setEntity(
          int index, com.google.transit.realtime.GtfsRealtime.FeedEntity value) {
        if (entityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityIsMutable();
          entity_.set(index, value);
          onChanged();
        } else {
          entityBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setEntity(
          int index, com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder builderForValue) {
        if (entityBuilder_ == null) {
          ensureEntityIsMutable();
          entity_.set(index, builderForValue.build());
          onChanged();
        } else {
          entityBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addEntity(com.google.transit.realtime.GtfsRealtime.FeedEntity value) {
        if (entityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityIsMutable();
          entity_.add(value);
          onChanged();
        } else {
          entityBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addEntity(
          int index, com.google.transit.realtime.GtfsRealtime.FeedEntity value) {
        if (entityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityIsMutable();
          entity_.add(index, value);
          onChanged();
        } else {
          entityBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addEntity(
          com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder builderForValue) {
        if (entityBuilder_ == null) {
          ensureEntityIsMutable();
          entity_.add(builderForValue.build());
          onChanged();
        } else {
          entityBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addEntity(
          int index, com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder builderForValue) {
        if (entityBuilder_ == null) {
          ensureEntityIsMutable();
          entity_.add(index, builderForValue.build());
          onChanged();
        } else {
          entityBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllEntity(
          java.lang.Iterable<? extends com.google.transit.realtime.GtfsRealtime.FeedEntity> values) {
        if (entityBuilder_ == null) {
          ensureEntityIsMutable();
          super.addAll(values, entity_);
          onChanged();
        } else {
          entityBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearEntity() {
        if (entityBuilder_ == null) {
          entity_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          entityBuilder_.clear();
        }
        return this;
      }
      public Builder removeEntity(int index) {
        if (entityBuilder_ == null) {
          ensureEntityIsMutable();
          entity_.remove(index);
          onChanged();
        } else {
          entityBuilder_.remove(index);
        }
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder getEntityBuilder(
          int index) {
        return getEntityFieldBuilder().getBuilder(index);
      }
      public com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder getEntityOrBuilder(
          int index) {
        if (entityBuilder_ == null) {
          return entity_.get(index);  } else {
          return entityBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder> 
           getEntityOrBuilderList() {
        if (entityBuilder_ != null) {
          return entityBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(entity_);
        }
      }
      public com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder addEntityBuilder() {
        return getEntityFieldBuilder().addBuilder(
            com.google.transit.realtime.GtfsRealtime.FeedEntity.getDefaultInstance());
      }
      public com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder addEntityBuilder(
          int index) {
        return getEntityFieldBuilder().addBuilder(
            index, com.google.transit.realtime.GtfsRealtime.FeedEntity.getDefaultInstance());
      }
      public java.util.List<com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder> 
           getEntityBuilderList() {
        return getEntityFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.FeedEntity, com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder, com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder> 
          getEntityFieldBuilder() {
        if (entityBuilder_ == null) {
          entityBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.FeedEntity, com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder, com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder>(
                  entity_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          entity_ = null;
        }
        return entityBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:transit_realtime.FeedMessage)
    }
    
    static {
      defaultInstance = new FeedMessage(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:transit_realtime.FeedMessage)
  }
  
  public interface FeedHeaderOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string gtfs_realtime_version = 1;
    boolean hasGtfsRealtimeVersion();
    String getGtfsRealtimeVersion();
    
    // optional .transit_realtime.FeedHeader.Incrementality incrementality = 2 [default = FULL_DATASET];
    boolean hasIncrementality();
    com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality getIncrementality();
    
    // optional uint64 timestamp = 3;
    boolean hasTimestamp();
    long getTimestamp();
  }
  public static final class FeedHeader extends
      com.google.protobuf.GeneratedMessage
      implements FeedHeaderOrBuilder {
    // Use FeedHeader.newBuilder() to construct.
    private FeedHeader(Builder builder) {
      super(builder);
    }
    private FeedHeader(boolean noInit) {}
    
    private static final FeedHeader defaultInstance;
    public static FeedHeader getDefaultInstance() {
      return defaultInstance;
    }
    
    public FeedHeader getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedHeader_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedHeader_fieldAccessorTable;
    }
    
    public enum Incrementality
        implements com.google.protobuf.ProtocolMessageEnum {
      FULL_DATASET(0, 0),
      DIFFERENTIAL(1, 1),
      ;
      
      public static final int FULL_DATASET_VALUE = 0;
      public static final int DIFFERENTIAL_VALUE = 1;
      
      
      public final int getNumber() { return value; }
      
      public static Incrementality valueOf(int value) {
        switch (value) {
          case 0: return FULL_DATASET;
          case 1: return DIFFERENTIAL;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<Incrementality>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Incrementality>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Incrementality>() {
              public Incrementality findValueByNumber(int number) {
                return Incrementality.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.FeedHeader.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final Incrementality[] VALUES = {
        FULL_DATASET, DIFFERENTIAL, 
      };
      
      public static Incrementality valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private Incrementality(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:transit_realtime.FeedHeader.Incrementality)
    }
    
    private int bitField0_;
    // required string gtfs_realtime_version = 1;
    public static final int GTFS_REALTIME_VERSION_FIELD_NUMBER = 1;
    private java.lang.Object gtfsRealtimeVersion_;
    public boolean hasGtfsRealtimeVersion() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getGtfsRealtimeVersion() {
      java.lang.Object ref = gtfsRealtimeVersion_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          gtfsRealtimeVersion_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getGtfsRealtimeVersionBytes() {
      java.lang.Object ref = gtfsRealtimeVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        gtfsRealtimeVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional .transit_realtime.FeedHeader.Incrementality incrementality = 2 [default = FULL_DATASET];
    public static final int INCREMENTALITY_FIELD_NUMBER = 2;
    private com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality incrementality_;
    public boolean hasIncrementality() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality getIncrementality() {
      return incrementality_;
    }
    
    // optional uint64 timestamp = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private long timestamp_;
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public long getTimestamp() {
      return timestamp_;
    }
    
    private void initFields() {
      gtfsRealtimeVersion_ = "";
      incrementality_ = com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality.FULL_DATASET;
      timestamp_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasGtfsRealtimeVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getGtfsRealtimeVersionBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, incrementality_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, timestamp_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getGtfsRealtimeVersionBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, incrementality_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, timestamp_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.FeedHeader prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.google.transit.realtime.GtfsRealtime.FeedHeaderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedHeader_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedHeader_fieldAccessorTable;
      }
      
      // Construct using com.google.transit.realtime.GtfsRealtime.FeedHeader.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        gtfsRealtimeVersion_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        incrementality_ = com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality.FULL_DATASET;
        bitField0_ = (bitField0_ & ~0x00000002);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.FeedHeader.getDescriptor();
      }
      
      public com.google.transit.realtime.GtfsRealtime.FeedHeader getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.FeedHeader.getDefaultInstance();
      }
      
      public com.google.transit.realtime.GtfsRealtime.FeedHeader build() {
        com.google.transit.realtime.GtfsRealtime.FeedHeader result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.google.transit.realtime.GtfsRealtime.FeedHeader buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.transit.realtime.GtfsRealtime.FeedHeader result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.google.transit.realtime.GtfsRealtime.FeedHeader buildPartial() {
        com.google.transit.realtime.GtfsRealtime.FeedHeader result = new com.google.transit.realtime.GtfsRealtime.FeedHeader(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.gtfsRealtimeVersion_ = gtfsRealtimeVersion_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.incrementality_ = incrementality_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.timestamp_ = timestamp_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.FeedHeader) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.FeedHeader)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.FeedHeader other) {
        if (other == com.google.transit.realtime.GtfsRealtime.FeedHeader.getDefaultInstance()) return this;
        if (other.hasGtfsRealtimeVersion()) {
          setGtfsRealtimeVersion(other.getGtfsRealtimeVersion());
        }
        if (other.hasIncrementality()) {
          setIncrementality(other.getIncrementality());
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasGtfsRealtimeVersion()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              gtfsRealtimeVersion_ = input.readBytes();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality value = com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                incrementality_ = value;
              }
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              timestamp_ = input.readUInt64();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string gtfs_realtime_version = 1;
      private java.lang.Object gtfsRealtimeVersion_ = "";
      public boolean hasGtfsRealtimeVersion() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getGtfsRealtimeVersion() {
        java.lang.Object ref = gtfsRealtimeVersion_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          gtfsRealtimeVersion_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setGtfsRealtimeVersion(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        gtfsRealtimeVersion_ = value;
        onChanged();
        return this;
      }
      public Builder clearGtfsRealtimeVersion() {
        bitField0_ = (bitField0_ & ~0x00000001);
        gtfsRealtimeVersion_ = getDefaultInstance().getGtfsRealtimeVersion();
        onChanged();
        return this;
      }
      void setGtfsRealtimeVersion(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        gtfsRealtimeVersion_ = value;
        onChanged();
      }
      
      // optional .transit_realtime.FeedHeader.Incrementality incrementality = 2 [default = FULL_DATASET];
      private com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality incrementality_ = com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality.FULL_DATASET;
      public boolean hasIncrementality() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality getIncrementality() {
        return incrementality_;
      }
      public Builder setIncrementality(com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        incrementality_ = value;
        onChanged();
        return this;
      }
      public Builder clearIncrementality() {
        bitField0_ = (bitField0_ & ~0x00000002);
        incrementality_ = com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality.FULL_DATASET;
        onChanged();
        return this;
      }
      
      // optional uint64 timestamp = 3;
      private long timestamp_ ;
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public long getTimestamp() {
        return timestamp_;
      }
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000004;
        timestamp_ = value;
        onChanged();
        return this;
      }
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000004);
        timestamp_ = 0L;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:transit_realtime.FeedHeader)
    }
    
    static {
      defaultInstance = new FeedHeader(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:transit_realtime.FeedHeader)
  }
  
  public interface FeedEntityOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string id = 1;
    boolean hasId();
    String getId();
    
    // optional bool is_deleted = 2 [default = false];
    boolean hasIsDeleted();
    boolean getIsDeleted();
    
    // optional .transit_realtime.TripUpdate trip_update = 3;
    boolean hasTripUpdate();
    com.google.transit.realtime.GtfsRealtime.TripUpdate getTripUpdate();
    com.google.transit.realtime.GtfsRealtime.TripUpdateOrBuilder getTripUpdateOrBuilder();
    
    // optional .transit_realtime.VehiclePosition vehicle = 4;
    boolean hasVehicle();
    com.google.transit.realtime.GtfsRealtime.VehiclePosition getVehicle();
    com.google.transit.realtime.GtfsRealtime.VehiclePositionOrBuilder getVehicleOrBuilder();
    
    // optional .transit_realtime.Alert alert = 5;
    boolean hasAlert();
    com.google.transit.realtime.GtfsRealtime.Alert getAlert();
    com.google.transit.realtime.GtfsRealtime.AlertOrBuilder getAlertOrBuilder();
  }
  public static final class FeedEntity extends
      com.google.protobuf.GeneratedMessage
      implements FeedEntityOrBuilder {
    // Use FeedEntity.newBuilder() to construct.
    private FeedEntity(Builder builder) {
      super(builder);
    }
    private FeedEntity(boolean noInit) {}
    
    private static final FeedEntity defaultInstance;
    public static FeedEntity getDefaultInstance() {
      return defaultInstance;
    }
    
    public FeedEntity getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedEntity_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedEntity_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private java.lang.Object id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          id_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional bool is_deleted = 2 [default = false];
    public static final int IS_DELETED_FIELD_NUMBER = 2;
    private boolean isDeleted_;
    public boolean hasIsDeleted() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public boolean getIsDeleted() {
      return isDeleted_;
    }
    
    // optional .transit_realtime.TripUpdate trip_update = 3;
    public static final int TRIP_UPDATE_FIELD_NUMBER = 3;
    private com.google.transit.realtime.GtfsRealtime.TripUpdate tripUpdate_;
    public boolean hasTripUpdate() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public com.google.transit.realtime.GtfsRealtime.TripUpdate getTripUpdate() {
      return tripUpdate_;
    }
    public com.google.transit.realtime.GtfsRealtime.TripUpdateOrBuilder getTripUpdateOrBuilder() {
      return tripUpdate_;
    }
    
    // optional .transit_realtime.VehiclePosition vehicle = 4;
    public static final int VEHICLE_FIELD_NUMBER = 4;
    private com.google.transit.realtime.GtfsRealtime.VehiclePosition vehicle_;
    public boolean hasVehicle() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public com.google.transit.realtime.GtfsRealtime.VehiclePosition getVehicle() {
      return vehicle_;
    }
    public com.google.transit.realtime.GtfsRealtime.VehiclePositionOrBuilder getVehicleOrBuilder() {
      return vehicle_;
    }
    
    // optional .transit_realtime.Alert alert = 5;
    public static final int ALERT_FIELD_NUMBER = 5;
    private com.google.transit.realtime.GtfsRealtime.Alert alert_;
    public boolean hasAlert() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public com.google.transit.realtime.GtfsRealtime.Alert getAlert() {
      return alert_;
    }
    public com.google.transit.realtime.GtfsRealtime.AlertOrBuilder getAlertOrBuilder() {
      return alert_;
    }
    
    private void initFields() {
      id_ = "";
      isDeleted_ = false;
      tripUpdate_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.getDefaultInstance();
      vehicle_ = com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDefaultInstance();
      alert_ = com.google.transit.realtime.GtfsRealtime.Alert.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasTripUpdate()) {
        if (!getTripUpdate().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasVehicle()) {
        if (!getVehicle().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasAlert()) {
        if (!getAlert().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, isDeleted_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, tripUpdate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, vehicle_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(5, alert_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isDeleted_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, tripUpdate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, vehicle_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, alert_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.FeedEntity prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedEntity_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedEntity_fieldAccessorTable;
      }
      
      // Construct using com.google.transit.realtime.GtfsRealtime.FeedEntity.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getTripUpdateFieldBuilder();
          getVehicleFieldBuilder();
          getAlertFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        id_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        isDeleted_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (tripUpdateBuilder_ == null) {
          tripUpdate_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.getDefaultInstance();
        } else {
          tripUpdateBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (vehicleBuilder_ == null) {
          vehicle_ = com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDefaultInstance();
        } else {
          vehicleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        if (alertBuilder_ == null) {
          alert_ = com.google.transit.realtime.GtfsRealtime.Alert.getDefaultInstance();
        } else {
          alertBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.FeedEntity.getDescriptor();
      }
      
      public com.google.transit.realtime.GtfsRealtime.FeedEntity getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.FeedEntity.getDefaultInstance();
      }
      
      public com.google.transit.realtime.GtfsRealtime.FeedEntity build() {
        com.google.transit.realtime.GtfsRealtime.FeedEntity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.google.transit.realtime.GtfsRealtime.FeedEntity buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.transit.realtime.GtfsRealtime.FeedEntity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.google.transit.realtime.GtfsRealtime.FeedEntity buildPartial() {
        com.google.transit.realtime.GtfsRealtime.FeedEntity result = new com.google.transit.realtime.GtfsRealtime.FeedEntity(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.isDeleted_ = isDeleted_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (tripUpdateBuilder_ == null) {
          result.tripUpdate_ = tripUpdate_;
        } else {
          result.tripUpdate_ = tripUpdateBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (vehicleBuilder_ == null) {
          result.vehicle_ = vehicle_;
        } else {
          result.vehicle_ = vehicleBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        if (alertBuilder_ == null) {
          result.alert_ = alert_;
        } else {
          result.alert_ = alertBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.FeedEntity) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.FeedEntity)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.FeedEntity other) {
        if (other == com.google.transit.realtime.GtfsRealtime.FeedEntity.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasIsDeleted()) {
          setIsDeleted(other.getIsDeleted());
        }
        if (other.hasTripUpdate()) {
          mergeTripUpdate(other.getTripUpdate());
        }
        if (other.hasVehicle()) {
          mergeVehicle(other.getVehicle());
        }
        if (other.hasAlert()) {
          mergeAlert(other.getAlert());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        if (hasTripUpdate()) {
          if (!getTripUpdate().isInitialized()) {
            
            return false;
          }
        }
        if (hasVehicle()) {
          if (!getVehicle().isInitialized()) {
            
            return false;
          }
        }
        if (hasAlert()) {
          if (!getAlert().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              id_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              isDeleted_ = input.readBool();
              break;
            }
            case 26: {
              com.google.transit.realtime.GtfsRealtime.TripUpdate.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.TripUpdate.newBuilder();
              if (hasTripUpdate()) {
                subBuilder.mergeFrom(getTripUpdate());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setTripUpdate(subBuilder.buildPartial());
              break;
            }
            case 34: {
              com.google.transit.realtime.GtfsRealtime.VehiclePosition.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.VehiclePosition.newBuilder();
              if (hasVehicle()) {
                subBuilder.mergeFrom(getVehicle());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setVehicle(subBuilder.buildPartial());
              break;
            }
            case 42: {
              com.google.transit.realtime.GtfsRealtime.Alert.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.Alert.newBuilder();
              if (hasAlert()) {
                subBuilder.mergeFrom(getAlert());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setAlert(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string id = 1;
      private java.lang.Object id_ = "";
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      void setId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
      }
      
      // optional bool is_deleted = 2 [default = false];
      private boolean isDeleted_ ;
      public boolean hasIsDeleted() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public boolean getIsDeleted() {
        return isDeleted_;
      }
      public Builder setIsDeleted(boolean value) {
        bitField0_ |= 0x00000002;
        isDeleted_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsDeleted() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isDeleted_ = false;
        onChanged();
        return this;
      }
      
      // optional .transit_realtime.TripUpdate trip_update = 3;
      private com.google.transit.realtime.GtfsRealtime.TripUpdate tripUpdate_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TripUpdate, com.google.transit.realtime.GtfsRealtime.TripUpdate.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdateOrBuilder> tripUpdateBuilder_;
      public boolean hasTripUpdate() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public com.google.transit.realtime.GtfsRealtime.TripUpdate getTripUpdate() {
        if (tripUpdateBuilder_ == null) {
          return tripUpdate_;
        } else {
          return tripUpdateBuilder_.getMessage();
        }
      }
      public Builder setTripUpdate(com.google.transit.realtime.GtfsRealtime.TripUpdate value) {
        if (tripUpdateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          tripUpdate_ = value;
          onChanged();
        } else {
          tripUpdateBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder setTripUpdate(
          com.google.transit.realtime.GtfsRealtime.TripUpdate.Builder builderForValue) {
        if (tripUpdateBuilder_ == null) {
          tripUpdate_ = builderForValue.build();
          onChanged();
        } else {
          tripUpdateBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder mergeTripUpdate(com.google.transit.realtime.GtfsRealtime.TripUpdate value) {
        if (tripUpdateBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              tripUpdate_ != com.google.transit.realtime.GtfsRealtime.TripUpdate.getDefaultInstance()) {
            tripUpdate_ =
              com.google.transit.realtime.GtfsRealtime.TripUpdate.newBuilder(tripUpdate_).mergeFrom(value).buildPartial();
          } else {
            tripUpdate_ = value;
          }
          onChanged();
        } else {
          tripUpdateBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder clearTripUpdate() {
        if (tripUpdateBuilder_ == null) {
          tripUpdate_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.getDefaultInstance();
          onChanged();
        } else {
          tripUpdateBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.Builder getTripUpdateBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getTripUpdateFieldBuilder().getBuilder();
      }
      public com.google.transit.realtime.GtfsRealtime.TripUpdateOrBuilder getTripUpdateOrBuilder() {
        if (tripUpdateBuilder_ != null) {
          return tripUpdateBuilder_.getMessageOrBuilder();
        } else {
          return tripUpdate_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TripUpdate, com.google.transit.realtime.GtfsRealtime.TripUpdate.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdateOrBuilder> 
          getTripUpdateFieldBuilder() {
        if (tripUpdateBuilder_ == null) {
          tripUpdateBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.TripUpdate, com.google.transit.realtime.GtfsRealtime.TripUpdate.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdateOrBuilder>(
                  tripUpdate_,
                  getParentForChildren(),
                  isClean());
          tripUpdate_ = null;
        }
        return tripUpdateBuilder_;
      }
      
      // optional .transit_realtime.VehiclePosition vehicle = 4;
      private com.google.transit.realtime.GtfsRealtime.VehiclePosition vehicle_ = com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.VehiclePosition, com.google.transit.realtime.GtfsRealtime.VehiclePosition.Builder, com.google.transit.realtime.GtfsRealtime.VehiclePositionOrBuilder> vehicleBuilder_;
      public boolean hasVehicle() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public com.google.transit.realtime.GtfsRealtime.VehiclePosition getVehicle() {
        if (vehicleBuilder_ == null) {
          return vehicle_;
        } else {
          return vehicleBuilder_.getMessage();
        }
      }
      public Builder setVehicle(com.google.transit.realtime.GtfsRealtime.VehiclePosition value) {
        if (vehicleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          vehicle_ = value;
          onChanged();
        } else {
          vehicleBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      public Builder setVehicle(
          com.google.transit.realtime.GtfsRealtime.VehiclePosition.Builder builderForValue) {
        if (vehicleBuilder_ == null) {
          vehicle_ = builderForValue.build();
          onChanged();
        } else {
          vehicleBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      public Builder mergeVehicle(com.google.transit.realtime.GtfsRealtime.VehiclePosition value) {
        if (vehicleBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008) &&
              vehicle_ != com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDefaultInstance()) {
            vehicle_ =
              com.google.transit.realtime.GtfsRealtime.VehiclePosition.newBuilder(vehicle_).mergeFrom(value).buildPartial();
          } else {
            vehicle_ = value;
          }
          onChanged();
        } else {
          vehicleBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      public Builder clearVehicle() {
        if (vehicleBuilder_ == null) {
          vehicle_ = com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDefaultInstance();
          onChanged();
        } else {
          vehicleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.VehiclePosition.Builder getVehicleBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getVehicleFieldBuilder().getBuilder();
      }
      public com.google.transit.realtime.GtfsRealtime.VehiclePositionOrBuilder getVehicleOrBuilder() {
        if (vehicleBuilder_ != null) {
          return vehicleBuilder_.getMessageOrBuilder();
        } else {
          return vehicle_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.VehiclePosition, com.google.transit.realtime.GtfsRealtime.VehiclePosition.Builder, com.google.transit.realtime.GtfsRealtime.VehiclePositionOrBuilder> 
          getVehicleFieldBuilder() {
        if (vehicleBuilder_ == null) {
          vehicleBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.VehiclePosition, com.google.transit.realtime.GtfsRealtime.VehiclePosition.Builder, com.google.transit.realtime.GtfsRealtime.VehiclePositionOrBuilder>(
                  vehicle_,
                  getParentForChildren(),
                  isClean());
          vehicle_ = null;
        }
        return vehicleBuilder_;
      }
      
      // optional .transit_realtime.Alert alert = 5;
      private com.google.transit.realtime.GtfsRealtime.Alert alert_ = com.google.transit.realtime.GtfsRealtime.Alert.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.Alert, com.google.transit.realtime.GtfsRealtime.Alert.Builder, com.google.transit.realtime.GtfsRealtime.AlertOrBuilder> alertBuilder_;
      public boolean hasAlert() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public com.google.transit.realtime.GtfsRealtime.Alert getAlert() {
        if (alertBuilder_ == null) {
          return alert_;
        } else {
          return alertBuilder_.getMessage();
        }
      }
      public Builder setAlert(com.google.transit.realtime.GtfsRealtime.Alert value) {
        if (alertBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          alert_ = value;
          onChanged();
        } else {
          alertBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      public Builder setAlert(
          com.google.transit.realtime.GtfsRealtime.Alert.Builder builderForValue) {
        if (alertBuilder_ == null) {
          alert_ = builderForValue.build();
          onChanged();
        } else {
          alertBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      public Builder mergeAlert(com.google.transit.realtime.GtfsRealtime.Alert value) {
        if (alertBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010) &&
              alert_ != com.google.transit.realtime.GtfsRealtime.Alert.getDefaultInstance()) {
            alert_ =
              com.google.transit.realtime.GtfsRealtime.Alert.newBuilder(alert_).mergeFrom(value).buildPartial();
          } else {
            alert_ = value;
          }
          onChanged();
        } else {
          alertBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      public Builder clearAlert() {
        if (alertBuilder_ == null) {
          alert_ = com.google.transit.realtime.GtfsRealtime.Alert.getDefaultInstance();
          onChanged();
        } else {
          alertBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.Alert.Builder getAlertBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getAlertFieldBuilder().getBuilder();
      }
      public com.google.transit.realtime.GtfsRealtime.AlertOrBuilder getAlertOrBuilder() {
        if (alertBuilder_ != null) {
          return alertBuilder_.getMessageOrBuilder();
        } else {
          return alert_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.Alert, com.google.transit.realtime.GtfsRealtime.Alert.Builder, com.google.transit.realtime.GtfsRealtime.AlertOrBuilder> 
          getAlertFieldBuilder() {
        if (alertBuilder_ == null) {
          alertBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.Alert, com.google.transit.realtime.GtfsRealtime.Alert.Builder, com.google.transit.realtime.GtfsRealtime.AlertOrBuilder>(
                  alert_,
                  getParentForChildren(),
                  isClean());
          alert_ = null;
        }
        return alertBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:transit_realtime.FeedEntity)
    }
    
    static {
      defaultInstance = new FeedEntity(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:transit_realtime.FeedEntity)
  }
  
  public interface TripUpdateOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .transit_realtime.TripDescriptor trip = 1;
    boolean hasTrip();
    com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip();
    com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder();
    
    // optional .transit_realtime.VehicleDescriptor vehicle = 3;
    boolean hasVehicle();
    com.google.transit.realtime.GtfsRealtime.VehicleDescriptor getVehicle();
    com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder getVehicleOrBuilder();
    
    // repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;
    java.util.List<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate> 
        getStopTimeUpdateList();
    com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate getStopTimeUpdate(int index);
    int getStopTimeUpdateCount();
    java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder> 
        getStopTimeUpdateOrBuilderList();
    com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder getStopTimeUpdateOrBuilder(
        int index);
  }
  public static final class TripUpdate extends
      com.google.protobuf.GeneratedMessage
      implements TripUpdateOrBuilder {
    // Use TripUpdate.newBuilder() to construct.
    private TripUpdate(Builder builder) {
      super(builder);
    }
    private TripUpdate(boolean noInit) {}
    
    private static final TripUpdate defaultInstance;
    public static TripUpdate getDefaultInstance() {
      return defaultInstance;
    }
    
    public TripUpdate getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_fieldAccessorTable;
    }
    
    public interface StopTimeEventOrBuilder
        extends com.google.protobuf.MessageOrBuilder {
      
      // optional int32 delay = 1;
      boolean hasDelay();
      int getDelay();
      
      // optional int64 time = 2;
      boolean hasTime();
      long getTime();
      
      // optional int32 uncertainty = 3;
      boolean hasUncertainty();
      int getUncertainty();
    }
    public static final class StopTimeEvent extends
        com.google.protobuf.GeneratedMessage
        implements StopTimeEventOrBuilder {
      // Use StopTimeEvent.newBuilder() to construct.
      private StopTimeEvent(Builder builder) {
        super(builder);
      }
      private StopTimeEvent(boolean noInit) {}
      
      private static final StopTimeEvent defaultInstance;
      public static StopTimeEvent getDefaultInstance() {
        return defaultInstance;
      }
      
      public StopTimeEvent getDefaultInstanceForType() {
        return defaultInstance;
      }
      
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeEvent_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeEvent_fieldAccessorTable;
      }
      
      private int bitField0_;
      // optional int32 delay = 1;
      public static final int DELAY_FIELD_NUMBER = 1;
      private int delay_;
      public boolean hasDelay() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getDelay() {
        return delay_;
      }
      
      // optional int64 time = 2;
      public static final int TIME_FIELD_NUMBER = 2;
      private long time_;
      public boolean hasTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getTime() {
        return time_;
      }
      
      // optional int32 uncertainty = 3;
      public static final int UNCERTAINTY_FIELD_NUMBER = 3;
      private int uncertainty_;
      public boolean hasUncertainty() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getUncertainty() {
        return uncertainty_;
      }
      
      private void initFields() {
        delay_ = 0;
        time_ = 0L;
        uncertainty_ = 0;
      }
      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized != -1) return isInitialized == 1;
        
        memoizedIsInitialized = 1;
        return true;
      }
      
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        getSerializedSize();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          output.writeInt32(1, delay_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeInt64(2, time_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          output.writeInt32(3, uncertainty_);
        }
        getUnknownFields().writeTo(output);
      }
      
      private int memoizedSerializedSize = -1;
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;
      
        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt32Size(1, delay_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt64Size(2, time_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt32Size(3, uncertainty_);
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSerializedSize = size;
        return size;
      }
      
      private static final long serialVersionUID = 0L;
      @java.lang.Override
      protected java.lang.Object writeReplace()
          throws java.io.ObjectStreamException {
        return super.writeReplace();
      }
      
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data).buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data, extensionRegistry)
                 .buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data).buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data, extensionRegistry)
                 .buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input).buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input, extensionRegistry)
                 .buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        Builder builder = newBuilder();
        if (builder.mergeDelimitedFrom(input)) {
          return builder.buildParsed();
        } else {
          return null;
        }
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Builder builder = newBuilder();
        if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
          return builder.buildParsed();
        } else {
          return null;
        }
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input).buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input, extensionRegistry)
                 .buildParsed();
      }
      
      public static Builder newBuilder() { return Builder.create(); }
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent prototype) {
        return newBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() { return newBuilder(this); }
      
      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      public static final class Builder extends
          com.google.protobuf.GeneratedMessage.Builder<Builder>
         implements com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeEvent_descriptor;
        }
        
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeEvent_fieldAccessorTable;
        }
        
        // Construct using com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }
        
        private Builder(BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          }
        }
        private static Builder create() {
          return new Builder();
        }
        
        public Builder clear() {
          super.clear();
          delay_ = 0;
          bitField0_ = (bitField0_ & ~0x00000001);
          time_ = 0L;
          bitField0_ = (bitField0_ & ~0x00000002);
          uncertainty_ = 0;
          bitField0_ = (bitField0_ & ~0x00000004);
          return this;
        }
        
        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }
        
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDescriptor();
        }
        
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent getDefaultInstanceForType() {
          return com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDefaultInstance();
        }
        
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent build() {
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }
        
        private com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent buildParsed()
            throws com.google.protobuf.InvalidProtocolBufferException {
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(
              result).asInvalidProtocolBufferException();
          }
          return result;
        }
        
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent buildPartial() {
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent result = new com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.delay_ = delay_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.time_ = time_;
          if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
            to_bitField0_ |= 0x00000004;
          }
          result.uncertainty_ = uncertainty_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }
        
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent) {
            return mergeFrom((com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }
        
        public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent other) {
          if (other == com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDefaultInstance()) return this;
          if (other.hasDelay()) {
            setDelay(other.getDelay());
          }
          if (other.hasTime()) {
            setTime(other.getTime());
          }
          if (other.hasUncertainty()) {
            setUncertainty(other.getUncertainty());
          }
          this.mergeUnknownFields(other.getUnknownFields());
          return this;
        }
        
        public final boolean isInitialized() {
          return true;
        }
        
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder(
              this.getUnknownFields());
          while (true) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              default: {
                if (!parseUnknownField(input, unknownFields,
                                       extensionRegistry, tag)) {
                  this.setUnknownFields(unknownFields.build());
                  onChanged();
                  return this;
                }
                break;
              }
              case 8: {
                bitField0_ |= 0x00000001;
                delay_ = input.readInt32();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                time_ = input.readInt64();
                break;
              }
              case 24: {
                bitField0_ |= 0x00000004;
                uncertainty_ = input.readInt32();
                break;
              }
            }
          }
        }
        
        private int bitField0_;
        
        // optional int32 delay = 1;
        private int delay_ ;
        public boolean hasDelay() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        public int getDelay() {
          return delay_;
        }
        public Builder setDelay(int value) {
          bitField0_ |= 0x00000001;
          delay_ = value;
          onChanged();
          return this;
        }
        public Builder clearDelay() {
          bitField0_ = (bitField0_ & ~0x00000001);
          delay_ = 0;
          onChanged();
          return this;
        }
        
        // optional int64 time = 2;
        private long time_ ;
        public boolean hasTime() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        public long getTime() {
          return time_;
        }
        public Builder setTime(long value) {
          bitField0_ |= 0x00000002;
          time_ = value;
          onChanged();
          return this;
        }
        public Builder clearTime() {
          bitField0_ = (bitField0_ & ~0x00000002);
          time_ = 0L;
          onChanged();
          return this;
        }
        
        // optional int32 uncertainty = 3;
        private int uncertainty_ ;
        public boolean hasUncertainty() {
          return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        public int getUncertainty() {
          return uncertainty_;
        }
        public Builder setUncertainty(int value) {
          bitField0_ |= 0x00000004;
          uncertainty_ = value;
          onChanged();
          return this;
        }
        public Builder clearUncertainty() {
          bitField0_ = (bitField0_ & ~0x00000004);
          uncertainty_ = 0;
          onChanged();
          return this;
        }
        
        // @@protoc_insertion_point(builder_scope:transit_realtime.TripUpdate.StopTimeEvent)
      }
      
      static {
        defaultInstance = new StopTimeEvent(true);
        defaultInstance.initFields();
      }
      
      // @@protoc_insertion_point(class_scope:transit_realtime.TripUpdate.StopTimeEvent)
    }
    
    public interface StopTimeUpdateOrBuilder
        extends com.google.protobuf.MessageOrBuilder {
      
      // optional uint32 stop_sequence = 1;
      boolean hasStopSequence();
      int getStopSequence();
      
      // optional string stop_id = 4;
      boolean hasStopId();
      String getStopId();
      
      // optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;
      boolean hasArrival();
      com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent getArrival();
      com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder getArrivalOrBuilder();
      
      // optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;
      boolean hasDeparture();
      com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent getDeparture();
      com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder getDepartureOrBuilder();
      
      // optional .transit_realtime.TripUpdate.StopTimeUpdate.ScheduleRelationship schedule_relationship = 5 [default = SCHEDULED];
      boolean hasScheduleRelationship();
      com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship getScheduleRelationship();
    }
    public static final class StopTimeUpdate extends
        com.google.protobuf.GeneratedMessage
        implements StopTimeUpdateOrBuilder {
      // Use StopTimeUpdate.newBuilder() to construct.
      private StopTimeUpdate(Builder builder) {
        super(builder);
      }
      private StopTimeUpdate(boolean noInit) {}
      
      private static final StopTimeUpdate defaultInstance;
      public static StopTimeUpdate getDefaultInstance() {
        return defaultInstance;
      }
      
      public StopTimeUpdate getDefaultInstanceForType() {
        return defaultInstance;
      }
      
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeUpdate_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeUpdate_fieldAccessorTable;
      }
      
      public enum ScheduleRelationship
          implements com.google.protobuf.ProtocolMessageEnum {
        SCHEDULED(0, 0),
        SKIPPED(1, 1),
        NO_DATA(2, 2),
        ;
        
        public static final int SCHEDULED_VALUE = 0;
        public static final int SKIPPED_VALUE = 1;
        public static final int NO_DATA_VALUE = 2;
        
        
        public final int getNumber() { return value; }
        
        public static ScheduleRelationship valueOf(int value) {
          switch (value) {
            case 0: return SCHEDULED;
            case 1: return SKIPPED;
            case 2: return NO_DATA;
            default: return null;
          }
        }
        
        public static com.google.protobuf.Internal.EnumLiteMap<ScheduleRelationship>
            internalGetValueMap() {
          return internalValueMap;
        }
        private static com.google.protobuf.Internal.EnumLiteMap<ScheduleRelationship>
            internalValueMap =
              new com.google.protobuf.Internal.EnumLiteMap<ScheduleRelationship>() {
                public ScheduleRelationship findValueByNumber(int number) {
                  return ScheduleRelationship.valueOf(number);
                }
              };
        
        public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
          return getDescriptor().getValues().get(index);
        }
        public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }
        public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
          return com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.getDescriptor().getEnumTypes().get(0);
        }
        
        private static final ScheduleRelationship[] VALUES = {
          SCHEDULED, SKIPPED, NO_DATA, 
        };
        
        public static ScheduleRelationship valueOf(
            com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
          if (desc.getType() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "EnumValueDescriptor is not for this type.");
          }
          return VALUES[desc.getIndex()];
        }
        
        private final int index;
        private final int value;
        
        private ScheduleRelationship(int index, int value) {
          this.index = index;
          this.value = value;
        }
        
        // @@protoc_insertion_point(enum_scope:transit_realtime.TripUpdate.StopTimeUpdate.ScheduleRelationship)
      }
      
      private int bitField0_;
      // optional uint32 stop_sequence = 1;
      public static final int STOP_SEQUENCE_FIELD_NUMBER = 1;
      private int stopSequence_;
      public boolean hasStopSequence() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getStopSequence() {
        return stopSequence_;
      }
      
      // optional string stop_id = 4;
      public static final int STOP_ID_FIELD_NUMBER = 4;
      private java.lang.Object stopId_;
      public boolean hasStopId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getStopId() {
        java.lang.Object ref = stopId_;
        if (ref instanceof String) {
          return (String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (com.google.protobuf.Internal.isValidUtf8(bs)) {
            stopId_ = s;
          }
          return s;
        }
      }
      private com.google.protobuf.ByteString getStopIdBytes() {
        java.lang.Object ref = stopId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8((String) ref);
          stopId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      
      // optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;
      public static final int ARRIVAL_FIELD_NUMBER = 2;
      private com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent arrival_;
      public boolean hasArrival() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent getArrival() {
        return arrival_;
      }
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder getArrivalOrBuilder() {
        return arrival_;
      }
      
      // optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;
      public static final int DEPARTURE_FIELD_NUMBER = 3;
      private com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent departure_;
      public boolean hasDeparture() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent getDeparture() {
        return departure_;
      }
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder getDepartureOrBuilder() {
        return departure_;
      }
      
      // optional .transit_realtime.TripUpdate.StopTimeUpdate.ScheduleRelationship schedule_relationship = 5 [default = SCHEDULED];
      public static final int SCHEDULE_RELATIONSHIP_FIELD_NUMBER = 5;
      private com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship scheduleRelationship_;
      public boolean hasScheduleRelationship() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship getScheduleRelationship() {
        return scheduleRelationship_;
      }
      
      private void initFields() {
        stopSequence_ = 0;
        stopId_ = "";
        arrival_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDefaultInstance();
        departure_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDefaultInstance();
        scheduleRelationship_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship.SCHEDULED;
      }
      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized != -1) return isInitialized == 1;
        
        memoizedIsInitialized = 1;
        return true;
      }
      
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        getSerializedSize();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          output.writeUInt32(1, stopSequence_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          output.writeMessage(2, arrival_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          output.writeMessage(3, departure_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeBytes(4, getStopIdBytes());
        }
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          output.writeEnum(5, scheduleRelationship_.getNumber());
        }
        getUnknownFields().writeTo(output);
      }
      
      private int memoizedSerializedSize = -1;
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;
      
        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
            .computeUInt32Size(1, stopSequence_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(2, arrival_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(3, departure_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(4, getStopIdBytes());
        }
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          size += com.google.protobuf.CodedOutputStream
            .computeEnumSize(5, scheduleRelationship_.getNumber());
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSerializedSize = size;
        return size;
      }
      
      private static final long serialVersionUID = 0L;
      @java.lang.Override
      protected java.lang.Object writeReplace()
          throws java.io.ObjectStreamException {
        return super.writeReplace();
      }
      
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data).buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data, extensionRegistry)
                 .buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data).buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data, extensionRegistry)
                 .buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input).buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input, extensionRegistry)
                 .buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        Builder builder = newBuilder();
        if (builder.mergeDelimitedFrom(input)) {
          return builder.buildParsed();
        } else {
          return null;
        }
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Builder builder = newBuilder();
        if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
          return builder.buildParsed();
        } else {
          return null;
        }
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input).buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input, extensionRegistry)
                 .buildParsed();
      }
      
      public static Builder newBuilder() { return Builder.create(); }
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate prototype) {
        return newBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() { return newBuilder(this); }
      
      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      public static final class Builder extends
          com.google.protobuf.GeneratedMessage.Builder<Builder>
         implements com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeUpdate_descriptor;
        }
        
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeUpdate_fieldAccessorTable;
        }
        
        // Construct using com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }
        
        private Builder(BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
            getArrivalFieldBuilder();
            getDepartureFieldBuilder();
          }
        }
        private static Builder create() {
          return new Builder();
        }
        
        public Builder clear() {
          super.clear();
          stopSequence_ = 0;
          bitField0_ = (bitField0_ & ~0x00000001);
          stopId_ = "";
          bitField0_ = (bitField0_ & ~0x00000002);
          if (arrivalBuilder_ == null) {
            arrival_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDefaultInstance();
          } else {
            arrivalBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000004);
          if (departureBuilder_ == null) {
            departure_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDefaultInstance();
          } else {
            departureBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000008);
          scheduleRelationship_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship.SCHEDULED;
          bitField0_ = (bitField0_ & ~0x00000010);
          return this;
        }
        
        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }
        
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.getDescriptor();
        }
        
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate getDefaultInstanceForType() {
          return com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.getDefaultInstance();
        }
        
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate build() {
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }
        
        private com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate buildParsed()
            throws com.google.protobuf.InvalidProtocolBufferException {
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(
              result).asInvalidProtocolBufferException();
          }
          return result;
        }
        
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate buildPartial() {
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate result = new com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.stopSequence_ = stopSequence_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.stopId_ = stopId_;
          if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
            to_bitField0_ |= 0x00000004;
          }
          if (arrivalBuilder_ == null) {
            result.arrival_ = arrival_;
          } else {
            result.arrival_ = arrivalBuilder_.build();
          }
          if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
            to_bitField0_ |= 0x00000008;
          }
          if (departureBuilder_ == null) {
            result.departure_ = departure_;
          } else {
            result.departure_ = departureBuilder_.build();
          }
          if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
            to_bitField0_ |= 0x00000010;
          }
          result.scheduleRelationship_ = scheduleRelationship_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }
        
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate) {
            return mergeFrom((com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }
        
        public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate other) {
          if (other == com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.getDefaultInstance()) return this;
          if (other.hasStopSequence()) {
            setStopSequence(other.getStopSequence());
          }
          if (other.hasStopId()) {
            setStopId(other.getStopId());
          }
          if (other.hasArrival()) {
            mergeArrival(other.getArrival());
          }
          if (other.hasDeparture()) {
            mergeDeparture(other.getDeparture());
          }
          if (other.hasScheduleRelationship()) {
            setScheduleRelationship(other.getScheduleRelationship());
          }
          this.mergeUnknownFields(other.getUnknownFields());
          return this;
        }
        
        public final boolean isInitialized() {
          return true;
        }
        
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder(
              this.getUnknownFields());
          while (true) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              default: {
                if (!parseUnknownField(input, unknownFields,
                                       extensionRegistry, tag)) {
                  this.setUnknownFields(unknownFields.build());
                  onChanged();
                  return this;
                }
                break;
              }
              case 8: {
                bitField0_ |= 0x00000001;
                stopSequence_ = input.readUInt32();
                break;
              }
              case 18: {
                com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.newBuilder();
                if (hasArrival()) {
                  subBuilder.mergeFrom(getArrival());
                }
                input.readMessage(subBuilder, extensionRegistry);
                setArrival(subBuilder.buildPartial());
                break;
              }
              case 26: {
                com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.newBuilder();
                if (hasDeparture()) {
                  subBuilder.mergeFrom(getDeparture());
                }
                input.readMessage(subBuilder, extensionRegistry);
                setDeparture(subBuilder.buildPartial());
                break;
              }
              case 34: {
                bitField0_ |= 0x00000002;
                stopId_ = input.readBytes();
                break;
              }
              case 40: {
                int rawValue = input.readEnum();
                com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship value = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(5, rawValue);
                } else {
                  bitField0_ |= 0x00000010;
                  scheduleRelationship_ = value;
                }
                break;
              }
            }
          }
        }
        
        private int bitField0_;
        
        // optional uint32 stop_sequence = 1;
        private int stopSequence_ ;
        public boolean hasStopSequence() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        public int getStopSequence() {
          return stopSequence_;
        }
        public Builder setStopSequence(int value) {
          bitField0_ |= 0x00000001;
          stopSequence_ = value;
          onChanged();
          return this;
        }
        public Builder clearStopSequence() {
          bitField0_ = (bitField0_ & ~0x00000001);
          stopSequence_ = 0;
          onChanged();
          return this;
        }
        
        // optional string stop_id = 4;
        private java.lang.Object stopId_ = "";
        public boolean hasStopId() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        public String getStopId() {
          java.lang.Object ref = stopId_;
          if (!(ref instanceof String)) {
            String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
            stopId_ = s;
            return s;
          } else {
            return (String) ref;
          }
        }
        public Builder setStopId(String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
          stopId_ = value;
          onChanged();
          return this;
        }
        public Builder clearStopId() {
          bitField0_ = (bitField0_ & ~0x00000002);
          stopId_ = getDefaultInstance().getStopId();
          onChanged();
          return this;
        }
        void setStopId(com.google.protobuf.ByteString value) {
          bitField0_ |= 0x00000002;
          stopId_ = value;
          onChanged();
        }
        
        // optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;
        private com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent arrival_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDefaultInstance();
        private com.google.protobuf.SingleFieldBuilder<
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder> arrivalBuilder_;
        public boolean hasArrival() {
          return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent getArrival() {
          if (arrivalBuilder_ == null) {
            return arrival_;
          } else {
            return arrivalBuilder_.getMessage();
          }
        }
        public Builder setArrival(com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent value) {
          if (arrivalBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            arrival_ = value;
            onChanged();
          } else {
            arrivalBuilder_.setMessage(value);
          }
          bitField0_ |= 0x00000004;
          return this;
        }
        public Builder setArrival(
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder builderForValue) {
          if (arrivalBuilder_ == null) {
            arrival_ = builderForValue.build();
            onChanged();
          } else {
            arrivalBuilder_.setMessage(builderForValue.build());
          }
          bitField0_ |= 0x00000004;
          return this;
        }
        public Builder mergeArrival(com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent value) {
          if (arrivalBuilder_ == null) {
            if (((bitField0_ & 0x00000004) == 0x00000004) &&
                arrival_ != com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDefaultInstance()) {
              arrival_ =
                com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.newBuilder(arrival_).mergeFrom(value).buildPartial();
            } else {
              arrival_ = value;
            }
            onChanged();
          } else {
            arrivalBuilder_.mergeFrom(value);
          }
          bitField0_ |= 0x00000004;
          return this;
        }
        public Builder clearArrival() {
          if (arrivalBuilder_ == null) {
            arrival_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDefaultInstance();
            onChanged();
          } else {
            arrivalBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000004);
          return this;
        }
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder getArrivalBuilder() {
          bitField0_ |= 0x00000004;
          onChanged();
          return getArrivalFieldBuilder().getBuilder();
        }
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder getArrivalOrBuilder() {
          if (arrivalBuilder_ != null) {
            return arrivalBuilder_.getMessageOrBuilder();
          } else {
            return arrival_;
          }
        }
        private com.google.protobuf.SingleFieldBuilder<
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder> 
            getArrivalFieldBuilder() {
          if (arrivalBuilder_ == null) {
            arrivalBuilder_ = new com.google.protobuf.SingleFieldBuilder<
                com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder>(
                    arrival_,
                    getParentForChildren(),
                    isClean());
            arrival_ = null;
          }
          return arrivalBuilder_;
        }
        
        // optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;
        private com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent departure_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDefaultInstance();
        private com.google.protobuf.SingleFieldBuilder<
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder> departureBuilder_;
        public boolean hasDeparture() {
          return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent getDeparture() {
          if (departureBuilder_ == null) {
            return departure_;
          } else {
            return departureBuilder_.getMessage();
          }
        }
        public Builder setDeparture(com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent value) {
          if (departureBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            departure_ = value;
            onChanged();
          } else {
            departureBuilder_.setMessage(value);
          }
          bitField0_ |= 0x00000008;
          return this;
        }
        public Builder setDeparture(
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder builderForValue) {
          if (departureBuilder_ == null) {
            departure_ = builderForValue.build();
            onChanged();
          } else {
            departureBuilder_.setMessage(builderForValue.build());
          }
          bitField0_ |= 0x00000008;
          return this;
        }
        public Builder mergeDeparture(com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent value) {
          if (departureBuilder_ == null) {
            if (((bitField0_ & 0x00000008) == 0x00000008) &&
                departure_ != com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDefaultInstance()) {
              departure_ =
                com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.newBuilder(departure_).mergeFrom(value).buildPartial();
            } else {
              departure_ = value;
            }
            onChanged();
          } else {
            departureBuilder_.mergeFrom(value);
          }
          bitField0_ |= 0x00000008;
          return this;
        }
        public Builder clearDeparture() {
          if (departureBuilder_ == null) {
            departure_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDefaultInstance();
            onChanged();
          } else {
            departureBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000008);
          return this;
        }
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder getDepartureBuilder() {
          bitField0_ |= 0x00000008;
          onChanged();
          return getDepartureFieldBuilder().getBuilder();
        }
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder getDepartureOrBuilder() {
          if (departureBuilder_ != null) {
            return departureBuilder_.getMessageOrBuilder();
          } else {
            return departure_;
          }
        }
        private com.google.protobuf.SingleFieldBuilder<
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder> 
            getDepartureFieldBuilder() {
          if (departureBuilder_ == null) {
            departureBuilder_ = new com.google.protobuf.SingleFieldBuilder<
                com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder>(
                    departure_,
                    getParentForChildren(),
                    isClean());
            departure_ = null;
          }
          return departureBuilder_;
        }
        
        // optional .transit_realtime.TripUpdate.StopTimeUpdate.ScheduleRelationship schedule_relationship = 5 [default = SCHEDULED];
        private com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship scheduleRelationship_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship.SCHEDULED;
        public boolean hasScheduleRelationship() {
          return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship getScheduleRelationship() {
          return scheduleRelationship_;
        }
        public Builder setScheduleRelationship(com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000010;
          scheduleRelationship_ = value;
          onChanged();
          return this;
        }
        public Builder clearScheduleRelationship() {
          bitField0_ = (bitField0_ & ~0x00000010);
          scheduleRelationship_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship.SCHEDULED;
          onChanged();
          return this;
        }
        
        // @@protoc_insertion_point(builder_scope:transit_realtime.TripUpdate.StopTimeUpdate)
      }
      
      static {
        defaultInstance = new StopTimeUpdate(true);
        defaultInstance.initFields();
      }
      
      // @@protoc_insertion_point(class_scope:transit_realtime.TripUpdate.StopTimeUpdate)
    }
    
    private int bitField0_;
    // required .transit_realtime.TripDescriptor trip = 1;
    public static final int TRIP_FIELD_NUMBER = 1;
    private com.google.transit.realtime.GtfsRealtime.TripDescriptor trip_;
    public boolean hasTrip() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip() {
      return trip_;
    }
    public com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder() {
      return trip_;
    }
    
    // optional .transit_realtime.VehicleDescriptor vehicle = 3;
    public static final int VEHICLE_FIELD_NUMBER = 3;
    private com.google.transit.realtime.GtfsRealtime.VehicleDescriptor vehicle_;
    public boolean hasVehicle() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor getVehicle() {
      return vehicle_;
    }
    public com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder getVehicleOrBuilder() {
      return vehicle_;
    }
    
    // repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;
    public static final int STOP_TIME_UPDATE_FIELD_NUMBER = 2;
    private java.util.List<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate> stopTimeUpdate_;
    public java.util.List<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate> getStopTimeUpdateList() {
      return stopTimeUpdate_;
    }
    public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder> 
        getStopTimeUpdateOrBuilderList() {
      return stopTimeUpdate_;
    }
    public int getStopTimeUpdateCount() {
      return stopTimeUpdate_.size();
    }
    public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate getStopTimeUpdate(int index) {
      return stopTimeUpdate_.get(index);
    }
    public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder getStopTimeUpdateOrBuilder(
        int index) {
      return stopTimeUpdate_.get(index);
    }
    
    private void initFields() {
      trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
      vehicle_ = com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
      stopTimeUpdate_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTrip()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, trip_);
      }
      for (int i = 0; i < stopTimeUpdate_.size(); i++) {
        output.writeMessage(2, stopTimeUpdate_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(3, vehicle_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, trip_);
      }
      for (int i = 0; i < stopTimeUpdate_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, stopTimeUpdate_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, vehicle_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.TripUpdate prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.google.transit.realtime.GtfsRealtime.TripUpdateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_fieldAccessorTable;
      }
      
      // Construct using com.google.transit.realtime.GtfsRealtime.TripUpdate.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getTripFieldBuilder();
          getVehicleFieldBuilder();
          getStopTimeUpdateFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (tripBuilder_ == null) {
          trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
        } else {
          tripBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (vehicleBuilder_ == null) {
          vehicle_ = com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
        } else {
          vehicleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (stopTimeUpdateBuilder_ == null) {
          stopTimeUpdate_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          stopTimeUpdateBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.TripUpdate.getDescriptor();
      }
      
      public com.google.transit.realtime.GtfsRealtime.TripUpdate getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.TripUpdate.getDefaultInstance();
      }
      
      public com.google.transit.realtime.GtfsRealtime.TripUpdate build() {
        com.google.transit.realtime.GtfsRealtime.TripUpdate result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.google.transit.realtime.GtfsRealtime.TripUpdate buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.transit.realtime.GtfsRealtime.TripUpdate result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.google.transit.realtime.GtfsRealtime.TripUpdate buildPartial() {
        com.google.transit.realtime.GtfsRealtime.TripUpdate result = new com.google.transit.realtime.GtfsRealtime.TripUpdate(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (tripBuilder_ == null) {
          result.trip_ = trip_;
        } else {
          result.trip_ = tripBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (vehicleBuilder_ == null) {
          result.vehicle_ = vehicle_;
        } else {
          result.vehicle_ = vehicleBuilder_.build();
        }
        if (stopTimeUpdateBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            stopTimeUpdate_ = java.util.Collections.unmodifiableList(stopTimeUpdate_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.stopTimeUpdate_ = stopTimeUpdate_;
        } else {
          result.stopTimeUpdate_ = stopTimeUpdateBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.TripUpdate) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.TripUpdate)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.TripUpdate other) {
        if (other == com.google.transit.realtime.GtfsRealtime.TripUpdate.getDefaultInstance()) return this;
        if (other.hasTrip()) {
          mergeTrip(other.getTrip());
        }
        if (other.hasVehicle()) {
          mergeVehicle(other.getVehicle());
        }
        if (stopTimeUpdateBuilder_ == null) {
          if (!other.stopTimeUpdate_.isEmpty()) {
            if (stopTimeUpdate_.isEmpty()) {
              stopTimeUpdate_ = other.stopTimeUpdate_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureStopTimeUpdateIsMutable();
              stopTimeUpdate_.addAll(other.stopTimeUpdate_);
            }
            onChanged();
          }
        } else {
          if (!other.stopTimeUpdate_.isEmpty()) {
            if (stopTimeUpdateBuilder_.isEmpty()) {
              stopTimeUpdateBuilder_.dispose();
              stopTimeUpdateBuilder_ = null;
              stopTimeUpdate_ = other.stopTimeUpdate_;
              bitField0_ = (bitField0_ & ~0x00000004);
              stopTimeUpdateBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getStopTimeUpdateFieldBuilder() : null;
            } else {
              stopTimeUpdateBuilder_.addAllMessages(other.stopTimeUpdate_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTrip()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.TripDescriptor.newBuilder();
              if (hasTrip()) {
                subBuilder.mergeFrom(getTrip());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setTrip(subBuilder.buildPartial());
              break;
            }
            case 18: {
              com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addStopTimeUpdate(subBuilder.buildPartial());
              break;
            }
            case 26: {
              com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.newBuilder();
              if (hasVehicle()) {
                subBuilder.mergeFrom(getVehicle());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setVehicle(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .transit_realtime.TripDescriptor trip = 1;
      private com.google.transit.realtime.GtfsRealtime.TripDescriptor trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder> tripBuilder_;
      public boolean hasTrip() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip() {
        if (tripBuilder_ == null) {
          return trip_;
        } else {
          return tripBuilder_.getMessage();
        }
      }
      public Builder setTrip(com.google.transit.realtime.GtfsRealtime.TripDescriptor value) {
        if (tripBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          trip_ = value;
          onChanged();
        } else {
          tripBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder setTrip(
          com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder builderForValue) {
        if (tripBuilder_ == null) {
          trip_ = builderForValue.build();
          onChanged();
        } else {
          tripBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder mergeTrip(com.google.transit.realtime.GtfsRealtime.TripDescriptor value) {
        if (tripBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              trip_ != com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance()) {
            trip_ =
              com.google.transit.realtime.GtfsRealtime.TripDescriptor.newBuilder(trip_).mergeFrom(value).buildPartial();
          } else {
            trip_ = value;
          }
          onChanged();
        } else {
          tripBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder clearTrip() {
        if (tripBuilder_ == null) {
          trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
          onChanged();
        } else {
          tripBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder getTripBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTripFieldBuilder().getBuilder();
      }
      public com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder() {
        if (tripBuilder_ != null) {
          return tripBuilder_.getMessageOrBuilder();
        } else {
          return trip_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder> 
          getTripFieldBuilder() {
        if (tripBuilder_ == null) {
          tripBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder>(
                  trip_,
                  getParentForChildren(),
                  isClean());
          trip_ = null;
        }
        return tripBuilder_;
      }
      
      // optional .transit_realtime.VehicleDescriptor vehicle = 3;
      private com.google.transit.realtime.GtfsRealtime.VehicleDescriptor vehicle_ = com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.VehicleDescriptor, com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder> vehicleBuilder_;
      public boolean hasVehicle() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor getVehicle() {
        if (vehicleBuilder_ == null) {
          return vehicle_;
        } else {
          return vehicleBuilder_.getMessage();
        }
      }
      public Builder setVehicle(com.google.transit.realtime.GtfsRealtime.VehicleDescriptor value) {
        if (vehicleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          vehicle_ = value;
          onChanged();
        } else {
          vehicleBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder setVehicle(
          com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder builderForValue) {
        if (vehicleBuilder_ == null) {
          vehicle_ = builderForValue.build();
          onChanged();
        } else {
          vehicleBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder mergeVehicle(com.google.transit.realtime.GtfsRealtime.VehicleDescriptor value) {
        if (vehicleBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              vehicle_ != com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance()) {
            vehicle_ =
              com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.newBuilder(vehicle_).mergeFrom(value).buildPartial();
          } else {
            vehicle_ = value;
          }
          onChanged();
        } else {
          vehicleBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder clearVehicle() {
        if (vehicleBuilder_ == null) {
          vehicle_ = com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
          onChanged();
        } else {
          vehicleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder getVehicleBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getVehicleFieldBuilder().getBuilder();
      }
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder getVehicleOrBuilder() {
        if (vehicleBuilder_ != null) {
          return vehicleBuilder_.getMessageOrBuilder();
        } else {
          return vehicle_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.VehicleDescriptor, com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder> 
          getVehicleFieldBuilder() {
        if (vehicleBuilder_ == null) {
          vehicleBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.VehicleDescriptor, com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder>(
                  vehicle_,
                  getParentForChildren(),
                  isClean());
          vehicle_ = null;
        }
        return vehicleBuilder_;
      }
      
      // repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;
      private java.util.List<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate> stopTimeUpdate_ =
        java.util.Collections.emptyList();
      private void ensureStopTimeUpdateIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          stopTimeUpdate_ = new java.util.ArrayList<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate>(stopTimeUpdate_);
          bitField0_ |= 0x00000004;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder> stopTimeUpdateBuilder_;
      
      public java.util.List<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate> getStopTimeUpdateList() {
        if (stopTimeUpdateBuilder_ == null) {
          return java.util.Collections.unmodifiableList(stopTimeUpdate_);
        } else {
          return stopTimeUpdateBuilder_.getMessageList();
        }
      }
      public int getStopTimeUpdateCount() {
        if (stopTimeUpdateBuilder_ == null) {
          return stopTimeUpdate_.size();
        } else {
          return stopTimeUpdateBuilder_.getCount();
        }
      }
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate getStopTimeUpdate(int index) {
        if (stopTimeUpdateBuilder_ == null) {
          return stopTimeUpdate_.get(index);
        } else {
          return stopTimeUpdateBuilder_.getMessage(index);
        }
      }
      public Builder setStopTimeUpdate(
          int index, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate value) {
        if (stopTimeUpdateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStopTimeUpdateIsMutable();
          stopTimeUpdate_.set(index, value);
          onChanged();
        } else {
          stopTimeUpdateBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setStopTimeUpdate(
          int index, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder builderForValue) {
        if (stopTimeUpdateBuilder_ == null) {
          ensureStopTimeUpdateIsMutable();
          stopTimeUpdate_.set(index, builderForValue.build());
          onChanged();
        } else {
          stopTimeUpdateBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addStopTimeUpdate(com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate value) {
        if (stopTimeUpdateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStopTimeUpdateIsMutable();
          stopTimeUpdate_.add(value);
          onChanged();
        } else {
          stopTimeUpdateBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addStopTimeUpdate(
          int index, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate value) {
        if (stopTimeUpdateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStopTimeUpdateIsMutable();
          stopTimeUpdate_.add(index, value);
          onChanged();
        } else {
          stopTimeUpdateBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addStopTimeUpdate(
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder builderForValue) {
        if (stopTimeUpdateBuilder_ == null) {
          ensureStopTimeUpdateIsMutable();
          stopTimeUpdate_.add(builderForValue.build());
          onChanged();
        } else {
          stopTimeUpdateBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addStopTimeUpdate(
          int index, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder builderForValue) {
        if (stopTimeUpdateBuilder_ == null) {
          ensureStopTimeUpdateIsMutable();
          stopTimeUpdate_.add(index, builderForValue.build());
          onChanged();
        } else {
          stopTimeUpdateBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllStopTimeUpdate(
          java.lang.Iterable<? extends com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate> values) {
        if (stopTimeUpdateBuilder_ == null) {
          ensureStopTimeUpdateIsMutable();
          super.addAll(values, stopTimeUpdate_);
          onChanged();
        } else {
          stopTimeUpdateBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearStopTimeUpdate() {
        if (stopTimeUpdateBuilder_ == null) {
          stopTimeUpdate_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          stopTimeUpdateBuilder_.clear();
        }
        return this;
      }
      public Builder removeStopTimeUpdate(int index) {
        if (stopTimeUpdateBuilder_ == null) {
          ensureStopTimeUpdateIsMutable();
          stopTimeUpdate_.remove(index);
          onChanged();
        } else {
          stopTimeUpdateBuilder_.remove(index);
        }
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder getStopTimeUpdateBuilder(
          int index) {
        return getStopTimeUpdateFieldBuilder().getBuilder(index);
      }
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder getStopTimeUpdateOrBuilder(
          int index) {
        if (stopTimeUpdateBuilder_ == null) {
          return stopTimeUpdate_.get(index);  } else {
          return stopTimeUpdateBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder> 
           getStopTimeUpdateOrBuilderList() {
        if (stopTimeUpdateBuilder_ != null) {
          return stopTimeUpdateBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(stopTimeUpdate_);
        }
      }
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder addStopTimeUpdateBuilder() {
        return getStopTimeUpdateFieldBuilder().addBuilder(
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.getDefaultInstance());
      }
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder addStopTimeUpdateBuilder(
          int index) {
        return getStopTimeUpdateFieldBuilder().addBuilder(
            index, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.getDefaultInstance());
      }
      public java.util.List<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder> 
           getStopTimeUpdateBuilderList() {
        return getStopTimeUpdateFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder> 
          getStopTimeUpdateFieldBuilder() {
        if (stopTimeUpdateBuilder_ == null) {
          stopTimeUpdateBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder>(
                  stopTimeUpdate_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          stopTimeUpdate_ = null;
        }
        return stopTimeUpdateBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:transit_realtime.TripUpdate)
    }
    
    static {
      defaultInstance = new TripUpdate(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:transit_realtime.TripUpdate)
  }
  
  public interface VehiclePositionOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional .transit_realtime.TripDescriptor trip = 1;
    boolean hasTrip();
    com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip();
    com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder();
    
    // optional .transit_realtime.VehicleDescriptor vehicle = 8;
    boolean hasVehicle();
    com.google.transit.realtime.GtfsRealtime.VehicleDescriptor getVehicle();
    com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder getVehicleOrBuilder();
    
    // optional .transit_realtime.Position position = 2;
    boolean hasPosition();
    com.google.transit.realtime.GtfsRealtime.Position getPosition();
    com.google.transit.realtime.GtfsRealtime.PositionOrBuilder getPositionOrBuilder();
    
    // optional uint32 current_stop_sequence = 3;
    boolean hasCurrentStopSequence();
    int getCurrentStopSequence();
    
    // optional string stop_id = 7;
    boolean hasStopId();
    String getStopId();
    
    // optional .transit_realtime.VehiclePosition.VehicleStopStatus current_status = 4 [default = IN_TRANSIT_TO];
    boolean hasCurrentStatus();
    com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus getCurrentStatus();
    
    // optional uint64 timestamp = 5;
    boolean hasTimestamp();
    long getTimestamp();
    
    // optional .transit_realtime.VehiclePosition.CongestionLevel congestion_level = 6;
    boolean hasCongestionLevel();
    com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel getCongestionLevel();
  }
  public static final class VehiclePosition extends
      com.google.protobuf.GeneratedMessage
      implements VehiclePositionOrBuilder {
    // Use VehiclePosition.newBuilder() to construct.
    private VehiclePosition(Builder builder) {
      super(builder);
    }
    private VehiclePosition(boolean noInit) {}
    
    private static final VehiclePosition defaultInstance;
    public static VehiclePosition getDefaultInstance() {
      return defaultInstance;
    }
    
    public VehiclePosition getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehiclePosition_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehiclePosition_fieldAccessorTable;
    }
    
    public enum VehicleStopStatus
        implements com.google.protobuf.ProtocolMessageEnum {
      INCOMING_AT(0, 0),
      STOPPED_AT(1, 1),
      IN_TRANSIT_TO(2, 2),
      ;
      
      public static final int INCOMING_AT_VALUE = 0;
      public static final int STOPPED_AT_VALUE = 1;
      public static final int IN_TRANSIT_TO_VALUE = 2;
      
      
      public final int getNumber() { return value; }
      
      public static VehicleStopStatus valueOf(int value) {
        switch (value) {
          case 0: return INCOMING_AT;
          case 1: return STOPPED_AT;
          case 2: return IN_TRANSIT_TO;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<VehicleStopStatus>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<VehicleStopStatus>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<VehicleStopStatus>() {
              public VehicleStopStatus findValueByNumber(int number) {
                return VehicleStopStatus.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final VehicleStopStatus[] VALUES = {
        INCOMING_AT, STOPPED_AT, IN_TRANSIT_TO, 
      };
      
      public static VehicleStopStatus valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private VehicleStopStatus(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:transit_realtime.VehiclePosition.VehicleStopStatus)
    }
    
    public enum CongestionLevel
        implements com.google.protobuf.ProtocolMessageEnum {
      UNKNOWN_CONGESTION_LEVEL(0, 0),
      RUNNING_SMOOTHLY(1, 1),
      STOP_AND_GO(2, 2),
      CONGESTION(3, 3),
      SEVERE_CONGESTION(4, 4),
      ;
      
      public static final int UNKNOWN_CONGESTION_LEVEL_VALUE = 0;
      public static final int RUNNING_SMOOTHLY_VALUE = 1;
      public static final int STOP_AND_GO_VALUE = 2;
      public static final int CONGESTION_VALUE = 3;
      public static final int SEVERE_CONGESTION_VALUE = 4;
      
      
      public final int getNumber() { return value; }
      
      public static CongestionLevel valueOf(int value) {
        switch (value) {
          case 0: return UNKNOWN_CONGESTION_LEVEL;
          case 1: return RUNNING_SMOOTHLY;
          case 2: return STOP_AND_GO;
          case 3: return CONGESTION;
          case 4: return SEVERE_CONGESTION;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<CongestionLevel>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<CongestionLevel>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CongestionLevel>() {
              public CongestionLevel findValueByNumber(int number) {
                return CongestionLevel.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDescriptor().getEnumTypes().get(1);
      }
      
      private static final CongestionLevel[] VALUES = {
        UNKNOWN_CONGESTION_LEVEL, RUNNING_SMOOTHLY, STOP_AND_GO, CONGESTION, SEVERE_CONGESTION, 
      };
      
      public static CongestionLevel valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private CongestionLevel(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:transit_realtime.VehiclePosition.CongestionLevel)
    }
    
    private int bitField0_;
    // optional .transit_realtime.TripDescriptor trip = 1;
    public static final int TRIP_FIELD_NUMBER = 1;
    private com.google.transit.realtime.GtfsRealtime.TripDescriptor trip_;
    public boolean hasTrip() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip() {
      return trip_;
    }
    public com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder() {
      return trip_;
    }
    
    // optional .transit_realtime.VehicleDescriptor vehicle = 8;
    public static final int VEHICLE_FIELD_NUMBER = 8;
    private com.google.transit.realtime.GtfsRealtime.VehicleDescriptor vehicle_;
    public boolean hasVehicle() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor getVehicle() {
      return vehicle_;
    }
    public com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder getVehicleOrBuilder() {
      return vehicle_;
    }
    
    // optional .transit_realtime.Position position = 2;
    public static final int POSITION_FIELD_NUMBER = 2;
    private com.google.transit.realtime.GtfsRealtime.Position position_;
    public boolean hasPosition() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public com.google.transit.realtime.GtfsRealtime.Position getPosition() {
      return position_;
    }
    public com.google.transit.realtime.GtfsRealtime.PositionOrBuilder getPositionOrBuilder() {
      return position_;
    }
    
    // optional uint32 current_stop_sequence = 3;
    public static final int CURRENT_STOP_SEQUENCE_FIELD_NUMBER = 3;
    private int currentStopSequence_;
    public boolean hasCurrentStopSequence() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getCurrentStopSequence() {
      return currentStopSequence_;
    }
    
    // optional string stop_id = 7;
    public static final int STOP_ID_FIELD_NUMBER = 7;
    private java.lang.Object stopId_;
    public boolean hasStopId() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public String getStopId() {
      java.lang.Object ref = stopId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          stopId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getStopIdBytes() {
      java.lang.Object ref = stopId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        stopId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional .transit_realtime.VehiclePosition.VehicleStopStatus current_status = 4 [default = IN_TRANSIT_TO];
    public static final int CURRENT_STATUS_FIELD_NUMBER = 4;
    private com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus currentStatus_;
    public boolean hasCurrentStatus() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus getCurrentStatus() {
      return currentStatus_;
    }
    
    // optional uint64 timestamp = 5;
    public static final int TIMESTAMP_FIELD_NUMBER = 5;
    private long timestamp_;
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public long getTimestamp() {
      return timestamp_;
    }
    
    // optional .transit_realtime.VehiclePosition.CongestionLevel congestion_level = 6;
    public static final int CONGESTION_LEVEL_FIELD_NUMBER = 6;
    private com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel congestionLevel_;
    public boolean hasCongestionLevel() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel getCongestionLevel() {
      return congestionLevel_;
    }
    
    private void initFields() {
      trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
      vehicle_ = com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
      position_ = com.google.transit.realtime.GtfsRealtime.Position.getDefaultInstance();
      currentStopSequence_ = 0;
      stopId_ = "";
      currentStatus_ = com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus.IN_TRANSIT_TO;
      timestamp_ = 0L;
      congestionLevel_ = com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel.UNKNOWN_CONGESTION_LEVEL;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (hasPosition()) {
        if (!getPosition().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, trip_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(2, position_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(3, currentStopSequence_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeEnum(4, currentStatus_.getNumber());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeUInt64(5, timestamp_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeEnum(6, congestionLevel_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(7, getStopIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(8, vehicle_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, trip_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, position_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, currentStopSequence_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, currentStatus_.getNumber());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, timestamp_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, congestionLevel_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, getStopIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, vehicle_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.VehiclePosition prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.google.transit.realtime.GtfsRealtime.VehiclePositionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehiclePosition_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehiclePosition_fieldAccessorTable;
      }
      
      // Construct using com.google.transit.realtime.GtfsRealtime.VehiclePosition.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getTripFieldBuilder();
          getVehicleFieldBuilder();
          getPositionFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (tripBuilder_ == null) {
          trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
        } else {
          tripBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (vehicleBuilder_ == null) {
          vehicle_ = com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
        } else {
          vehicleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (positionBuilder_ == null) {
          position_ = com.google.transit.realtime.GtfsRealtime.Position.getDefaultInstance();
        } else {
          positionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        currentStopSequence_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        stopId_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        currentStatus_ = com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus.IN_TRANSIT_TO;
        bitField0_ = (bitField0_ & ~0x00000020);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000040);
        congestionLevel_ = com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel.UNKNOWN_CONGESTION_LEVEL;
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDescriptor();
      }
      
      public com.google.transit.realtime.GtfsRealtime.VehiclePosition getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDefaultInstance();
      }
      
      public com.google.transit.realtime.GtfsRealtime.VehiclePosition build() {
        com.google.transit.realtime.GtfsRealtime.VehiclePosition result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.google.transit.realtime.GtfsRealtime.VehiclePosition buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.transit.realtime.GtfsRealtime.VehiclePosition result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.google.transit.realtime.GtfsRealtime.VehiclePosition buildPartial() {
        com.google.transit.realtime.GtfsRealtime.VehiclePosition result = new com.google.transit.realtime.GtfsRealtime.VehiclePosition(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (tripBuilder_ == null) {
          result.trip_ = trip_;
        } else {
          result.trip_ = tripBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (vehicleBuilder_ == null) {
          result.vehicle_ = vehicle_;
        } else {
          result.vehicle_ = vehicleBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (positionBuilder_ == null) {
          result.position_ = position_;
        } else {
          result.position_ = positionBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.currentStopSequence_ = currentStopSequence_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.stopId_ = stopId_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.currentStatus_ = currentStatus_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.timestamp_ = timestamp_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.congestionLevel_ = congestionLevel_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.VehiclePosition) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.VehiclePosition)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.VehiclePosition other) {
        if (other == com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDefaultInstance()) return this;
        if (other.hasTrip()) {
          mergeTrip(other.getTrip());
        }
        if (other.hasVehicle()) {
          mergeVehicle(other.getVehicle());
        }
        if (other.hasPosition()) {
          mergePosition(other.getPosition());
        }
        if (other.hasCurrentStopSequence()) {
          setCurrentStopSequence(other.getCurrentStopSequence());
        }
        if (other.hasStopId()) {
          setStopId(other.getStopId());
        }
        if (other.hasCurrentStatus()) {
          setCurrentStatus(other.getCurrentStatus());
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasCongestionLevel()) {
          setCongestionLevel(other.getCongestionLevel());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (hasPosition()) {
          if (!getPosition().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.TripDescriptor.newBuilder();
              if (hasTrip()) {
                subBuilder.mergeFrom(getTrip());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setTrip(subBuilder.buildPartial());
              break;
            }
            case 18: {
              com.google.transit.realtime.GtfsRealtime.Position.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.Position.newBuilder();
              if (hasPosition()) {
                subBuilder.mergeFrom(getPosition());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setPosition(subBuilder.buildPartial());
              break;
            }
            case 24: {
              bitField0_ |= 0x00000008;
              currentStopSequence_ = input.readUInt32();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus value = com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000020;
                currentStatus_ = value;
              }
              break;
            }
            case 40: {
              bitField0_ |= 0x00000040;
              timestamp_ = input.readUInt64();
              break;
            }
            case 48: {
              int rawValue = input.readEnum();
              com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel value = com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(6, rawValue);
              } else {
                bitField0_ |= 0x00000080;
                congestionLevel_ = value;
              }
              break;
            }
            case 58: {
              bitField0_ |= 0x00000010;
              stopId_ = input.readBytes();
              break;
            }
            case 66: {
              com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.newBuilder();
              if (hasVehicle()) {
                subBuilder.mergeFrom(getVehicle());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setVehicle(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional .transit_realtime.TripDescriptor trip = 1;
      private com.google.transit.realtime.GtfsRealtime.TripDescriptor trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder> tripBuilder_;
      public boolean hasTrip() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip() {
        if (tripBuilder_ == null) {
          return trip_;
        } else {
          return tripBuilder_.getMessage();
        }
      }
      public Builder setTrip(com.google.transit.realtime.GtfsRealtime.TripDescriptor value) {
        if (tripBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          trip_ = value;
          onChanged();
        } else {
          tripBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder setTrip(
          com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder builderForValue) {
        if (tripBuilder_ == null) {
          trip_ = builderForValue.build();
          onChanged();
        } else {
          tripBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder mergeTrip(com.google.transit.realtime.GtfsRealtime.TripDescriptor value) {
        if (tripBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              trip_ != com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance()) {
            trip_ =
              com.google.transit.realtime.GtfsRealtime.TripDescriptor.newBuilder(trip_).mergeFrom(value).buildPartial();
          } else {
            trip_ = value;
          }
          onChanged();
        } else {
          tripBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder clearTrip() {
        if (tripBuilder_ == null) {
          trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
          onChanged();
        } else {
          tripBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder getTripBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTripFieldBuilder().getBuilder();
      }
      public com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder() {
        if (tripBuilder_ != null) {
          return tripBuilder_.getMessageOrBuilder();
        } else {
          return trip_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder> 
          getTripFieldBuilder() {
        if (tripBuilder_ == null) {
          tripBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder>(
                  trip_,
                  getParentForChildren(),
                  isClean());
          trip_ = null;
        }
        return tripBuilder_;
      }
      
      // optional .transit_realtime.VehicleDescriptor vehicle = 8;
      private com.google.transit.realtime.GtfsRealtime.VehicleDescriptor vehicle_ = com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.VehicleDescriptor, com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder> vehicleBuilder_;
      public boolean hasVehicle() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor getVehicle() {
        if (vehicleBuilder_ == null) {
          return vehicle_;
        } else {
          return vehicleBuilder_.getMessage();
        }
      }
      public Builder setVehicle(com.google.transit.realtime.GtfsRealtime.VehicleDescriptor value) {
        if (vehicleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          vehicle_ = value;
          onChanged();
        } else {
          vehicleBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder setVehicle(
          com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder builderForValue) {
        if (vehicleBuilder_ == null) {
          vehicle_ = builderForValue.build();
          onChanged();
        } else {
          vehicleBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder mergeVehicle(com.google.transit.realtime.GtfsRealtime.VehicleDescriptor value) {
        if (vehicleBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              vehicle_ != com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance()) {
            vehicle_ =
              com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.newBuilder(vehicle_).mergeFrom(value).buildPartial();
          } else {
            vehicle_ = value;
          }
          onChanged();
        } else {
          vehicleBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder clearVehicle() {
        if (vehicleBuilder_ == null) {
          vehicle_ = com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
          onChanged();
        } else {
          vehicleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder getVehicleBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getVehicleFieldBuilder().getBuilder();
      }
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder getVehicleOrBuilder() {
        if (vehicleBuilder_ != null) {
          return vehicleBuilder_.getMessageOrBuilder();
        } else {
          return vehicle_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.VehicleDescriptor, com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder> 
          getVehicleFieldBuilder() {
        if (vehicleBuilder_ == null) {
          vehicleBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.VehicleDescriptor, com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder>(
                  vehicle_,
                  getParentForChildren(),
                  isClean());
          vehicle_ = null;
        }
        return vehicleBuilder_;
      }
      
      // optional .transit_realtime.Position position = 2;
      private com.google.transit.realtime.GtfsRealtime.Position position_ = com.google.transit.realtime.GtfsRealtime.Position.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.Position, com.google.transit.realtime.GtfsRealtime.Position.Builder, com.google.transit.realtime.GtfsRealtime.PositionOrBuilder> positionBuilder_;
      public boolean hasPosition() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public com.google.transit.realtime.GtfsRealtime.Position getPosition() {
        if (positionBuilder_ == null) {
          return position_;
        } else {
          return positionBuilder_.getMessage();
        }
      }
      public Builder setPosition(com.google.transit.realtime.GtfsRealtime.Position value) {
        if (positionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          position_ = value;
          onChanged();
        } else {
          positionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder setPosition(
          com.google.transit.realtime.GtfsRealtime.Position.Builder builderForValue) {
        if (positionBuilder_ == null) {
          position_ = builderForValue.build();
          onChanged();
        } else {
          positionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder mergePosition(com.google.transit.realtime.GtfsRealtime.Position value) {
        if (positionBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              position_ != com.google.transit.realtime.GtfsRealtime.Position.getDefaultInstance()) {
            position_ =
              com.google.transit.realtime.GtfsRealtime.Position.newBuilder(position_).mergeFrom(value).buildPartial();
          } else {
            position_ = value;
          }
          onChanged();
        } else {
          positionBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder clearPosition() {
        if (positionBuilder_ == null) {
          position_ = com.google.transit.realtime.GtfsRealtime.Position.getDefaultInstance();
          onChanged();
        } else {
          positionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.Position.Builder getPositionBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getPositionFieldBuilder().getBuilder();
      }
      public com.google.transit.realtime.GtfsRealtime.PositionOrBuilder getPositionOrBuilder() {
        if (positionBuilder_ != null) {
          return positionBuilder_.getMessageOrBuilder();
        } else {
          return position_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.Position, com.google.transit.realtime.GtfsRealtime.Position.Builder, com.google.transit.realtime.GtfsRealtime.PositionOrBuilder> 
          getPositionFieldBuilder() {
        if (positionBuilder_ == null) {
          positionBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.Position, com.google.transit.realtime.GtfsRealtime.Position.Builder, com.google.transit.realtime.GtfsRealtime.PositionOrBuilder>(
                  position_,
                  getParentForChildren(),
                  isClean());
          position_ = null;
        }
        return positionBuilder_;
      }
      
      // optional uint32 current_stop_sequence = 3;
      private int currentStopSequence_ ;
      public boolean hasCurrentStopSequence() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getCurrentStopSequence() {
        return currentStopSequence_;
      }
      public Builder setCurrentStopSequence(int value) {
        bitField0_ |= 0x00000008;
        currentStopSequence_ = value;
        onChanged();
        return this;
      }
      public Builder clearCurrentStopSequence() {
        bitField0_ = (bitField0_ & ~0x00000008);
        currentStopSequence_ = 0;
        onChanged();
        return this;
      }
      
      // optional string stop_id = 7;
      private java.lang.Object stopId_ = "";
      public boolean hasStopId() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public String getStopId() {
        java.lang.Object ref = stopId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          stopId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setStopId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        stopId_ = value;
        onChanged();
        return this;
      }
      public Builder clearStopId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        stopId_ = getDefaultInstance().getStopId();
        onChanged();
        return this;
      }
      void setStopId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000010;
        stopId_ = value;
        onChanged();
      }
      
      // optional .transit_realtime.VehiclePosition.VehicleStopStatus current_status = 4 [default = IN_TRANSIT_TO];
      private com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus currentStatus_ = com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus.IN_TRANSIT_TO;
      public boolean hasCurrentStatus() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus getCurrentStatus() {
        return currentStatus_;
      }
      public Builder setCurrentStatus(com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        currentStatus_ = value;
        onChanged();
        return this;
      }
      public Builder clearCurrentStatus() {
        bitField0_ = (bitField0_ & ~0x00000020);
        currentStatus_ = com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus.IN_TRANSIT_TO;
        onChanged();
        return this;
      }
      
      // optional uint64 timestamp = 5;
      private long timestamp_ ;
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public long getTimestamp() {
        return timestamp_;
      }
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000040;
        timestamp_ = value;
        onChanged();
        return this;
      }
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000040);
        timestamp_ = 0L;
        onChanged();
        return this;
      }
      
      // optional .transit_realtime.VehiclePosition.CongestionLevel congestion_level = 6;
      private com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel congestionLevel_ = com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel.UNKNOWN_CONGESTION_LEVEL;
      public boolean hasCongestionLevel() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel getCongestionLevel() {
        return congestionLevel_;
      }
      public Builder setCongestionLevel(com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000080;
        congestionLevel_ = value;
        onChanged();
        return this;
      }
      public Builder clearCongestionLevel() {
        bitField0_ = (bitField0_ & ~0x00000080);
        congestionLevel_ = com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel.UNKNOWN_CONGESTION_LEVEL;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:transit_realtime.VehiclePosition)
    }
    
    static {
      defaultInstance = new VehiclePosition(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:transit_realtime.VehiclePosition)
  }
  
  public interface AlertOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated .transit_realtime.TimeRange active_period = 1;
    java.util.List<com.google.transit.realtime.GtfsRealtime.TimeRange> 
        getActivePeriodList();
    com.google.transit.realtime.GtfsRealtime.TimeRange getActivePeriod(int index);
    int getActivePeriodCount();
    java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder> 
        getActivePeriodOrBuilderList();
    com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder getActivePeriodOrBuilder(
        int index);
    
    // repeated .transit_realtime.EntitySelector informed_entity = 5;
    java.util.List<com.google.transit.realtime.GtfsRealtime.EntitySelector> 
        getInformedEntityList();
    com.google.transit.realtime.GtfsRealtime.EntitySelector getInformedEntity(int index);
    int getInformedEntityCount();
    java.util.List<? extends com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder> 
        getInformedEntityOrBuilderList();
    com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder getInformedEntityOrBuilder(
        int index);
    
    // optional .transit_realtime.Alert.Cause cause = 6 [default = UNKNOWN_CAUSE];
    boolean hasCause();
    com.google.transit.realtime.GtfsRealtime.Alert.Cause getCause();
    
    // optional .transit_realtime.Alert.Effect effect = 7 [default = UNKNOWN_EFFECT];
    boolean hasEffect();
    com.google.transit.realtime.GtfsRealtime.Alert.Effect getEffect();
    
    // optional .transit_realtime.TranslatedString url = 8;
    boolean hasUrl();
    com.google.transit.realtime.GtfsRealtime.TranslatedString getUrl();
    com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getUrlOrBuilder();
    
    // optional .transit_realtime.TranslatedString header_text = 10;
    boolean hasHeaderText();
    com.google.transit.realtime.GtfsRealtime.TranslatedString getHeaderText();
    com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getHeaderTextOrBuilder();
    
    // optional .transit_realtime.TranslatedString description_text = 11;
    boolean hasDescriptionText();
    com.google.transit.realtime.GtfsRealtime.TranslatedString getDescriptionText();
    com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getDescriptionTextOrBuilder();
  }
  public static final class Alert extends
      com.google.protobuf.GeneratedMessage
      implements AlertOrBuilder {
    // Use Alert.newBuilder() to construct.
    private Alert(Builder builder) {
      super(builder);
    }
    private Alert(boolean noInit) {}
    
    private static final Alert defaultInstance;
    public static Alert getDefaultInstance() {
      return defaultInstance;
    }
    
    public Alert getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Alert_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Alert_fieldAccessorTable;
    }
    
    public enum Cause
        implements com.google.protobuf.ProtocolMessageEnum {
      UNKNOWN_CAUSE(0, 1),
      OTHER_CAUSE(1, 2),
      TECHNICAL_PROBLEM(2, 3),
      STRIKE(3, 4),
      DEMONSTRATION(4, 5),
      ACCIDENT(5, 6),
      HOLIDAY(6, 7),
      WEATHER(7, 8),
      MAINTENANCE(8, 9),
      CONSTRUCTION(9, 10),
      POLICE_ACTIVITY(10, 11),
      MEDICAL_EMERGENCY(11, 12),
      ;
      
      public static final int UNKNOWN_CAUSE_VALUE = 1;
      public static final int OTHER_CAUSE_VALUE = 2;
      public static final int TECHNICAL_PROBLEM_VALUE = 3;
      public static final int STRIKE_VALUE = 4;
      public static final int DEMONSTRATION_VALUE = 5;
      public static final int ACCIDENT_VALUE = 6;
      public static final int HOLIDAY_VALUE = 7;
      public static final int WEATHER_VALUE = 8;
      public static final int MAINTENANCE_VALUE = 9;
      public static final int CONSTRUCTION_VALUE = 10;
      public static final int POLICE_ACTIVITY_VALUE = 11;
      public static final int MEDICAL_EMERGENCY_VALUE = 12;
      
      
      public final int getNumber() { return value; }
      
      public static Cause valueOf(int value) {
        switch (value) {
          case 1: return UNKNOWN_CAUSE;
          case 2: return OTHER_CAUSE;
          case 3: return TECHNICAL_PROBLEM;
          case 4: return STRIKE;
          case 5: return DEMONSTRATION;
          case 6: return ACCIDENT;
          case 7: return HOLIDAY;
          case 8: return WEATHER;
          case 9: return MAINTENANCE;
          case 10: return CONSTRUCTION;
          case 11: return POLICE_ACTIVITY;
          case 12: return MEDICAL_EMERGENCY;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<Cause>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Cause>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Cause>() {
              public Cause findValueByNumber(int number) {
                return Cause.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.Alert.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final Cause[] VALUES = {
        UNKNOWN_CAUSE, OTHER_CAUSE, TECHNICAL_PROBLEM, STRIKE, DEMONSTRATION, ACCIDENT, HOLIDAY, WEATHER, MAINTENANCE, CONSTRUCTION, POLICE_ACTIVITY, MEDICAL_EMERGENCY, 
      };
      
      public static Cause valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private Cause(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:transit_realtime.Alert.Cause)
    }
    
    public enum Effect
        implements com.google.protobuf.ProtocolMessageEnum {
      NO_SERVICE(0, 1),
      REDUCED_SERVICE(1, 2),
      SIGNIFICANT_DELAYS(2, 3),
      DETOUR(3, 4),
      ADDITIONAL_SERVICE(4, 5),
      MODIFIED_SERVICE(5, 6),
      OTHER_EFFECT(6, 7),
      UNKNOWN_EFFECT(7, 8),
      STOP_MOVED(8, 9),
      ;
      
      public static final int NO_SERVICE_VALUE = 1;
      public static final int REDUCED_SERVICE_VALUE = 2;
      public static final int SIGNIFICANT_DELAYS_VALUE = 3;
      public static final int DETOUR_VALUE = 4;
      public static final int ADDITIONAL_SERVICE_VALUE = 5;
      public static final int MODIFIED_SERVICE_VALUE = 6;
      public static final int OTHER_EFFECT_VALUE = 7;
      public static final int UNKNOWN_EFFECT_VALUE = 8;
      public static final int STOP_MOVED_VALUE = 9;
      
      
      public final int getNumber() { return value; }
      
      public static Effect valueOf(int value) {
        switch (value) {
          case 1: return NO_SERVICE;
          case 2: return REDUCED_SERVICE;
          case 3: return SIGNIFICANT_DELAYS;
          case 4: return DETOUR;
          case 5: return ADDITIONAL_SERVICE;
          case 6: return MODIFIED_SERVICE;
          case 7: return OTHER_EFFECT;
          case 8: return UNKNOWN_EFFECT;
          case 9: return STOP_MOVED;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<Effect>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Effect>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Effect>() {
              public Effect findValueByNumber(int number) {
                return Effect.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.Alert.getDescriptor().getEnumTypes().get(1);
      }
      
      private static final Effect[] VALUES = {
        NO_SERVICE, REDUCED_SERVICE, SIGNIFICANT_DELAYS, DETOUR, ADDITIONAL_SERVICE, MODIFIED_SERVICE, OTHER_EFFECT, UNKNOWN_EFFECT, STOP_MOVED, 
      };
      
      public static Effect valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private Effect(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:transit_realtime.Alert.Effect)
    }
    
    private int bitField0_;
    // repeated .transit_realtime.TimeRange active_period = 1;
    public static final int ACTIVE_PERIOD_FIELD_NUMBER = 1;
    private java.util.List<com.google.transit.realtime.GtfsRealtime.TimeRange> activePeriod_;
    public java.util.List<com.google.transit.realtime.GtfsRealtime.TimeRange> getActivePeriodList() {
      return activePeriod_;
    }
    public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder> 
        getActivePeriodOrBuilderList() {
      return activePeriod_;
    }
    public int getActivePeriodCount() {
      return activePeriod_.size();
    }
    public com.google.transit.realtime.GtfsRealtime.TimeRange getActivePeriod(int index) {
      return activePeriod_.get(index);
    }
    public com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder getActivePeriodOrBuilder(
        int index) {
      return activePeriod_.get(index);
    }
    
    // repeated .transit_realtime.EntitySelector informed_entity = 5;
    public static final int INFORMED_ENTITY_FIELD_NUMBER = 5;
    private java.util.List<com.google.transit.realtime.GtfsRealtime.EntitySelector> informedEntity_;
    public java.util.List<com.google.transit.realtime.GtfsRealtime.EntitySelector> getInformedEntityList() {
      return informedEntity_;
    }
    public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder> 
        getInformedEntityOrBuilderList() {
      return informedEntity_;
    }
    public int getInformedEntityCount() {
      return informedEntity_.size();
    }
    public com.google.transit.realtime.GtfsRealtime.EntitySelector getInformedEntity(int index) {
      return informedEntity_.get(index);
    }
    public com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder getInformedEntityOrBuilder(
        int index) {
      return informedEntity_.get(index);
    }
    
    // optional .transit_realtime.Alert.Cause cause = 6 [default = UNKNOWN_CAUSE];
    public static final int CAUSE_FIELD_NUMBER = 6;
    private com.google.transit.realtime.GtfsRealtime.Alert.Cause cause_;
    public boolean hasCause() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.google.transit.realtime.GtfsRealtime.Alert.Cause getCause() {
      return cause_;
    }
    
    // optional .transit_realtime.Alert.Effect effect = 7 [default = UNKNOWN_EFFECT];
    public static final int EFFECT_FIELD_NUMBER = 7;
    private com.google.transit.realtime.GtfsRealtime.Alert.Effect effect_;
    public boolean hasEffect() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.google.transit.realtime.GtfsRealtime.Alert.Effect getEffect() {
      return effect_;
    }
    
    // optional .transit_realtime.TranslatedString url = 8;
    public static final int URL_FIELD_NUMBER = 8;
    private com.google.transit.realtime.GtfsRealtime.TranslatedString url_;
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public com.google.transit.realtime.GtfsRealtime.TranslatedString getUrl() {
      return url_;
    }
    public com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getUrlOrBuilder() {
      return url_;
    }
    
    // optional .transit_realtime.TranslatedString header_text = 10;
    public static final int HEADER_TEXT_FIELD_NUMBER = 10;
    private com.google.transit.realtime.GtfsRealtime.TranslatedString headerText_;
    public boolean hasHeaderText() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public com.google.transit.realtime.GtfsRealtime.TranslatedString getHeaderText() {
      return headerText_;
    }
    public com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getHeaderTextOrBuilder() {
      return headerText_;
    }
    
    // optional .transit_realtime.TranslatedString description_text = 11;
    public static final int DESCRIPTION_TEXT_FIELD_NUMBER = 11;
    private com.google.transit.realtime.GtfsRealtime.TranslatedString descriptionText_;
    public boolean hasDescriptionText() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public com.google.transit.realtime.GtfsRealtime.TranslatedString getDescriptionText() {
      return descriptionText_;
    }
    public com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getDescriptionTextOrBuilder() {
      return descriptionText_;
    }
    
    private void initFields() {
      activePeriod_ = java.util.Collections.emptyList();
      informedEntity_ = java.util.Collections.emptyList();
      cause_ = com.google.transit.realtime.GtfsRealtime.Alert.Cause.UNKNOWN_CAUSE;
      effect_ = com.google.transit.realtime.GtfsRealtime.Alert.Effect.UNKNOWN_EFFECT;
      url_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      headerText_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      descriptionText_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (hasUrl()) {
        if (!getUrl().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasHeaderText()) {
        if (!getHeaderText().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasDescriptionText()) {
        if (!getDescriptionText().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < activePeriod_.size(); i++) {
        output.writeMessage(1, activePeriod_.get(i));
      }
      for (int i = 0; i < informedEntity_.size(); i++) {
        output.writeMessage(5, informedEntity_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(6, cause_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(7, effect_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(8, url_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(10, headerText_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(11, descriptionText_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (int i = 0; i < activePeriod_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, activePeriod_.get(i));
      }
      for (int i = 0; i < informedEntity_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, informedEntity_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, cause_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, effect_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, url_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, headerText_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, descriptionText_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.google.transit.realtime.GtfsRealtime.Alert parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.Alert parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.Alert parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.Alert parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.Alert parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.Alert parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.Alert parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.Alert parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.Alert parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.Alert parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.Alert prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.google.transit.realtime.GtfsRealtime.AlertOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Alert_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Alert_fieldAccessorTable;
      }
      
      // Construct using com.google.transit.realtime.GtfsRealtime.Alert.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getActivePeriodFieldBuilder();
          getInformedEntityFieldBuilder();
          getUrlFieldBuilder();
          getHeaderTextFieldBuilder();
          getDescriptionTextFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (activePeriodBuilder_ == null) {
          activePeriod_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          activePeriodBuilder_.clear();
        }
        if (informedEntityBuilder_ == null) {
          informedEntity_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          informedEntityBuilder_.clear();
        }
        cause_ = com.google.transit.realtime.GtfsRealtime.Alert.Cause.UNKNOWN_CAUSE;
        bitField0_ = (bitField0_ & ~0x00000004);
        effect_ = com.google.transit.realtime.GtfsRealtime.Alert.Effect.UNKNOWN_EFFECT;
        bitField0_ = (bitField0_ & ~0x00000008);
        if (urlBuilder_ == null) {
          url_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
        } else {
          urlBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        if (headerTextBuilder_ == null) {
          headerText_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
        } else {
          headerTextBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        if (descriptionTextBuilder_ == null) {
          descriptionText_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
        } else {
          descriptionTextBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.Alert.getDescriptor();
      }
      
      public com.google.transit.realtime.GtfsRealtime.Alert getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.Alert.getDefaultInstance();
      }
      
      public com.google.transit.realtime.GtfsRealtime.Alert build() {
        com.google.transit.realtime.GtfsRealtime.Alert result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.google.transit.realtime.GtfsRealtime.Alert buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.transit.realtime.GtfsRealtime.Alert result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.google.transit.realtime.GtfsRealtime.Alert buildPartial() {
        com.google.transit.realtime.GtfsRealtime.Alert result = new com.google.transit.realtime.GtfsRealtime.Alert(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (activePeriodBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            activePeriod_ = java.util.Collections.unmodifiableList(activePeriod_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.activePeriod_ = activePeriod_;
        } else {
          result.activePeriod_ = activePeriodBuilder_.build();
        }
        if (informedEntityBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            informedEntity_ = java.util.Collections.unmodifiableList(informedEntity_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.informedEntity_ = informedEntity_;
        } else {
          result.informedEntity_ = informedEntityBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000001;
        }
        result.cause_ = cause_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000002;
        }
        result.effect_ = effect_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000004;
        }
        if (urlBuilder_ == null) {
          result.url_ = url_;
        } else {
          result.url_ = urlBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000008;
        }
        if (headerTextBuilder_ == null) {
          result.headerText_ = headerText_;
        } else {
          result.headerText_ = headerTextBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000010;
        }
        if (descriptionTextBuilder_ == null) {
          result.descriptionText_ = descriptionText_;
        } else {
          result.descriptionText_ = descriptionTextBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.Alert) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.Alert)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.Alert other) {
        if (other == com.google.transit.realtime.GtfsRealtime.Alert.getDefaultInstance()) return this;
        if (activePeriodBuilder_ == null) {
          if (!other.activePeriod_.isEmpty()) {
            if (activePeriod_.isEmpty()) {
              activePeriod_ = other.activePeriod_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureActivePeriodIsMutable();
              activePeriod_.addAll(other.activePeriod_);
            }
            onChanged();
          }
        } else {
          if (!other.activePeriod_.isEmpty()) {
            if (activePeriodBuilder_.isEmpty()) {
              activePeriodBuilder_.dispose();
              activePeriodBuilder_ = null;
              activePeriod_ = other.activePeriod_;
              bitField0_ = (bitField0_ & ~0x00000001);
              activePeriodBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getActivePeriodFieldBuilder() : null;
            } else {
              activePeriodBuilder_.addAllMessages(other.activePeriod_);
            }
          }
        }
        if (informedEntityBuilder_ == null) {
          if (!other.informedEntity_.isEmpty()) {
            if (informedEntity_.isEmpty()) {
              informedEntity_ = other.informedEntity_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureInformedEntityIsMutable();
              informedEntity_.addAll(other.informedEntity_);
            }
            onChanged();
          }
        } else {
          if (!other.informedEntity_.isEmpty()) {
            if (informedEntityBuilder_.isEmpty()) {
              informedEntityBuilder_.dispose();
              informedEntityBuilder_ = null;
              informedEntity_ = other.informedEntity_;
              bitField0_ = (bitField0_ & ~0x00000002);
              informedEntityBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getInformedEntityFieldBuilder() : null;
            } else {
              informedEntityBuilder_.addAllMessages(other.informedEntity_);
            }
          }
        }
        if (other.hasCause()) {
          setCause(other.getCause());
        }
        if (other.hasEffect()) {
          setEffect(other.getEffect());
        }
        if (other.hasUrl()) {
          mergeUrl(other.getUrl());
        }
        if (other.hasHeaderText()) {
          mergeHeaderText(other.getHeaderText());
        }
        if (other.hasDescriptionText()) {
          mergeDescriptionText(other.getDescriptionText());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (hasUrl()) {
          if (!getUrl().isInitialized()) {
            
            return false;
          }
        }
        if (hasHeaderText()) {
          if (!getHeaderText().isInitialized()) {
            
            return false;
          }
        }
        if (hasDescriptionText()) {
          if (!getDescriptionText().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              com.google.transit.realtime.GtfsRealtime.TimeRange.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.TimeRange.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addActivePeriod(subBuilder.buildPartial());
              break;
            }
            case 42: {
              com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.EntitySelector.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addInformedEntity(subBuilder.buildPartial());
              break;
            }
            case 48: {
              int rawValue = input.readEnum();
              com.google.transit.realtime.GtfsRealtime.Alert.Cause value = com.google.transit.realtime.GtfsRealtime.Alert.Cause.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(6, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                cause_ = value;
              }
              break;
            }
            case 56: {
              int rawValue = input.readEnum();
              com.google.transit.realtime.GtfsRealtime.Alert.Effect value = com.google.transit.realtime.GtfsRealtime.Alert.Effect.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(7, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                effect_ = value;
              }
              break;
            }
            case 66: {
              com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.TranslatedString.newBuilder();
              if (hasUrl()) {
                subBuilder.mergeFrom(getUrl());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setUrl(subBuilder.buildPartial());
              break;
            }
            case 82: {
              com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.TranslatedString.newBuilder();
              if (hasHeaderText()) {
                subBuilder.mergeFrom(getHeaderText());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setHeaderText(subBuilder.buildPartial());
              break;
            }
            case 90: {
              com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.TranslatedString.newBuilder();
              if (hasDescriptionText()) {
                subBuilder.mergeFrom(getDescriptionText());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setDescriptionText(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated .transit_realtime.TimeRange active_period = 1;
      private java.util.List<com.google.transit.realtime.GtfsRealtime.TimeRange> activePeriod_ =
        java.util.Collections.emptyList();
      private void ensureActivePeriodIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          activePeriod_ = new java.util.ArrayList<com.google.transit.realtime.GtfsRealtime.TimeRange>(activePeriod_);
          bitField0_ |= 0x00000001;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TimeRange, com.google.transit.realtime.GtfsRealtime.TimeRange.Builder, com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder> activePeriodBuilder_;
      
      public java.util.List<com.google.transit.realtime.GtfsRealtime.TimeRange> getActivePeriodList() {
        if (activePeriodBuilder_ == null) {
          return java.util.Collections.unmodifiableList(activePeriod_);
        } else {
          return activePeriodBuilder_.getMessageList();
        }
      }
      public int getActivePeriodCount() {
        if (activePeriodBuilder_ == null) {
          return activePeriod_.size();
        } else {
          return activePeriodBuilder_.getCount();
        }
      }
      public com.google.transit.realtime.GtfsRealtime.TimeRange getActivePeriod(int index) {
        if (activePeriodBuilder_ == null) {
          return activePeriod_.get(index);
        } else {
          return activePeriodBuilder_.getMessage(index);
        }
      }
      public Builder setActivePeriod(
          int index, com.google.transit.realtime.GtfsRealtime.TimeRange value) {
        if (activePeriodBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureActivePeriodIsMutable();
          activePeriod_.set(index, value);
          onChanged();
        } else {
          activePeriodBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setActivePeriod(
          int index, com.google.transit.realtime.GtfsRealtime.TimeRange.Builder builderForValue) {
        if (activePeriodBuilder_ == null) {
          ensureActivePeriodIsMutable();
          activePeriod_.set(index, builderForValue.build());
          onChanged();
        } else {
          activePeriodBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addActivePeriod(com.google.transit.realtime.GtfsRealtime.TimeRange value) {
        if (activePeriodBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureActivePeriodIsMutable();
          activePeriod_.add(value);
          onChanged();
        } else {
          activePeriodBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addActivePeriod(
          int index, com.google.transit.realtime.GtfsRealtime.TimeRange value) {
        if (activePeriodBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureActivePeriodIsMutable();
          activePeriod_.add(index, value);
          onChanged();
        } else {
          activePeriodBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addActivePeriod(
          com.google.transit.realtime.GtfsRealtime.TimeRange.Builder builderForValue) {
        if (activePeriodBuilder_ == null) {
          ensureActivePeriodIsMutable();
          activePeriod_.add(builderForValue.build());
          onChanged();
        } else {
          activePeriodBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addActivePeriod(
          int index, com.google.transit.realtime.GtfsRealtime.TimeRange.Builder builderForValue) {
        if (activePeriodBuilder_ == null) {
          ensureActivePeriodIsMutable();
          activePeriod_.add(index, builderForValue.build());
          onChanged();
        } else {
          activePeriodBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllActivePeriod(
          java.lang.Iterable<? extends com.google.transit.realtime.GtfsRealtime.TimeRange> values) {
        if (activePeriodBuilder_ == null) {
          ensureActivePeriodIsMutable();
          super.addAll(values, activePeriod_);
          onChanged();
        } else {
          activePeriodBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearActivePeriod() {
        if (activePeriodBuilder_ == null) {
          activePeriod_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          activePeriodBuilder_.clear();
        }
        return this;
      }
      public Builder removeActivePeriod(int index) {
        if (activePeriodBuilder_ == null) {
          ensureActivePeriodIsMutable();
          activePeriod_.remove(index);
          onChanged();
        } else {
          activePeriodBuilder_.remove(index);
        }
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.TimeRange.Builder getActivePeriodBuilder(
          int index) {
        return getActivePeriodFieldBuilder().getBuilder(index);
      }
      public com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder getActivePeriodOrBuilder(
          int index) {
        if (activePeriodBuilder_ == null) {
          return activePeriod_.get(index);  } else {
          return activePeriodBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder> 
           getActivePeriodOrBuilderList() {
        if (activePeriodBuilder_ != null) {
          return activePeriodBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(activePeriod_);
        }
      }
      public com.google.transit.realtime.GtfsRealtime.TimeRange.Builder addActivePeriodBuilder() {
        return getActivePeriodFieldBuilder().addBuilder(
            com.google.transit.realtime.GtfsRealtime.TimeRange.getDefaultInstance());
      }
      public com.google.transit.realtime.GtfsRealtime.TimeRange.Builder addActivePeriodBuilder(
          int index) {
        return getActivePeriodFieldBuilder().addBuilder(
            index, com.google.transit.realtime.GtfsRealtime.TimeRange.getDefaultInstance());
      }
      public java.util.List<com.google.transit.realtime.GtfsRealtime.TimeRange.Builder> 
           getActivePeriodBuilderList() {
        return getActivePeriodFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TimeRange, com.google.transit.realtime.GtfsRealtime.TimeRange.Builder, com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder> 
          getActivePeriodFieldBuilder() {
        if (activePeriodBuilder_ == null) {
          activePeriodBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.TimeRange, com.google.transit.realtime.GtfsRealtime.TimeRange.Builder, com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder>(
                  activePeriod_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          activePeriod_ = null;
        }
        return activePeriodBuilder_;
      }
      
      // repeated .transit_realtime.EntitySelector informed_entity = 5;
      private java.util.List<com.google.transit.realtime.GtfsRealtime.EntitySelector> informedEntity_ =
        java.util.Collections.emptyList();
      private void ensureInformedEntityIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          informedEntity_ = new java.util.ArrayList<com.google.transit.realtime.GtfsRealtime.EntitySelector>(informedEntity_);
          bitField0_ |= 0x00000002;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.EntitySelector, com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder, com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder> informedEntityBuilder_;
      
      public java.util.List<com.google.transit.realtime.GtfsRealtime.EntitySelector> getInformedEntityList() {
        if (informedEntityBuilder_ == null) {
          return java.util.Collections.unmodifiableList(informedEntity_);
        } else {
          return informedEntityBuilder_.getMessageList();
        }
      }
      public int getInformedEntityCount() {
        if (informedEntityBuilder_ == null) {
          return informedEntity_.size();
        } else {
          return informedEntityBuilder_.getCount();
        }
      }
      public com.google.transit.realtime.GtfsRealtime.EntitySelector getInformedEntity(int index) {
        if (informedEntityBuilder_ == null) {
          return informedEntity_.get(index);
        } else {
          return informedEntityBuilder_.getMessage(index);
        }
      }
      public Builder setInformedEntity(
          int index, com.google.transit.realtime.GtfsRealtime.EntitySelector value) {
        if (informedEntityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInformedEntityIsMutable();
          informedEntity_.set(index, value);
          onChanged();
        } else {
          informedEntityBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setInformedEntity(
          int index, com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder builderForValue) {
        if (informedEntityBuilder_ == null) {
          ensureInformedEntityIsMutable();
          informedEntity_.set(index, builderForValue.build());
          onChanged();
        } else {
          informedEntityBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addInformedEntity(com.google.transit.realtime.GtfsRealtime.EntitySelector value) {
        if (informedEntityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInformedEntityIsMutable();
          informedEntity_.add(value);
          onChanged();
        } else {
          informedEntityBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addInformedEntity(
          int index, com.google.transit.realtime.GtfsRealtime.EntitySelector value) {
        if (informedEntityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInformedEntityIsMutable();
          informedEntity_.add(index, value);
          onChanged();
        } else {
          informedEntityBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addInformedEntity(
          com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder builderForValue) {
        if (informedEntityBuilder_ == null) {
          ensureInformedEntityIsMutable();
          informedEntity_.add(builderForValue.build());
          onChanged();
        } else {
          informedEntityBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addInformedEntity(
          int index, com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder builderForValue) {
        if (informedEntityBuilder_ == null) {
          ensureInformedEntityIsMutable();
          informedEntity_.add(index, builderForValue.build());
          onChanged();
        } else {
          informedEntityBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllInformedEntity(
          java.lang.Iterable<? extends com.google.transit.realtime.GtfsRealtime.EntitySelector> values) {
        if (informedEntityBuilder_ == null) {
          ensureInformedEntityIsMutable();
          super.addAll(values, informedEntity_);
          onChanged();
        } else {
          informedEntityBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearInformedEntity() {
        if (informedEntityBuilder_ == null) {
          informedEntity_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          informedEntityBuilder_.clear();
        }
        return this;
      }
      public Builder removeInformedEntity(int index) {
        if (informedEntityBuilder_ == null) {
          ensureInformedEntityIsMutable();
          informedEntity_.remove(index);
          onChanged();
        } else {
          informedEntityBuilder_.remove(index);
        }
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder getInformedEntityBuilder(
          int index) {
        return getInformedEntityFieldBuilder().getBuilder(index);
      }
      public com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder getInformedEntityOrBuilder(
          int index) {
        if (informedEntityBuilder_ == null) {
          return informedEntity_.get(index);  } else {
          return informedEntityBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder> 
           getInformedEntityOrBuilderList() {
        if (informedEntityBuilder_ != null) {
          return informedEntityBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(informedEntity_);
        }
      }
      public com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder addInformedEntityBuilder() {
        return getInformedEntityFieldBuilder().addBuilder(
            com.google.transit.realtime.GtfsRealtime.EntitySelector.getDefaultInstance());
      }
      public com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder addInformedEntityBuilder(
          int index) {
        return getInformedEntityFieldBuilder().addBuilder(
            index, com.google.transit.realtime.GtfsRealtime.EntitySelector.getDefaultInstance());
      }
      public java.util.List<com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder> 
           getInformedEntityBuilderList() {
        return getInformedEntityFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.EntitySelector, com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder, com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder> 
          getInformedEntityFieldBuilder() {
        if (informedEntityBuilder_ == null) {
          informedEntityBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.EntitySelector, com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder, com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder>(
                  informedEntity_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          informedEntity_ = null;
        }
        return informedEntityBuilder_;
      }
      
      // optional .transit_realtime.Alert.Cause cause = 6 [default = UNKNOWN_CAUSE];
      private com.google.transit.realtime.GtfsRealtime.Alert.Cause cause_ = com.google.transit.realtime.GtfsRealtime.Alert.Cause.UNKNOWN_CAUSE;
      public boolean hasCause() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public com.google.transit.realtime.GtfsRealtime.Alert.Cause getCause() {
        return cause_;
      }
      public Builder setCause(com.google.transit.realtime.GtfsRealtime.Alert.Cause value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        cause_ = value;
        onChanged();
        return this;
      }
      public Builder clearCause() {
        bitField0_ = (bitField0_ & ~0x00000004);
        cause_ = com.google.transit.realtime.GtfsRealtime.Alert.Cause.UNKNOWN_CAUSE;
        onChanged();
        return this;
      }
      
      // optional .transit_realtime.Alert.Effect effect = 7 [default = UNKNOWN_EFFECT];
      private com.google.transit.realtime.GtfsRealtime.Alert.Effect effect_ = com.google.transit.realtime.GtfsRealtime.Alert.Effect.UNKNOWN_EFFECT;
      public boolean hasEffect() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public com.google.transit.realtime.GtfsRealtime.Alert.Effect getEffect() {
        return effect_;
      }
      public Builder setEffect(com.google.transit.realtime.GtfsRealtime.Alert.Effect value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        effect_ = value;
        onChanged();
        return this;
      }
      public Builder clearEffect() {
        bitField0_ = (bitField0_ & ~0x00000008);
        effect_ = com.google.transit.realtime.GtfsRealtime.Alert.Effect.UNKNOWN_EFFECT;
        onChanged();
        return this;
      }
      
      // optional .transit_realtime.TranslatedString url = 8;
      private com.google.transit.realtime.GtfsRealtime.TranslatedString url_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder> urlBuilder_;
      public boolean hasUrl() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public com.google.transit.realtime.GtfsRealtime.TranslatedString getUrl() {
        if (urlBuilder_ == null) {
          return url_;
        } else {
          return urlBuilder_.getMessage();
        }
      }
      public Builder setUrl(com.google.transit.realtime.GtfsRealtime.TranslatedString value) {
        if (urlBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          url_ = value;
          onChanged();
        } else {
          urlBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      public Builder setUrl(
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder builderForValue) {
        if (urlBuilder_ == null) {
          url_ = builderForValue.build();
          onChanged();
        } else {
          urlBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      public Builder mergeUrl(com.google.transit.realtime.GtfsRealtime.TranslatedString value) {
        if (urlBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010) &&
              url_ != com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance()) {
            url_ =
              com.google.transit.realtime.GtfsRealtime.TranslatedString.newBuilder(url_).mergeFrom(value).buildPartial();
          } else {
            url_ = value;
          }
          onChanged();
        } else {
          urlBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      public Builder clearUrl() {
        if (urlBuilder_ == null) {
          url_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
          onChanged();
        } else {
          urlBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder getUrlBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getUrlFieldBuilder().getBuilder();
      }
      public com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getUrlOrBuilder() {
        if (urlBuilder_ != null) {
          return urlBuilder_.getMessageOrBuilder();
        } else {
          return url_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder> 
          getUrlFieldBuilder() {
        if (urlBuilder_ == null) {
          urlBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder>(
                  url_,
                  getParentForChildren(),
                  isClean());
          url_ = null;
        }
        return urlBuilder_;
      }
      
      // optional .transit_realtime.TranslatedString header_text = 10;
      private com.google.transit.realtime.GtfsRealtime.TranslatedString headerText_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder> headerTextBuilder_;
      public boolean hasHeaderText() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public com.google.transit.realtime.GtfsRealtime.TranslatedString getHeaderText() {
        if (headerTextBuilder_ == null) {
          return headerText_;
        } else {
          return headerTextBuilder_.getMessage();
        }
      }
      public Builder setHeaderText(com.google.transit.realtime.GtfsRealtime.TranslatedString value) {
        if (headerTextBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          headerText_ = value;
          onChanged();
        } else {
          headerTextBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      public Builder setHeaderText(
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder builderForValue) {
        if (headerTextBuilder_ == null) {
          headerText_ = builderForValue.build();
          onChanged();
        } else {
          headerTextBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      public Builder mergeHeaderText(com.google.transit.realtime.GtfsRealtime.TranslatedString value) {
        if (headerTextBuilder_ == null) {
          if (((bitField0_ & 0x00000020) == 0x00000020) &&
              headerText_ != com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance()) {
            headerText_ =
              com.google.transit.realtime.GtfsRealtime.TranslatedString.newBuilder(headerText_).mergeFrom(value).buildPartial();
          } else {
            headerText_ = value;
          }
          onChanged();
        } else {
          headerTextBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }
      public Builder clearHeaderText() {
        if (headerTextBuilder_ == null) {
          headerText_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
          onChanged();
        } else {
          headerTextBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder getHeaderTextBuilder() {
        bitField0_ |= 0x00000020;
        onChanged();
        return getHeaderTextFieldBuilder().getBuilder();
      }
      public com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getHeaderTextOrBuilder() {
        if (headerTextBuilder_ != null) {
          return headerTextBuilder_.getMessageOrBuilder();
        } else {
          return headerText_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder> 
          getHeaderTextFieldBuilder() {
        if (headerTextBuilder_ == null) {
          headerTextBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder>(
                  headerText_,
                  getParentForChildren(),
                  isClean());
          headerText_ = null;
        }
        return headerTextBuilder_;
      }
      
      // optional .transit_realtime.TranslatedString description_text = 11;
      private com.google.transit.realtime.GtfsRealtime.TranslatedString descriptionText_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder> descriptionTextBuilder_;
      public boolean hasDescriptionText() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public com.google.transit.realtime.GtfsRealtime.TranslatedString getDescriptionText() {
        if (descriptionTextBuilder_ == null) {
          return descriptionText_;
        } else {
          return descriptionTextBuilder_.getMessage();
        }
      }
      public Builder setDescriptionText(com.google.transit.realtime.GtfsRealtime.TranslatedString value) {
        if (descriptionTextBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          descriptionText_ = value;
          onChanged();
        } else {
          descriptionTextBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      public Builder setDescriptionText(
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder builderForValue) {
        if (descriptionTextBuilder_ == null) {
          descriptionText_ = builderForValue.build();
          onChanged();
        } else {
          descriptionTextBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      public Builder mergeDescriptionText(com.google.transit.realtime.GtfsRealtime.TranslatedString value) {
        if (descriptionTextBuilder_ == null) {
          if (((bitField0_ & 0x00000040) == 0x00000040) &&
              descriptionText_ != com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance()) {
            descriptionText_ =
              com.google.transit.realtime.GtfsRealtime.TranslatedString.newBuilder(descriptionText_).mergeFrom(value).buildPartial();
          } else {
            descriptionText_ = value;
          }
          onChanged();
        } else {
          descriptionTextBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000040;
        return this;
      }
      public Builder clearDescriptionText() {
        if (descriptionTextBuilder_ == null) {
          descriptionText_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
          onChanged();
        } else {
          descriptionTextBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder getDescriptionTextBuilder() {
        bitField0_ |= 0x00000040;
        onChanged();
        return getDescriptionTextFieldBuilder().getBuilder();
      }
      public com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getDescriptionTextOrBuilder() {
        if (descriptionTextBuilder_ != null) {
          return descriptionTextBuilder_.getMessageOrBuilder();
        } else {
          return descriptionText_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder> 
          getDescriptionTextFieldBuilder() {
        if (descriptionTextBuilder_ == null) {
          descriptionTextBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder>(
                  descriptionText_,
                  getParentForChildren(),
                  isClean());
          descriptionText_ = null;
        }
        return descriptionTextBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:transit_realtime.Alert)
    }
    
    static {
      defaultInstance = new Alert(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:transit_realtime.Alert)
  }
  
  public interface TimeRangeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional uint64 start = 1;
    boolean hasStart();
    long getStart();
    
    // optional uint64 end = 2;
    boolean hasEnd();
    long getEnd();
  }
  public static final class TimeRange extends
      com.google.protobuf.GeneratedMessage
      implements TimeRangeOrBuilder {
    // Use TimeRange.newBuilder() to construct.
    private TimeRange(Builder builder) {
      super(builder);
    }
    private TimeRange(boolean noInit) {}
    
    private static final TimeRange defaultInstance;
    public static TimeRange getDefaultInstance() {
      return defaultInstance;
    }
    
    public TimeRange getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TimeRange_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TimeRange_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional uint64 start = 1;
    public static final int START_FIELD_NUMBER = 1;
    private long start_;
    public boolean hasStart() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getStart() {
      return start_;
    }
    
    // optional uint64 end = 2;
    public static final int END_FIELD_NUMBER = 2;
    private long end_;
    public boolean hasEnd() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getEnd() {
      return end_;
    }
    
    private void initFields() {
      start_ = 0L;
      end_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, start_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, end_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, start_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, end_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.TimeRange prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TimeRange_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TimeRange_fieldAccessorTable;
      }
      
      // Construct using com.google.transit.realtime.GtfsRealtime.TimeRange.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        start_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        end_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.TimeRange.getDescriptor();
      }
      
      public com.google.transit.realtime.GtfsRealtime.TimeRange getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.TimeRange.getDefaultInstance();
      }
      
      public com.google.transit.realtime.GtfsRealtime.TimeRange build() {
        com.google.transit.realtime.GtfsRealtime.TimeRange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.google.transit.realtime.GtfsRealtime.TimeRange buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.transit.realtime.GtfsRealtime.TimeRange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.google.transit.realtime.GtfsRealtime.TimeRange buildPartial() {
        com.google.transit.realtime.GtfsRealtime.TimeRange result = new com.google.transit.realtime.GtfsRealtime.TimeRange(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.start_ = start_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.end_ = end_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.TimeRange) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.TimeRange)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.TimeRange other) {
        if (other == com.google.transit.realtime.GtfsRealtime.TimeRange.getDefaultInstance()) return this;
        if (other.hasStart()) {
          setStart(other.getStart());
        }
        if (other.hasEnd()) {
          setEnd(other.getEnd());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              start_ = input.readUInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              end_ = input.readUInt64();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional uint64 start = 1;
      private long start_ ;
      public boolean hasStart() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getStart() {
        return start_;
      }
      public Builder setStart(long value) {
        bitField0_ |= 0x00000001;
        start_ = value;
        onChanged();
        return this;
      }
      public Builder clearStart() {
        bitField0_ = (bitField0_ & ~0x00000001);
        start_ = 0L;
        onChanged();
        return this;
      }
      
      // optional uint64 end = 2;
      private long end_ ;
      public boolean hasEnd() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getEnd() {
        return end_;
      }
      public Builder setEnd(long value) {
        bitField0_ |= 0x00000002;
        end_ = value;
        onChanged();
        return this;
      }
      public Builder clearEnd() {
        bitField0_ = (bitField0_ & ~0x00000002);
        end_ = 0L;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:transit_realtime.TimeRange)
    }
    
    static {
      defaultInstance = new TimeRange(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:transit_realtime.TimeRange)
  }
  
  public interface PositionOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required float latitude = 1;
    boolean hasLatitude();
    float getLatitude();
    
    // required float longitude = 2;
    boolean hasLongitude();
    float getLongitude();
    
    // optional float bearing = 3;
    boolean hasBearing();
    float getBearing();
    
    // optional double odometer = 4;
    boolean hasOdometer();
    double getOdometer();
    
    // optional float speed = 5;
    boolean hasSpeed();
    float getSpeed();
  }
  public static final class Position extends
      com.google.protobuf.GeneratedMessage
      implements PositionOrBuilder {
    // Use Position.newBuilder() to construct.
    private Position(Builder builder) {
      super(builder);
    }
    private Position(boolean noInit) {}
    
    private static final Position defaultInstance;
    public static Position getDefaultInstance() {
      return defaultInstance;
    }
    
    public Position getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Position_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Position_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required float latitude = 1;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    private float latitude_;
    public boolean hasLatitude() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public float getLatitude() {
      return latitude_;
    }
    
    // required float longitude = 2;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private float longitude_;
    public boolean hasLongitude() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public float getLongitude() {
      return longitude_;
    }
    
    // optional float bearing = 3;
    public static final int BEARING_FIELD_NUMBER = 3;
    private float bearing_;
    public boolean hasBearing() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public float getBearing() {
      return bearing_;
    }
    
    // optional double odometer = 4;
    public static final int ODOMETER_FIELD_NUMBER = 4;
    private double odometer_;
    public boolean hasOdometer() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public double getOdometer() {
      return odometer_;
    }
    
    // optional float speed = 5;
    public static final int SPEED_FIELD_NUMBER = 5;
    private float speed_;
    public boolean hasSpeed() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public float getSpeed() {
      return speed_;
    }
    
    private void initFields() {
      latitude_ = 0F;
      longitude_ = 0F;
      bearing_ = 0F;
      odometer_ = 0D;
      speed_ = 0F;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasLatitude()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLongitude()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeFloat(1, latitude_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeFloat(2, longitude_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeFloat(3, bearing_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeDouble(4, odometer_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeFloat(5, speed_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, latitude_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, longitude_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, bearing_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, odometer_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, speed_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.google.transit.realtime.GtfsRealtime.Position parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.Position parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.Position parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.Position parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.Position parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.Position parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.Position parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.Position parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.Position parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.Position parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.Position prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.google.transit.realtime.GtfsRealtime.PositionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Position_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Position_fieldAccessorTable;
      }
      
      // Construct using com.google.transit.realtime.GtfsRealtime.Position.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        latitude_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000001);
        longitude_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000002);
        bearing_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000004);
        odometer_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000008);
        speed_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.Position.getDescriptor();
      }
      
      public com.google.transit.realtime.GtfsRealtime.Position getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.Position.getDefaultInstance();
      }
      
      public com.google.transit.realtime.GtfsRealtime.Position build() {
        com.google.transit.realtime.GtfsRealtime.Position result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.google.transit.realtime.GtfsRealtime.Position buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.transit.realtime.GtfsRealtime.Position result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.google.transit.realtime.GtfsRealtime.Position buildPartial() {
        com.google.transit.realtime.GtfsRealtime.Position result = new com.google.transit.realtime.GtfsRealtime.Position(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.latitude_ = latitude_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.longitude_ = longitude_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.bearing_ = bearing_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.odometer_ = odometer_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.speed_ = speed_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.Position) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.Position)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.Position other) {
        if (other == com.google.transit.realtime.GtfsRealtime.Position.getDefaultInstance()) return this;
        if (other.hasLatitude()) {
          setLatitude(other.getLatitude());
        }
        if (other.hasLongitude()) {
          setLongitude(other.getLongitude());
        }
        if (other.hasBearing()) {
          setBearing(other.getBearing());
        }
        if (other.hasOdometer()) {
          setOdometer(other.getOdometer());
        }
        if (other.hasSpeed()) {
          setSpeed(other.getSpeed());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasLatitude()) {
          
          return false;
        }
        if (!hasLongitude()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 13: {
              bitField0_ |= 0x00000001;
              latitude_ = input.readFloat();
              break;
            }
            case 21: {
              bitField0_ |= 0x00000002;
              longitude_ = input.readFloat();
              break;
            }
            case 29: {
              bitField0_ |= 0x00000004;
              bearing_ = input.readFloat();
              break;
            }
            case 33: {
              bitField0_ |= 0x00000008;
              odometer_ = input.readDouble();
              break;
            }
            case 45: {
              bitField0_ |= 0x00000010;
              speed_ = input.readFloat();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required float latitude = 1;
      private float latitude_ ;
      public boolean hasLatitude() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public float getLatitude() {
        return latitude_;
      }
      public Builder setLatitude(float value) {
        bitField0_ |= 0x00000001;
        latitude_ = value;
        onChanged();
        return this;
      }
      public Builder clearLatitude() {
        bitField0_ = (bitField0_ & ~0x00000001);
        latitude_ = 0F;
        onChanged();
        return this;
      }
      
      // required float longitude = 2;
      private float longitude_ ;
      public boolean hasLongitude() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public float getLongitude() {
        return longitude_;
      }
      public Builder setLongitude(float value) {
        bitField0_ |= 0x00000002;
        longitude_ = value;
        onChanged();
        return this;
      }
      public Builder clearLongitude() {
        bitField0_ = (bitField0_ & ~0x00000002);
        longitude_ = 0F;
        onChanged();
        return this;
      }
      
      // optional float bearing = 3;
      private float bearing_ ;
      public boolean hasBearing() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public float getBearing() {
        return bearing_;
      }
      public Builder setBearing(float value) {
        bitField0_ |= 0x00000004;
        bearing_ = value;
        onChanged();
        return this;
      }
      public Builder clearBearing() {
        bitField0_ = (bitField0_ & ~0x00000004);
        bearing_ = 0F;
        onChanged();
        return this;
      }
      
      // optional double odometer = 4;
      private double odometer_ ;
      public boolean hasOdometer() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public double getOdometer() {
        return odometer_;
      }
      public Builder setOdometer(double value) {
        bitField0_ |= 0x00000008;
        odometer_ = value;
        onChanged();
        return this;
      }
      public Builder clearOdometer() {
        bitField0_ = (bitField0_ & ~0x00000008);
        odometer_ = 0D;
        onChanged();
        return this;
      }
      
      // optional float speed = 5;
      private float speed_ ;
      public boolean hasSpeed() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public float getSpeed() {
        return speed_;
      }
      public Builder setSpeed(float value) {
        bitField0_ |= 0x00000010;
        speed_ = value;
        onChanged();
        return this;
      }
      public Builder clearSpeed() {
        bitField0_ = (bitField0_ & ~0x00000010);
        speed_ = 0F;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:transit_realtime.Position)
    }
    
    static {
      defaultInstance = new Position(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:transit_realtime.Position)
  }
  
  public interface TripDescriptorOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string trip_id = 1;
    boolean hasTripId();
    String getTripId();
    
    // optional string route_id = 5;
    boolean hasRouteId();
    String getRouteId();
    
    // optional string start_time = 2;
    boolean hasStartTime();
    String getStartTime();
    
    // optional string start_date = 3;
    boolean hasStartDate();
    String getStartDate();
    
    // optional .transit_realtime.TripDescriptor.ScheduleRelationship schedule_relationship = 4;
    boolean hasScheduleRelationship();
    com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship getScheduleRelationship();
  }
  public static final class TripDescriptor extends
      com.google.protobuf.GeneratedMessage
      implements TripDescriptorOrBuilder {
    // Use TripDescriptor.newBuilder() to construct.
    private TripDescriptor(Builder builder) {
      super(builder);
    }
    private TripDescriptor(boolean noInit) {}
    
    private static final TripDescriptor defaultInstance;
    public static TripDescriptor getDefaultInstance() {
      return defaultInstance;
    }
    
    public TripDescriptor getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripDescriptor_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripDescriptor_fieldAccessorTable;
    }
    
    public enum ScheduleRelationship
        implements com.google.protobuf.ProtocolMessageEnum {
      SCHEDULED(0, 0),
      ADDED(1, 1),
      UNSCHEDULED(2, 2),
      CANCELED(3, 3),
      REPLACEMENT(4, 5),
      ;
      
      public static final int SCHEDULED_VALUE = 0;
      public static final int ADDED_VALUE = 1;
      public static final int UNSCHEDULED_VALUE = 2;
      public static final int CANCELED_VALUE = 3;
      public static final int REPLACEMENT_VALUE = 5;
      
      
      public final int getNumber() { return value; }
      
      public static ScheduleRelationship valueOf(int value) {
        switch (value) {
          case 0: return SCHEDULED;
          case 1: return ADDED;
          case 2: return UNSCHEDULED;
          case 3: return CANCELED;
          case 5: return REPLACEMENT;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<ScheduleRelationship>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<ScheduleRelationship>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ScheduleRelationship>() {
              public ScheduleRelationship findValueByNumber(int number) {
                return ScheduleRelationship.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final ScheduleRelationship[] VALUES = {
        SCHEDULED, ADDED, UNSCHEDULED, CANCELED, REPLACEMENT, 
      };
      
      public static ScheduleRelationship valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private ScheduleRelationship(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:transit_realtime.TripDescriptor.ScheduleRelationship)
    }
    
    private int bitField0_;
    // optional string trip_id = 1;
    public static final int TRIP_ID_FIELD_NUMBER = 1;
    private java.lang.Object tripId_;
    public boolean hasTripId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getTripId() {
      java.lang.Object ref = tripId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          tripId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getTripIdBytes() {
      java.lang.Object ref = tripId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        tripId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string route_id = 5;
    public static final int ROUTE_ID_FIELD_NUMBER = 5;
    private java.lang.Object routeId_;
    public boolean hasRouteId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getRouteId() {
      java.lang.Object ref = routeId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          routeId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getRouteIdBytes() {
      java.lang.Object ref = routeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        routeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string start_time = 2;
    public static final int START_TIME_FIELD_NUMBER = 2;
    private java.lang.Object startTime_;
    public boolean hasStartTime() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getStartTime() {
      java.lang.Object ref = startTime_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          startTime_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getStartTimeBytes() {
      java.lang.Object ref = startTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        startTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string start_date = 3;
    public static final int START_DATE_FIELD_NUMBER = 3;
    private java.lang.Object startDate_;
    public boolean hasStartDate() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getStartDate() {
      java.lang.Object ref = startDate_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          startDate_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getStartDateBytes() {
      java.lang.Object ref = startDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        startDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional .transit_realtime.TripDescriptor.ScheduleRelationship schedule_relationship = 4;
    public static final int SCHEDULE_RELATIONSHIP_FIELD_NUMBER = 4;
    private com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship scheduleRelationship_;
    public boolean hasScheduleRelationship() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship getScheduleRelationship() {
      return scheduleRelationship_;
    }
    
    private void initFields() {
      tripId_ = "";
      routeId_ = "";
      startTime_ = "";
      startDate_ = "";
      scheduleRelationship_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship.SCHEDULED;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTripIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(2, getStartTimeBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(3, getStartDateBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeEnum(4, scheduleRelationship_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(5, getRouteIdBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getTripIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getStartTimeBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getStartDateBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, scheduleRelationship_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getRouteIdBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.TripDescriptor prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripDescriptor_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripDescriptor_fieldAccessorTable;
      }
      
      // Construct using com.google.transit.realtime.GtfsRealtime.TripDescriptor.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        tripId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        routeId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        startTime_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        startDate_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        scheduleRelationship_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship.SCHEDULED;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDescriptor();
      }
      
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
      }
      
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor build() {
        com.google.transit.realtime.GtfsRealtime.TripDescriptor result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.google.transit.realtime.GtfsRealtime.TripDescriptor buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.transit.realtime.GtfsRealtime.TripDescriptor result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor buildPartial() {
        com.google.transit.realtime.GtfsRealtime.TripDescriptor result = new com.google.transit.realtime.GtfsRealtime.TripDescriptor(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.tripId_ = tripId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.routeId_ = routeId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.startTime_ = startTime_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.startDate_ = startDate_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.scheduleRelationship_ = scheduleRelationship_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.TripDescriptor) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.TripDescriptor)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.TripDescriptor other) {
        if (other == com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance()) return this;
        if (other.hasTripId()) {
          setTripId(other.getTripId());
        }
        if (other.hasRouteId()) {
          setRouteId(other.getRouteId());
        }
        if (other.hasStartTime()) {
          setStartTime(other.getStartTime());
        }
        if (other.hasStartDate()) {
          setStartDate(other.getStartDate());
        }
        if (other.hasScheduleRelationship()) {
          setScheduleRelationship(other.getScheduleRelationship());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              tripId_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000004;
              startTime_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000008;
              startDate_ = input.readBytes();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship value = com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000010;
                scheduleRelationship_ = value;
              }
              break;
            }
            case 42: {
              bitField0_ |= 0x00000002;
              routeId_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string trip_id = 1;
      private java.lang.Object tripId_ = "";
      public boolean hasTripId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getTripId() {
        java.lang.Object ref = tripId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          tripId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setTripId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        tripId_ = value;
        onChanged();
        return this;
      }
      public Builder clearTripId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        tripId_ = getDefaultInstance().getTripId();
        onChanged();
        return this;
      }
      void setTripId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        tripId_ = value;
        onChanged();
      }
      
      // optional string route_id = 5;
      private java.lang.Object routeId_ = "";
      public boolean hasRouteId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getRouteId() {
        java.lang.Object ref = routeId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          routeId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setRouteId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        routeId_ = value;
        onChanged();
        return this;
      }
      public Builder clearRouteId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        routeId_ = getDefaultInstance().getRouteId();
        onChanged();
        return this;
      }
      void setRouteId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        routeId_ = value;
        onChanged();
      }
      
      // optional string start_time = 2;
      private java.lang.Object startTime_ = "";
      public boolean hasStartTime() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getStartTime() {
        java.lang.Object ref = startTime_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          startTime_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setStartTime(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        startTime_ = value;
        onChanged();
        return this;
      }
      public Builder clearStartTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        startTime_ = getDefaultInstance().getStartTime();
        onChanged();
        return this;
      }
      void setStartTime(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        startTime_ = value;
        onChanged();
      }
      
      // optional string start_date = 3;
      private java.lang.Object startDate_ = "";
      public boolean hasStartDate() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getStartDate() {
        java.lang.Object ref = startDate_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          startDate_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setStartDate(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        startDate_ = value;
        onChanged();
        return this;
      }
      public Builder clearStartDate() {
        bitField0_ = (bitField0_ & ~0x00000008);
        startDate_ = getDefaultInstance().getStartDate();
        onChanged();
        return this;
      }
      void setStartDate(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        startDate_ = value;
        onChanged();
      }
      
      // optional .transit_realtime.TripDescriptor.ScheduleRelationship schedule_relationship = 4;
      private com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship scheduleRelationship_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship.SCHEDULED;
      public boolean hasScheduleRelationship() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship getScheduleRelationship() {
        return scheduleRelationship_;
      }
      public Builder setScheduleRelationship(com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        scheduleRelationship_ = value;
        onChanged();
        return this;
      }
      public Builder clearScheduleRelationship() {
        bitField0_ = (bitField0_ & ~0x00000010);
        scheduleRelationship_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship.SCHEDULED;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:transit_realtime.TripDescriptor)
    }
    
    static {
      defaultInstance = new TripDescriptor(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:transit_realtime.TripDescriptor)
  }
  
  public interface VehicleDescriptorOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string id = 1;
    boolean hasId();
    String getId();
    
    // optional string label = 2;
    boolean hasLabel();
    String getLabel();
    
    // optional string license_plate = 3;
    boolean hasLicensePlate();
    String getLicensePlate();
  }
  public static final class VehicleDescriptor extends
      com.google.protobuf.GeneratedMessage
      implements VehicleDescriptorOrBuilder {
    // Use VehicleDescriptor.newBuilder() to construct.
    private VehicleDescriptor(Builder builder) {
      super(builder);
    }
    private VehicleDescriptor(boolean noInit) {}
    
    private static final VehicleDescriptor defaultInstance;
    public static VehicleDescriptor getDefaultInstance() {
      return defaultInstance;
    }
    
    public VehicleDescriptor getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehicleDescriptor_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehicleDescriptor_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private java.lang.Object id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          id_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string label = 2;
    public static final int LABEL_FIELD_NUMBER = 2;
    private java.lang.Object label_;
    public boolean hasLabel() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getLabel() {
      java.lang.Object ref = label_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          label_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getLabelBytes() {
      java.lang.Object ref = label_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        label_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string license_plate = 3;
    public static final int LICENSE_PLATE_FIELD_NUMBER = 3;
    private java.lang.Object licensePlate_;
    public boolean hasLicensePlate() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getLicensePlate() {
      java.lang.Object ref = licensePlate_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          licensePlate_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getLicensePlateBytes() {
      java.lang.Object ref = licensePlate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        licensePlate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      id_ = "";
      label_ = "";
      licensePlate_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getLabelBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getLicensePlateBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getLabelBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getLicensePlateBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.VehicleDescriptor prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehicleDescriptor_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehicleDescriptor_fieldAccessorTable;
      }
      
      // Construct using com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        id_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        label_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        licensePlate_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDescriptor();
      }
      
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
      }
      
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor build() {
        com.google.transit.realtime.GtfsRealtime.VehicleDescriptor result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.google.transit.realtime.GtfsRealtime.VehicleDescriptor buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.transit.realtime.GtfsRealtime.VehicleDescriptor result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor buildPartial() {
        com.google.transit.realtime.GtfsRealtime.VehicleDescriptor result = new com.google.transit.realtime.GtfsRealtime.VehicleDescriptor(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.label_ = label_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.licensePlate_ = licensePlate_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.VehicleDescriptor) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.VehicleDescriptor)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.VehicleDescriptor other) {
        if (other == com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasLabel()) {
          setLabel(other.getLabel());
        }
        if (other.hasLicensePlate()) {
          setLicensePlate(other.getLicensePlate());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              id_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              label_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              licensePlate_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string id = 1;
      private java.lang.Object id_ = "";
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      void setId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
      }
      
      // optional string label = 2;
      private java.lang.Object label_ = "";
      public boolean hasLabel() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getLabel() {
        java.lang.Object ref = label_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          label_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setLabel(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        label_ = value;
        onChanged();
        return this;
      }
      public Builder clearLabel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        label_ = getDefaultInstance().getLabel();
        onChanged();
        return this;
      }
      void setLabel(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        label_ = value;
        onChanged();
      }
      
      // optional string license_plate = 3;
      private java.lang.Object licensePlate_ = "";
      public boolean hasLicensePlate() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getLicensePlate() {
        java.lang.Object ref = licensePlate_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          licensePlate_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setLicensePlate(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        licensePlate_ = value;
        onChanged();
        return this;
      }
      public Builder clearLicensePlate() {
        bitField0_ = (bitField0_ & ~0x00000004);
        licensePlate_ = getDefaultInstance().getLicensePlate();
        onChanged();
        return this;
      }
      void setLicensePlate(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        licensePlate_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:transit_realtime.VehicleDescriptor)
    }
    
    static {
      defaultInstance = new VehicleDescriptor(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:transit_realtime.VehicleDescriptor)
  }
  
  public interface EntitySelectorOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string agency_id = 1;
    boolean hasAgencyId();
    String getAgencyId();
    
    // optional string route_id = 2;
    boolean hasRouteId();
    String getRouteId();
    
    // optional int32 route_type = 3;
    boolean hasRouteType();
    int getRouteType();
    
    // optional .transit_realtime.TripDescriptor trip = 4;
    boolean hasTrip();
    com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip();
    com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder();
    
    // optional string stop_id = 5;
    boolean hasStopId();
    String getStopId();
  }
  public static final class EntitySelector extends
      com.google.protobuf.GeneratedMessage
      implements EntitySelectorOrBuilder {
    // Use EntitySelector.newBuilder() to construct.
    private EntitySelector(Builder builder) {
      super(builder);
    }
    private EntitySelector(boolean noInit) {}
    
    private static final EntitySelector defaultInstance;
    public static EntitySelector getDefaultInstance() {
      return defaultInstance;
    }
    
    public EntitySelector getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_EntitySelector_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_EntitySelector_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string agency_id = 1;
    public static final int AGENCY_ID_FIELD_NUMBER = 1;
    private java.lang.Object agencyId_;
    public boolean hasAgencyId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getAgencyId() {
      java.lang.Object ref = agencyId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          agencyId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getAgencyIdBytes() {
      java.lang.Object ref = agencyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        agencyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string route_id = 2;
    public static final int ROUTE_ID_FIELD_NUMBER = 2;
    private java.lang.Object routeId_;
    public boolean hasRouteId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getRouteId() {
      java.lang.Object ref = routeId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          routeId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getRouteIdBytes() {
      java.lang.Object ref = routeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        routeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 route_type = 3;
    public static final int ROUTE_TYPE_FIELD_NUMBER = 3;
    private int routeType_;
    public boolean hasRouteType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getRouteType() {
      return routeType_;
    }
    
    // optional .transit_realtime.TripDescriptor trip = 4;
    public static final int TRIP_FIELD_NUMBER = 4;
    private com.google.transit.realtime.GtfsRealtime.TripDescriptor trip_;
    public boolean hasTrip() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip() {
      return trip_;
    }
    public com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder() {
      return trip_;
    }
    
    // optional string stop_id = 5;
    public static final int STOP_ID_FIELD_NUMBER = 5;
    private java.lang.Object stopId_;
    public boolean hasStopId() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public String getStopId() {
      java.lang.Object ref = stopId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          stopId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getStopIdBytes() {
      java.lang.Object ref = stopId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        stopId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      agencyId_ = "";
      routeId_ = "";
      routeType_ = 0;
      trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
      stopId_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getAgencyIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getRouteIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, routeType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, trip_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getStopIdBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getAgencyIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getRouteIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, routeType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, trip_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getStopIdBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.EntitySelector prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_EntitySelector_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_EntitySelector_fieldAccessorTable;
      }
      
      // Construct using com.google.transit.realtime.GtfsRealtime.EntitySelector.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getTripFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        agencyId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        routeId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        routeType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (tripBuilder_ == null) {
          trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
        } else {
          tripBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        stopId_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.EntitySelector.getDescriptor();
      }
      
      public com.google.transit.realtime.GtfsRealtime.EntitySelector getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.EntitySelector.getDefaultInstance();
      }
      
      public com.google.transit.realtime.GtfsRealtime.EntitySelector build() {
        com.google.transit.realtime.GtfsRealtime.EntitySelector result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.google.transit.realtime.GtfsRealtime.EntitySelector buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.transit.realtime.GtfsRealtime.EntitySelector result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.google.transit.realtime.GtfsRealtime.EntitySelector buildPartial() {
        com.google.transit.realtime.GtfsRealtime.EntitySelector result = new com.google.transit.realtime.GtfsRealtime.EntitySelector(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.agencyId_ = agencyId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.routeId_ = routeId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.routeType_ = routeType_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (tripBuilder_ == null) {
          result.trip_ = trip_;
        } else {
          result.trip_ = tripBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.stopId_ = stopId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.EntitySelector) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.EntitySelector)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.EntitySelector other) {
        if (other == com.google.transit.realtime.GtfsRealtime.EntitySelector.getDefaultInstance()) return this;
        if (other.hasAgencyId()) {
          setAgencyId(other.getAgencyId());
        }
        if (other.hasRouteId()) {
          setRouteId(other.getRouteId());
        }
        if (other.hasRouteType()) {
          setRouteType(other.getRouteType());
        }
        if (other.hasTrip()) {
          mergeTrip(other.getTrip());
        }
        if (other.hasStopId()) {
          setStopId(other.getStopId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              agencyId_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              routeId_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              routeType_ = input.readInt32();
              break;
            }
            case 34: {
              com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.TripDescriptor.newBuilder();
              if (hasTrip()) {
                subBuilder.mergeFrom(getTrip());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setTrip(subBuilder.buildPartial());
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              stopId_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string agency_id = 1;
      private java.lang.Object agencyId_ = "";
      public boolean hasAgencyId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getAgencyId() {
        java.lang.Object ref = agencyId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          agencyId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setAgencyId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        agencyId_ = value;
        onChanged();
        return this;
      }
      public Builder clearAgencyId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        agencyId_ = getDefaultInstance().getAgencyId();
        onChanged();
        return this;
      }
      void setAgencyId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        agencyId_ = value;
        onChanged();
      }
      
      // optional string route_id = 2;
      private java.lang.Object routeId_ = "";
      public boolean hasRouteId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getRouteId() {
        java.lang.Object ref = routeId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          routeId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setRouteId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        routeId_ = value;
        onChanged();
        return this;
      }
      public Builder clearRouteId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        routeId_ = getDefaultInstance().getRouteId();
        onChanged();
        return this;
      }
      void setRouteId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        routeId_ = value;
        onChanged();
      }
      
      // optional int32 route_type = 3;
      private int routeType_ ;
      public boolean hasRouteType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getRouteType() {
        return routeType_;
      }
      public Builder setRouteType(int value) {
        bitField0_ |= 0x00000004;
        routeType_ = value;
        onChanged();
        return this;
      }
      public Builder clearRouteType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        routeType_ = 0;
        onChanged();
        return this;
      }
      
      // optional .transit_realtime.TripDescriptor trip = 4;
      private com.google.transit.realtime.GtfsRealtime.TripDescriptor trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder> tripBuilder_;
      public boolean hasTrip() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip() {
        if (tripBuilder_ == null) {
          return trip_;
        } else {
          return tripBuilder_.getMessage();
        }
      }
      public Builder setTrip(com.google.transit.realtime.GtfsRealtime.TripDescriptor value) {
        if (tripBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          trip_ = value;
          onChanged();
        } else {
          tripBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      public Builder setTrip(
          com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder builderForValue) {
        if (tripBuilder_ == null) {
          trip_ = builderForValue.build();
          onChanged();
        } else {
          tripBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      public Builder mergeTrip(com.google.transit.realtime.GtfsRealtime.TripDescriptor value) {
        if (tripBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008) &&
              trip_ != com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance()) {
            trip_ =
              com.google.transit.realtime.GtfsRealtime.TripDescriptor.newBuilder(trip_).mergeFrom(value).buildPartial();
          } else {
            trip_ = value;
          }
          onChanged();
        } else {
          tripBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      public Builder clearTrip() {
        if (tripBuilder_ == null) {
          trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
          onChanged();
        } else {
          tripBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder getTripBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getTripFieldBuilder().getBuilder();
      }
      public com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder() {
        if (tripBuilder_ != null) {
          return tripBuilder_.getMessageOrBuilder();
        } else {
          return trip_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder> 
          getTripFieldBuilder() {
        if (tripBuilder_ == null) {
          tripBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder>(
                  trip_,
                  getParentForChildren(),
                  isClean());
          trip_ = null;
        }
        return tripBuilder_;
      }
      
      // optional string stop_id = 5;
      private java.lang.Object stopId_ = "";
      public boolean hasStopId() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public String getStopId() {
        java.lang.Object ref = stopId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          stopId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setStopId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        stopId_ = value;
        onChanged();
        return this;
      }
      public Builder clearStopId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        stopId_ = getDefaultInstance().getStopId();
        onChanged();
        return this;
      }
      void setStopId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000010;
        stopId_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:transit_realtime.EntitySelector)
    }
    
    static {
      defaultInstance = new EntitySelector(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:transit_realtime.EntitySelector)
  }
  
  public interface TranslatedStringOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated .transit_realtime.TranslatedString.Translation translation = 1;
    java.util.List<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation> 
        getTranslationList();
    com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation getTranslation(int index);
    int getTranslationCount();
    java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder> 
        getTranslationOrBuilderList();
    com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder getTranslationOrBuilder(
        int index);
  }
  public static final class TranslatedString extends
      com.google.protobuf.GeneratedMessage
      implements TranslatedStringOrBuilder {
    // Use TranslatedString.newBuilder() to construct.
    private TranslatedString(Builder builder) {
      super(builder);
    }
    private TranslatedString(boolean noInit) {}
    
    private static final TranslatedString defaultInstance;
    public static TranslatedString getDefaultInstance() {
      return defaultInstance;
    }
    
    public TranslatedString getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_fieldAccessorTable;
    }
    
    public interface TranslationOrBuilder
        extends com.google.protobuf.MessageOrBuilder {
      
      // required string text = 1;
      boolean hasText();
      String getText();
      
      // optional string language = 2;
      boolean hasLanguage();
      String getLanguage();
    }
    public static final class Translation extends
        com.google.protobuf.GeneratedMessage
        implements TranslationOrBuilder {
      // Use Translation.newBuilder() to construct.
      private Translation(Builder builder) {
        super(builder);
      }
      private Translation(boolean noInit) {}
      
      private static final Translation defaultInstance;
      public static Translation getDefaultInstance() {
        return defaultInstance;
      }
      
      public Translation getDefaultInstanceForType() {
        return defaultInstance;
      }
      
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_Translation_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_Translation_fieldAccessorTable;
      }
      
      private int bitField0_;
      // required string text = 1;
      public static final int TEXT_FIELD_NUMBER = 1;
      private java.lang.Object text_;
      public boolean hasText() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getText() {
        java.lang.Object ref = text_;
        if (ref instanceof String) {
          return (String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (com.google.protobuf.Internal.isValidUtf8(bs)) {
            text_ = s;
          }
          return s;
        }
      }
      private com.google.protobuf.ByteString getTextBytes() {
        java.lang.Object ref = text_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8((String) ref);
          text_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      
      // optional string language = 2;
      public static final int LANGUAGE_FIELD_NUMBER = 2;
      private java.lang.Object language_;
      public boolean hasLanguage() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getLanguage() {
        java.lang.Object ref = language_;
        if (ref instanceof String) {
          return (String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (com.google.protobuf.Internal.isValidUtf8(bs)) {
            language_ = s;
          }
          return s;
        }
      }
      private com.google.protobuf.ByteString getLanguageBytes() {
        java.lang.Object ref = language_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8((String) ref);
          language_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      
      private void initFields() {
        text_ = "";
        language_ = "";
      }
      private byte memoizedIsInitialized = -1;
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized != -1) return isInitialized == 1;
        
        if (!hasText()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }
      
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        getSerializedSize();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          output.writeBytes(1, getTextBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeBytes(2, getLanguageBytes());
        }
        getUnknownFields().writeTo(output);
      }
      
      private int memoizedSerializedSize = -1;
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;
      
        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(1, getTextBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream
            .computeBytesSize(2, getLanguageBytes());
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSerializedSize = size;
        return size;
      }
      
      private static final long serialVersionUID = 0L;
      @java.lang.Override
      protected java.lang.Object writeReplace()
          throws java.io.ObjectStreamException {
        return super.writeReplace();
      }
      
      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data).buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data, extensionRegistry)
                 .buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data).buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data, extensionRegistry)
                 .buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input).buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input, extensionRegistry)
                 .buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        Builder builder = newBuilder();
        if (builder.mergeDelimitedFrom(input)) {
          return builder.buildParsed();
        } else {
          return null;
        }
      }
      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Builder builder = newBuilder();
        if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
          return builder.buildParsed();
        } else {
          return null;
        }
      }
      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input).buildParsed();
      }
      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input, extensionRegistry)
                 .buildParsed();
      }
      
      public static Builder newBuilder() { return Builder.create(); }
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation prototype) {
        return newBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() { return newBuilder(this); }
      
      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      public static final class Builder extends
          com.google.protobuf.GeneratedMessage.Builder<Builder>
         implements com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_Translation_descriptor;
        }
        
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_Translation_fieldAccessorTable;
        }
        
        // Construct using com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }
        
        private Builder(BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          }
        }
        private static Builder create() {
          return new Builder();
        }
        
        public Builder clear() {
          super.clear();
          text_ = "";
          bitField0_ = (bitField0_ & ~0x00000001);
          language_ = "";
          bitField0_ = (bitField0_ & ~0x00000002);
          return this;
        }
        
        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }
        
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.getDescriptor();
        }
        
        public com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation getDefaultInstanceForType() {
          return com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.getDefaultInstance();
        }
        
        public com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation build() {
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }
        
        private com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation buildParsed()
            throws com.google.protobuf.InvalidProtocolBufferException {
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(
              result).asInvalidProtocolBufferException();
          }
          return result;
        }
        
        public com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation buildPartial() {
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation result = new com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.text_ = text_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.language_ = language_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }
        
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation) {
            return mergeFrom((com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }
        
        public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation other) {
          if (other == com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.getDefaultInstance()) return this;
          if (other.hasText()) {
            setText(other.getText());
          }
          if (other.hasLanguage()) {
            setLanguage(other.getLanguage());
          }
          this.mergeUnknownFields(other.getUnknownFields());
          return this;
        }
        
        public final boolean isInitialized() {
          if (!hasText()) {
            
            return false;
          }
          return true;
        }
        
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder(
              this.getUnknownFields());
          while (true) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              default: {
                if (!parseUnknownField(input, unknownFields,
                                       extensionRegistry, tag)) {
                  this.setUnknownFields(unknownFields.build());
                  onChanged();
                  return this;
                }
                break;
              }
              case 10: {
                bitField0_ |= 0x00000001;
                text_ = input.readBytes();
                break;
              }
              case 18: {
                bitField0_ |= 0x00000002;
                language_ = input.readBytes();
                break;
              }
            }
          }
        }
        
        private int bitField0_;
        
        // required string text = 1;
        private java.lang.Object text_ = "";
        public boolean hasText() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        public String getText() {
          java.lang.Object ref = text_;
          if (!(ref instanceof String)) {
            String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
            text_ = s;
            return s;
          } else {
            return (String) ref;
          }
        }
        public Builder setText(String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
          text_ = value;
          onChanged();
          return this;
        }
        public Builder clearText() {
          bitField0_ = (bitField0_ & ~0x00000001);
          text_ = getDefaultInstance().getText();
          onChanged();
          return this;
        }
        void setText(com.google.protobuf.ByteString value) {
          bitField0_ |= 0x00000001;
          text_ = value;
          onChanged();
        }
        
        // optional string language = 2;
        private java.lang.Object language_ = "";
        public boolean hasLanguage() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        public String getLanguage() {
          java.lang.Object ref = language_;
          if (!(ref instanceof String)) {
            String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
            language_ = s;
            return s;
          } else {
            return (String) ref;
          }
        }
        public Builder setLanguage(String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
          language_ = value;
          onChanged();
          return this;
        }
        public Builder clearLanguage() {
          bitField0_ = (bitField0_ & ~0x00000002);
          language_ = getDefaultInstance().getLanguage();
          onChanged();
          return this;
        }
        void setLanguage(com.google.protobuf.ByteString value) {
          bitField0_ |= 0x00000002;
          language_ = value;
          onChanged();
        }
        
        // @@protoc_insertion_point(builder_scope:transit_realtime.TranslatedString.Translation)
      }
      
      static {
        defaultInstance = new Translation(true);
        defaultInstance.initFields();
      }
      
      // @@protoc_insertion_point(class_scope:transit_realtime.TranslatedString.Translation)
    }
    
    // repeated .transit_realtime.TranslatedString.Translation translation = 1;
    public static final int TRANSLATION_FIELD_NUMBER = 1;
    private java.util.List<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation> translation_;
    public java.util.List<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation> getTranslationList() {
      return translation_;
    }
    public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder> 
        getTranslationOrBuilderList() {
      return translation_;
    }
    public int getTranslationCount() {
      return translation_.size();
    }
    public com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation getTranslation(int index) {
      return translation_.get(index);
    }
    public com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder getTranslationOrBuilder(
        int index) {
      return translation_.get(index);
    }
    
    private void initFields() {
      translation_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      for (int i = 0; i < getTranslationCount(); i++) {
        if (!getTranslation(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < translation_.size(); i++) {
        output.writeMessage(1, translation_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (int i = 0; i < translation_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, translation_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.TranslatedString prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_fieldAccessorTable;
      }
      
      // Construct using com.google.transit.realtime.GtfsRealtime.TranslatedString.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getTranslationFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (translationBuilder_ == null) {
          translation_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          translationBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.TranslatedString.getDescriptor();
      }
      
      public com.google.transit.realtime.GtfsRealtime.TranslatedString getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      }
      
      public com.google.transit.realtime.GtfsRealtime.TranslatedString build() {
        com.google.transit.realtime.GtfsRealtime.TranslatedString result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.google.transit.realtime.GtfsRealtime.TranslatedString buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.google.transit.realtime.GtfsRealtime.TranslatedString result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.google.transit.realtime.GtfsRealtime.TranslatedString buildPartial() {
        com.google.transit.realtime.GtfsRealtime.TranslatedString result = new com.google.transit.realtime.GtfsRealtime.TranslatedString(this);
        int from_bitField0_ = bitField0_;
        if (translationBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            translation_ = java.util.Collections.unmodifiableList(translation_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.translation_ = translation_;
        } else {
          result.translation_ = translationBuilder_.build();
        }
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.TranslatedString) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.TranslatedString)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.TranslatedString other) {
        if (other == com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance()) return this;
        if (translationBuilder_ == null) {
          if (!other.translation_.isEmpty()) {
            if (translation_.isEmpty()) {
              translation_ = other.translation_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTranslationIsMutable();
              translation_.addAll(other.translation_);
            }
            onChanged();
          }
        } else {
          if (!other.translation_.isEmpty()) {
            if (translationBuilder_.isEmpty()) {
              translationBuilder_.dispose();
              translationBuilder_ = null;
              translation_ = other.translation_;
              bitField0_ = (bitField0_ & ~0x00000001);
              translationBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getTranslationFieldBuilder() : null;
            } else {
              translationBuilder_.addAllMessages(other.translation_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        for (int i = 0; i < getTranslationCount(); i++) {
          if (!getTranslation(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder subBuilder = com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addTranslation(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated .transit_realtime.TranslatedString.Translation translation = 1;
      private java.util.List<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation> translation_ =
        java.util.Collections.emptyList();
      private void ensureTranslationIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          translation_ = new java.util.ArrayList<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation>(translation_);
          bitField0_ |= 0x00000001;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation, com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder> translationBuilder_;
      
      public java.util.List<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation> getTranslationList() {
        if (translationBuilder_ == null) {
          return java.util.Collections.unmodifiableList(translation_);
        } else {
          return translationBuilder_.getMessageList();
        }
      }
      public int getTranslationCount() {
        if (translationBuilder_ == null) {
          return translation_.size();
        } else {
          return translationBuilder_.getCount();
        }
      }
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation getTranslation(int index) {
        if (translationBuilder_ == null) {
          return translation_.get(index);
        } else {
          return translationBuilder_.getMessage(index);
        }
      }
      public Builder setTranslation(
          int index, com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation value) {
        if (translationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTranslationIsMutable();
          translation_.set(index, value);
          onChanged();
        } else {
          translationBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setTranslation(
          int index, com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder builderForValue) {
        if (translationBuilder_ == null) {
          ensureTranslationIsMutable();
          translation_.set(index, builderForValue.build());
          onChanged();
        } else {
          translationBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addTranslation(com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation value) {
        if (translationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTranslationIsMutable();
          translation_.add(value);
          onChanged();
        } else {
          translationBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addTranslation(
          int index, com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation value) {
        if (translationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTranslationIsMutable();
          translation_.add(index, value);
          onChanged();
        } else {
          translationBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addTranslation(
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder builderForValue) {
        if (translationBuilder_ == null) {
          ensureTranslationIsMutable();
          translation_.add(builderForValue.build());
          onChanged();
        } else {
          translationBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addTranslation(
          int index, com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder builderForValue) {
        if (translationBuilder_ == null) {
          ensureTranslationIsMutable();
          translation_.add(index, builderForValue.build());
          onChanged();
        } else {
          translationBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllTranslation(
          java.lang.Iterable<? extends com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation> values) {
        if (translationBuilder_ == null) {
          ensureTranslationIsMutable();
          super.addAll(values, translation_);
          onChanged();
        } else {
          translationBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearTranslation() {
        if (translationBuilder_ == null) {
          translation_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          translationBuilder_.clear();
        }
        return this;
      }
      public Builder removeTranslation(int index) {
        if (translationBuilder_ == null) {
          ensureTranslationIsMutable();
          translation_.remove(index);
          onChanged();
        } else {
          translationBuilder_.remove(index);
        }
        return this;
      }
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder getTranslationBuilder(
          int index) {
        return getTranslationFieldBuilder().getBuilder(index);
      }
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder getTranslationOrBuilder(
          int index) {
        if (translationBuilder_ == null) {
          return translation_.get(index);  } else {
          return translationBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder> 
           getTranslationOrBuilderList() {
        if (translationBuilder_ != null) {
          return translationBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(translation_);
        }
      }
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder addTranslationBuilder() {
        return getTranslationFieldBuilder().addBuilder(
            com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.getDefaultInstance());
      }
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder addTranslationBuilder(
          int index) {
        return getTranslationFieldBuilder().addBuilder(
            index, com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.getDefaultInstance());
      }
      public java.util.List<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder> 
           getTranslationBuilderList() {
        return getTranslationFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation, com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder> 
          getTranslationFieldBuilder() {
        if (translationBuilder_ == null) {
          translationBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation, com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder>(
                  translation_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          translation_ = null;
        }
        return translationBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:transit_realtime.TranslatedString)
    }
    
    static {
      defaultInstance = new TranslatedString(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:transit_realtime.TranslatedString)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_transit_realtime_FeedMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_transit_realtime_FeedMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_transit_realtime_FeedHeader_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_transit_realtime_FeedHeader_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_transit_realtime_FeedEntity_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_transit_realtime_FeedEntity_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_transit_realtime_TripUpdate_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_transit_realtime_TripUpdate_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_transit_realtime_TripUpdate_StopTimeEvent_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_transit_realtime_TripUpdate_StopTimeEvent_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_transit_realtime_TripUpdate_StopTimeUpdate_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_transit_realtime_TripUpdate_StopTimeUpdate_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_transit_realtime_VehiclePosition_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_transit_realtime_VehiclePosition_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_transit_realtime_Alert_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_transit_realtime_Alert_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_transit_realtime_TimeRange_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_transit_realtime_TimeRange_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_transit_realtime_Position_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_transit_realtime_Position_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_transit_realtime_TripDescriptor_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_transit_realtime_TripDescriptor_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_transit_realtime_VehicleDescriptor_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_transit_realtime_VehicleDescriptor_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_transit_realtime_EntitySelector_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_transit_realtime_EntitySelector_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_transit_realtime_TranslatedString_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_transit_realtime_TranslatedString_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_transit_realtime_TranslatedString_Translation_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_transit_realtime_TranslatedString_Translation_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023gtfs-realtime.proto\022\020transit_realtime\"" +
      "i\n\013FeedMessage\022,\n\006header\030\001 \002(\0132\034.transit" +
      "_realtime.FeedHeader\022,\n\006entity\030\002 \003(\0132\034.t" +
      "ransit_realtime.FeedEntity\"\307\001\n\nFeedHeade" +
      "r\022\035\n\025gtfs_realtime_version\030\001 \002(\t\022Q\n\016incr" +
      "ementality\030\002 \001(\0162+.transit_realtime.Feed" +
      "Header.Incrementality:\014FULL_DATASET\022\021\n\tt" +
      "imestamp\030\003 \001(\004\"4\n\016Incrementality\022\020\n\014FULL" +
      "_DATASET\020\000\022\020\n\014DIFFERENTIAL\020\001\"\302\001\n\nFeedEnt" +
      "ity\022\n\n\002id\030\001 \002(\t\022\031\n\nis_deleted\030\002 \001(\010:\005fal",
      "se\0221\n\013trip_update\030\003 \001(\0132\034.transit_realti" +
      "me.TripUpdate\0222\n\007vehicle\030\004 \001(\0132!.transit" +
      "_realtime.VehiclePosition\022&\n\005alert\030\005 \001(\013" +
      "2\027.transit_realtime.Alert\"\340\004\n\nTripUpdate" +
      "\022.\n\004trip\030\001 \002(\0132 .transit_realtime.TripDe" +
      "scriptor\0224\n\007vehicle\030\003 \001(\0132#.transit_real" +
      "time.VehicleDescriptor\022E\n\020stop_time_upda" +
      "te\030\002 \003(\0132+.transit_realtime.TripUpdate.S" +
      "topTimeUpdate\032A\n\rStopTimeEvent\022\r\n\005delay\030" +
      "\001 \001(\005\022\014\n\004time\030\002 \001(\003\022\023\n\013uncertainty\030\003 \001(\005",
      "\032\341\002\n\016StopTimeUpdate\022\025\n\rstop_sequence\030\001 \001" +
      "(\r\022\017\n\007stop_id\030\004 \001(\t\022;\n\007arrival\030\002 \001(\0132*.t" +
      "ransit_realtime.TripUpdate.StopTimeEvent" +
      "\022=\n\tdeparture\030\003 \001(\0132*.transit_realtime.T" +
      "ripUpdate.StopTimeEvent\022j\n\025schedule_rela" +
      "tionship\030\005 \001(\0162@.transit_realtime.TripUp" +
      "date.StopTimeUpdate.ScheduleRelationship" +
      ":\tSCHEDULED\"?\n\024ScheduleRelationship\022\r\n\tS" +
      "CHEDULED\020\000\022\013\n\007SKIPPED\020\001\022\013\n\007NO_DATA\020\002\"\331\004\n" +
      "\017VehiclePosition\022.\n\004trip\030\001 \001(\0132 .transit",
      "_realtime.TripDescriptor\0224\n\007vehicle\030\010 \001(" +
      "\0132#.transit_realtime.VehicleDescriptor\022," +
      "\n\010position\030\002 \001(\0132\032.transit_realtime.Posi" +
      "tion\022\035\n\025current_stop_sequence\030\003 \001(\r\022\017\n\007s" +
      "top_id\030\007 \001(\t\022Z\n\016current_status\030\004 \001(\01623.t" +
      "ransit_realtime.VehiclePosition.VehicleS" +
      "topStatus:\rIN_TRANSIT_TO\022\021\n\ttimestamp\030\005 " +
      "\001(\004\022K\n\020congestion_level\030\006 \001(\01621.transit_" +
      "realtime.VehiclePosition.CongestionLevel" +
      "\"G\n\021VehicleStopStatus\022\017\n\013INCOMING_AT\020\000\022\016",
      "\n\nSTOPPED_AT\020\001\022\021\n\rIN_TRANSIT_TO\020\002\"}\n\017Con" +
      "gestionLevel\022\034\n\030UNKNOWN_CONGESTION_LEVEL" +
      "\020\000\022\024\n\020RUNNING_SMOOTHLY\020\001\022\017\n\013STOP_AND_GO\020" +
      "\002\022\016\n\nCONGESTION\020\003\022\025\n\021SEVERE_CONGESTION\020\004" +
      "\"\256\006\n\005Alert\0222\n\ractive_period\030\001 \003(\0132\033.tran" +
      "sit_realtime.TimeRange\0229\n\017informed_entit" +
      "y\030\005 \003(\0132 .transit_realtime.EntitySelecto" +
      "r\022;\n\005cause\030\006 \001(\0162\035.transit_realtime.Aler" +
      "t.Cause:\rUNKNOWN_CAUSE\022>\n\006effect\030\007 \001(\0162\036" +
      ".transit_realtime.Alert.Effect:\016UNKNOWN_",
      "EFFECT\022/\n\003url\030\010 \001(\0132\".transit_realtime.T" +
      "ranslatedString\0227\n\013header_text\030\n \001(\0132\".t" +
      "ransit_realtime.TranslatedString\022<\n\020desc" +
      "ription_text\030\013 \001(\0132\".transit_realtime.Tr" +
      "anslatedString\"\330\001\n\005Cause\022\021\n\rUNKNOWN_CAUS" +
      "E\020\001\022\017\n\013OTHER_CAUSE\020\002\022\025\n\021TECHNICAL_PROBLE" +
      "M\020\003\022\n\n\006STRIKE\020\004\022\021\n\rDEMONSTRATION\020\005\022\014\n\010AC" +
      "CIDENT\020\006\022\013\n\007HOLIDAY\020\007\022\013\n\007WEATHER\020\010\022\017\n\013MA" +
      "INTENANCE\020\t\022\020\n\014CONSTRUCTION\020\n\022\023\n\017POLICE_" +
      "ACTIVITY\020\013\022\025\n\021MEDICAL_EMERGENCY\020\014\"\265\001\n\006Ef",
      "fect\022\016\n\nNO_SERVICE\020\001\022\023\n\017REDUCED_SERVICE\020" +
      "\002\022\026\n\022SIGNIFICANT_DELAYS\020\003\022\n\n\006DETOUR\020\004\022\026\n" +
      "\022ADDITIONAL_SERVICE\020\005\022\024\n\020MODIFIED_SERVIC" +
      "E\020\006\022\020\n\014OTHER_EFFECT\020\007\022\022\n\016UNKNOWN_EFFECT\020" +
      "\010\022\016\n\nSTOP_MOVED\020\t\"\'\n\tTimeRange\022\r\n\005start\030" +
      "\001 \001(\004\022\013\n\003end\030\002 \001(\004\"a\n\010Position\022\020\n\010latitu" +
      "de\030\001 \002(\002\022\021\n\tlongitude\030\002 \002(\002\022\017\n\007bearing\030\003" +
      " \001(\002\022\020\n\010odometer\030\004 \001(\001\022\r\n\005speed\030\005 \001(\002\"\223\002" +
      "\n\016TripDescriptor\022\017\n\007trip_id\030\001 \001(\t\022\020\n\010rou" +
      "te_id\030\005 \001(\t\022\022\n\nstart_time\030\002 \001(\t\022\022\n\nstart",
      "_date\030\003 \001(\t\022T\n\025schedule_relationship\030\004 \001" +
      "(\01625.transit_realtime.TripDescriptor.Sch" +
      "eduleRelationship\"`\n\024ScheduleRelationshi" +
      "p\022\r\n\tSCHEDULED\020\000\022\t\n\005ADDED\020\001\022\017\n\013UNSCHEDUL" +
      "ED\020\002\022\014\n\010CANCELED\020\003\022\017\n\013REPLACEMENT\020\005\"E\n\021V" +
      "ehicleDescriptor\022\n\n\002id\030\001 \001(\t\022\r\n\005label\030\002 " +
      "\001(\t\022\025\n\rlicense_plate\030\003 \001(\t\"\212\001\n\016EntitySel" +
      "ector\022\021\n\tagency_id\030\001 \001(\t\022\020\n\010route_id\030\002 \001" +
      "(\t\022\022\n\nroute_type\030\003 \001(\005\022.\n\004trip\030\004 \001(\0132 .t" +
      "ransit_realtime.TripDescriptor\022\017\n\007stop_i",
      "d\030\005 \001(\t\"\206\001\n\020TranslatedString\022C\n\013translat" +
      "ion\030\001 \003(\0132..transit_realtime.TranslatedS" +
      "tring.Translation\032-\n\013Translation\022\014\n\004text" +
      "\030\001 \002(\t\022\020\n\010language\030\002 \001(\tB\035\n\033com.google.t" +
      "ransit.realtime"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_transit_realtime_FeedMessage_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_transit_realtime_FeedMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_transit_realtime_FeedMessage_descriptor,
              new java.lang.String[] { "Header", "Entity", },
              com.google.transit.realtime.GtfsRealtime.FeedMessage.class,
              com.google.transit.realtime.GtfsRealtime.FeedMessage.Builder.class);
          internal_static_transit_realtime_FeedHeader_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_transit_realtime_FeedHeader_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_transit_realtime_FeedHeader_descriptor,
              new java.lang.String[] { "GtfsRealtimeVersion", "Incrementality", "Timestamp", },
              com.google.transit.realtime.GtfsRealtime.FeedHeader.class,
              com.google.transit.realtime.GtfsRealtime.FeedHeader.Builder.class);
          internal_static_transit_realtime_FeedEntity_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_transit_realtime_FeedEntity_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_transit_realtime_FeedEntity_descriptor,
              new java.lang.String[] { "Id", "IsDeleted", "TripUpdate", "Vehicle", "Alert", },
              com.google.transit.realtime.GtfsRealtime.FeedEntity.class,
              com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder.class);
          internal_static_transit_realtime_TripUpdate_descriptor =
            getDescriptor().getMessageTypes().get(3);
          internal_static_transit_realtime_TripUpdate_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_transit_realtime_TripUpdate_descriptor,
              new java.lang.String[] { "Trip", "Vehicle", "StopTimeUpdate", },
              com.google.transit.realtime.GtfsRealtime.TripUpdate.class,
              com.google.transit.realtime.GtfsRealtime.TripUpdate.Builder.class);
          internal_static_transit_realtime_TripUpdate_StopTimeEvent_descriptor =
            internal_static_transit_realtime_TripUpdate_descriptor.getNestedTypes().get(0);
          internal_static_transit_realtime_TripUpdate_StopTimeEvent_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_transit_realtime_TripUpdate_StopTimeEvent_descriptor,
              new java.lang.String[] { "Delay", "Time", "Uncertainty", },
              com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.class,
              com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder.class);
          internal_static_transit_realtime_TripUpdate_StopTimeUpdate_descriptor =
            internal_static_transit_realtime_TripUpdate_descriptor.getNestedTypes().get(1);
          internal_static_transit_realtime_TripUpdate_StopTimeUpdate_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_transit_realtime_TripUpdate_StopTimeUpdate_descriptor,
              new java.lang.String[] { "StopSequence", "StopId", "Arrival", "Departure", "ScheduleRelationship", },
              com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.class,
              com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder.class);
          internal_static_transit_realtime_VehiclePosition_descriptor =
            getDescriptor().getMessageTypes().get(4);
          internal_static_transit_realtime_VehiclePosition_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_transit_realtime_VehiclePosition_descriptor,
              new java.lang.String[] { "Trip", "Vehicle", "Position", "CurrentStopSequence", "StopId", "CurrentStatus", "Timestamp", "CongestionLevel", },
              com.google.transit.realtime.GtfsRealtime.VehiclePosition.class,
              com.google.transit.realtime.GtfsRealtime.VehiclePosition.Builder.class);
          internal_static_transit_realtime_Alert_descriptor =
            getDescriptor().getMessageTypes().get(5);
          internal_static_transit_realtime_Alert_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_transit_realtime_Alert_descriptor,
              new java.lang.String[] { "ActivePeriod", "InformedEntity", "Cause", "Effect", "Url", "HeaderText", "DescriptionText", },
              com.google.transit.realtime.GtfsRealtime.Alert.class,
              com.google.transit.realtime.GtfsRealtime.Alert.Builder.class);
          internal_static_transit_realtime_TimeRange_descriptor =
            getDescriptor().getMessageTypes().get(6);
          internal_static_transit_realtime_TimeRange_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_transit_realtime_TimeRange_descriptor,
              new java.lang.String[] { "Start", "End", },
              com.google.transit.realtime.GtfsRealtime.TimeRange.class,
              com.google.transit.realtime.GtfsRealtime.TimeRange.Builder.class);
          internal_static_transit_realtime_Position_descriptor =
            getDescriptor().getMessageTypes().get(7);
          internal_static_transit_realtime_Position_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_transit_realtime_Position_descriptor,
              new java.lang.String[] { "Latitude", "Longitude", "Bearing", "Odometer", "Speed", },
              com.google.transit.realtime.GtfsRealtime.Position.class,
              com.google.transit.realtime.GtfsRealtime.Position.Builder.class);
          internal_static_transit_realtime_TripDescriptor_descriptor =
            getDescriptor().getMessageTypes().get(8);
          internal_static_transit_realtime_TripDescriptor_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_transit_realtime_TripDescriptor_descriptor,
              new java.lang.String[] { "TripId", "RouteId", "StartTime", "StartDate", "ScheduleRelationship", },
              com.google.transit.realtime.GtfsRealtime.TripDescriptor.class,
              com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder.class);
          internal_static_transit_realtime_VehicleDescriptor_descriptor =
            getDescriptor().getMessageTypes().get(9);
          internal_static_transit_realtime_VehicleDescriptor_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_transit_realtime_VehicleDescriptor_descriptor,
              new java.lang.String[] { "Id", "Label", "LicensePlate", },
              com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.class,
              com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder.class);
          internal_static_transit_realtime_EntitySelector_descriptor =
            getDescriptor().getMessageTypes().get(10);
          internal_static_transit_realtime_EntitySelector_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_transit_realtime_EntitySelector_descriptor,
              new java.lang.String[] { "AgencyId", "RouteId", "RouteType", "Trip", "StopId", },
              com.google.transit.realtime.GtfsRealtime.EntitySelector.class,
              com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder.class);
          internal_static_transit_realtime_TranslatedString_descriptor =
            getDescriptor().getMessageTypes().get(11);
          internal_static_transit_realtime_TranslatedString_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_transit_realtime_TranslatedString_descriptor,
              new java.lang.String[] { "Translation", },
              com.google.transit.realtime.GtfsRealtime.TranslatedString.class,
              com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder.class);
          internal_static_transit_realtime_TranslatedString_Translation_descriptor =
            internal_static_transit_realtime_TranslatedString_descriptor.getNestedTypes().get(0);
          internal_static_transit_realtime_TranslatedString_Translation_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_transit_realtime_TranslatedString_Translation_descriptor,
              new java.lang.String[] { "Text", "Language", },
              com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.class,
              com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
