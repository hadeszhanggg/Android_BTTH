package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class giaiPT_2 extends AppCompatActivity {
    Button btnClose;
    TextView txtKqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giai_pt2);
        btnClose=findViewById(R.id.btnBack);
        txtKqua=findViewById(R.id.txtKqua);
        Intent callerI=getIntent();
        Bundle getValue = callerI.getBundleExtra("MyResult");
        txtKqua.setText(getValue.getString("kqua"));
        addEvent();
    }
    void addEvent() {
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), giaiPT_1.class);
                startActivity(it);
            }
        });
    }
}