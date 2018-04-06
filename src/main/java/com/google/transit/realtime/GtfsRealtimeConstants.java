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

import com.google.transit.realtime.GtfsRealtime.FeedHeader;

public class GtfsRealtimeConstants {

  /**
   * The current version of the GTFS-realtime spec supported by the library.
   * Should be used to set
   * {@link FeedHeader.Builder#setGtfsRealtimeVersion(String)}.
   * 
   * The current version is "{@value #VERSION}"
   */
  public static final String VERSION = "1.0";
}
