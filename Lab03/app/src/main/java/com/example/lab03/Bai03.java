package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Bai03 extends AppCompatActivity {
    Button btnSend;
    EditText txtName, txtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai03);
        txtName=findViewById(R.id.edtName);
        txtEmail=findViewById(R.id.edtEmail);
        btnSend=findViewById(R.id.btnSend);
        addEvent();
    }
    void addEvent() {
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = txtName.getText().toString();
                String email = txtEmail.getText().toString();

                if (!name.isEmpty() && !email.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("name", name);
                    bundle.putString("email", email);

                    Intent it = new Intent(getApplicationContext(), Bai03_Infor.class);
                    it.putExtra("MyInfor", bundle);
                    startActivity(it);
                } else {
                    Toast.makeText(getApplicationContext(), "Fill value Name and Email, please!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}