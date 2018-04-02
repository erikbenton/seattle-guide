package com.example.android.seattleguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Getting all the TextViews
        TextView westSeattleTV = findViewById(R.id.west_seattle_tv);
        final TextView lowerQueenAnneTV = findViewById(R.id.lower_queen_anne_tv);
        TextView pikePlaceTV = findViewById(R.id.pike_place_tv);
        TextView westlakeCenterTV = findViewById(R.id.westlake_tv);

        // Adding click events to TextViews
        westSeattleTV.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // Create Intent to open West Seattle Activity
                Intent westSeattleIntent = new Intent(MainActivity.this, WestSeattleActivity.class);

                // Start the new West Seattle Activity
                startActivity(westSeattleIntent);
            }
        });

        lowerQueenAnneTV.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // Create Intent to open Lower Queen Anne Activity
                Intent queenAnneIntent = new Intent(MainActivity.this, LowerQueenAnneActivity.class);

                // Start the new Lower Queen Anne Activity
                startActivity(queenAnneIntent);
            }
        });

        pikePlaceTV.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // Create Intent to open Pike Place Market Activity
                Intent pikePlaceIntent = new Intent(MainActivity.this, PikePlaceMarketActivity.class);

                // Start new Pike Place Market Activity
                startActivity(pikePlaceIntent);
            }
        });

        westlakeCenterTV.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // Create Intent to open Westlake Center Activity
                Intent westlakeCenterIntent = new Intent(MainActivity.this, WestlakeCenterActivity.class);

                // Start new West Lake Center Activity
                startActivity(westlakeCenterIntent);
            }
        });
    }
}
