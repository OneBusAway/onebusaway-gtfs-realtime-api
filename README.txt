This project contains Java libraries generated from the protocol buffer definition of the GTFS-realtime spec.  It also
contains a few OneBusAway-specific extensions.  To regenerate the Java source-code, use the following command from the
root of the project:

% protoc \
 -Isrc/main/resources \
 --java_out=src/main/java/ \
 src/main/resources/com/google/transit/realtime/gtfs-realtime.proto \
 src/main/resources/com/google/transit/realtime/gtfs-realtime-NYCT.proto \
 src/main/resources/com/google/transit/realtime/gtfs-realtime-OneBusAway.proto

Note: you will need to add back a copyright-license header to each source file after regeneration.