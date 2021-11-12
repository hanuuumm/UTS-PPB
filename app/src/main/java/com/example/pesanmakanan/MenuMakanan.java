package com.example.pesanmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MenuMakanan extends AppCompatActivity {

    ListView lv;
    String[] Nama = {"Fried Rice", "Croffle", "Fench Fries", "Ayam Geprek",
            "Rice Bowl"
    };

    String[] Harga = {"Rp 25.000", "Rp 25.000", "Rp 17.000", "Rp 25.000",
            "Rp 22.000", "Rp 15.000"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makanan);
        this.setTitle("Menu Makanan");
        lv = findViewById(R.id.constraintLayout);
        ListAdapter listAdapter = new ListAdapter(this,Nama, Harga);
        lv.setAdapter(listAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        "Menu " + Nama[position]+ " Dengan Harga " +Harga[position],
                        Toast.LENGTH_SHORT).show();

            }
        });
    }


}