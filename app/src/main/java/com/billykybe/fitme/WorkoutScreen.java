package com.billykybe.fitme;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.List;

public class WorkoutScreen extends AppCompatActivity {

    public List<Workout_items_model> workout_list = new ArrayList<>();
    String id;
    boolean isMale = false;
    int current = 0;

    ProgressBar progressBar;
    TextView counter, rwContinue;
    VideoView wImage;
    TextView wText, ws_pauseBtn;
    TextView rst_timmer;
    TextView skip,prev;
    int modifier = 0;
    int size;

    int active;
    private CountDownTimer countDownTimer;
    private boolean countdownRunning;
    private long timeLeft;
    int weight = 30, height = 30, age = 20;
    double factor;
    int currentWorkout =0;
    TextView rest_rem,rest_title;
    VideoView rest_img;
    int levelOfWorkout;
    ConstraintLayout clayout;
ImageView backBtn ;

    @Override
    protected void onPause() {
        super.onPause();
        wImage.suspend();
        rest_img.suspend();

    }

    @Override
    protected void onResume() {
        super.onResume();
        wImage.resume();
        rest_img.resume();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_screen);

rest_img = findViewById(R.id.rest_img);
        rest_rem =findViewById(R.id.wr_texttop_txt);
        rest_title =findViewById(R.id.wr_title_txt);
        rst_timmer =findViewById(R.id.resttimer);
        skip = findViewById(R.id.skipWork);
        prev = findViewById(R.id.prevWork);

        skip.setOnClickListener(view ->{
            if (currentWorkout < workout_list.size()){
                countDownTimer.cancel();

                currentWorkout++;
                startWorkout(currentWorkout);

            }
            else {
                sentData();
            }

        } );
        prev.setOnClickListener(view ->{
            if (currentWorkout >0){
                countDownTimer.cancel();

                currentWorkout--;
                startWorkout(currentWorkout);

            }
        } );

getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
getWindow().setStatusBarColor(Color.TRANSPARENT);
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);;
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);;
        wImage = findViewById(R.id.wi_iimg);
        wText = findViewById(R.id.ws_title);
wImage.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setLooping(true);
    }
});
        backBtn = findViewById(R.id.w_backBtn);
        backBtn.setOnClickListener(view -> {

        });
        Bundle intent = getIntent().getExtras();

        id = intent.getString("id");
        //update list of items
//        addItems(id);

        WorkoutsDB addWorkouts = new WorkoutsDB(id);


        workout_list = addWorkouts.getList();

        if (levelOfWorkout == 1) {
            factor = 1.375;

        } else if (levelOfWorkout == 2) {
            factor = 1.55;
        } else {
            factor = 1.725;

        }

        clayout = findViewById(R.id.clayout);
        rwContinue = findViewById(R.id.rw_continue);


        progressBar = findViewById(R.id.ws_progressbar);
        counter = findViewById(R.id.wscounter_text);


        MediaPlayer mediaPlayer = new MediaPlayer();
        try {

            mediaPlayer.setDataSource("android.resource://"+getPackageName()+"/"+R.raw.cheer);
            mediaPlayer.prepare();
            mediaPlayer.start();

        }catch (Exception e){
            e.getStackTrace();
        }
        startWorkout(currentWorkout);

        ////



//
//        rwContinue.setOnClickListener(View -> {
//            skipRest();
//        });
//




    }

//    private void skipRest() {
//        clayout.setVisibility(View.GONE);
//        currentWorkout += 1;
//        startWorkout(currentWorkout);
//    }

    private void startWorkout(int look) {
        int timeToWait = Integer.parseInt(workout_list.get(look).getW_duration())*1000;
        wText.setText(workout_list.get(look).w_name);
                wImage.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+workout_list.get(look).w_lottie));
                wImage.start();



countDownTimer=
        new CountDownTimer(timeToWait,1000){
            int toShow = Integer.parseInt(workout_list.get(look).getW_duration());

            @Override//
//        rwContinue.setOnClickListener(View -> {
//            skipRest();
//        });
//

            public void onTick(long l) {
counter.setText(String.valueOf(toShow));
toShow--;
            }

            @Override
            public void onFinish() {
                if (look == workout_list.size()-1){
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    try {

                        mediaPlayer.setDataSource("android.resource://"+getPackageName()+"/"+R.raw.cheer);
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                    }catch (Exception e){
                        e.getStackTrace();
                    }
                    counter.setText("End");
sentData();

                }else {
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    try {

                        mediaPlayer.setDataSource("android.resource://"+getPackageName()+"/"+R.raw.ding);
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                    }catch (Exception e){
                        e.getStackTrace();
                    }
                 currentWorkout++;
                    startWorkout(currentWorkout);
                }
            }
        }.start();

//
//        final Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                wText.setText(workout_list.get(look).w_name);
//                wImage.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+workout_list.get(look).w_lottie));
//                wImage.start();
//
//                if (modifier <=100){
//                    counter.setText(String.valueOf(modifier));
//                    Toast.makeText(WorkoutScreen.this, String.valueOf(modifier), Toast.LENGTH_SHORT).show();
//
//                    progressBar.setProgress(modifier);
//                    modifier++;
//                    handler.postDelayed(this,200);
//                }else {
//
//                 if (look < workout_list.size()){
//                     Toast.makeText(WorkoutScreen.this, "done", Toast.LENGTH_SHORT).show();
//                    int temp = modifier;
//                     if (modifier<workout_list.size()){
//                        temp = modifier+1;
//                    }
//rest_title.setText(String.valueOf(temp));
//                     rest_img.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+workout_list.get(temp).w_lottie));
//                     rest_img.start();
//
//                     rest_img.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//                         @Override
//                         public void onPrepared(MediaPlayer mediaPlayer) {
//                             mediaPlayer.setLooping(true);
//                         }
//                     });
//clayout.setVisibility(View.VISIBLE);
//
//                 }else {
//
//                    int lookNext =look+1;
//                     Toast.makeText(WorkoutScreen.this, "lookNext", Toast.LENGTH_SHORT).show();
//
//
//
//                 }
//                }
//
//            }
//        },200);

        
    }


    public void sentData() {
        int calories = calories();
        int workouts;

        int time = 0, minutes, seconds;


        for (Workout_items_model workout : workout_list) {
            time = time + Integer.parseInt(workout.getW_duration());




        }
        minutes = (time / 60) % 60;
        seconds = (time / 60);
        workouts = workout_list.size();

        Intent intent = new Intent(this.getApplicationContext(),EndOfWorkout.class);

        intent.putExtra("workouts",String.valueOf(workouts));
        intent.putExtra("calos",String.valueOf(calories));
        intent.putExtra("mins",String.valueOf(minutes));
        intent.putExtra("secs",String.valueOf(seconds));

        startActivity(intent);
        finish();




    }

    private int calories() {
        int calos;

        if (isMale) {
            calos = (int) ((665 + (6.23) * weight) + (12.7 * height) - (6.8 * age));

        } else {
            calos = (int) ((655 + (4.35) * weight) + (4.7 * height) - (4.7 * age));

        }
        return calos;
    }
}