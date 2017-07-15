/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.travelbyloveguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {

    public MuseumFragment(){
        //Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_object_list, container, false);

        ArrayList<TourObject> tourObjectArrayList = new ArrayList<TourObject>();

        TourObjectLocation location = new TourObjectLocation();

        location.setCity("Santiago de Chile");
        location.setStreetName("calle prinipal");
        location.setStreetNumber(54);
        location.setGeoLocalization("-33417005,-70619383");

        tourObjectArrayList.add(new TourObject(location, "Museum 1", "+48519101141", "Nice Museum"));
        //need to set adapter for a list

        TourObjectAdapter adapter = new TourObjectAdapter(getActivity(), tourObjectArrayList, R.color.colorBackgroundTourObject);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
