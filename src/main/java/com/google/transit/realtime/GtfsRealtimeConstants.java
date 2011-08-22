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
