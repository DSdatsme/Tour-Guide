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

public class AmusementFragment extends Fragment {
    //constructor
    public AmusementFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ArrayList<Location> locations = new ArrayList<>();

        View rootView = inflater.inflate(R.layout.list_view_layout, container, false);

        locations.add(new Location(R.string.amusement_name_fantasy, R.drawable.vardhman, R.string.amusement_description_fantasy));
        locations.add(new Location(R.string.amusement_name_cinemax, R.drawable.cinemax, R.string.amusement_description_cinemax));
        locations.add(new Location(R.string.amusement_name_municipal_garden, R.drawable.municipal_garden, R.string.amusement_description_municipal_garden));
        locations.add(new Location(R.string.amusement_name_thakur_mall, R.drawable.thakur_mall, R.string.amusement_description_thakur_mall));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.custom_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
