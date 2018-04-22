package com.example.android.MusicPlayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> words) {
        super(context, 0,words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Song currentWord = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.by_title_text_view);

        titleTextView.setText(currentWord.getdisplayTitle());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.by_artist_text_view);

        artistTextView.setText(currentWord.getdisplayArtist());

        TextView albumTextView = (TextView) listItemView.findViewById(R.id.by_album_text_view);

        albumTextView.setText(currentWord.getdisplayAlbum());

        return listItemView;
    }

}