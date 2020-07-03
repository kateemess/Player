package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView playlists = findViewById(R.id.playlists);
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);

                startActivity(playlistsIntent);
            }

        });

        TextView albums = findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        TextView artists = findViewById(R.id.artists);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        TextView tracks = findViewById(R.id.tracks);
        tracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tracksIntent = new Intent(MainActivity.this, TracksActivity.class);
                startActivity(tracksIntent);
            }
        });

    }
}