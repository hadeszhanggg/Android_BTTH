package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,btn9,btn10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvent();
    }
    void addControls()
    {
        btn1 = (Button) findViewById(R.id.btnBai01);
        btn2 = (Button) findViewById(R.id.btnBai02);
        btn3 = (Button) findViewById(R.id.btnBai03);
        btn4 = (Button) findViewById(R.id.btnBai04);
        btn5 = (Button) findViewById(R.id.btnBai05);
        btn6 = (Button) findViewById(R.id.btnBai06);
        btn7 = (Button) findViewById(R.id.btnBai07);
        btn8 = (Button) findViewById(R.id.btnBai08);
        btn9 = (Button) findViewById(R.id.btnBai09);
        btn10 = (Button) findViewById(R.id.btnBai10);
    }
    @Override
    protected void onPause(){
        super.onPause();
    }
    @Override
    protected void onStop(){
        super.onStop();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
    }
    void addEvent(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),Activity_Bai01.class);

                startActivity(it);
                //quick Notification
                Toast.makeText(getApplicationContext(),"Open bai01!",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Open",Toast.LENGTH_LONG).show();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),Activity_Bai02.class);
                startActivity(it);
                //quick Notification
                Toast.makeText(getApplicationContext(),"Open bai02!",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Open",Toast.LENGTH_LONG).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),Activity_Bai03.class);
                startActivity(it);
                //quick Notification
                Toast.makeText(getApplicationContext(),"Open bai03!",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Open",Toast.LENGTH_LONG).show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),Activity_Bai04.class);
                startActivity(it);
                //quick Notification
                Toast.makeText(getApplicationContext(),"Open bai04!",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Open",Toast.LENGTH_LONG).show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),Activity_Bai05.class);
                startActivity(it);
                //quick Notification
                Toast.makeText(getApplicationContext(),"Open bai05!",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Open",Toast.LENGTH_LONG).show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),Activity_Bai06.class);
                startActivity(it);
                //quick Notification
                Toast.makeText(getApplicationContext(),"Open bai06!",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Open",Toast.LENGTH_LONG).show();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),Activity_Bai07.class);
                startActivity(it);
                //quick Notification
                Toast.makeText(getApplicationContext(),"Open bai07!",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Open",Toast.LENGTH_LONG).show();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),Activity_Bai08.class);
                startActivity(it);
                //quick Notification
                Toast.makeText(getApplicationContext(),"Open bai08!",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Open",Toast.LENGTH_LONG).show();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),Activity_Bai09.class);
                startActivity(it);
                //quick Notification
                Toast.makeText(getApplicationContext(),"Open bai09!",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Open",Toast.LENGTH_LONG).show();
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(),Activity_Bai10.class);
                startActivity(it);
                //quick Notification
                Toast.makeText(getApplicationContext(),"Open bai10!",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Open",Toast.LENGTH_LONG).show();
            }
        });
    }
}