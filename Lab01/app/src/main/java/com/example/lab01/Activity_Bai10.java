package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Activity_Bai10 extends AppCompatActivity {

    TextView txtWelcome, txtHoChiMinh;
    EditText edtName, edtPass, edtConfirmPass;
    Button btnLogin, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai10);

        txtWelcome = findViewById(R.id.txtWelcome);
        txtHoChiMinh = findViewById(R.id.txtHoChiMinh);
        edtName = findViewById(R.id.edtName);
        edtPass = findViewById(R.id.edtPass);
        edtConfirmPass = new EditText(this); // Tạo mới EditText cho Confirm Password
        btnLogin = findViewById(R.id.btnLogin);
        btnSignup = findViewById(R.id.btnSignup);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Thay đổi giao diện khi người dùng click vào btnSignup
                txtWelcome.setText("Create a new account");
                btnLogin.setText("Create new account");

                // Thêm EditText cho Confirm Password vào layout
                LinearLayout layout = findViewById(R.id.linearLayout);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                params.setMargins(0, 10, 0, 0);
                edtConfirmPass.setLayoutParams(params);
                edtConfirmPass.setHint("Confirm Password ...");
                layout.addView(edtConfirmPass);

                // Ẩn nút btnSignup
                btnSignup.setVisibility(View.GONE);
            }
        });
    }
}
