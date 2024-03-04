package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Bai09 extends AppCompatActivity {
    Button btnTong, btnHieu, btnTich, btnThuong, btnUocMax;
    EditText inputA, inputB;
    TextView txtKetQuaBai10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai09);
        addControls();
        addEvent();
    }
    public void addControls() {
        btnTong = (Button) findViewById(R.id.btnTong);
        btnHieu = (Button) findViewById(R.id.btnHieu);
        btnTich = (Button) findViewById(R.id.btnTich);
        btnThuong = (Button) findViewById(R.id.btnThuong);
        btnUocMax = (Button) findViewById(R.id.btnUocMax);
        inputA = (EditText) findViewById(R.id.inputA);
        inputB = (EditText) findViewById(R.id.inputB);
        txtKetQuaBai10 = (TextView) findViewById(R.id.txtKetQuaBai10);
    }
    public void addEvent() {
        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhVaHienThiKetQua("Tổng", "+");
            }
        });
        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhVaHienThiKetQua("Hiệu", "-");
            }
        });
        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhVaHienThiKetQua("Tích", "*");
            }
        });
        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhVaHienThiKetQua("Thương", "/");
            }
        });
        btnUocMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tính và hiển thị ước chung lớn nhất của hai số
                if (!inputA.getText().toString().isEmpty() && !inputB.getText().toString().isEmpty()) {
                    int a = Integer.parseInt(inputA.getText().toString());
                    int b = Integer.parseInt(inputB.getText().toString());
                    int uocMax = timUocChungLonNhat(a, b);
                    txtKetQuaBai10.setText("Ước chung lớn nhất: " + uocMax);
                }
            }
        });
    }
    private void tinhVaHienThiKetQua(String tenPhepToan, String phepToan) {
        // Tính và hiển thị kết quả của phép toán
        if (!inputA.getText().toString().isEmpty() && !inputB.getText().toString().isEmpty()) {
            int a = Integer.parseInt(inputA.getText().toString());
            int b = Integer.parseInt(inputB.getText().toString());
            int ketQua = 0;
            switch (phepToan) {
                case "+":
                    ketQua = a + b;
                    break;
                case "-":
                    ketQua = a - b;
                    break;
                case "*":
                    ketQua = a * b;
                    break;
                case "/":
                    // Kiểm tra trường hợp chia cho 0
                    if (b != 0) {
                        ketQua = a / b;
                    } else {
                        txtKetQuaBai10.setText("Lỗi: Không thể chia cho 0");
                        return;
                    }
                    break;
            }
            txtKetQuaBai10.setText(tenPhepToan + ": " + ketQua);
        }
    }
    private int timUocChungLonNhat(int a, int b) {
        // Tìm ước chung lớn nhất
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Trả về giá trị tuyệt đối để đảm bảo ước chung lớn nhất là số dương
    }
}
