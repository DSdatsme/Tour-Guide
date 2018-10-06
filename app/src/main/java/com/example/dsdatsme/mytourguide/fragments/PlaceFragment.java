package com.example.dsdatsme.mytourguide.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.dsdatsme.mytourguide.Location;
import com.example.dsdatsme.mytourguide.LocationAdapter;
import com.example.dsdatsme.mytourguide.R;

import java.util.ArrayList;

public class PlaceFragment extends Fragment {
    public PlaceFragment() {
    }

    @NonNull
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayList<Location> locations = new ArrayList<>();

        View rootView = inflater.inflate(R.layout.list_view_layout, container, false);

        locations.add(new Location(R.string.place_name_gorai, R.drawable.gorai, R.string.place_description_gorai));
        locations.add(new Location(R.string.place_name_pagoda, R.drawable.pagoda, R.string.place_description_pagoda));
        locations.add(new Location(R.string.place_name_tungareshwar, R.drawable.tungareshwar, R.string.place_description_tungareshwar));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.custom_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
