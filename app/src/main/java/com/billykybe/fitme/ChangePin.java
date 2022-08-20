package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ChangePin extends AppCompatActivity {
    TextView ssEnterdPin,one,two,three,four,five,six,seven,eight,nine,zero,changePinBtn;
    View pinslotone,pinslottwo,pinslotthree,pinslotfour,pincover,keyboard,passHolder,old_pass,new_pass,new_again_pass,old_new,new_new;
    int ss_count = 0;
    int progress = 1;
    ImageView backIc,cp_backBtn;
    boolean allowAccesss = false;
    String oldPin="1234",newPin="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_pin);
        initViews();
        initButtons();
        cp_backBtn.setOnClickListener(view -> {finish();});
        backIc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ssEnterdPin.getText().toString().length() > 0) {
                    String enteredPin = ssEnterdPin.getText().toString();
                    StringBuffer stringBuffer = new StringBuffer(enteredPin);
                    stringBuffer.deleteCharAt(stringBuffer.length() - 1);

                    enteredPin = stringBuffer.toString();
                    ssEnterdPin.setText(enteredPin);

                    if (ss_count != 0) {
                        ss_count--;
                    }
                    if (ss_count == 0) {
                        backIc.setVisibility(View.INVISIBLE);

                    } else {
                        backIc.setVisibility(View.VISIBLE);

                    }
                    counter();


                }


            }
        });

    }
    private void initViews() {
        new_pass = findViewById(R.id.new_pin_holder);
        new_again_pass = findViewById(R.id.new_again_pin_holder);
        old_pass = findViewById(R.id.old_pin_holder);
        old_new = findViewById(R.id.old_new_divide);
        new_new = findViewById(R.id.new_new_divide);
        old_pass = findViewById(R.id.old_pin_holder);
       cp_backBtn = findViewById(R.id.cp_backBtn);
        pinslotone = findViewById(R.id.ss_pin_slot_one);
        pinslottwo = findViewById(R.id.ss_pin_slot_two);
        pinslotthree = findViewById(R.id.ss_pin_slot_three);
        pinslotfour = findViewById(R.id.ss_pin_slot_four);
        ssEnterdPin = findViewById(R.id.ss_entersPin);
        backIc = findViewById(R.id.ss_backspace);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        changePinBtn = findViewById(R.id.changePinBtn);
        keyboard = findViewById(R.id.keyboardholderSec);
        passHolder = findViewById(R.id.passwordholder);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
    }
    private void checkAllow() {
        if (allowAccesss) {

        }
    }
    private void confirmPin() {



        if (ssEnterdPin.getText().toString().length() == 4) {


if (progress == 1){

    if (ssEnterdPin.getText().toString().equals(oldPin)) {

        old_pass.setBackgroundResource(R.drawable.pin_bg_fill);
        old_new.setBackgroundResource(R.drawable.progress_bg);

        allowAccesss = true;
        checkAllow();
        ss_count = 0;
        counter();
        ssEnterdPin.setText("");
        progress = 2;

    } else {
        //todo:// failed animation
        old_pass.setBackgroundResource(R.drawable.pin_fail_bg);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        old_pass.setBackgroundResource(R.drawable.pin_bg_null);

        ss_count = 0;
        counter();
        ssEnterdPin.setText("");

    }
}

        }
        else if (progress == 2){
            newPin = ssEnterdPin.getText().toString();


            new_pass.setBackgroundResource(R.drawable.pin_bg_fill);
            new_new.setBackgroundResource(R.drawable.progress_bg);



            ss_count = 0;
            counter();
            ssEnterdPin.setText("");
            progress = 3;
        }else {
if (newPin.equals(ssEnterdPin.getText().toString())){
    oldPin = newPin;
 }else {
    old_pass.setBackgroundResource(R.drawable.pin_fail_bg);
    try {
        Thread.sleep(100);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    old_pass.setBackgroundResource(R.drawable.pin_bg_null);

    ss_count = 0;
    counter();
    ssEnterdPin.setText("");
 }


            new_pass.setBackgroundResource(R.drawable.pin_bg_fill);
            new_new.setBackgroundResource(R.drawable.progress_bg);



            ss_count = 0;
            counter();
            ssEnterdPin.setText("");
            progress = 3;

        }





        if (ssEnterdPin.getText().toString().equals("")) {

            backIc.setVisibility(View.INVISIBLE);
        } else {
            backIc.setVisibility(View.VISIBLE);
        }
    }
    private void counter() {
        switch (ss_count) {
            case 0:
                pinslotone.setVisibility(View.INVISIBLE);

                pinslottwo.setVisibility(View.INVISIBLE);

                pinslotthree.setVisibility(View.INVISIBLE);

                pinslotfour.setVisibility(View.INVISIBLE);
                break;
            case 1:
                pinslotone.setVisibility(View.VISIBLE);
                pinslottwo.setVisibility(View.INVISIBLE);

                pinslotthree.setVisibility(View.INVISIBLE);

                pinslotfour.setVisibility(View.INVISIBLE);

                break;
            case 2:
                pinslotone.setVisibility(View.VISIBLE);

                pinslottwo.setVisibility(View.VISIBLE);

                pinslotthree.setVisibility(View.INVISIBLE);

                pinslotfour.setVisibility(View.INVISIBLE);
                break;
            case 3:
                pinslotone.setVisibility(View.VISIBLE);

                pinslottwo.setVisibility(View.VISIBLE);

                pinslotthree.setVisibility(View.VISIBLE);
                pinslotfour.setVisibility(View.INVISIBLE);

                break;
            case 4:
                pinslotone.setVisibility(View.VISIBLE);

                pinslottwo.setVisibility(View.VISIBLE);

                pinslotthree.setVisibility(View.VISIBLE);

                pinslotfour.setVisibility(View.VISIBLE);


                break;
        }
    }
    private void enterPin(TextView one) {

        String enteredPin = ssEnterdPin.getText().toString();
        enteredPin += one.getText().toString();
        ssEnterdPin.setText(enteredPin);
        ss_count++;
        counter();

        confirmPin();

    }
    private void initButtons() {



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


}