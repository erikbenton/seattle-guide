package com.example.android.seattleguide;


import android.content.Intent;
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
        final ArrayList<Entry> foods = new ArrayList<Entry>();
        foods.add(new Entry("Salty's Fish 'n Chips", "Great place for eating fish and chips. Way better than Spuds"));
        foods.add(new Entry("Lee's Asian", "My favorite Asian food place. Get the General Tso's chicken, you can't go wrong"));
        foods.add(new Entry("Kokoras Greek Grill", "Best Gyro place in town, and their fries are great. Make sure the get extra Feta."));
        foods.add(new Entry("Mission Cantina", "Go here for an upper class Mexican restaurant dinner."));

        // Create an Array Adapter for creating the layout for places
        EntryAdapter adapter = new EntryAdapter(getActivity(), foods);

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
                Entry entry = foods.get(i);

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
