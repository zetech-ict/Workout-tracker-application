package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class WorkoutScreen extends AppCompatActivity {

List<Workout_items_model> workout_list = new ArrayList<>();
String id;
    ProgressBar progressBar ;
    TextView counter ;
    LottieAnimationView wImage;
    TextView wText;
    int modifier=0;
    int size;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_screen);
wImage= findViewById(R.id.wi_img);
wText =  findViewById(R.id.ws_title);
        Bundle intent = getIntent().getExtras();

        id =intent.getString("id");
        //update list of items
addItems(id);
size = 0;
        progressBar = findViewById(R.id.ws_progressbar);
        counter = findViewById(R.id.wscounter_text);
wText.setText("hh");

for (int i = 1 ;i<workout_list.size();i++){
//            displayWorkout(workout_list.get(i));
            trytwo(workout_list.get(i));



        }



    }
public  int counterOn;
    private void trytwo(Workout_items_model workout_items_model) {
        new CountDownTimer(3000,1000){
            public void onTick(long millisec){
                wText.setText( workout_items_model.getW_name());
                Toast.makeText(WorkoutScreen.this, String.valueOf(counterOn), Toast.LENGTH_SHORT).show();
                wImage.setImageResource(workout_items_model.getW_lottie());
counterOn++;
            }

            @Override
            public void onFinish() {
                 wText.setText( "Finnished");
                 Intent toCongrats = new Intent(getApplicationContext(),EndOfWorkout.class);
                 startActivity(toCongrats);
                 finish();
            }


        }.start();
    }
    public  void addItems(String id){
        switch (id){
            case "fullbody-bg":
                workout_list.clear();
                workout_list.add(new Workout_items_model(R.raw.spaceman, "Kicks", "10"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "2icks", "15"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "3icks", "20"));
                workout_list.add(new Workout_items_model(R.raw.spaceman, "4icks", "10"));


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