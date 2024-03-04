package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Bai07 extends AppCompatActivity {
    Button btnTinhBinary, btnTinhHexa;
    EditText inputDecimal;
    TextView txtKquaDecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai07);
        addControl();
        addEvent();
    }
    public void addControl()
    {
        btnTinhBinary = (Button) findViewById(R.id.btnTinhBinary);
        btnTinhHexa = (Button) findViewById(R.id.btnTinhHexa);
        inputDecimal = (EditText) findViewById(R.id.inputDecimal);
        txtKquaDecimal = (TextView) findViewById(R.id.txtKquaDecimal);
    }
    public void addEvent() {

        btnTinhBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý chuyển đổi sang hệ nhị phân
                if (!inputDecimal.getText().toString().isEmpty()) {
                    int decimalValue = Integer.parseInt(inputDecimal.getText().toString());
                    String binaryResult = Integer.toBinaryString(decimalValue);
                    txtKquaDecimal.setText("Hệ nhị phân: " + binaryResult);
                } else {
                    txtKquaDecimal.setText("Vui lòng nhập số thập phân");
                }
            }
        });

        btnTinhHexa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý chuyển đổi sang hệ thập lục phân
                if (!inputDecimal.getText().toString().isEmpty()) {
                    int decimalValue = Integer.parseInt(inputDecimal.getText().toString());
                    String hexaResult = Integer.toHexString(decimalValue);
                    txtKquaDecimal.setText("Hệ thập lục phân: " + hexaResult);
                } else {
                    txtKquaDecimal.setText("Vui lòng nhập số thập phân");
                }
            }
        });
    }
}
