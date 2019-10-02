package com.kulineri.resepmakananindonesia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.kulineri.resepmakananindonesia.adapter.ListMakananAdapter;
import com.kulineri.resepmakananindonesia.model.DataMakanan;
import com.kulineri.resepmakananindonesia.model.Makanan;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvMakanan;
    private String title = "Daftar Makanan";
    ArrayList<Makanan> list = new ArrayList<>();

    private void showSelected(Makanan food) {
        //Toast.makeText(this, "Kamu memilih " + food.getName(), Toast.LENGTH_SHORT).show();
        Intent data = new Intent(MainActivity.this, DetilMakanan.class);
        data.putExtra(DetilMakanan.EXTRA_NAMA, food.getName());
        data.putExtra(DetilMakanan.EXTRA_IMG, food.getPhoto());
        data.putExtra(DetilMakanan.EXTRA_DETIL, food.getDetail());
        data.putExtra(DetilMakanan.EXTRA_BAHAN, food.getBahan());
        data.putExtra(DetilMakanan.EXTRA_CARA, food.getCara());
        startActivity(data);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMakanan = findViewById(R.id.rv_makanan);
        rvMakanan.setHasFixedSize(true);

        list.addAll(DataMakanan.getListData());
        showListMakanan();
    }

    private void showListMakanan() {
        rvMakanan.setLayoutManager(new LinearLayoutManager(this));
        ListMakananAdapter listFoodAdapter = new ListMakananAdapter(list);
        rvMakanan.setAdapter(listFoodAdapter);

        listFoodAdapter.setOnItemClickCallback(new ListMakananAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Makanan data) {
                 showSelected(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.action_about) {
            Intent abt = new Intent(getApplicationContext(), About1.class);
            this.startActivity(abt);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
