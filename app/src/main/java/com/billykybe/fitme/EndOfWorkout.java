package com.billykybe.fitme;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class EndOfWorkout extends AppCompatActivity {
    TextView toHome, toReminder;
    String workouts, calories;
    String timeMin;
    String timeSec;
String time;
TextView congrats_workouts,congrats_calos,congrats_time;
private final String CHANEL_ID = "workout_notification";
private  final int NOTIFICATION_ID=1;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_of_workout);
        Intent intent = getIntent();
        workouts = intent.getStringExtra("workouts");
        calories = intent.getStringExtra("calos");
        timeMin = intent.getStringExtra("mins");
        timeSec = intent.getStringExtra("secs");


//init
        congrats_workouts = findViewById(R.id.congrats_workouts);
        congrats_calos = findViewById(R.id.congrats_calories);
        congrats_time = findViewById(R.id.congrats_minutes);

        congrats_workouts.setText(workouts);
        congrats_calos.setText(calories);


        congrats_time.setText(timeMin+":"+timeSec);

//========> Notification first test
createNotification();
addNotification();


        toHome = findViewById(R.id.eow_toHome);
        toHome.setOnClickListener(view -> {
            Intent toHome = new Intent(getApplicationContext(), HomePage.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(toHome);

            finish();
        });
        toReminder = findViewById(R.id.eow_toTimer);
        toReminder.setOnClickListener(view -> {
            Intent toReminder = new Intent(getApplicationContext(), Reminder.class);
            startActivity(toReminder);
finish();
        });
    }

    private void addNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(),CHANEL_ID);
        builder.setSmallIcon(R.drawable.recent_dis_78);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(),R.drawable.recent_dis_78));
        builder.setContentTitle("Congratulations");
        builder.setContentText("You have completed you workout, keep going athlete");
        builder.setAutoCancel(true);
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);

        //Make ita notific
        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(getApplicationContext());
        notificationManagerCompat.notify(NOTIFICATION_ID,builder.build());
    }

    //api Annotation
    @RequiresApi(api = Build.VERSION_CODES.O)
    private void createNotification() {
        CharSequence title ="titlee";
        String desc = "desc";
        NotificationChannel notificationChannel = new NotificationChannel(CHANEL_ID,title,NotificationManager.IMPORTANCE_DEFAULT);
        notificationChannel.setDescription(desc);

        NotificationManager  notificationManager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.createNotificationChannel(notificationChannel);



    }
}

