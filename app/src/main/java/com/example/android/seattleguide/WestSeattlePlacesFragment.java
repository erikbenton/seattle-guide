package com.example.android.seattleguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class WestSeattlePlacesFragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.entry_list, container, false);

        // Create a list of places to go in West Seattle
        final ArrayList<String> places = new ArrayList<String>();
        places.add("Alki");
        places.add("The Junction");
        places.add("Admiral District");
        places.add("Piers");

        // Create an Array Adapter for creating the layout for places
        ArrayAdapter<String> placesAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, places);

        //Find the List View by ID
        ListView listView = rootView.findViewById(R.id.entry_view);

        // Make listView use the Adapter to display all the places
        listView.setAdapter(placesAdapter);

        return rootView;
    }
}
