package com.example.lab05.demoClass;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Fruit {
    int idAnh;
    String tenFruit;
    int soLuong;

    public Fruit(int idAnh, String tenFruit, int soLuong) {
        this.idAnh = idAnh;
        this.tenFruit=tenFruit;
        this.soLuong=soLuong;
    }

    public Fruit() {
    }

    public int getIdAnh() {
        return idAnh;
    }

    public void setIdAnh(int idAnh) {
        this.idAnh = idAnh;
    }

    public String getTenFruit() {
        return tenFruit;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setTenFruit(String tenFruit) {
        this.tenFruit = tenFruit;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public static ArrayList<Fruit> iniArrayListFruit(int[]lsIdImg, String[] lsName, int[] lsPrice)
    {
        ArrayList<Fruit> arrayListFruit = new ArrayList<>();
        for(int i=0; i<lsIdImg.length; i++)
        {
            Fruit fruit=new Fruit(lsIdImg[i],lsName[i],lsPrice[i]);
            arrayListFruit.add(fruit);
        }
        return arrayListFruit;
    }
}
