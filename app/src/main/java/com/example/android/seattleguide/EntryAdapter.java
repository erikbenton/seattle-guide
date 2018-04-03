package com.example.android.seattleguide;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.android.seattleguide.WestSeattleEventsFragment;
import com.example.android.seattleguide.WestSeattleFoodFragment;
import com.example.android.seattleguide.WestSeattlePlacesFragment;

import java.util.ArrayList;
import java.util.List;

public class EntryAdapter extends ArrayAdapter<Entry>
{

    private Context mContext;
    private List<Entry> entryList;
    private int mColorResourceId;

    public EntryAdapter(@NonNull Activity context, ArrayList<Entry> list, int colorResource)
    {
        super(context, 0, list);
        mContext = context;
        entryList = list;
        mColorResourceId = colorResource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItem = convertView;


        if(listItem == null)
        {
            listItem = LayoutInflater.from(mContext).inflate(android.R.layout.simple_list_item_1, parent, false);
        }

        final Entry currentEntry = entryList.get(position);

        ImageView imageView = listItem.findViewById(R.id.image);

        // Adding image to the list
        imageView.setImageResource(currentEntry.getImageResourceId());


        return listItem;
    }
}
