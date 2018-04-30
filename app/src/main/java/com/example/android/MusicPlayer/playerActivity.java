package com.example.android.MusicPlayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class playerActivity extends AppCompatActivity {

    static View currentSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        // Find the View that shows the colors category
        TextView current_Song = (TextView) currentSong;

            TextView songsList = (TextView) findViewById(R.id.by_title_player);
            songsList.setText("Hello");


    }
}
