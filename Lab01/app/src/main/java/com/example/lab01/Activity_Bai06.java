package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Bai06 extends AppCompatActivity {
    Button btnTinhLich;
    EditText inputNam;
    TextView kquaLichAm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai06);
        addEvent();
    }
    public void addEvent() {
        btnTinhLich = (Button) findViewById(R.id.btnTinhLich);
        inputNam = (EditText) findViewById(R.id.inputLichDuong);
        kquaLichAm = (TextView) findViewById(R.id.txtLichAm);
        //Khai báo 2 mảng chứa can và chi
        String[] can = new String[]{"Canh", "Tân","Nhâm","Quý","Giáp","Ất","Bính","Đinh","Mậu","Kỷ"};
        String[] chi = new String[]{"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mão","Thìn","Tỵ","Ngọ","Mùi"};

        btnTinhLich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!inputNam.getText().toString().isEmpty()) {
                    int namDuong = Integer.parseInt(inputNam.getText().toString());
                    // Xử lý năm âm lịch (Index tính ra tương ứng vị trí của can hoặc chi trong mảng
                    int canIndex = namDuong % 10;
                    int chiIndex = namDuong % 12;

                    String canNam = can[canIndex];
                    String chiNam = chi[chiIndex];

                    String ketQuaLichAm = canNam + " " + chiNam;
                    // Hiển thị kết quả
                    kquaLichAm.setText(ketQuaLichAm);
                } else {
                    // Hiển thị thông báo nếu ô nhập năm trống
                    kquaLichAm.setText("Vui lòng nhập năm dương lịch");
                }
            }
        });
    }


}