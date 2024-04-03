package com.example.lab4_nguyenduyluan_2001215937;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends ArrayAdapter {
    int layout;
    Context context;
    ArrayList<Song> list = new ArrayList<>();
    public SongAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Song> objects) {
        super(context, resource, objects);
        this.layout = resource;
        this.context=context;
        this.list =objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Song song = list.get(position);
        if(convertView==null)
        {
            convertView= LayoutInflater.from(context).inflate(layout,null);
        }
        TextView txtv = (TextView) convertView.findViewById(R.id.textViewSongBai5);
        txtv.setText(song.getName());
        return convertView;
    }
}
