## The OneBusAway GTFS-Realtime API [![Build Status](https://travis-ci.org/OneBusAway/onebusaway-gtfs-realtime-api.svg?branch=master)](https://travis-ci.org/OneBusAway/onebusaway-gtfs-realtime-api) [![Join the OneBusAway chat](https://onebusaway.herokuapp.com/badge.svg)](https://onebusaway.herokuapp.com/)

This project contains Java libraries generated from the OneBusAway-specific and NYCT-specific GTFS-realtime protocol buffer extensions.

For details on using the library, see the current release documentation:

http://developer.onebusaway.org/modules/onebusaway-gtfs-realtime-api/current/

For bleeding-edge users, see the latest SNAPSHOT documentation:

http://developer.onebusaway.org/modules/onebusaway-gtfs-realtime-api/current-SNAPSHOT/

To regenerate the Java source-code, use the following command from the
root of the project:

~~~
% protoc \
 -Isrc/main/resources \
 --java_out=src/main/java/ \
 src/main/resources/com/google/transit/realtime/gtfs-realtime-NYCT.proto \
 src/main/resources/com/google/transit/realtime/gtfs-realtime-OneBusAway.proto
~~~

Note: you will need to add back a copyright-license header to each source file after regeneration.
