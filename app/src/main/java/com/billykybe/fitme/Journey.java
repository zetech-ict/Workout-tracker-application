package com.billykybe.fitme;

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
import java.util.List;

public class Journey extends Fragment {
    RecyclerView rv_history;
    List<History_item_model> history_item_models = new ArrayList<>();
    History_item_adapter history_item_adapter;
    TextView tojourney;
    private static final int ADD_COURSE_REQUEST = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_journey, container, false);


        rv_history = view.findViewById(R.id.rv_history);
        tojourney = view.findViewById(R.id.mj_textLnk);
        tojourney.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(), MyJourney.class);
            startActivity(intent);

        });


        rv_history.setLayoutManager(new LinearLayoutManager(getContext()));
        history_item_adapter = new History_item_adapter(history_item_models);
        rv_history.setAdapter(history_item_adapter);

FittMeDatabase fittMeDatabase = FittMeDatabase.getInstance(this.getContext());
history_item_models =
fittMeDatabase.databaseDAO().getWorkoutsDoneList();

        history_item_adapter.notifyDataSetChanged();
        return view;


    }


}