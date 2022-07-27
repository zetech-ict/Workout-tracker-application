package com.billykybe.fitme;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class favorite_adapter extends RecyclerView.Adapter<favorite_adapter.MyHolder> {
List<favorite_model> favorites ;

    public favorite_adapter(List<favorite_model> favorites) {
        this.favorites = favorites;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return   new MyHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.favorite_item, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.fav_title.setText(favorites.get(position).getFav_title());
        holder.fav_duration.setText(favorites.get(position).getFav_duration());
        holder.fav_image.setImageResource(favorites.get(position).getFav_image());
        holder.fav_level.setImageResource(favorites.get(position).getFav_level());



    }

    @Override
    public int getItemCount() {
        return favorites.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView fav_image,fav_level;
        TextView fav_title,fav_duration;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            fav_image = itemView.findViewById(R.id.fav_image);
            fav_level = itemView.findViewById(R.id.fav_level);
            fav_title = itemView .findViewById(R.id.fav_title);
            fav_duration = itemView.findViewById(R.id.fav_duration);


        }

    }
}
