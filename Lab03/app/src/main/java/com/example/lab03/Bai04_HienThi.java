package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
public class Bai04_HienThi extends AppCompatActivity {
    Button btnDong;
    TextView txtThongTinCaNhan, txtThongTinBoSung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai04_hien_thi);

        btnDong = findViewById(R.id.btnDong);
        txtThongTinBoSung = findViewById(R.id.txtThongTinBoSung);
        txtThongTinCaNhan = findViewById(R.id.txtThongTinCaNhan);

        // Nhận dữ liệu từ Intent
        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
                String name = bundle.getString("Name", "");
                String cmnd = bundle.getString("CMND", "");
                String bangCap = bundle.getString("BangCap", "");
                String boSung = bundle.getString("BoSung", "");
                ArrayList<String> soThich = bundle.getStringArrayList("SoThich");

                String thongTinCaNhan = "Tên: " + name + "\nCMND: " + cmnd + "\nBằng cấp: " + bangCap + "\nSở thích: ";

                if (soThich != null && !soThich.isEmpty()) {
                    for (String interest : soThich) {
                        thongTinCaNhan += interest + ", ";
                    }
                    // Xóa dấu phẩy cuối cùng
                    thongTinCaNhan = thongTinCaNhan.substring(0, thongTinCaNhan.length() - 2);
                } else {
                    thongTinCaNhan += "Không có sở thích";
                }

                txtThongTinCaNhan.setText(thongTinCaNhan);


                // Hiển thị thông tin bổ sung
                txtThongTinBoSung.setText("Thông tin bổ sung: " + boSung);
            }
        }

        btnDong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Quay về Activity Bai04
                Intent backToBai04Intent = new Intent(Bai04_HienThi.this, Bai04.class);
                startActivity(backToBai04Intent);
            }
        });
    }
}
