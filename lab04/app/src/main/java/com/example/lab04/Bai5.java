package com.example.lab4_nguyenduyluan_2001215937;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Bai5 extends AppCompatActivity {

    ListView lvSong;
    ArrayList<Song> list = new ArrayList<>();
    SongAdapter songAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);
        addSongs();
        addControls();
        addEvents();
    }
    void addControls()
    {
        lvSong = (ListView) findViewById(R.id.lvSongBai5);
        songAdapter = new SongAdapter(Bai5.this,R.layout.song,list);
        lvSong.setAdapter(songAdapter);
    }
    void addSongs()
    {
        Song song1 = new Song(R.raw.ineedagirl,"I need a girl");
        list.add(song1);
        Song song2 = new Song(R.raw.rain,"Rain");
        list.add(song2);
        Song song3 = new Song(R.raw.lovecloud,"Love cloud");
        list.add(song3);
    }
    void addEvents()
    {
        lvSong.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Song currentSong = list.get(i);
                Intent intent = new Intent(getApplicationContext(),Bai5_Child.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",currentSong.name);
                bundle.putInt("id",currentSong.id);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}