package com.example.a2001215653_nguyentanhuudanh_buoi04;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Activity5 extends AppCompatActivity {

    Button btnImg, btnGui;
    ImageButton imgAvatar;
    EditText edtName, edtCMND, edtNgaySinh, edtInf;
    RadioButton rdoNam, rdoNu, rdoTrungCap, rdoCaoDang, rdoDaiHoc;

    RadioGroup rdogGioiTinh, rdogBangCap;
    CheckBox cbDocBao, cbDocSach, cbDocCoding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        addControl();
        btnGui();
    }

    protected void addControl()
    {
        btnImg = findViewById(R.id.btnImg);
        btnGui = findViewById(R.id.btnGui);
        imgAvatar = findViewById(R.id.imgAvatar);
        edtName = findViewById(R.id.edtName);
        edtCMND = findViewById(R.id.edtCMND);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        edtInf = findViewById(R.id.edtInf);
        rdoNam = findViewById(R.id.rdoNam);
        rdoNu = findViewById(R.id.rdoNu);
        rdoTrungCap = findViewById(R.id.rdoTrungCap);
        rdoCaoDang = findViewById(R.id.rdoCaoDang);
        rdoDaiHoc =findViewById(R.id.rdoDaiHoc);
        cbDocBao = findViewById(R.id.cbDocBao);
        cbDocSach = findViewById(R.id.cbDocSach);
        cbDocCoding = findViewById(R.id.cbDocCoding);
        imgAvatar.setImageResource(R.drawable.meo);
        rdogGioiTinh = findViewById(R.id.rdogGioiTinh);
        rdogBangCap = findViewById(R.id.rdogBangCap);

    }

    protected void btnGui()
    {
        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity5.this, Result_Activity5.class);

                Bundle bundle = new Bundle();
                bundle.putString("Name",edtName.getText().toString());
                bundle.putString("CMND",edtCMND.getText().toString());
                bundle.putString("NgaySinh",edtNgaySinh.getText().toString());
                bundle.putBoolean("Nam", rdoNam.isChecked());
                bundle.putBoolean("Nu", rdoNu.isChecked());
                bundle.putBoolean("TrungCap", rdoTrungCap.isChecked());
                bundle.putBoolean("CaoDang", rdoCaoDang.isChecked());
                bundle.putBoolean("DaiHoc", rdoDaiHoc.isChecked());
                bundle.putBoolean("DocBao", cbDocBao.isChecked());
                bundle.putBoolean("DocSach", cbDocSach.isChecked());
                bundle.putBoolean("DocCoding", cbDocCoding.isChecked());
                bundle.putString("ThongTinBoSung", edtInf.getText().toString());

                intent.putExtra("GuiInf",bundle);
                startActivity(intent);
            }
        });
    }






}