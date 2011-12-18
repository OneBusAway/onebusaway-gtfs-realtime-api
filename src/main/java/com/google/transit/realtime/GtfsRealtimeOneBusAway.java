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

public final class GtfsRealtimeOneBusAway {
  private GtfsRealtimeOneBusAway() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registry.add(com.google.transit.realtime.GtfsRealtimeOneBusAway.source);
    registry.add(com.google.transit.realtime.GtfsRealtimeOneBusAway.delay);
  }
  public static final int SOURCE_FIELD_NUMBER = 1000;
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.transit.realtime.GtfsRealtime.FeedEntity,
      java.lang.String> source = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int DELAY_FIELD_NUMBER = 1000;
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.transit.realtime.GtfsRealtime.TripUpdate,
      java.lang.Integer> delay = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Integer.class,
        null);
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:com/google/transit/realtime/gtfs-realt" +
      "ime-OneBusAway.proto\022\020transit_realtime\032/" +
      "com/google/transit/realtime/gtfs-realtim" +
      "e.proto:-\n\006source\022\034.transit_realtime.Fee" +
      "dEntity\030\350\007 \001(\t:,\n\005delay\022\034.transit_realti" +
      "me.TripUpdate\030\350\007 \001(\005B\035\n\033com.google.trans" +
      "it.realtime"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          source.internalInit(descriptor.getExtensions().get(0));
          delay.internalInit(descriptor.getExtensions().get(1));
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.transit.realtime.GtfsRealtime.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
