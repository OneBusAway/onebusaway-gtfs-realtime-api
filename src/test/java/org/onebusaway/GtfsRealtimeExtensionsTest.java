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

package org.onebusaway;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.transit.realtime.GtfsRealtimeConstants;
import com.google.transit.realtime.GtfsRealtimeExtensions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.google.transit.realtime.GtfsRealtime.*;
import static com.google.transit.realtime.GtfsRealtimeNYCT.NyctTripDescriptor;
import static com.google.transit.realtime.GtfsRealtimeNYCT.nyctTripDescriptor;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GtfsRealtimeExtensionsTest {

    private final static ExtensionRegistry er = ExtensionRegistry.newInstance();

    @BeforeAll
    static void setUp() {
        GtfsRealtimeExtensions.registerExtensions(er);
    }

    private final String TEST_ENTITY_ID = "1";
    private final String TEST_FEED_VERSION = GtfsRealtimeConstants.VERSION;
    private final String TEST_TRAIN_ID = "0A 1002+ 207/FAR";
    private final boolean TEST_IS_ASSIGNED = true;

    @Test
    void registerExtensions() throws InvalidProtocolBufferException {

        final FeedMessage.Builder fmb = FeedMessage.newBuilder();

        final FeedHeader.Builder fhb = fmb.getHeaderBuilder();
        fhb.setGtfsRealtimeVersion(TEST_FEED_VERSION);

        final FeedEntity.Builder feb = fmb.addEntityBuilder();
        feb.setId(TEST_ENTITY_ID);

        final TripUpdate.Builder tub = feb.getTripUpdateBuilder();
        final TripDescriptor.Builder tdb = tub.getTripBuilder();

        final NyctTripDescriptor.Builder ntdb = NyctTripDescriptor.newBuilder();
        ntdb.setTrainId(TEST_TRAIN_ID);
        ntdb.setIsAssigned(TEST_IS_ASSIGNED);

        tdb.setExtension(nyctTripDescriptor, ntdb.build());

        final byte[] serializedMessage = fmb.build().toByteArray();

        final FeedMessage fm = FeedMessage.parseFrom(serializedMessage, er);

        assertEquals(TEST_FEED_VERSION, fm.getHeader().getGtfsRealtimeVersion());

        final FeedEntity fe = fm.getEntity(0);
        final TripUpdate tu = fe.getTripUpdate();
        final TripDescriptor td = tu.getTrip();
        final NyctTripDescriptor ntd = td.getExtension(nyctTripDescriptor);

        assertEquals(TEST_TRAIN_ID, ntd.getTrainId());
        assertEquals(TEST_IS_ASSIGNED, ntd.getIsAssigned());
    }
}