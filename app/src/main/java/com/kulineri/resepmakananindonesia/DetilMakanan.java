package com.kulineri.resepmakananindonesia;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetilMakanan extends AppCompatActivity {
    public static final String EXTRA_IMG = "0";
    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_DETIL = "extra_detil";
    public static final String EXTRA_BAHAN = "extra_bahan";
    public static final String EXTRA_CARA = "extra_cara";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detil_masakan);

        TextView tvNama = findViewById(R.id.recv_nama_makanan);
        TextView tvDesk = findViewById(R.id.recv_detil_makanan);
        TextView tvBhn = findViewById(R.id.recv_bahan);
        TextView tvCara = findViewById(R.id.recv_cara_masak);
        ImageView tvPhoto = findViewById(R.id.recv_img_makanan);

        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        String desk = getIntent().getStringExtra(EXTRA_DETIL);
        String cara = getIntent().getStringExtra(EXTRA_CARA);
        String bahan = getIntent().getStringExtra(EXTRA_BAHAN);
        int img = getIntent().getIntExtra(EXTRA_IMG, 0);

        tvNama.setText(nama);
        tvDesk.setText(desk);
        tvBhn.setText(bahan);
        tvCara.setText(cara);
        tvPhoto.setImageResource(img);

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
