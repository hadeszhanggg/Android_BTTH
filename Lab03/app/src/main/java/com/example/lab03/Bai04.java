package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;
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
import java.util.ArrayList;
public class Bai04 extends AppCompatActivity {
    EditText edtName, edtCMND,edtBoSung;
    RadioButton rdBtnTC, rdBtnCD, rdBtnDH;
    CheckBox cbBao, cbSach, cbCode;
    String BangCap;
    ArrayList<String> SoThich;
Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai04);
        edtName = findViewById(R.id.edtName);
        edtCMND = findViewById(R.id.edtCMND);
        rdBtnCD = findViewById(R.id.rdBtnCD);
        rdBtnDH = findViewById(R.id.rdBtnDH);
        rdBtnTC = findViewById(R.id.rdBtnTC);
        cbBao = findViewById(R.id.cbBao);
        edtBoSung=findViewById(R.id.edtBoSung);
        cbCode = findViewById(R.id.cbCode);
        cbSach = findViewById(R.id.cbSach);
        SoThich = new ArrayList<>();
        btnSend=findViewById(R.id.btnSend);

        // Thiết lập sự kiện cho RadioButton
        RadioGroup radioGroup = findViewById(R.id.rdBtnGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Xử lý sự kiện khi RadioButton được chọn
                if (checkedId == R.id.rdBtnCD) {
                    BangCap = "Cao Dang";
                } else if (checkedId == R.id.rdBtnDH) {
                    BangCap = "Dai Hoc";
                } else if (checkedId == R.id.rdBtnTC) {
                    BangCap = "Trung cap";
                }
            }
        });

        // Thiết lập sự kiện cho CheckBox
        cbBao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                handleCheckBoxChange(cbBao, "Bao");
            }
        });
        cbSach.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                handleCheckBoxChange(cbSach, "Sach");
            }
        });
        cbCode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                handleCheckBoxChange(cbCode, "Code");
            }
        });

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendDataToNextActivity();
            }
        });
    }

    // Xử lý sự kiện khi CheckBox thay đổi trạng thái
    private void handleCheckBoxChange(CheckBox checkBox, String interest) {
        if (checkBox.isChecked()) {
            // CheckBox được chọn
            Toast.makeText(Bai04.this, "Bạn chọn " + interest, Toast.LENGTH_SHORT).show();
            // Thêm sở thích vào ArrayList
            SoThich.add(interest);
        } else {
            // CheckBox không được chọn
            Toast.makeText(Bai04.this, "Bạn bỏ chọn " + interest, Toast.LENGTH_SHORT).show();
            // Xóa sở thích khỏi ArrayList
            SoThich.remove(interest);
        }
    }

    // Phương thức để gửi dữ liệu qua Activity khác
    private void sendDataToNextActivity() {
        // Tạo Intent để mở Activity mới
        Intent intent = new Intent(getApplicationContext(), Bai04_HienThi.class);
        // Tạo Bundle để chứa dữ liệu cần truyền đi
        Bundle bundle = new Bundle();
        bundle.putString("Name", edtName.getText().toString());
        bundle.putString("CMND", edtCMND.getText().toString());
        bundle.putStringArrayList("SoThich", SoThich);
        bundle.putString("BangCap", BangCap);
        bundle.putString("BoSung", edtBoSung.toString());
        // Đưa Bundle vào Intent
        intent.putExtras(bundle);
        // Khởi chạy Intent để mở Activity mới
        startActivity(intent);
    }
}