package com.example.buoi01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextNumber1 = findViewById(R.id.editTextNumber1);
                EditText editTextNumber2 = findViewById(R.id.editTextNumber2);
                TextView textViewResult = findViewById(R.id.textViewResult);

                int number1 = Integer.parseInt(editTextNumber1.getText().toString());
                int number2 = Integer.parseInt(editTextNumber2.getText().toString());
                int result = number1 + number2;

                textViewResult.setText("Kết quả: " + result);
            }
        });
    }
}
