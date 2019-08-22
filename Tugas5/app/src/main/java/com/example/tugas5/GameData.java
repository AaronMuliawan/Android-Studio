package com.example.tugas5;

import java.util.ArrayList;

public class GameData {
    public static String[][] data = new String[][]{
            {"Wizard Akita", "Aku sudah ditakdirkan menjadi pemain catur HEBAT sejak lahir. Bermain catur adalah bakat, kewajiban, dan takdirku!"},
            {"Fluffy Lunar", "Bola berbulu misterius dari timur ini sangat lihai dalam bertingkah menggemaskan. Tsundere yang pintar berbicara ini konon membawa hoki untuk pemiliknya"},
            {"Greedy Dragon", "Naga muda tambun yang gila emas, makhluk ini sangat unik dan konyol. Pola pikirnya yang cukup rakus namun optimis ini selalu membuat pemiliknya tersenyum"}
    };

    public static ArrayList<Game> getListData(){
        ArrayList<Game> list = new ArrayList<>();
        for (String[] aData : data){
            Game game = new Game();
            game.setName(aData[0]);
            game.setDeskripsi(aData[1]);
            list.add(game);
        }
        return list;
    }
}