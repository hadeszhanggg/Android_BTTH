package com.example.lab4_nguyenduyluan_2001215937;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bai5_Child extends AppCompatActivity {

    MediaPlayer player;
    TextView tvName;
    Button btnPlay, btnPause, btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5_child);
        Bundle bundle = getIntent().getExtras();
        tvName = (TextView) findViewById(R.id.textViewSongBai5_Child);
        tvName.setText(bundle.getString("name"));
        player = MediaPlayer.create(this,bundle.getInt("id"));
        addControls();
        addEvents();
    }

    void addControls()
    {
        btnPlay = (Button) findViewById(R.id.btnPlayBai5);
        btnPause = (Button) findViewById(R.id.btnPauseBai5);
        btnPause.setEnabled(false);
        btnBack = (Button) findViewById(R.id.btnBackBai5);
    }

    void addEvents()
    {
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.start();
                btnPause.setEnabled(true);
                btnPlay.setEnabled(false);
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.pause();
                btnPlay.setEnabled(true);
                btnPause.setEnabled(false);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}