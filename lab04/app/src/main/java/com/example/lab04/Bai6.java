package com.example.a2001215653_nguyentanhuudanh_buoi05_btvn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class Bai6 extends AppCompatActivity {
    ListView list;
    ArrayList<Music> listMusic = new ArrayList<>();
    MusicAdapter musicAdapter;
    ImageButton btnPlay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai6);
        addControl();


    }

    protected void addControl()
    {
        btnPlay =findViewById(R.id.btnPlay);
        list = findViewById(R.id.list);
        addMusic();
        musicAdapter = new MusicAdapter(Bai6.this,R.layout.layout_row, listMusic);
        list.setAdapter(musicAdapter);
    }

    protected void addMusic()
    {
        Music music1 = new Music(R.raw.khutaosong,R.drawable.khutaosong, "Khu tao sống");
        listMusic.add(music1);
        Music music2 = new Music(R.raw.chanhoc,R.drawable.chanhoc, "Chán học");
        listMusic.add(music2);
        Music music3 = new Music(R.raw.daucoduoc,R.drawable.daucoduoc, "Đâu có được");
        listMusic.add(music3);
    }


}