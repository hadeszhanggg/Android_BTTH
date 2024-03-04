package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class Activity_Bai04 extends AppCompatActivity {
EditText inputA, inputB;
Button btnTim;
TextView txtKqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai04);
        addEvent();
    }
    //Tim uoc chung nho nhat tu a va b
    void addEvent(){
        btnTim = (Button) findViewById(R.id.btnTimUoc);
        inputA = (EditText) findViewById(R.id.inputA);
        inputB = (EditText) findViewById(R.id.inputB);
        txtKqua=(TextView) findViewById(R.id.txtKetQuaUocChung);

        btnTim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(inputA.getText().toString());
                int b = Integer.parseInt(inputB.getText().toString());
                String result = "Ước chung của " + a + " và " + b + " là: ";
                for (int i = 1; i <= Math.min(a, b); i++) {
                    if (a % i == 0 && b % i == 0) {
                        result += i + ", ";
                    }
                }
                txtKqua.setText(result.substring(0, result.length() - 2));
            }
        });
    }
}