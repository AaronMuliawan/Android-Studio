package com.example.tugas6;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

class GameViewHolder extends RecyclerView.ViewHolder {
    private TextView xmlName;
    private TextView xmlDesk;
    private ImageView xmlFoto;
    private LinearLayout linearLayout;

    GameViewHolder(@NonNull View itemView) {
        super(itemView);
        xmlName = itemView.findViewById(R.id.item_judul);
        xmlDesk = itemView.findViewById(R.id.item_desk);
        xmlFoto = itemView.findViewById(R.id.item_foto);
        linearLayout = itemView.findViewById(R.id.linear_list);
    }
    void fetchData(final Games games, final Context context){
        xmlName.setText(games.getNama());
        xmlDesk.setText(games.getDesk());
        Glide.with(itemView.getContext()).load(games.getFoto()).apply(new RequestOptions().override(55, 55))
                .into(xmlFoto);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity.class);
                intent.putExtra("nama", games.getNama());
                intent.putExtra("harga", games.getHarga());
                intent.putExtra("desk", games.getDesk());
                intent.putExtra("foto", games.getFoto());
                context.startActivity(intent);
            }
        });
    }
}
