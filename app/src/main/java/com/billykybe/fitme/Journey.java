package com.billykybe.fitme;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import com.billykybe.fitme.database.FitMeDatabase;

import java.util.ArrayList;
import java.util.List;

public class Journey extends Fragment {
    RecyclerView rv_history;
    List<History_item_model> history_item_models = new ArrayList<>();
    History_item_adapter history_item_adapter;
    TextView tojourney;

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


        FitMeDatabase fitMeDatabase = Room.databaseBuilder(requireContext()
                        , FitMeDatabase.class, "workouts_done")
                .build();
        history_item_models = fitMeDatabase.doneWorkoutsDAO().getAll();


        rv_history.setLayoutManager(new LinearLayoutManager(getContext()));
        history_item_adapter = new History_item_adapter(history_item_models);
        rv_history.setAdapter(history_item_adapter);


        history_item_adapter.notifyDataSetChanged();
        return view;


    }
}