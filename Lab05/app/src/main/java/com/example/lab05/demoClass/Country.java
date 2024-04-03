package com.example.lab05.demoClass;

import java.util.ArrayList;

public class Country {
    int idAnh;
    String tenQG;

    public Country() {
    }

    public Country(int idAnh, String tenQG) {
        this.idAnh = idAnh;
        this.tenQG = tenQG;
    }

    public int getIdAnh() {
        return idAnh;
    }

    public String getTenQG() {
        return tenQG;
    }

    public void setIdAnh(int idAnh) {
        this.idAnh = idAnh;
    }

    public void setTenQG(String tenQG) {
        this.tenQG = tenQG;
    }
    public static ArrayList<Country> iniArrayListCountry(int[]lsIdImg, String[] lsName)
    {
        ArrayList<Country> arrayListCountry = new ArrayList<>();
        for(int i=0; i<lsIdImg.length; i++)
        {
            Country country=new Country(lsIdImg[i],lsName[i]);
            arrayListCountry.add(country);
        }
        return arrayListCountry;
    }
}
