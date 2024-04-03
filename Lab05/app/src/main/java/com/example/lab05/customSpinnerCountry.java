package com.example.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import com.example.lab05.demoClass.Country;
import com.example.lab05.R;
import com.example.lab05.demoClass.Fruit;

public class customSpinnerCountry extends AppCompatActivity {
    Spinner  spinner_countries;
    ArrayList<String> data=new ArrayList<>();
    ArrayList<Country>arrayListCountry=new ArrayList<>();
    CustomAdapterCountrySpinner adapterCountry;
    int[] lsIdImg = new int[]{R.drawable.cuba,R.drawable.mongolia, R.drawable.hongkong, R.drawable.england,R.drawable.germany};
    String[]lsName= new String[]{"Cuba","Mông Cổ","Hongkong","Anh quốc","Đức quốc xã"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_spinner_country);
        spinner_countries=(Spinner)findViewById(R.id.spinnerCountries);
        arrayListCountry=Country.iniArrayListCountry(lsIdImg,lsName);
        adapterCountry=new CustomAdapterCountrySpinner(customSpinnerCountry.this,R.layout.layout_item_country, arrayListCountry);
        spinner_countries.setAdapter(adapterCountry);
    }
}