package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class ImageView extends AppCompatActivity {
    Button btnNewImage ;
    android.widget.ImageView imgView;
    int [] id={R.drawable.battien , R.drawable.camchuong,R.drawable.dongtien,R.drawable.hoahong,R.drawable.hoalan,R.drawable.hoaly};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        btnNewImage =  findViewById(R.id.btnNewImage);
        imgView = findViewById(R.id.imgView);
        addEvent();
    }
    void addEvent() {
        btnNewImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rd = new Random();
                int n=rd.nextInt(id.length);
                imgView.setImageResource(id[n]);
                Toast.makeText(getApplicationContext(), "Uploading new image!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}