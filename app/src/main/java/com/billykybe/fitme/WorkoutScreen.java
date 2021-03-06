package com.billykybe.fitme;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class WorkoutScreen extends AppCompatActivity {

    public List<Workout_items_model> workout_list = new ArrayList<>();
    String id;
    boolean isMale = false;
    int current = 0;
int[]start;
int[]end;
    ProgressBar progressBar;
    TextView counter, rwContinue;
    VideoView wImage;
    TextView wText, ws_pauseBtn;
    TextView rst_timmer;
    TextView skip,prev;
    View progress_bg;
    int modifier = 0;
    int size;
View workoutHolderView ;
    int active;
    private CountDownTimer countDownTimer,restCountTimer;
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

    public static final String EXTRA_ID =
            "com.billykybe.fitme.EXTRA_ID";

    public static final String EXTRA_DATE_TIME =
            "com.billykybe.fitme.EXTRA_DATE_TIME";
    public static final String EXTRA_NAME =
            "com.billykybe.fitme.EXTRA_NAME";
    public static final String EXTRA_TIME =
            "com.billykybe.fitme.EXTRA_TIME";

    public static final String EXTRA_KCAL =
            "com.billykybe.fitme.EXTRA_KCAL";

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
        progress_bg = findViewById(R.id.progress_bg);
        skip.setOnClickListener(view ->{
            if (currentWorkout < workout_list.size()-1){
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
        workoutHolderView =  findViewById(R.id.workoutHolderView);

        wImage.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });rest_img.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
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

        getStartTime();
        startWorkout(currentWorkout);

        ////




        rwContinue.setOnClickListener(View -> {
            skipRest();
        });





    }

    private void getStartTime() {
        start = new int[3];
        int m,s;
        Calendar calendar = Calendar.getInstance();

        start[0] = calendar.get(Calendar.HOUR_OF_DAY);
        start[1] =calendar.get(Calendar.MINUTE);
        start[2] =calendar.get(Calendar.SECOND);

    }
    private void getEndTime() {
        end = new int[3];

        Calendar calendar = Calendar.getInstance();

        end[0] = calendar.get(Calendar.HOUR_OF_DAY);
        end[1] =calendar.get(Calendar.MINUTE);
        end[2] =calendar.get(Calendar.SECOND);



    }

    private void updateBar(int position) {



        final DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        int widthInPx = Resources.getSystem().getDisplayMetrics().widthPixels;
        int pixelDPI = Resources.getSystem().getDisplayMetrics().densityDpi;


        int screenWidthInDp =(widthInPx/pixelDPI)*160;

        int currentMax = (screenWidthInDp * position) / workout_list.size()-1;

     progress_bg.setLayoutParams(new ConstraintLayout.LayoutParams(currentMax*2,3));


    }

    private void skipRest() {
        workoutHolderView.setVisibility(View.VISIBLE);
        try {
            restCountTimer.cancel();
            countDownTimer.cancel();
        }catch (Exception e){

        }
        clayout.setVisibility(View.GONE);
        currentWorkout += 1;
        startWorkout(currentWorkout);
    }

    private void startWorkout(int look) {

        updateBar(look+1);

        int timeToWait = Integer.parseInt(workout_list.get(look).getW_duration())*1000;
        wText.setText(workout_list.get(look).w_name);
                wImage.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+workout_list.get(look).w_lottie));
                wImage.start();



                progressBar.setMax(Integer.parseInt(workout_list.get(look).getW_duration()));

countDownTimer=
        new CountDownTimer(timeToWait,1000){
    int toShow = Integer.parseInt(workout_list.get(look).getW_duration());
int modifiy  = 0;

            @Override


            public void onTick(long l) {

counter.setText(String.valueOf(toShow));
toShow--;

                progressBar.setProgress(modifiy);
modifiy++;
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



restShow(currentWorkout);


                }
            }
        }.start();



    }

    private void restShow(int currentWorkout) {
        workoutHolderView.setVisibility(View.GONE);

        int i =currentWorkout;

            clayout.setVisibility(View.VISIBLE);
            if (currentWorkout!= workout_list.size()-1) {
                i = currentWorkout + 1;
            }

        String remtextMsg = "Next Workout ("+(i+1)+"/"+(workout_list.size())+")";

        rest_rem.setText(remtextMsg);
        rest_title.setText(workout_list.get(i).w_name);
        rest_img.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });


        rest_img.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+workout_list.get(i).w_lottie));
        wImage.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+workout_list.get(i).w_lottie));

        rest_img.start();

int restDuration = 10000;
        restCountTimer=
                new CountDownTimer(restDuration,1000){
                    int modifiy  = 0;
                    int restRem = 10;

                    @Override


                    public void onTick(long l) {

                        rst_timmer.setText(String.valueOf(restRem));

                        restRem--;

                    }

                    @Override
                    public void onFinish() {


             skipRest();

                        }

                }.start();
        //// End of rest

    }


    public void sentData() {
try {
    restCountTimer.cancel();
    countDownTimer.cancel();
}catch (Exception e){

}

        getEndTime();
        int calories = calories();
        int workouts;

        int hours , minutes, seconds;

hours = start[0];
        minutes =start[1];
        seconds = start[2];
        workouts = workout_list.size();

        Intent intent = new Intent(this.getApplicationContext(),EndOfWorkout.class);

        intent.putExtra("workouts",String.valueOf(workouts));
        intent.putExtra("calos",String.valueOf(calories));
        String timeTaken []= new String[2];
        timeTaken = getTimeTaken(start,end);
        intent.putExtra("mins",timeTaken[0]);
        intent.putExtra("secs",timeTaken[1]);

        //=====> Room database start
        FittMeDatabase fittMeDatabase = FittMeDatabase.getInstance(this);
        History_item_model model = new History_item_model(R.drawable.ic_chest,"Chest Begg","3:40","203","June 10,2021");
        fittMeDatabase.databaseDAO().insertWorkoutDone(model);
        //=====> Room database end

        startActivity(intent);
        finish();




    }

    private String[] getTimeTaken(int[] start, int[] end) {
        int tt []={-1,-1};
        String ttString []= {"10","30"};



        /* TODO: FIx This Quick Task */
        return ttString;
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