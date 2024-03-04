package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.CompoundButton;

public class BTVN_Bai6 extends AppCompatActivity {
    EditText edtName, edtCMND;
    RadioButton rdBtnTC, rdBtnCD, rdBtnDH;
    CheckBox cbBao, cbSach, cbCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btvn_bai6);
        edtName=findViewById(R.id.edtName);
        edtCMND=findViewById(R.id.edtCMND);
        rdBtnCD=findViewById(R.id.rdBtnCD);
        rdBtnDH=findViewById(R.id.rdBtnDH);
        rdBtnTC=findViewById(R.id.rdBtnTC);
        cbBao=findViewById(R.id.cbBao);
        cbCode=findViewById(R.id.cbCode);
        cbSach=findViewById(R.id.cbSach);
        // Thiết lập sự kiện cho RadioButton
        RadioGroup radioGroup = findViewById(R.id.rdBtnGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Xử lý sự kiện khi RadioButton được chọn
                if (checkedId == R.id.rdBtnCD) {
                    rdBtnDH.setChecked(false);
                    rdBtnTC.setChecked(false);
                } else if (checkedId == R.id.rdBtnDH) {
                    rdBtnCD.setChecked(false);
                    rdBtnTC.setChecked(false);
                } else if (checkedId == R.id.rdBtnTC) {
                    rdBtnCD.setChecked(false);
                    rdBtnDH.setChecked(false);
                }
            }
        });

        // Thiết lập sự kiện cho CheckBox
        cbBao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Xử lý sự kiện khi CheckBox thay đổi trạng thái
                if (isChecked) {
                    // CheckBox được chọn
                    Toast.makeText(BTVN_Bai6.this, "Bạn chọn Báo", Toast.LENGTH_SHORT).show();
                } else {
                    // CheckBox không được chọn
                    Toast.makeText(BTVN_Bai6.this, "Bạn bỏ chọn Báo", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}