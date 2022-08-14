package com.billykybe.fitme;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Journey extends Fragment {
    RecyclerView rv_history;
    List<History_item_model> history_item_models = new ArrayList<>();
    History_item_adapter history_item_adapter;
    TextView tojourney,tv_sesh,tv_minutes,tv_calos;

    int seccions =0,minutes=0,calos=0;
    @SuppressLint("NotifyDataSetChanged")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FittMeDatabase fittMeDatabase = FittMeDatabase.getInstance(this.getContext());
        history_item_models.clear();
        history_item_models =
                fittMeDatabase.databaseDAO().getWorkoutsDoneList();


        View view = inflater.inflate(R.layout.fragment_journey, container, false);
        tv_calos = view.findViewById(R.id.calos_holder_txt);
        tv_minutes = view.findViewById(R.id.time_holder_txt);
        tv_sesh = view.findViewById(R.id.sesh_holder_txt);

//        Set vals
        seccions = history_item_models.size();
        //ToDO:Add time
        long timeInSeconds = 120;

        minutes = (int)timeInSeconds/60;
        calos = 0;
                for(int i = 0;i<= history_item_models.size()-1;i++){
                    calos+=Integer.parseInt(history_item_models.get(i).w_kcal);
                }
        tv_sesh.setText(String.valueOf(seccions));


       if (calos>999){
           int first = calos/1000;
           int second = calos%1000;
           while (second>=10){
               second/=10;
           }
            tv_calos.setText(first+"."+second+"K");


        }else {
            tv_calos.setText(String.valueOf(calos));

        }
        tv_minutes.setText(String.valueOf(minutes));

        rv_history = view.findViewById(R.id.rv_history);
        tojourney = view.findViewById(R.id.mj_textLnk);
        tojourney.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(), MyJourney.class);
            startActivity(intent);

        });



        rv_history.setLayoutManager(new LinearLayoutManager(getContext()));
        history_item_adapter = new History_item_adapter(history_item_models);
        rv_history.setAdapter(history_item_adapter);



//        Toast.makeText(this.getContext(), history_item_models.toString()  , Toast.LENGTH_SHORT).show();
        history_item_adapter.notifyDataSetChanged();

        return view;


    }


}