package com.example.android.seattleguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class WestSeattleActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_category.xml layout file
        setContentView(R.layout.west_seattle);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        EntryAdapter adapter = new EntryAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
