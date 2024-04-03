package com.example.lab05.demoClass;

import java.util.ArrayList;

public class Film {
    String filmName;
    String filmDescription;
    String year;

    public Film() {
    }
    public Film( String filmName, String filmDescription, String year) {
        this.filmName = filmName;
        this.filmDescription = filmDescription;
        this.year = year;
    }



    public String getFilmName() {
        return filmName;
    }

    public String getFilmDescription() {
        return filmDescription;
    }

    public String getYear() {
        return year;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void setFilmDescription(String filmDescription) {
        this.filmDescription = filmDescription;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public static ArrayList<Film> iniArrayListMovie(String[] lsName, String[]lsGenner, String[] lsYear)
    {
        ArrayList<Film> arrayListFilm = new ArrayList<>();
        for(int i=0; i<lsName.length; i++)
        {
            Film movie = new Film(lsName[i],lsGenner[i],lsYear[i]);
            arrayListFilm.add(movie);
        }
        return arrayListFilm;
    }
}
