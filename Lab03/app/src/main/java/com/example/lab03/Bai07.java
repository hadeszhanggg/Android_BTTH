package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class Bai07 extends AppCompatActivity {
    private class Card {
        public int drawableId;
        public int value;

        public Card(int drawableId, int value) {
            this.drawableId = drawableId;
            this.value = value;
        }
    }

    android.widget.ImageView imgView1, imgView2, imgView3;
    Button btnDone;
    Card[] id = new Card[52];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai07);
        btnDone = findViewById(R.id.btnDone);
        imgView1 = findViewById(R.id.imageView1);
        imgView2 = findViewById(R.id.imageView2);
        imgView3 = findViewById(R.id.imageView3);

        for (int i = 1; i <= 52; i++) {
            String drawableName = "a" + i;
            int drawableId = getResources().getIdentifier(drawableName, "drawable", getPackageName());

            // Kiểm tra nếu drawableId không phải là 0 (tức là tìm thấy drawable)
            if (drawableId != 0) {
                // Gán một Card vao mảng đồng thời lấy giá trị (số nút) của lá bài bằng cách lấy tên của nó.
                id[i - 1] = new Card(drawableId, getValueForDrawable(i));
            }
        }
        addEvent();
    }
    void addEvent() {
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rd = new Random();
                //random 3 lá
                int n1 = rd.nextInt(id.length);
                int n2 = rd.nextInt(id.length);
                int n3 = rd.nextInt(id.length);
                //tíh tổng số nút bằng cách lấy value của lá bài tương ứng
                int sum = id[n1].value + id[n2].value + id[n3].value;
                Toast.makeText(getApplicationContext(), "Tổng nút ba lá bài là: " + sum, Toast.LENGTH_SHORT).show();
                //Lấy lá bài bằng cách lấy drawableId của mỗi lá
                imgView1.setImageResource(id[n1].drawableId);
                imgView2.setImageResource(id[n2].drawableId);
                imgView3.setImageResource(id[n3].drawableId);
            }
        });
    }
    //Hàm này gán giá trị (số nút) cho mỗi lá bài dựa vào tên của chúng
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
        return 0; // Giá trị mặc định
    }
}