package com.example.tugas5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardGameAdapter extends RecyclerView.Adapter<CardGameAdapter.CardViewHolder> {
    private ArrayList<Game> listGame;

    public CardGameAdapter(ArrayList<Game> games) {this.listGame = games; }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder holder, int position) {
        Game game = listGame.get(position);

        Glide.with(holder.itemView.getContext())
                .load(R.drawable.wizard_akita)
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgFoto);

        holder.name.setText(game.getName());
        holder.desk.setText(game.getDeskripsi());

    }

    @Override
    public int getItemCount() { return listGame.size(); }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView name, desk;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.img_item_foto);
            name = itemView.findViewById(R.id.item_name);
            desk = itemView.findViewById(R.id.item_deks);
        }
    }
}
