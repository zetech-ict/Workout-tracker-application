package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Notifications extends AppCompatActivity {
    RecyclerView rv_notifications;
    ImageView notIf_backBtn ;
    List<notification_model> notifications = new ArrayList<>();
    notification_adapter notification_adapter;
    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        notIf_backBtn = findViewById(R.id.notIf_backBtn);
        notIf_backBtn.setOnClickListener(view -> {
            finish();
        });
        rv_notifications = findViewById(R.id.noti_rv);


        rv_notifications.setLayoutManager(new LinearLayoutManager(this));
        notification_adapter = new notification_adapter(notifications);
        rv_notifications.setAdapter(notification_adapter);

        notifications.add(new notification_model(R.drawable.notification,"New Update Available","This version is depresiated update to continue"));
        notifications.add(new notification_model(R.drawable.design_ic_visibility,"Time to Workout","This version is depresiated update to continue"));
        notifications.add(new notification_model(R.drawable.password,"Workout Update","Abs for beggener has a new update "));
        notifications.add(new notification_model(R.drawable.envelope,"New Update Available","This version is depresiated update to continue"));
        notification_adapter.notifyDataSetChanged();

    }
}