package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnbeli;
    EditText nama, kategori, jumlah;
    TextView resultnama, resultkategori, resultjumlah, resultharga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnbeli = findViewById(R.id.btn_beli);
        nama = findViewById(R.id.edit_nama);
        kategori = findViewById(R.id.edit_kategori);
        jumlah = findViewById(R.id.edit_jumlah);
        resultnama = findViewById(R.id.result_nama);
        resultkategori = findViewById(R.id.result_kategori);
        resultjumlah = findViewById(R.id.result_jumlah);
        resultharga = findViewById(R.id.result_harga);
        btnbeli.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_beli){
            String name = nama.getText().toString();
            String category = kategori.getText().toString();
            String jml = jumlah.getText().toString();
            if (name.isEmpty() || category.isEmpty() || jml.isEmpty()){
                nama.setError("Tidak Boleh Kosong");
                kategori.setError("Tidak Boleh Kosong");
                jumlah.setError("Tidak Boleh Kosong");
            }else {
                int harga = 5000 * Integer.parseInt(jml);
                resultnama.setText("Nama:" + name);
                resultkategori.setText("Kategori: " + category);
                resultjumlah.setText("Jumlah: " + jml);
                resultharga.setText("Harga: " + harga);
            }
        }
    }
}
