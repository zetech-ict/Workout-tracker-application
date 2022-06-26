package com.billykybe.fitme;

import android.content.Intent;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;

import java.util.concurrent.Executor;

public class SecurityCheck extends AppCompatActivity {

    TextView one, two, three, four, five, six, seven, eight, nine, zero, enterdPinHolder, enterpintext;
    ImageView finger_print_ic, backspace_ic;
    View pin_slot_one, pin_slot_two, pin_slot_three, pin_slot_four;
    boolean allowAcces = false;
    String enteredPin = "";
    int counts = 0;

    String correctPin = "1234";

VideoView pinvideo;

    @Override
    protected void onPause() {
        super.onPause();
        pinvideo.suspend();
    }

    @Override
    protected void onResume() {
        super.onResume();
     pinvideo.resume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_check);
        initViews();



        pinvideo.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.splash));
        pinvideo.start();

        pinvideo.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
                mediaPlayer.setVolume(0,0);
            }
        });

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );




        //=========== biometrics management
        BiometricManager biometricManager = BiometricManager.from(this);
        switch (biometricManager.canAuthenticate()) {
            case BiometricManager.BIOMETRIC_SUCCESS:

                finger_print_ic.setVisibility(View.VISIBLE);

                break;
            case BiometricManager.BIOMETRIC_ERROR_HW_UNAVAILABLE:
                finger_print_ic.setVisibility(View.INVISIBLE);

                break;
            case BiometricManager.BIOMETRIC_ERROR_NO_HARDWARE:


            case BiometricManager.BIOMETRIC_ERROR_NONE_ENROLLED:


                finger_print_ic.setVisibility(View.INVISIBLE);


                break;


        }


        Executor executor = ContextCompat.getMainExecutor(this);
        BiometricPrompt biometricPrompt = new BiometricPrompt(SecurityCheck.this, executor, new BiometricPrompt.AuthenticationCallback() {
            @Override
            public void onAuthenticationError(int errorCode, @NonNull CharSequence errString) {
                super.onAuthenticationError(errorCode, errString);

            }

            @Override
            public void onAuthenticationSucceeded(@NonNull BiometricPrompt.AuthenticationResult result) {
                super.onAuthenticationSucceeded(result);
                pin_slot_one.setVisibility(View.VISIBLE);

                pin_slot_two.setVisibility(View.VISIBLE);

                pin_slot_three.setVisibility(View.VISIBLE);

                pin_slot_four.setVisibility(View.VISIBLE);

                succesAnimation();
                allowAcces = true;
                checkAllow();
            }

            @Override
            public void onAuthenticationFailed() {
                super.onAuthenticationFailed();
                pin_slot_one.setVisibility(View.VISIBLE);

                pin_slot_two.setVisibility(View.VISIBLE);

                pin_slot_three.setVisibility(View.VISIBLE);

                pin_slot_four.setVisibility(View.VISIBLE);

                failedAnimation();
                pin_slot_one.setVisibility(View.INVISIBLE);

                pin_slot_two.setVisibility(View.INVISIBLE);

                pin_slot_three.setVisibility(View.INVISIBLE);

                pin_slot_four.setVisibility(View.INVISIBLE);
            }
        });


        BiometricPrompt.PromptInfo promptInfo = new BiometricPrompt.PromptInfo.Builder()
                .setTitle("Login")
                .setDescription("Unlock your FitMe account\nPlease authenticate using biometrics")
                .setNegativeButtonText("Use Pin")

                .build();


        biometricPrompt.authenticate(promptInfo);
        finger_print_ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    biometricPrompt.authenticate(promptInfo);
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Can't use fingerprint", Toast.LENGTH_SHORT).show();
//Todo:// Not showing
                }

            }
        });
//=========== / biometrics management


        //=========== Pin management

        initAllButtons();

        backspace_ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (enterdPinHolder.getText().toString().length() > 0) {
                    String enteredPin = enterdPinHolder.getText().toString();
                    StringBuffer stringBuffer = new StringBuffer(enteredPin);
                    stringBuffer.deleteCharAt(stringBuffer.length() - 1);

                    enteredPin = stringBuffer.toString();
                    enterdPinHolder.setText(enteredPin);

                    if (counts != 0) {
                        counts--;
                    }
                    if (counts == 0) {
                        backspace_ic.setVisibility(View.INVISIBLE);
                        switch (biometricManager.canAuthenticate()) {
                            case BiometricManager.BIOMETRIC_SUCCESS:

                                finger_print_ic.setVisibility(View.VISIBLE);

                                break;
                        }
                    } else {
                        backspace_ic.setVisibility(View.VISIBLE);

                    }
                    counter();


                }


            }
        });

