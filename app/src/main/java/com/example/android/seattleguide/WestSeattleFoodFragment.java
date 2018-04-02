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
public class WestSeattleFoodFragment extends Fragment
{


    public WestSeattleFoodFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.entry_list, container, false);

        // Create a list of places to go in West Seattle
        final ArrayList<String> foods = new ArrayList<String>();
        foods.add("Salty's Fish 'n Chips");
        foods.add("Lee's Asian");
        foods.add("Kokoras Greek Grill");
        foods.add("Mission Cantina");

        // Create an Array Adapter for creating the layout for places
        ArrayAdapter<String> placesAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, foods);

        //Find the List View by ID
        ListView listView = rootView.findViewById(R.id.entry_view);

        // Make listView use the Adapter to display all the places
        listView.setAdapter(placesAdapter);

        return rootView;
    }

}
