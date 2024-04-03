package com.example.lab05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.lab05.demoClass.Film;
import android.os.Bundle;

import java.util.ArrayList;

public class recycleViewFilm extends AppCompatActivity {
    RecyclerView recyMovie;
    ArrayList<Film>arrayListMovie=new ArrayList<>();
    customAdapterFilm adapterMovie;
    //----------------------------
    String[]lsMovieName=new String[]{"John Wick","Bố già","Avatar"};
    String[]lsGenner=new String[]{"Hành động","Mafia","KHVT"};
    String[]lsYear=new String[]{"2015","1997","2018"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view_film);
            setContentView(R.layout.activity_recycle_view_film);
            recyMovie=(RecyclerView) findViewById(R.id.rvFilm);
            //-----------------------------------------------------
            arrayListMovie=Film.iniArrayListMovie(lsMovieName,lsGenner,lsYear);
            adapterMovie=new customAdapterFilm(arrayListMovie);
            recyMovie.addItemDecoration(new DividerItemDecoration(this,
                    DividerItemDecoration.VERTICAL));
            RecyclerView.LayoutManager mLayoutManager=
                    new LinearLayoutManager(recycleViewFilm.this);
            recyMovie.setLayoutManager(mLayoutManager);
            recyMovie.setItemAnimator(new DefaultItemAnimator());
            recyMovie.setAdapter(adapterMovie);
        }
    }
