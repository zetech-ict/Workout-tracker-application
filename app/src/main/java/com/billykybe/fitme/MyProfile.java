package com.billykybe.fitme;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class MyProfile extends Fragment {
    View editProfile, notification, security, help, logout;

    View toGame;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_profile, container, false);
        toGame = view.findViewById(R.id.game_mode);
        editProfile = view.findViewById(R.id.editprofile_holder);
        notification = view.findViewById(R.id.nottification_holder);
        security = view.findViewById(R.id.security_holder);
        help = view.findViewById(R.id.help_holder);
        logout = view.findViewById(R.id.logout_holder);


        editProfile.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),EditProfile.class);
            startActivity(intent);

        });


        notification.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),NottificationSettings.class);
            startActivity(intent);

        });


        security.setOnClickListener(view1 -> {
//            Intent intent = new Intent(getActivity(),EditProfile.class);
//            startActivity(intent);
            //TODO: security screen

        });


        help.setOnClickListener(view1 -> {
//            Intent intent = new Intent(getActivity(),EditProfile.class);
//            startActivity(intent);
            //TODO:add help screen

        });


        logout.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),LetsYouIn.class);
            startActivity(intent);
// TODO: finish this fragment
        });

        toGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), JourneyAct.class);
                startActivity(intent);

            }
        });
        return view;
    }
}