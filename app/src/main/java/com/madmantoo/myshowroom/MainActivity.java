package com.madmantoo.myshowroom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMobil;
    private ArrayList<Mobil> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMobil = findViewById(R.id.rv_mobil);
        rvMobil.setHasFixedSize(true);

        list.addAll(DataMobil.getListData());
        showRecyclerCardView();

    }

    private void showRecyclerCardView(){
        rvMobil.setLayoutManager(new GridLayoutManager(this, 3));
        CardViewMobilAdapter cardViewMobilAdapter = new CardViewMobilAdapter(list);
        rvMobil.setAdapter(cardViewMobilAdapter);

        cardViewMobilAdapter.setOnItemClickCallback(new CardViewMobilAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Mobil data) {
                showSelectedMobil(data);
            }
        });
    }

    private void showSelectedMobil(Mobil mobil) {
        Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
        pindah.putExtra("mobil_name",mobil.getName());
        pindah.putExtra("harga",mobil.getHarga());
        pindah.putExtra("detail",mobil.getDetail());
        pindah.putExtra("imgPhoto",mobil.getPhoto());
        startActivity(pindah);
    }

    private void showSelectedAbout(){
        Intent pindah = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(pindah);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode){
        switch (selectedMode) {
            case R.id.action_list:
                showRecyclerCardView();
                break;

            case R.id.action_about:
                showSelectedAbout();
                break;
        }
    }
}
