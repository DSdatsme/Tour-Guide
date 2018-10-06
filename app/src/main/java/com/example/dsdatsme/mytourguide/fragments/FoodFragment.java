package com.example.dsdatsme.mytourguide.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.dsdatsme.mytourguide.Location;
import com.example.dsdatsme.mytourguide.LocationAdapter;
import com.example.dsdatsme.mytourguide.R;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    //constructor
    public FoodFragment() {
    }

    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayList<Location> locations = new ArrayList<>();

        View rootView = inflater.inflate(R.layout.list_view_layout, container, false);

        locations.add(new Location(R.string.food_name_panipuri, R.drawable.pani_puri, R.string.food_description_panipuri));
        locations.add(new Location(R.string.food_name_pavbhaji, R.drawable.bhaji_pav, R.string.food_description_pavbhaji));
        locations.add(new Location(R.string.food_name_vadapav, R.drawable.vadapav, R.string.food_description_vadapav));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.custom_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
