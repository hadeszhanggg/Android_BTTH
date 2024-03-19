package com.example.a2001215653_nguyentanhuudanh_buoi04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Random;

public class Activity6 extends AppCompatActivity {

    EditText edtSo, edtDaySo;
    Button btnAdd, btnCreate, btnSort, btnMinMax, btnXuatXuoi, btnXuatNguoc, btnDaoNgauNhien;
    CheckBox cbChan, cbLe, cbNgauNhien, cbSoAm;
    RadioButton rdoTang, rdoGiam;
    Random random = new Random();
    StringBuilder builder = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        addControl();
        addDaySo();
        TaoDaySo();
        TimMinMax();
        XuatXuoi();
        XuatNguoc();
        DaoNgauNhien();
    }

    protected void addControl()
    {
        edtSo = findViewById(R.id.edtSo);
        edtDaySo = findViewById(R.id.edtDaySo);
        btnAdd = findViewById(R.id.btnAdd);
        btnCreate = findViewById(R.id.btnCreate);
        btnSort = findViewById(R.id.btnSort);
        btnMinMax = findViewById(R.id.btnMinMax);
        btnXuatXuoi = findViewById(R.id.btnXuatXuoi);
        btnXuatNguoc = findViewById(R.id.btnXuatNguoc);
        btnDaoNgauNhien = findViewById(R.id.btnDaoNgauNgien);
        cbChan = findViewById(R.id.cbChan);
        cbLe = findViewById(R.id.cbLe);
        cbNgauNhien = findViewById(R.id.cboNgauNhien);
        cbSoAm = findViewById(R.id.cboSoAm);
        rdoTang = findViewById(R.id.rdoTang);
        rdoGiam = findViewById(R.id.rdoGiam);
    }

    protected void addDaySo()
    {
        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String so = edtSo.getText().toString();
                builder.append(so).append(" ");
                edtDaySo.setText(builder.toString());
                edtSo.setText("");
            }

        });

    }

    protected  void TaoDaySo()
    {
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtDaySo.setText("");
                int so = 0;
                if (cbChan.isChecked()) {
                    for (int i = 0; i < 10; i++)
                    {
                        so = random.nextInt(100);
                        if(so % 2 == 0)
                        {
                            builder.append(so).append(" ");
                        }
                    }
                    edtDaySo.setText(builder);
                } else if (cbLe.isChecked()) {
                    for (int i = 0; i < 10; i++)
                    {
                        so = random.nextInt(100);
                        if(so % 2 != 0)
                        {
                            builder.append(so).append(" ");
                        }
                    }
                    edtDaySo.setText(builder);
                }
                else if (cbNgauNhien.isChecked())
                {
                    for (int i = 0; i < 10; i++)
                    {
                        so = random.nextInt(100);
                        builder.append(so).append(" ");
                    }
                    edtDaySo.setText(builder);
                }
                else if (cbSoAm.isChecked())
                {

                    for (int i = 0; i < 10; i++)
                    {
                        so = random.nextInt(100) * -1;
                        builder.append(so).append(" ");
                    }
                    edtDaySo.setText(builder);
                }
            }
        });
    }

    protected  void showToast(String message)
    {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    protected int[] chuyenChuoiThanhSo()
    {
        String str = edtDaySo.getText().toString();
        String[] strArr = str.split(" ");

        int[]  intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++)
        {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        return  intArr;
    }

    // Hàm tìm giá trị nhỏ nhất trong mảng
    public static int findMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Hàm tìm giá trị lớn nhất trong mảng
    public static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    protected void TimMinMax()
    {
        btnMinMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] numbers = chuyenChuoiThanhSo();
                int min = findMinValue(numbers);
                int max = findMaxValue(numbers);
                String message = "Gía Max = " + max + " Gia trị Min = " + min;
                showToast(message);
            }
        });
    }

    protected void XuatXuoi()
    {
        btnXuatXuoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = edtDaySo.getText().toString();
                showToast(message);
            }
        });
    }

    protected String ChuyenSoThanhChuoi(int[] arr)
    {
        String str = "";
        for (int i = 0;  i < arr.length; i++)
        {
            str += arr[i] + " ";
        }
        return str;
    }

    protected void XuatNguoc()
    {
        btnXuatNguoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] numbers = chuyenChuoiThanhSo();
                int[] daySoNguoc = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++)
                {
                    daySoNguoc[i] = numbers[(numbers.length - 1) - i];
                }

                String chuoiDaoNguoc = ChuyenSoThanhChuoi(daySoNguoc);
                showToast(chuoiDaoNguoc);
            }
        });

    }

    public static void shuffleArray(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            // Hoán đổi giá trị của arr[i] và arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    protected void DaoNgauNhien()
    {
        btnDaoNgauNhien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] numbers = chuyenChuoiThanhSo();
                shuffleArray(numbers);
                String daoNgauNhien = ChuyenSoThanhChuoi(numbers);
                showToast(daoNgauNhien);
            }
        });
    }
}