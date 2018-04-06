/**
 * Portions of this module are modifications based on work created and shared by Google:
 *
 *   http://code.google.com/policies.html
 *
 * and used according to terms described in the Creative Commons 3.0 Attribution License:
 *
 *   http://creativecommons.org/licenses/by/3.0/
 *
 * Specifically, the gtfs-realtime.proto:
 *
 *   http://code.google.com/transit/realtime/docs/gtfs-realtime_proto.html
 *
 * was used to generate the classes contained within.
 *
 * Portions of this module are modifications based on work created by the New York
 * City Metropolitan Transportation Authority.
 *
 * All code is Copyright (C) 2011 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
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
   * registry, except LIRR, unless includeLIRR=true. If includeLIRR=true, the
   * LIRR extension will be added to the registry but the MNR extension will
   * not be.
   *
   * LIRR and MNR GTFS-RT extensions both use extension ID 1005. Since MNR has
   * been assigned extension ID 1005 in the Google registry, it makes sense to
   * default to MNR.
   * 
   * @param registry registry to add the extensions to
   * @param includeLIRR if true, include LIRR extension; if false, include MNR
   *                    extension.
   */
  public static void registerExtensions(ExtensionRegistry registry, boolean includeLIRR) {
    registry.add(GtfsRealtimeNYCT.nyctFeedHeader);
    registry.add(GtfsRealtimeNYCT.nyctStopTimeUpdate);
    registry.add(GtfsRealtimeNYCT.nyctTripDescriptor);
    registry.add(GtfsRealtimeOneBusAway.obaFeedHeader);
    registry.add(GtfsRealtimeOneBusAway.obaFeedEntity);
    registry.add(GtfsRealtimeOneBusAway.obaTripUpdate);
    registry.add(GtfsRealtimeOneBusAway.obaEntitySelector);
    registry.add(GtfsRealtimeOneBusAway.obaStopTimeUpdate);
    // warning: cannot add both GtfsRealtimeMNR.mnrStopTimeUpdate and GtfsRealtimeLIRR.MtaStopTimeUpdate.track to the same registry
    if (includeLIRR) {
      registry.add(GtfsRealtimeLIRR.MtaStopTimeUpdate.track);
    } else {
      registry.add(GtfsRealtimeMNR.mnrStopTimeUpdate);
    }
  }

  /**
   * Adds all known GTFS-realtime extension messages to the specified extension
   * registry, except LIRR.
   *
   * @param registry registry to add the extensions to
   */
  public static void registerExtensions(ExtensionRegistry registry) {
    registerExtensions(registry, false);
  }
}
