package com.example.tugas6;

import java.util.ArrayList;

class GameData {
    private static String [][] data = new String[][]{
            {"A Game of Dwarves", "A Game of Dwarves adalah game bertema strategi dungeon real-time bertema kerdil yang dikembangkan oleh Zeal Game Studio dan diterbitkan oleh Paradox Interactive pada 23 Oktober 2012. Versi PlayStation 3 sedang dikembangkan tetapi dibatalkan sebelum dirilis.", "https://upload.wikimedia.org/wikipedia/en/thumb/b/b9/A_Game_of_Dwarves_Cover.jpg/220px-A_Game_of_Dwarves_Cover.jpg", "89999"},
            {"Saints Row 3", "Saints Row: The Third, juga dikenal sebagai Saints Row 3, SRTT atau SR3, adalah permainan aksi petualangan dunia terbuka yang dikembangkan oleh Volition, Inc. dan diedarkan oleh THQ.", "https://upload.wikimedia.org/wikipedia/en/thumb/9/98/Saints_Row_The_Third_box_art.jpg/220px-Saints_Row_The_Third_box_art.jpg", "115999"},
            {"Lost Saga", "Lost Saga adalah game bebas untuk dimainkan dan berjenis 3D Casual Fighting. Permainan ini dikembangkan oleh IO Entertainment dari Korea Selatan.", "https://storage.googleapis.com/unipin-assets/images/icon_product_pages/1557982596-icon-1531707288-icon-Untitled-5-31.png", "150000"},
            {"GTA 5", "Grand Theft Auto V adalah game aksi dan petualangan yang dikembangkan oleh Rockstar North dan di terbitkan oleh Rockstar Games. Game ini terbit pada tanggal 17 september 2013 untuk console Playstation 3 dan Xbox 360. Game ini adalah game kelima belas dari seluruh game GTA", "https://images.g2a.com/newlayout/323x433/1x1x0/387a113709aa/59e5efeb5bafe304c4426c47", "290000"},
            {"MineCraft", "Minecraft adalah permainan sandbox yang diciptakan oleh Mojang yang dipimpin oleh Markus 'Notch' Persson dari Swedia. Setelah Persson pergi, pada tahun 2011, Jens 'Jeb' Bergensten mengambil alih kendali Minecraft sebagai Developer Game Mojang.", "https://s2.gaming-cdn.com/images/products/442/orig/minecraft-cover.jpg", "199000"},
            {"PUBG", "PlayerUnknown's Battlegrounds adalah sebuah permainan dengan genre battle royale, yang para pemainnya bisa bermain dengan 100 orang sekaligus secara daring. Di dalam permainan ini pemain bisa bermain solo, tim 2 orang, dan tim 4 orang, serta bisa mengundang teman untuk bergabung ke dalam permainan sebagai tim.", "https://www.gamesdeal.com/media/catalog/product/cache/1/thumbnail/253x358/db978388cfd007780066eaab38556cef/e/n/en-pubg.jpg", "219999"},
            {"Assassin's Creed Unity", "Assassin's Creed Unity adalah sebuah permainan video laga petualangan yang dikembangkan oleh Ubisoft Montreal dan dipublikasikan oleh Ubisoft. Permainan tersebut dirilis pada November 2014 untuk Microsoft Windows, PlayStation 4 dan Xbox One", "https://store-images.s-microsoft.com/image/apps.51396.69296710537599543.9e7afb5a-8195-4e25-bfc8-08e94d687949.fc8b8b4a-70e0-4d84-a5c8-a91fd9773feb?mode=scale&q=90&h=225&w=150", "345000"},
            {"Chess Rush", "Chess Rush adalah game strategi berbasis giliran yang hadir dengan pertandingan 10+ menit inovatif dan gameplay klasik, oleh Tencent Games. Ini tersedia untuk iOS dan Android.", "https://media.hitekno.com/thumbs/2019/07/29/97451-chess-rush/730x480-img-97451-chess-rush.jpg", "Free"},
            {"Harvest Moon: Back to Nature", "Harvest Moon: Back to Nature adalah sebuah seri permainan video simulasi permainan yang dikembangkan oleh Victor Interactive Software. Ini merupakan game Harvest Moon pertama untuk konsol non-Nintendo.", "https://s.kaskus.id/images/2014/07/24/5447139_20140724100111.jpg", "49999"},
            {"Need for Speed: Most Wanted", "Need for Speed: Most Wanted adalah permainan balapan multiplatform yang dikembangkan oleh EA Black Box dan pertama kali dirilis oleh Electronic Arts di Amerika Serikat pada 15 November 2005. Permainan ini merupakan bagian dari serial Need for Speed.", "https://pcgamingwiki.ams3.digitaloceanspaces.com/thumb/1/16/Need_for_Speed_Most_Wanted_cover.jpg/300px-Need_for_Speed_Most_Wanted_cover.jpg", "29500"}
    };

    static ArrayList<Games> getlisdata(){
        ArrayList<Games> list = new ArrayList<>();
        for (String [] aData: data){
            Games games = new Games();
            games.setNama(aData[0]);
            games.setDesk(aData[1]);
            games.setFoto(aData[2]);
            games.setHarga(aData[3]);
            list.add(games);
        }
        return list;
    }
}
