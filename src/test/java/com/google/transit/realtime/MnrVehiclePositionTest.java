/**
 * Copyright (C) 2019 Cambridge Systematics, Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.transit.realtime;

import org.junit.Test;

import static org.junit.Assert.*;

public class MnrVehiclePositionTest {

    @Test
    public void testVanillaVehiclePosition() {
        GtfsRealtime.VehiclePosition vp = createVehiclePosition();
        assertFalse(vp.hasExtension(GtfsRealtimeMNR.mnrVehiclePosition));
        // If extension is queried regardless:
        assertFalse(vp.getExtension(GtfsRealtimeMNR.mnrVehiclePosition).hasCurrentStatus());
        // Default status should be NONE:
        assertEquals(GtfsRealtimeMNR.MnrVehiclePosition.MnrVehicleStopStatus.NONE,
                vp.getExtension(GtfsRealtimeMNR.mnrVehiclePosition).getCurrentStatus());
    }

    @Test
    public void testVehiclePositionWithEmptyExtension() {
        GtfsRealtime.VehiclePosition vp = createVehiclePositionWithExtension(false);
        assertTrue(vp.hasExtension(GtfsRealtimeMNR.mnrVehiclePosition));
        assertFalse(vp.getExtension(GtfsRealtimeMNR.mnrVehiclePosition).hasCurrentStatus());
        // Default status should be NONE:
        assertEquals(GtfsRealtimeMNR.MnrVehiclePosition.MnrVehicleStopStatus.NONE,
                vp.getExtension(GtfsRealtimeMNR.mnrVehiclePosition).getCurrentStatus());
    }

    @Test
    public void testVehiclePositionDelayed() {
        GtfsRealtime.VehiclePosition vp = createVehiclePositionWithExtension(true);
        assertTrue(vp.hasExtension(GtfsRealtimeMNR.mnrVehiclePosition));
        assertTrue(vp.getExtension(GtfsRealtimeMNR.mnrVehiclePosition).hasCurrentStatus());
        assertEquals(GtfsRealtimeMNR.MnrVehiclePosition.MnrVehicleStopStatus.DELAYED,
                vp.getExtension(GtfsRealtimeMNR.mnrVehiclePosition).getCurrentStatus());
    }

    private static GtfsRealtime.VehiclePosition createVehiclePosition() {
        return GtfsRealtime.VehiclePosition.getDefaultInstance();
    }

    private static GtfsRealtime.VehiclePosition createVehiclePositionWithExtension(boolean includeDelayed) {
        GtfsRealtimeMNR.MnrVehiclePosition.Builder extension = GtfsRealtimeMNR.MnrVehiclePosition.newBuilder();
        if (includeDelayed) {
            extension.setCurrentStatus(GtfsRealtimeMNR.MnrVehiclePosition.MnrVehicleStopStatus.DELAYED);
        }
        return GtfsRealtime.VehiclePosition.newBuilder()
                .setExtension(GtfsRealtimeMNR.mnrVehiclePosition, extension.build())
                .build();
    }
}
