package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.CompoundButton;
import android.widget.Toast;

public class Bai02 extends AppCompatActivity {
    Button btnResult;
    RadioGroup rdGroup;
    RadioButton rd1, rd2, rd3;
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai02);
        btnResult=findViewById(R.id.btnResult);
        rd1=findViewById(R.id.rdbtn1);
        rd2=findViewById(R.id.rdbtn2);
        rd3=findViewById(R.id.rdbtn3);
        txtResult=findViewById(R.id.txtResult);
        rd1.setOnCheckedChangeListener(listenerRadio);
        rd2.setOnCheckedChangeListener(listenerRadio);
        rd3.setOnCheckedChangeListener(listenerRadio);
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rd2.isChecked())
                {
                    txtResult.setText("Đúng rồi");
                }
                else
                {
                    txtResult.setText("Sai");
                }
            }
        });
    }
    CompoundButton.OnCheckedChangeListener listenerRadio
            = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            btnResult.setEnabled(true);
            if (b) {
                txtResult.setText("Bạn chọn:" + compoundButton.getText());
            }
        }
    };
}