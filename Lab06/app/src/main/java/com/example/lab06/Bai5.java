package com.example.a2001215653_nguyentanhuudanh_buoi07_btvn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Bai5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id_item = item.getItemId();
        if(id_item == R.id.android)
        {
            Toast.makeText(this, "Android", Toast.LENGTH_SHORT).show();
        }
        else if(id_item == R.id.profile)
        {
            Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
        }
        else if(id_item == R.id.download)
        {
            Toast.makeText(this, "Download", Toast.LENGTH_SHORT).show();
        } else if (id_item == R.id.setting) {
            Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
        }
        else if (id_item == R.id.exit)
        {
            Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}