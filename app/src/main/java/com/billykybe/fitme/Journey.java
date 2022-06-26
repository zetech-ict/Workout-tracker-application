package com.billykybe.fitme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Journey extends Fragment {
    RecyclerView rv_history;
    List<History_item_model> history_item_models = new ArrayList<>();
    History_item_adapter history_item_adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_journey, container, false);


        rv_history = (RecyclerView) view.findViewById(R.id.rv_history);


        rv_history.setLayoutManager(new LinearLayoutManager(getContext()));
        history_item_adapter = new History_item_adapter(history_item_models);
        rv_history.setAdapter(history_item_adapter);

        history_item_models.add(new History_item_model(R.drawable.ic_chest, "ABS ADVANCED", "2:45","234","May 25, 10:25PM"));
        history_item_models.add(new History_item_model(R.drawable.ic_arm, "CHEST ADVANCED", "2:45","234","May 25, 10:25PM"));
        history_item_models.add(new History_item_model(R.drawable.ic_leg, "FULL BODY ADVANCED", "2:45","234","May 25, 10:25PM"));
        history_item_models.add(new History_item_model(R.drawable.ic_abs, "ABS INTERMEDIATE", "2:45","234","May 25, 10:25PM"));
        history_item_models.add(new History_item_model(R.drawable.ic_chest, "FULL BODY BEGGINERS", "2:45","234","May 25, 10:25PM"));
        history_item_models.add(new History_item_model(R.drawable.ic_abs, "ABS INTERMEDIATE", "2:45","234","May 25, 10:25PM"));

        history_item_adapter.notifyDataSetChanged();
        return  view;


    }
}