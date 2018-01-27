/*
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.iitism.devism.shuttletracker;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

/**
 * Created by shubham on 26/11/17.
 */
public class MapItem implements ClusterItem {

    public final String name;
    public final int icon;
    private final LatLng mPosition;



    public MapItem(LatLng position, String name, int pictureResource) {
        this.name = name;
        icon = pictureResource;
        mPosition = position;

    }


    @Override
    public LatLng getPosition() {
        return mPosition;
    }

    public String getName() {
        return name;
    }

}
