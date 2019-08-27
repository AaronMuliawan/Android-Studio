package com.example.tugas6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameViewHolder> {
    private ArrayList<Games> games;

    void setGame(ArrayList<Games> listGames){
        this.games =listGames;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list,viewGroup,false);
        return new GameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder gameViewHolder, int i) {
        gameViewHolder.fetchData(games.get(i), gameViewHolder.itemView.getContext());
    }

    @Override
    public int getItemCount() {
        return games.size();
    }
}
