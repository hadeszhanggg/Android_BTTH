package com.example.lab05;

import android.widget.BaseAdapter;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.lab05.demoClass.Country;
import com.example.lab05.demoClass.Fruit;

import java.util.ArrayList;
public class CustomAdapterCountrySpinner extends BaseAdapter {
    LayoutInflater layoutInflater;
    ArrayList<Country> arrayListCountry;
    int layoutItem;
    public CustomAdapterCountrySpinner(Activity context, int layoutItem,ArrayList<Country> arrayListCountry) {
        this.layoutInflater = context.getLayoutInflater();
        this.arrayListCountry = arrayListCountry;
        this.layoutItem = layoutItem;
    }
    @Override
    public int getCount() {
        return this.arrayListCountry.size();
    }
    @Override
    public Object getItem(int position) {
        return this.arrayListCountry.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Country country = arrayListCountry.get(position);
        View rowView = layoutInflater.inflate(layoutItem,null,true);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imgCountry);
        imageView.setImageResource(country.getIdAnh());
        TextView tvName = (TextView) rowView.findViewById(R.id.txtCountry);
        tvName.setText(country.getTenQG());
        return rowView;
    }
}
