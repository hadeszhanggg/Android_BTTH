package com.example.lab05;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.KeyCycle;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import com.example.lab05.demoClass.Film;
public class customAdapterFilm extends RecyclerView.Adapter<customAdapterFilm.MyViewHolder> {
    ArrayList<Film>arrayListMovie= new ArrayList<>();

    public customAdapterFilm(ArrayList<Film> arrayListMovie) {
        this.arrayListMovie = arrayListMovie;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_film,
                parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
       Film movie=arrayListMovie.get(position);
        holder.tvMovieName.setText(movie.getFilmName());
        holder.tvYear.setText(movie.getYear());
        holder.tvGenner.setText(movie.getFilmDescription());
    }

    @Override
    public int getItemCount() {
        return arrayListMovie.size();
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvMovieName, tvYear, tvGenner;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMovieName=(TextView) itemView.findViewById(R.id.txtFileName);
            tvYear=(TextView) itemView.findViewById(R.id.txtYear);
            tvGenner=(TextView) itemView.findViewById(R.id.txtFilmDescription);

        }
    }
}
