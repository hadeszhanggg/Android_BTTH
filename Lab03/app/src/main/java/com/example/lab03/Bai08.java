package com.example.lab03;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bai08 extends AppCompatActivity {
    private class Card {
        public int drawableId;
        public int value;

        public Card(int drawableId, int value) {
            this.drawableId = drawableId;
            this.value = value;
        }
    }

    Button btnPlay, btnLichSu;
    android.widget.ImageView imgView1, imgView2, imgView3, imgView4, imgView5, imgView6;
    Card[] id = new Card[52];
    TextView txtNutHades, txtNutBot;
    List<String> lichSuChoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai08);
        btnPlay = findViewById(R.id.btnPlay);
        btnLichSu = findViewById(R.id.btnLichSu);
        imgView1 = findViewById(R.id.img1);
        imgView2 = findViewById(R.id.img2);
        imgView3 = findViewById(R.id.img3);
        imgView4 = findViewById(R.id.img4);
        imgView5 = findViewById(R.id.img5);
        imgView6 = findViewById(R.id.img6);
        txtNutBot = findViewById(R.id.txtNutBot);
        txtNutHades = findViewById(R.id.txtNutHades);

        lichSuChoi = new ArrayList<>();

        for (int i = 1; i <= 52; i++) {
            String drawableName = "a" + i;
            int drawableId = getResources().getIdentifier(drawableName, "drawable", getPackageName());
            if (drawableId != 0) {
                id[i - 1] = new Card(drawableId, getValueForDrawable(i));
            }
        }

        addEvent();
    }

    void addEvent() {
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rd = new Random();
                int n1 = rd.nextInt(id.length);
                int n2 = rd.nextInt(id.length);
                int n3 = rd.nextInt(id.length);
                int n4 = rd.nextInt(id.length);
                int n5 = rd.nextInt(id.length);
                int n6 = rd.nextInt(id.length);

                int sumHades = id[n1].value + id[n2].value + id[n3].value;
                int sumBot = id[n4].value + id[n5].value + id[n6].value;
                txtNutBot.setText("Số nút của Bot: " + sumBot);
                txtNutHades.setText("Số nút của Hades: " + sumHades);

                String result = "Hòa";
                if (sumHades > sumBot) {
                    result = "Hades thắng";
                    Toast.makeText(getApplicationContext(), "Hades Thang", Toast.LENGTH_SHORT).show();
                } else if (sumHades < sumBot) {
                    result = "Hades thua";
                    Toast.makeText(getApplicationContext(), "Hades thua", Toast.LENGTH_SHORT).show();
                }else Toast.makeText(getApplicationContext(), "Hades hoa", Toast.LENGTH_SHORT).show();

                lichSuChoi.add("Hades: " + sumHades + " - Bot: " + sumBot + " - Kết quả: " + result);

                imgView1.setImageResource(id[n1].drawableId);
                imgView2.setImageResource(id[n2].drawableId);
                imgView3.setImageResource(id[n3].drawableId);
                imgView4.setImageResource(id[n4].drawableId);
                imgView5.setImageResource(id[n5].drawableId);
                imgView6.setImageResource(id[n6].drawableId);
            }
        });

        btnLichSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LichSuChoi.class);
                // Tạo Bundle để chứa dữ liệu cần truyền đi
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("lichSuChoi", (ArrayList<String>) lichSuChoi);
                // Đưa Bundle vào Intent
                intent.putExtras(bundle);
                // Khởi chạy Intent để mở Activity mới
                startActivity(intent);
            }
        });
    }

    int getValueForDrawable(int i) {
        if (i >= 1 && i <= 4) {
            return 1;
        } else if (i >= 5 && i <= 20) {
            return 10;
        } else if (i >= 21 && i <= 24) {
            return 9;
        } else if (i >= 25 && i <= 28) {
            return 8;
        } else if (i >= 29 && i <= 32) {
            return 7;
        } else if (i >= 33 && i <= 36) {
            return 6;
        } else if (i >= 37 && i <= 40) {
            return 5;
        } else if (i >= 41 && i <= 44) {
            return 4;
        } else if (i >= 45 && i <= 48) {
            return 3;
        } else if (i >= 49 && i <= 52) {
            return 2;
        }
        return 0;
    }
}
