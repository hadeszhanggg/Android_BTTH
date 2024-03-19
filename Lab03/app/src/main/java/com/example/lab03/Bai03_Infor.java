package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Bai03_Infor extends AppCompatActivity {
    EditText edtName, edtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai03_infor);
        edtName = findViewById(R.id.txtName);
        edtEmail=findViewById(R.id.txtEmail);
        Intent callerI=getIntent();
        Bundle getValue = callerI.getBundleExtra("MyInfor");
        edtName.setText(getValue.getString("name"));
        edtEmail.setText(getValue.getString("email"));
    }
}