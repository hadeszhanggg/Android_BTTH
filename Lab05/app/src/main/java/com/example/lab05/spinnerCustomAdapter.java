package com.example.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import com.example.lab05.demoClass.Fruit;
public class spinnerCustomAdapter extends AppCompatActivity {
    Spinner  spinner_traicay;
    ArrayList<String> data=new ArrayList<>();
    ArrayList<Fruit>arrayListFruit=new ArrayList<>();
    CustomAdapterFruitSpinner adapterFruit;
    int[] lsIdImg = new int[]{R.drawable.apple,R.drawable.banana, R.drawable.litchi, R.drawable.mango,R.drawable.pineapple};
    String[]lsName= new String[]{"Táo","Chuối","Dâu","Xoài","Thơm"};
    int[]lsPrice = new int[]{100,12,80,20,30};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_custom_adapter);
        spinner_traicay=(Spinner)findViewById(R.id.spinnerFruit);
        arrayListFruit= Fruit.iniArrayListFruit(lsIdImg,lsName,lsPrice);
        adapterFruit=new CustomAdapterFruitSpinner(spinnerCustomAdapter.this,R.layout.layout_item_fruit, arrayListFruit);
        spinner_traicay.setAdapter(adapterFruit);
    }
}