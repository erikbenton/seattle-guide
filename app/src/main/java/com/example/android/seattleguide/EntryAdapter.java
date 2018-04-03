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
import android.widget.TextView;

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

    public EntryAdapter(@NonNull Activity context, ArrayList<Entry> list)
    {
        super(context, 0, list);
        mContext = context;
        entryList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItem = convertView;

        if(listItem == null)
        {
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);
        }

        final Entry currentEntry = entryList.get(position);

        TextView entryText = listItem.findViewById(R.id.entry_text_view);
        entryText.setText(currentEntry.getTitle());


        return listItem;
    }
}
