package com.billykybe.fitme;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class WorkoutScreen extends AppCompatActivity {

    public  List<Workout_items_model> workout_list = new ArrayList<>();
    String id;
    ProgressBar progressBar;
    TextView counter;
    LottieAnimationView wImage;
    TextView wText;
    int modifier = 0;
    int size;
    int active;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_screen);
        wImage = findViewById(R.id.wi_img);
        wText = findViewById(R.id.ws_title);
        Bundle intent = getIntent().getExtras();

        id = intent.getString("id");
        //update list of items
        addItems(id);

        progressBar = findViewById(R.id.ws_progressbar);
        counter = findViewById(R.id.wscounter_text);

for (int i = 1 ;i < workout_list.size();i++) {
    Toast.makeText(WorkoutScreen.this, "Act "+workout_list.get(i).getW_name(), Toast.LENGTH_SHORT).show();

    CountDownTimer countDownTimer = new CountDownTimer(Integer.parseInt(workout_list.get(i).w_duration)* 1000, 1000) {
int current = 1;


        @Override
        public void onTick(long l) {

            counter.setText(String.valueOf(l/1000));


            
            
        }

        @Override
        public void onFinish() {
            current++;


            wImage.setAnimation(workout_list.get(current).getW_lottie());
            wText.setText(workout_list.get(current).getW_name());
           if (current == workout_list.size()){
               Intent intent1 = new Intent(getApplicationContext(), EndOfWorkout.class);
               startActivity(intent1);
               finish();
           }
        }
    };
    countDownTimer.start();


}






    }


    public void addItems(String id) {
        switch (id) {
            case "fullbody-bg":
                workout_list.clear();
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "10"));
                workout_list.add(new Workout_items_model(R.raw.trophy, "4icks", "15"));

                workout_list.add(new Workout_items_model(R.raw.likeicon, "2icks", "20"));
                workout_list.add(new Workout_items_model(R.raw.congratulations, "3icks", "25"));


                break;
            case "arms-bg":
                workout_list.clear();


                break;
            case "abs-bg":
                workout_list.clear();

                break;
            case "chest-bg":

                break;

        }
    }
}