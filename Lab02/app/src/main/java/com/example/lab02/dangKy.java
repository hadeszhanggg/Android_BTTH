package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class dangKy<string> extends AppCompatActivity {
    EditText edtName, edtPass, edtConfirmPass;
    Button btnSignup, btnSigninForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);

        edtName = findViewById(R.id.edtName);
        edtPass = findViewById(R.id.edtPass);
        edtConfirmPass = findViewById(R.id.edtRePass);
        btnSignup = findViewById(R.id.btnSignup);
        btnSigninForm = findViewById(R.id.btnSigninForm);

        addEvent();
    }

    void addEvent() {
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtName.getText().toString();
                String password = edtPass.getText().toString();

                if (password.equals(edtConfirmPass.getText().toString())) {
                    Intent it = new Intent(dangKy.this, MainActivity.class);
                    it.putExtra("name", username);
                    it.putExtra("pass", password);
                    startActivity(it);
                    // Quick Notification
                    Toast.makeText(getApplicationContext(), "Open login form!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Repassword must match password!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        String username = edtName.getText().toString();
        String password = edtPass.getText().toString();
    }
}