//=========== / Pin management

    }

    private void initAllButtons() {

        one.setOnClickListener(v -> {

            enterPin(one);


        });
        two.setOnClickListener(v -> {

            enterPin(two);


        });
        three.setOnClickListener(v -> {

            enterPin(three);


        });
        four.setOnClickListener(v -> {

            enterPin(four);


        });
        five.setOnClickListener(v -> {

            enterPin(five);


        });
        six.setOnClickListener(v -> {

            enterPin(six);


        });
        seven.setOnClickListener(v -> {

            enterPin(seven);


        });
        eight.setOnClickListener(v -> {

            enterPin(eight);


        });
        nine.setOnClickListener(v -> {

            enterPin(nine);


        });
        zero.setOnClickListener(v -> {

            enterPin(zero);


        });

    }

    private void enterPin(TextView one) {

        String enteredPin = enterdPinHolder.getText().toString();
        enteredPin += one.getText().toString();
        enterdPinHolder.setText(enteredPin);
        counts++;
        counter();

        confirmPin();
    }

    private void counter() {
        switch (counts) {
            case 0:
                pin_slot_one.setVisibility(View.INVISIBLE);

                pin_slot_two.setVisibility(View.INVISIBLE);

                pin_slot_three.setVisibility(View.INVISIBLE);

                pin_slot_four.setVisibility(View.INVISIBLE);
                break;
            case 1:
                pin_slot_one.setVisibility(View.VISIBLE);
                pin_slot_two.setVisibility(View.INVISIBLE);

                pin_slot_three.setVisibility(View.INVISIBLE);

                pin_slot_four.setVisibility(View.INVISIBLE);

                break;
            case 2:
                pin_slot_one.setVisibility(View.VISIBLE);

                pin_slot_two.setVisibility(View.VISIBLE);

                pin_slot_three.setVisibility(View.INVISIBLE);

                pin_slot_four.setVisibility(View.INVISIBLE);
                break;
            case 3:
                pin_slot_one.setVisibility(View.VISIBLE);

                pin_slot_two.setVisibility(View.VISIBLE);

                pin_slot_three.setVisibility(View.VISIBLE);
                pin_slot_four.setVisibility(View.INVISIBLE);

                break;
            case 4:
                pin_slot_one.setVisibility(View.VISIBLE);

                pin_slot_two.setVisibility(View.VISIBLE);

                pin_slot_three.setVisibility(View.VISIBLE);

                pin_slot_four.setVisibility(View.VISIBLE);


                break;
        }
    }

    private void confirmPin() {



        if (enterdPinHolder.getText().toString().length() == 4) {



            if (enterdPinHolder.getText().toString().equals(correctPin)) {

        //todo:// success animation
        succesAnimation();

        allowAcces = true;
        checkAllow();
    } else {
        //todo:// failed animation
        failedAnimation();


        counts = 0;
        counter();
        enterdPinHolder.setText("");

}




        }

        BiometricManager biometricManager = BiometricManager.from(this);

        switch (biometricManager.canAuthenticate()) {
            case BiometricManager.BIOMETRIC_SUCCESS:

                finger_print_ic.setVisibility(View.VISIBLE);

                break;
            case BiometricManager.BIOMETRIC_ERROR_HW_UNAVAILABLE:
                finger_print_ic.setVisibility(View.INVISIBLE);
                break;
        }
        if (enterdPinHolder.getText().toString().equals("")) {

            backspace_ic.setVisibility(View.INVISIBLE);
        } else {
            finger_print_ic.setVisibility(View.INVISIBLE);
            backspace_ic.setVisibility(View.VISIBLE);
        }
    }

    private void failedAnimation() {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        pin_slot_one.startAnimation(animation);
        pin_slot_two.startAnimation(animation);
        pin_slot_three.startAnimation(animation);
        pin_slot_four.startAnimation(animation);


        pin_slot_one.setBackgroundResource(R.drawable.pin_fail_bg);
        pin_slot_two.setBackgroundResource(R.drawable.pin_fail_bg);
        pin_slot_three.setBackgroundResource(R.drawable.pin_fail_bg);
        pin_slot_four.setBackgroundResource(R.drawable.pin_fail_bg);



        enterpintext.setTextColor(getResources().getColor(R.color.error));
        pin_slot_one.clearAnimation();
        pin_slot_two.clearAnimation();
        pin_slot_three.clearAnimation();
        pin_slot_four.clearAnimation();

        pin_slot_one.setBackgroundResource(R.drawable.pin_bg_fill);
        pin_slot_two.setBackgroundResource(R.drawable.pin_bg_fill);
        pin_slot_three.setBackgroundResource(R.drawable.pin_bg_fill);
        pin_slot_four.setBackgroundResource(R.drawable.pin_bg_fill);

    }

    private void succesAnimation() {

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        pin_slot_one.startAnimation(animation);
        pin_slot_two.startAnimation(animation);
        pin_slot_three.startAnimation(animation);
        pin_slot_four.startAnimation(animation);
        pin_slot_one.setBackgroundResource(R.drawable.pin_succes_bg);
        pin_slot_two.setBackgroundResource(R.drawable.pin_succes_bg);
        pin_slot_three.setBackgroundResource(R.drawable.pin_succes_bg);
        pin_slot_four.setBackgroundResource(R.drawable.pin_succes_bg);


        enterpintext.setText("Validation succes");
        enterpintext.setTextColor(getResources().getColor(R.color.color_primary));


    }

    private void checkAllow() {
        if (allowAcces) {
            Intent intent = new Intent(getApplicationContext(), HomePage.class);
            startActivity(intent);
        }
    }

    private void initViews() {

        pinvideo = findViewById(R.id.pinvideo);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        finger_print_ic = findViewById(R.id.finger_ic);
        backspace_ic = findViewById(R.id.backspace_ic);
        enterdPinHolder = findViewById(R.id.enterdPinHolder);
        pin_slot_one = findViewById(R.id.pin_slot_one);
        pin_slot_two = findViewById(R.id.pin_slot_two);
        pin_slot_three = findViewById(R.id.pin_slot_three);
        pin_slot_four = findViewById(R.id.pin_slot_four);
        enterpintext = findViewById(R.id.enterpintext);


    }
}