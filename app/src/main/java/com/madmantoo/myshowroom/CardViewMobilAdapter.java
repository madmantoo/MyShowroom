package com.madmantoo.myshowroom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewMobilAdapter extends RecyclerView.Adapter<CardViewMobilAdapter.CardViewViewHolder> {
    private ArrayList<Mobil> listMobil;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public CardViewMobilAdapter(ArrayList<Mobil> list) {
        this.listMobil = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_mobil, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        Mobil mobil = listMobil.get(position);

        Glide.with(holder.itemView.getContext())
                .load(mobil.getPhoto())
                .apply(new RequestOptions().override(120, 160))
                .into(holder.imgPhoto);

        holder.tvName.setText(mobil.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listMobil.get(holder.getAdapterPosition()));
            }
        });
    }

    public interface OnItemClickCallback{
        void onItemClicked(Mobil data);
    }

    @Override
    public int getItemCount() {
        return listMobil.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
            ImageView imgPhoto;
            TextView tvName;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
        }
    }
}
