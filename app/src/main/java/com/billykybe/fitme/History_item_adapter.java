package com.billykybe.fitme;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class History_item_adapter extends RecyclerView.Adapter<History_item_adapter.MyViewHolder> {

    List<History_item_model> history_item_models;

    public History_item_adapter(List<History_item_model> history_item_models) {
        this.history_item_models = history_item_models;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return   new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.history_item, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.w_img.setImageResource(history_item_models.get(position).getW_img());
        holder.date.setText(history_item_models.get(position).getW_date());
        holder.name.setText(history_item_models.get(position).getW_name());
        holder.duration.setText(history_item_models.get(position).getW_duration());
        holder.kcal.setText(history_item_models.get(position).getW_kcal());
    }

    @Override
    public int getItemCount() {
        return history_item_models.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView w_img;
        TextView date,name,kcal,duration;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            w_img = itemView.findViewById(R.id.workout_img);
            date = itemView.findViewById(R.id.date);
            name = itemView.findViewById(R.id.workout);
            kcal = itemView.findViewById(R.id.workoutkcal);
            duration = itemView.findViewById(R.id.workouttime);




        }
    }
}
