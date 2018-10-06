package com.example.dsdatsme.mytourguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.dsdatsme.mytourguide.CategoryAdapter;
import com.example.dsdatsme.mytourguide.Location;

import java.util.ArrayList;
import java.util.List;

public class PlaceFragment extends Fragment {
    public PlaceFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        List<Location> locations = new ArrayList<>();

        locations.add(new Location(R.string.amusement_name_fantasy, R.drawable.ic_launcher_round,R.string.amusement_name_fantasy );
        locations.add(new Location(R.string.amusement_name_fantasy, R.drawable.ic_launcher_round,R.string.amusement_name_fantasy );

        View rootView = inflater.inflate(R.layout.amusement_list,container, false);
        CategoryAdapter adapter = new CategoryAdapter (getActivity(), locations, R.colo);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
