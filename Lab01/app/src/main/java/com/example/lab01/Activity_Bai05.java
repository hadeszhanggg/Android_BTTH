package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Bai05 extends AppCompatActivity {
    EditText inputA, inputB;
    Button btnTinh;
    TextView txtKqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai05);
        addEvent();
    }
    void addEvent(){
        btnTinh = (Button) findViewById(R.id.btnTinh);
        inputA = (EditText) findViewById(R.id.inputA);
        inputB = (EditText) findViewById(R.id.inputB);
        txtKqua=(TextView) findViewById(R.id.txtKetQua);

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(inputA.getText().toString());
                int b = Integer.parseInt(inputB.getText().toString());
                String result;
                if (a == 0) {
                    if (b == 0) {
                        result = "Phương trình có vô số nghiệm.";
                    } else {
                        result = "Phương trình vô nghiệm.";
                    }
                } else {
                    double x = (double) -b / a;
                    result = "Kết quả phương trình " + a + "x + " + b + " = 0 là: x = " + x;
                }
                txtKqua.setText(result);
            }
        });
    }
}