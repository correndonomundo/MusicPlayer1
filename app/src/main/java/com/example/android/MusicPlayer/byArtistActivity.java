package com.example.android.MusicPlayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class byArtistActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Desafinado", "Ella Fitzgerald", "The best of Ella"));
        songs.add(new Song("Corcovado", "Andy Williams", "The shadow of your smile"));
        songs.add(new Song("Smoke on the water", "Deep Purple", "Machine Head"));
        songs.add(new Song("'Na sera e maggio", "Patrizio Buanne", "The Italian"));
        songs.add(new Song("Yolanda", "Pink Martini", "Sympathique"));
        songs.add(new Song("La soledad", "Pink Martini", "Simpathique"));
        songs.add(new Song("Mil Passos", "Soha", "D'ici et d'ailleurs"));
        songs.add(new Song("Su lado de cama ", "Joao Soriano", "El Duque de la Bachata"));


        com.example.android.MusicPlayer.SongAdapter Adapter = new com.example.android.MusicPlayer.SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.songs_list);

        listView.setAdapter(Adapter);

        // Find the View that shows the colors category
        ListView songsList = (ListView) findViewById(R.id.songs_list);

    }
}

