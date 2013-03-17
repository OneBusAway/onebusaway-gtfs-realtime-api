/**
 * Copyright (C) 2012 Google, Inc.
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
 */
package com.google.transit.realtime;

import com.google.protobuf.ExtensionRegistry;

/**
 * Support for GTFS-realtime extensions.
 * 
 * @author bdferris
 */
public class GtfsRealtimeExtensions {

  /**
   * Adds all known GTFS-realtime extension messages to the specified extension
   * registry.
   * 
   * @param registry
   */
  public static void registerExtensions(ExtensionRegistry registry) {
    registry.add(GtfsRealtimeNYCT.nyctFeedHeader);
    registry.add(GtfsRealtimeNYCT.nyctStopTimeUpdate);
    registry.add(GtfsRealtimeNYCT.nyctTripDescriptor);
    registry.add(GtfsRealtimeOneBusAway.obaFeedHeader);
    registry.add(GtfsRealtimeOneBusAway.obaFeedEntity);
    registry.add(GtfsRealtimeOneBusAway.obaTripUpdate);
  }
}
