package com.example.android.seattleguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class WestSeattleEventsFragment extends Fragment
{


    public WestSeattleEventsFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.entry_list, container, false);

        // Create a list of places to go in West Seattle
        final ArrayList<String> events = new ArrayList<String>();
        events.add("West Seattle Street Fair");
        events.add("Pirates Landing");
        events.add("West Seattle Parade");
        events.add("Scuba Diving");
        events.add("Fishing");
        events.add("Bike Rides");

        // Create an Array Adapter for creating the layout for places
        ArrayAdapter<String> placesAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, events);

        //Find the List View by ID
        ListView listView = rootView.findViewById(R.id.entry_view);

        // Make listView use the Adapter to display all the places
        listView.setAdapter(placesAdapter);

        return rootView;
    }

}
