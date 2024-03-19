package com.example.a2001215653_nguyentanhuudanh_buoi04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result_Activity5 extends AppCompatActivity {

    TextView txtThongTin, txtBoSung;
    Button btnDong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result5);
        addControl();

        Intent callerIntent = getIntent();
        Bundle packageFromCaller =  callerIntent.getBundleExtra("GuiInf");
        String  Name = packageFromCaller.getString("Name");
        String  CMND = packageFromCaller.getString("CMND");
        String NgaySinh = packageFromCaller.getString("NgaySinh");

        Boolean Nam = packageFromCaller.getBoolean("Nam");
        Boolean Nu = packageFromCaller.getBoolean("Nu");
        Boolean TrungCap = packageFromCaller.getBoolean("TrungCap");
        Boolean CaoDang = packageFromCaller.getBoolean("CaoDang");
        Boolean DaiHoc = packageFromCaller.getBoolean("DaiHoc");
        Boolean DocBao = packageFromCaller.getBoolean("DocBao");
        Boolean DocSach = packageFromCaller.getBoolean("DocSach");
        Boolean DocCoding = packageFromCaller.getBoolean("DocCoding");

        String ThongTinBoSung = packageFromCaller.getString("ThongTinBoSung");

        String ThongTin = Name + "\n" + CMND + "\n" + NgaySinh;
        if(Nam)
        {
            ThongTin += "\nNam";
        } else if (Nu) {
            ThongTin += "\bNữ";
        }
        if(TrungCap)
        {
            ThongTin += "\nĐọc sách";
        }
        if(CaoDang)
        {
            ThongTin += "\nCao Đẳng";
        }
        if (DaiHoc) {
            ThongTin += "\nĐại học";
        }

        txtThongTin.setText(ThongTin);
        txtBoSung.setText(ThongTinBoSung);


        btnDong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    protected void addControl()
    {
        txtThongTin = findViewById(R.id.txtThongTin);
        txtBoSung = findViewById(R.id.txtBoSung);
        btnDong = findViewById(R.id.btnDong);
    }
}