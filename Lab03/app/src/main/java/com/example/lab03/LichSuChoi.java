package com.example.lab03;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class LichSuChoi extends AppCompatActivity {
    TextView txtLichSu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lich_su_choi);
        txtLichSu = findViewById(R.id.txtLichSu);

        // Nhận danh sách lịch sử chơi từ Intent
        ArrayList<String> lichSuChoiStrings = getIntent().getStringArrayListExtra("lichSuChoi");

        // Chuyển đổi danh sách lịch sử chơi thành danh sách CardHistory
        ArrayList<CardHistory> lichSuChoi = new ArrayList<>();
        for (String lichSuString : lichSuChoiStrings) {
            // Split chuỗi để lấy thông tin của từng lượt chơi
            String[] lichSuInfo = lichSuString.split(" - ");
            int sumHades = Integer.parseInt(lichSuInfo[0].split(": ")[1]);
            int sumBot = Integer.parseInt(lichSuInfo[1].split(": ")[1]);
            String result = lichSuInfo[2].split(": ")[1];

            // Tạo đối tượng CardHistory và thêm vào danh sách
            lichSuChoi.add(new CardHistory(sumHades, sumBot, result));
        }

        // Hiển thị thông tin lịch sử chơi
        StringBuilder lichSuText = new StringBuilder();
        for (CardHistory cardHistory : lichSuChoi) {
            lichSuText.append("Hades: ").append(cardHistory.getSumHades())
                    .append(" - Bot: ").append(cardHistory.getSumBot())
                    .append(" - Kết quả: ").append(cardHistory.getResult())
                    .append("\n");
        }

        txtLichSu.setText(lichSuText.toString());
    }
}
