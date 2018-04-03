package com.example.android.seattleguide;


import android.content.Intent;
import android.media.AudioManager;
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
        final ArrayList<Entry> events = new ArrayList<Entry>();
        events.add(new Entry("West Seattle Street Fair", "Cool Street fair"));
        events.add(new Entry("Pirates Landing", "Pirates Land at Alki"));
        events.add(new Entry("West Seattle Parade", "Parade through West Seattle"));
        events.add(new Entry("Scuba Diving", "Lots of awesome dive spots"));
        events.add(new Entry("Fishing", "Plenty of places to fish and get that tasty PNW Salmon!"));
        events.add(new Entry("Bike Rides", "Great paces to go biking, very open community"));

        // Create an Array Adapter for creating the layout for places
        EntryAdapter adapter = new EntryAdapter(getActivity(), events);

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
                Entry entry = events.get(i);

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
