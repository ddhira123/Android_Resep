package com.kulineri.resepmakananindonesia.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.kulineri.resepmakananindonesia.R;
import com.kulineri.resepmakananindonesia.model.Makanan;

import java.text.BreakIterator;
import java.util.ArrayList;

public class ListMakananAdapter extends RecyclerView.Adapter<ListMakananAdapter.ListViewHolder> {
    public ArrayList<Makanan> listMakanan;

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListMakananAdapter(ArrayList<Makanan> list){
        this.listMakanan = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.barisan_makanan, parent, false);
        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Makanan food = listMakanan.get(position);
        Glide.with(holder.itemView.getContext()).load(food.getPhoto()).apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvNama.setText(food.getName());
        holder.tvDetil.setText(food.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listMakanan.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDetil;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_makanan);
            tvNama = itemView.findViewById(R.id.tv_nama_makanan);
            tvDetil = itemView.findViewById(R.id.tv_detil_makanan);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Makanan data);
    }
}
