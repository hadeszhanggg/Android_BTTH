package com.example.a2001215653_nguyentanhuudanh_buoi05_btvn;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter {

    int layout;
    Context context;
    ArrayList<Music> listMusic = new ArrayList<>();


    public MusicAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Music> objects) {
        super(context, resource, objects);
        this.context = context;
        this.listMusic = objects;
        this.layout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Music music = listMusic.get(position);
        if(convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(layout, null);
        }
        ImageView img = convertView.findViewById(R.id.imgMucsic);
        img.setImageResource(music.getImg());
        TextView txt = convertView.findViewById(R.id.txtMusic);
        txt.setText(music.getName());
        return  convertView;

    }
}