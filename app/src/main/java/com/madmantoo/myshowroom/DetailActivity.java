package com.madmantoo.myshowroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import android.widget.TextView;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView nama_mobil,harga,detail;
    private String nama,mharga,details;
    private int imgPhoto;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);

        nama_mobil = findViewById(R.id.tv_item_name);
        harga = findViewById(R.id.tv_harga);
        detail = findViewById(R.id.tv_detail);
        img = findViewById(R.id.img_item_photo);

        nama = getIntent().getStringExtra("mobil_name");
        mharga = getIntent().getStringExtra("harga");
        details = getIntent().getStringExtra("detail");
        imgPhoto = getIntent().getIntExtra("imgPhoto", 0);

        nama_mobil.setText(nama);
        harga.setText(mharga);
        detail.setText(details);
        img.setImageResource(imgPhoto);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_dial_number:
                String phoneNumber = "087883775012";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}
