package com.example.android.seattleguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;

import com.example.android.seattleguide.R;
import com.example.android.seattleguide.WestSeattleEventsFragment;
import com.example.android.seattleguide.WestSeattleFoodFragment;
import com.example.android.seattleguide.WestSeattlePlacesFragment;

public class SimplePagerAdapter extends FragmentPagerAdapter
{

    private Context mContext;

    public SimplePagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
        {
            return new WestSeattlePlacesFragment();
        }
        else if (position == 1)
        {
            return new WestSeattleFoodFragment();
        }
        else
        {
            return new WestSeattleEventsFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
        {
            return "Places";
        } else if (position == 1)
        {
            return "Food";
        }
        else
        {
            return "Events";
        }
    }

}
