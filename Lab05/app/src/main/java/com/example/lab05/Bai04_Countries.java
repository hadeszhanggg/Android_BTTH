package com.example.lab05;

import androidx.appcompat.app.AppCompatActivity;
import com.example.lab05.demoClass.bai04Country;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
public class Bai04_Countries extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai04_countries);

        List<bai04Country> image_details = getListData();
        final GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new CustomAdapter_bai04(this, image_details));
// When the user clicks on the GridItem
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = gridView.getItemAtPosition(position);
                bai04Country country = (bai04Country) o;
                Toast.makeText(Bai04_Countries.this, "Selected :"
                        + " " + country, Toast.LENGTH_LONG).show();
            }
        });
    }
    private List<bai04Country> getListData() {
        List<bai04Country> list = new ArrayList<bai04Country>();
        bai04Country vietnam = new bai04Country("Cuba", "cuba", 98000000);
        bai04Country usa = new bai04Country("England", "england", 320000000);
        bai04Country russia = new bai04Country("Mongolia", "mongolia", 142000000);
        bai04Country australia = new bai04Country("Germany", "germany", 23766305);
        bai04Country japan = new bai04Country("Hongkong", "hongkong", 126788677);
        list.add(vietnam);
        list.add(usa);
        list.add(russia);
        list.add(australia);
        list.add(japan);
        return list;
    }
}