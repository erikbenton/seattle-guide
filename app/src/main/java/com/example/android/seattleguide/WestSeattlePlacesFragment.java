package com.example.android.seattleguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;

public class WestSeattlePlacesFragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

        View rootView = inflater.inflate(R.layout.entry_list, container, false);

        // Create a list of places to go in West Seattle
        final ArrayList<Entry> places = new ArrayList<Entry>();
        places.add(new Entry("Alki", "My favorite beach to chill at. It's not like a California beach with lots of sand and waves. It's a sandy -> rocky beach, but there are lots of fire pits, restaurants to eat at, and animals to see in the waters.", R.raw.alki));
        places.add(new Entry("The Junction", "Lots of fun shopping to do around here. It's a community shopping strip that's a good hub for going, and coming home from downtown.", R.raw.west_seattle_junction));
        places.add(new Entry("Admiral District", "The community shopping area for Alki and Admiral district dwellers. Some good restaurants, parks, and fitness centers", R.raw.admiral));
        places.add(new Entry("Seacrest Park", "Near the end of the Alki boardwalk. Goo restaurant to at while you fish. Plus it's right where the Water Taxi is so it's very easy to get downtown.", R.raw.seacrest_park));

        // Create an Array Adapter for creating the layout for places
        EntryAdapter adapter = new EntryAdapter(getActivity(), places);

        //Find the List View by ID
        ListView listView = rootView.findViewById(R.id.entry);

        // Make listView use the Adapter to display all the places
        listView.setAdapter(adapter);

        // Adding an onClickListener so that the entry
        // is presented when clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Entry entry = places.get(i);

                Intent intent = new Intent(getActivity(), EntryActivity.class);

                // Serializing the entry
                // https://github.com/google/gson
                Gson gson = new Gson();
                intent.putExtra("EntryInfo", gson.toJson(entry));
                startActivity(intent);

            }

        });

        return rootView;
    }
}
