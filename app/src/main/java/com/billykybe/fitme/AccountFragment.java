package com.billykybe.fitme;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class AccountFragment extends Fragment {
    TextView mj_textLnk;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_account, container, false);

       mj_textLnk = view.findViewById(R.id.mj_textLnk);

       mj_textLnk.setOnClickListener(view1 -> {
           Intent toJourney = new Intent(getActivity(),MyJourney.class);
           startActivity(toJourney);
       });


        return view;
    }
}