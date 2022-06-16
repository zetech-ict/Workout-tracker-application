package com.billykybe.fitme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class IntroFragment extends Fragment {
TextView fi_continue ,fi_text;
View view1,view2,view3;
ImageView mainImage;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_intro, container, false);

        fi_continue = view.findViewById(R.id.fi_continue);
        fi_text = view.findViewById(R.id.fi_text);
        view1 = view.findViewById(R.id.fi_dashOne);
        view2 = view.findViewById(R.id.fi_dashTwo);
        view3 = view.findViewById(R.id.fi_dashThree);
        mainImage = view.findViewById(R.id.mainimg);


        String textToShow = getArguments().getString("massage");
        fi_text.setText(textToShow);

        fi_continue.setOnClickListener(view1 -> {


        });





        return view ;
    }
}