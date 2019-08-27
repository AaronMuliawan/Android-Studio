package com.example.tugas6;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

class CardGameHolder extends RecyclerView.ViewHolder {
    TextView textViewName;
    TextView textViewDesk;
    ImageView imageView;
    Button btnShare;
    Button btnBeli;
    CardView linearLayout;

    CardGameHolder(@NonNull View itemView) {
        super(itemView);
        textViewDesk = itemView.findViewById(R.id.item_desk);
        textViewName = itemView.findViewById(R.id.item_judul);
        imageView = itemView.findViewById(R.id.item_foto);
        btnBeli = itemView.findViewById(R.id.set_beli);
        btnShare = itemView.findViewById(R.id.set_share);
        linearLayout = itemView.findViewById(R.id.linear_card);
    }
}
