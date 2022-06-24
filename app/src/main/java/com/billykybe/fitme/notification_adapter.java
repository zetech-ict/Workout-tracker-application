package com.billykybe.fitme;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class notification_adapter extends RecyclerView.Adapter<notification_adapter.MyHolder> {
    List<notification_model> notification_models;
    int priority;

    public notification_adapter( List<notification_model> notification_models) {

        this.notification_models = notification_models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return   new MyHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_item, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        holder.bgImage.setImageResource(notification_models.get(position).getImgView());
        holder.na_title.setText(notification_models.get(position).getN_title());
        holder.na_text.setText(notification_models.get(position).getN_text());
        holder.na_notification_icon.setImageResource(notification_models.get(position).getNotificationIcon());

    if (holder.getPosition() == 0) {
        holder.bgImage.setColorFilter(ContextCompat.getColor(holder.bgImage.getContext(), R.color.error));
    } else if (holder.getPosition() == 1) {
        holder.bgImage.setColorFilter(ContextCompat.getColor(holder.bgImage.getContext(), R.color.warning));

    } else if (holder.getPosition() == 2) {
        holder.bgImage.setColorFilter(ContextCompat.getColor(holder.bgImage.getContext(), R.color.success));

    } else {
        holder.bgImage.setColorFilter(ContextCompat.getColor(holder.bgImage.getContext(), R.color.color_secondary));

    }




    }


    @Override
    public int getItemCount() {
        return notification_models.size();
    }

    public class MyHolder extends  RecyclerView.ViewHolder {
        ImageView na_notification_icon,bgImage;
        TextView na_title,na_text;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
bgImage = itemView.findViewById(R.id.noti_img);
            na_notification_icon = itemView.findViewById(R.id.notificationcat_ic);
            na_title = itemView.findViewById(R.id.noti_title_txt);
            na_text = itemView.findViewById(R.id.noti_desc_txt);
        }
    }
}
