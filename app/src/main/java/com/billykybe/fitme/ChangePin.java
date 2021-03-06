package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ChangePin extends AppCompatActivity {
    TextView ssEnterdPin,one,two,three,four,five,six,seven,eight,nine,zero,changePinBtn;
    View pinslotone,pinslottwo,pinslotthree,pinslotfour,pincover,keyboard,passHolder;
    int ss_count = 0;
    ImageView backIc,cp_backBtn;
    boolean allowAccesss = false;
    String oldPin="1234",newPin,tempPin;

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



            if (ssEnterdPin.getText().toString().equals("1234")) {



                allowAccesss = true;
                checkAllow();
            } else {
                //todo:// failed animation



                ss_count = 0;
                counter();
                ssEnterdPin.setText("");

            }




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