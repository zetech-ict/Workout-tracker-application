package com.billykybe.fitme;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.List;

public class WorkoutScreen extends AppCompatActivity {

    public List<Workout_items_model> workout_list = new ArrayList<>();
    String id;

    int current = 0;

    ProgressBar progressBar;
    TextView counter, rwContinue;
    LottieAnimationView wImage;
    TextView wText, ws_pauseBtn;
    int modifier = 0;
    int size;
    int active;
    private CountDownTimer countDownTimer;
    private boolean countdownRunning;
    private long timeLeft;

    ConstraintLayout clayout;

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
        clayout = findViewById(R.id.clayout);
        rwContinue = findViewById(R.id.rw_continue);

        rwContinue.setOnClickListener(View ->{
            skipRest();
        });

        ws_pauseBtn = findViewById(R.id.ws_pauseBtn);
        ws_pauseBtn.setOnClickListener(view -> {

        });


//        startCountdown(current);
    }

    public void startCountdown(int current) {
        int currentCount = current;
//        countDownTimer = new CountDownTimer(timeLeft, 1000) {
//            @Override
//            public void onTick(long l) {
//                timeLeft = l;
//                updateViews();
//            }
//
//            @Override
//            public void onFinish() {
//                if (workout_list.size() > currentCount) {
//                    int start = 0;
////                    Intent intent = new Intent(getApplicationContext(), RestWorkout.class);
////                    int nextWorkout = current + 1;
////                    Bundle bundle = new Bundle();
////                    bundle.putString("nextWorkout", String.valueOf(nextWorkout));
////                    startActivity(intent);
////                    finish();
//                    clayout.setVisibility(View.VISIBLE);
//                    try {
//                        Toast.makeText(WorkoutScreen.this, start, Toast.LENGTH_SHORT).show();
//                    }catch (Exception e){
//                        Toast.makeText(WorkoutScreen.this, e.getMessage(), Toast.LENGTH_LONG).show();
//                    }
//
//                } else {
//                    Intent intent = new Intent(getApplicationContext(), EndOfWorkout.class);
//                    startActivity(intent);
//                    finish();
//                }
//
//            }
//        }.start();
        countdownRunning = true;
        counter.setText("hello");

        wImage.setAnimation(workout_list.get(current).getW_lottie());
        wText.setText(workout_list.get(current).getW_name());
    }

    private void updateViews() {
    }

    void skipRest(){
        clayout.setVisibility(View.GONE);
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