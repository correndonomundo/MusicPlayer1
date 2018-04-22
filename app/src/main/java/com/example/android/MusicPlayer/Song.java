package com.example.android.MusicPlayer;

public class Song {


    private String mDisplayTitle;

    private String mDisplayArtist;

    private String mDisplayAlbum;


    public Song(String displayTitle, String displayArtist, String displayAlbum) {
        mDisplayTitle = displayTitle;
        mDisplayArtist = displayArtist;
        mDisplayAlbum = displayAlbum;
    }


    public String getdisplayTitle() {
        return  mDisplayTitle;
    }


    public String getdisplayArtist() {
        return mDisplayArtist;
    }

    public String getdisplayAlbum() {
        return mDisplayAlbum;
    }

}
