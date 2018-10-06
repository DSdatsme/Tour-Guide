package com.example.dsdatsme.mytourguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.dsdatsme.mytourguide.Location;
import com.example.dsdatsme.mytourguide.LocationAdapter;
import com.example.dsdatsme.mytourguide.R;

import java.util.ArrayList;

public class HotelFragment extends Fragment {
    //constructor
    public HotelFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayList<Location> locations = new ArrayList<>();

        View rootView = inflater.inflate(R.layout.list_view_layout, container, false);

        locations.add(new Location(R.string.hotel_name_darasdhaba, R.drawable.dara_dhaba, R.string.hotel_description_darasdhaba));
        locations.add(new Location(R.string.hotel_name_spicerice, R.drawable.spice_rice, R.string.hotel_description_spicerice));
        locations.add(new Location(R.string.hotel_name_veggies, R.drawable.veggies, R.string.hotel_description_veggies));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.custom_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
