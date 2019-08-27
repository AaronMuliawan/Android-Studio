package com.example.tugas6;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridGameAdapter extends RecyclerView.Adapter<GridGameViewHolder> {
    private ArrayList<Games> games;

    @NonNull
    @Override
    public GridGameViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid,viewGroup,false);
        return new GridGameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridGameViewHolder gridGameViewHolder, @SuppressLint("RecyclerView") final int i) {
        Glide.with(gridGameViewHolder.itemView.getContext()).load(games.get(i).getFoto()).apply(new RequestOptions().override(350,550))
                .into(gridGameViewHolder.imageView);

        gridGameViewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gridGameViewHolder.itemView.getContext(), MainActivity.class);
                intent.putExtra("name", games.get(i).getNama());
                intent.putExtra("price", games.get(i).getHarga());
                intent.putExtra("desc", games.get(i).getDesk());
                intent.putExtra("image", games.get(i).getFoto());
                gridGameViewHolder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    void setGames(ArrayList<Games> games) {
        this.games = games;
    }
}
