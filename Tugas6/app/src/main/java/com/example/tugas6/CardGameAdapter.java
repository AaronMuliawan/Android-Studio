package com.example.tugas6;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardGameAdapter extends RecyclerView.Adapter<CardGameHolder> {
    private ArrayList<Games> games;
    @NonNull
    @Override
    public CardGameHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card,viewGroup,false);
        return new CardGameHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardGameHolder cardGameHolder, @SuppressLint("RecyclerView") final int i) {
        cardGameHolder.textViewName.setText(games.get(i).getNama());
        cardGameHolder.textViewDesk.setText(games.get(i).getDesk());
        Glide.with(cardGameHolder.itemView.getContext()).load(games.get(i).getFoto()).apply(new RequestOptions().override(350,550))
                .into(cardGameHolder.imageView);

        cardGameHolder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cardGameHolder.itemView.getContext(),"anda menklik share",Toast.LENGTH_SHORT).show();
            }
        });

        cardGameHolder.btnBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cardGameHolder.itemView.getContext(),"anda menklik favorite",Toast.LENGTH_SHORT).show();
            }
        });

        cardGameHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cardGameHolder.itemView.getContext(), MainActivity.class);
                intent.putExtra("name", games.get(i).getNama());
                intent.putExtra("price", games.get(i).getHarga());
                intent.putExtra("desc", games.get(i).getDesk());
                intent.putExtra("image", games.get(i).getFoto());
                cardGameHolder.itemView.getContext().startActivity(intent);
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
