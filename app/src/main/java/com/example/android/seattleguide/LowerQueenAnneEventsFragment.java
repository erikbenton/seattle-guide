package com.example.android.seattleguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LowerQueenAnneEventsFragment extends Fragment
{


    public LowerQueenAnneEventsFragment()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.entry_list, container, false);

        // Create a list of places to go in West Seattle
        final ArrayList<Entry> places = new ArrayList<Entry>();
        places.add(new Entry("Pacific Science Center", "Great place to learn about science and engineering! Lots of really cool displays and amazing fun for kids", R.raw.pacific_science_center));
        places.add(new Entry("Seattle Center", "Great place to go on a free day, especially in the summer. This is where the Space needle is. Also, there's a great dome shaped fountain, the Key Arena, rides for kids to go on, and many special events are held here.", R.raw.seattle_center));
        places.add(new Entry("Museum of Pop Culture", "The Museum of Pop Culture is a wonderful place to learn about the history of pop, especially since Seattle has played a pivotal role in its formation", R.raw.museum_of_pop_culture));
        places.add(new Entry("Myrtle Edwards Park", "Great beach park to go to. Has a nice bike path to ride on, an outside obstacle course, and cool industrial buildings to look at. Plus the Seattle Hempfest is held here ;)", R.raw.myrtle_edwards_park));

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
