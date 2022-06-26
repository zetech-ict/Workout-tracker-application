package com.billykybe.fitme;



import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;
import com.billykybe.fitme.Workout_items_model;

import java.util.List;

public class workout_item_adapter  extends RecyclerView.Adapter<workout_item_adapter.MyViewHolder> {

    List<Workout_items_model> workout_items_models;

    public workout_item_adapter(List<Workout_items_model> workout_items_models) {
        this.workout_items_models = workout_items_models;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return   new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.workouts_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


//        holder.lottieImg.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+workout_items_models.get(position).w_lottie));
        holder.lottieImg.start();


        holder.w_name.setText(workout_items_models.get(position).getW_name());
        holder.w_duration.setText(workout_items_models.get(position).getW_duration());

    }

    @Override
    public int getItemCount() {
        return workout_items_models.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        VideoView lottieImg;
        TextView w_name,w_duration;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            lottieImg = itemView.findViewById(R.id.wi_img);
            w_name = itemView.findViewById(R.id.wi_title);
            w_duration = itemView.findViewById(R.id.wi_duration);
        }
    }
}