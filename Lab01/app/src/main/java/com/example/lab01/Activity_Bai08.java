package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Bai08 extends AppCompatActivity {
    Button btnCelsius, btnFahrenheit, btnClear;
    EditText inputFahrenheit, inputCelsius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai08);
        addControls();
        addEvent();
    }

    public void addControls() {
        btnCelsius = (Button) findViewById(R.id.btnCelsius);
        btnFahrenheit = (Button) findViewById(R.id.btnFahrenheit);
        btnClear = (Button) findViewById(R.id.btnClear);
        inputFahrenheit = (EditText) findViewById(R.id.inputFahrenheit);
        inputCelsius = (EditText) findViewById(R.id.inputCelsius);
    }

    public void addEvent() {
        btnCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý chuyển đổi từ Celsius sang Fahrenheit
                if (!inputCelsius.getText().toString().isEmpty()) {
                    double celsiusValue = Double.parseDouble(inputCelsius.getText().toString());
                    double fahrenheitValue = (celsiusValue * 9 / 5) + 32;
                    inputFahrenheit.setText(String.valueOf(fahrenheitValue));
                }
            }
        });

        btnFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý chuyển đổi từ Fahrenheit sang Celsius
                if (!inputFahrenheit.getText().toString().isEmpty()) {
                    double fahrenheitValue = Double.parseDouble(inputFahrenheit.getText().toString());
                    double celsiusValue = (fahrenheitValue - 32) * 5 / 9;
                    inputCelsius.setText(String.valueOf(celsiusValue));
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xóa dữ liệu trong cả hai ô nhập liệu
                inputCelsius.setText("");
                inputFahrenheit.setText("");
            }
        });
    }
}
