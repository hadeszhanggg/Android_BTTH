package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class giaiPT_1 extends AppCompatActivity {
    Button btnKqua;
    EditText edtA, edtB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giai_pt1);
        btnKqua=findViewById(R.id.btnKqua);
        edtA=findViewById(R.id.edtA);
        edtB=findViewById(R.id.edtB);
        addEvent();
    }
    void addEvent() {
       btnKqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtA.getText().toString()!=null&&edtB.getText().toString()!=null)
                {
                    double a = Double.parseDouble(edtA.getText().toString());
                    double b = Double.parseDouble(edtB.getText().toString());
                    String kqua = giaiPhuongTrinhBac1(a, b);
                    Bundle bundle = new Bundle();
                    bundle.putString("kqua",kqua);
                    Intent it = new Intent(getApplicationContext(), giaiPT_2.class);
                    it.putExtra("MyResult",bundle);
                    startActivity(it);
                }else
                    Toast.makeText(getApplicationContext(), "Fill value a and b, please!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    // Phương thức giải phương trình bậc 1
    String giaiPhuongTrinhBac1(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                return "Phương trình có vô số nghiệm";
            } else {
                return "Phương trình vô nghiệm";
            }
        } else {
            double x = -b / a;
            return "Nghiệm của phương trình là: " + x;
        }
    }
}
