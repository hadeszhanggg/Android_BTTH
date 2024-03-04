package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtName, edtPass;
    Button btnLogin, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtName);
        edtPass = findViewById(R.id.edtPass);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignup = findViewById(R.id.btnSignup);

        String confirmName = "null", confirmPass = "null";
        Intent intent = getIntent();
        confirmName = intent.getStringExtra("name");
        confirmPass = intent.getStringExtra("pass");

        addEvent(confirmName, confirmPass);
    }

    void addEvent(String name, String pass) {
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), dangKy.class);
                startActivity(it);
                // Quick Notification
                Toast.makeText(getApplicationContext(), "Close signin form", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "Open Signup form", Toast.LENGTH_LONG).show();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name != null && pass != null
                        && name.equals(edtName.getText().toString())
                        && pass.equals(edtPass.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "Login successfully!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Login failed!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
