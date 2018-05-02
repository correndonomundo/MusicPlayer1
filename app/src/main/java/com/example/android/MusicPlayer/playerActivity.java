package com.example.android.MusicPlayer;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.MusicPlayer.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedMap;

/**
 * Created by HP on 4/6/2016.
 */
public class playerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_list);

        int position = getIntent().getIntExtra("currentPosition", -1);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Desafinado", "Ella Fitzgerald", "The best of Ella"));
        songs.add(new Song("Corcovado", "Andy Williams", "The shadow of your smile"));
        songs.add(new Song("Smoke on the water", "Deep Purple", "Machine Head"));
        songs.add(new Song("'Na sera e maggio", "Patrizio Buanne", "The Italian"));
        songs.add(new Song("Yolanda", "Pink Martini", "Sympathique"));
        songs.add(new Song("La soledad", "Pink Martini", "Simpathique"));
        songs.add(new Song("Mil Passos", "Soha", "D'ici et d'ailleurs"));
        songs.add(new Song("Su lado de cama ", "Joao Soriano", "El Duque de la Bachata"));

        ArrayList<Song> songs2 = new ArrayList<Song>();
        songs2.add(songs.get(position));

        com.example.android.MusicPlayer.playerAdapter Adapter = new com.example.android.MusicPlayer.playerAdapter(this, songs2);

        ListView listView = (ListView) findViewById(R.id.activity_player_list);

        listView.setAdapter(Adapter);

        ImageButton imageButton = (ImageButton) findViewById(R.id.previous);





    }
}





