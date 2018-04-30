package com.example.android.MusicPlayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView byTitle = (TextView) findViewById(R.id.by_title);

        // Set a click listener on that View
        byTitle.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent byAlbumIntent = new Intent(MainActivity.this, com.example.android.MusicPlayer.byTitleActivity.class);

                // Start the new activity
                startActivity(byAlbumIntent);
            }
        });

        // Find the View that shows the family category
        TextView byArtist = (TextView) findViewById(R.id.by_artist);

        // Set a click listener on that View
        byArtist.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent byTitleIntent = new Intent(MainActivity.this, byArtistActivity.class);

                // Start the new activity
                startActivity(byTitleIntent);
            }
        });

        // Find the View that shows the colors category
        TextView byAlbum = (TextView) findViewById(R.id.by_album);

        // Set a click listener on that View
        byAlbum.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent byArtistIntent = new Intent(MainActivity.this, byAlbumActivity.class);

                // Start the new activity
                startActivity(byArtistIntent);
            }
        });


     }
}