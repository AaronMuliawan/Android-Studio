package com.example.tugas5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvGame;
    private ArrayList<Game> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGame = findViewById(R.id.rv_game);
        rvGame.setHasFixedSize(true);

        list.addAll(GameData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rvGame.setLayoutManager(new LinearLayoutManager(this));
        CardGameAdapter cardGameAdapter = new CardGameAdapter(list);
        rvGame.setAdapter(cardGameAdapter);
    }
}
