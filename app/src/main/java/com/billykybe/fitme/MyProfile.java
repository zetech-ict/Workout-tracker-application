package com.billykybe.fitme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class MyProfile extends Fragment {
    View editProfile, notification, security, help, logout,closeLogout,closeLogoutCard,customDialog;
TextView yesLogout,noLogout;

    View toGame,shareholder;

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
        closeLogout = view.findViewById(R.id.logout_holder_backcard);
        closeLogoutCard = view.findViewById(R.id.logout_holder_card);
        customDialog = view.findViewById(R.id.customdialogLogout);
        yesLogout = view.findViewById(R.id.yesBtn);
        noLogout = view.findViewById(R.id.noBtn);
        shareholder = view.findViewById(R.id.shareholder);



        yesLogout.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),MainActivity.class);
            intent.putExtra("toOnboard",3);
            startActivity(intent);

            //TODO:Database reset here
            getActivity().finish();
            System.exit(0);

        });
        noLogout.setOnClickListener(view1 -> {

            closeLogout.setVisibility(View.GONE);
            closeLogoutCard.setVisibility(View.GONE);
            customDialog.setVisibility(View.GONE);
        });
closeLogout.setOnClickListener(view1 -> {
    closeLogout.setVisibility(View.GONE);
    closeLogoutCard.setVisibility(View.GONE);
    customDialog.setVisibility(View.GONE);

});

        editProfile.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),EditProfile.class);
            startActivity(intent);

        });


        notification.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),NottificationSettings.class);
            startActivity(intent);

        });



        shareholder.setOnClickListener(view1 -> {


            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,"FitMe Workout Tracker");
            intent.putExtra(Intent.EXTRA_TEXT,"Hey check out our app at : https://play.google.com/store/apps/details?1d="+BuildConfig.APPLICATION_ID);

            startActivity(intent);

        });


        security.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),SecuritySettings.class);
            startActivity(intent);

        });


        help.setOnClickListener(view1 -> {



            Intent mailhelp = new Intent(Intent.ACTION_VIEW);
            Uri data = Uri.parse("mailto:?subject="+"FitMe Development"+"&body="+"Hey! will respond as soon as possible"+"&to="+"billykybe@gmail.com");
            mailhelp.setData(data);
            startActivity(Intent.createChooser(mailhelp,"Send mail..."));
        });


        logout.setOnClickListener(view1 -> {

            closeLogout.setVisibility(View.VISIBLE);
            closeLogoutCard.setVisibility(View.VISIBLE);
            customDialog.setVisibility(View.VISIBLE);


        });

        toGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MyJourney.class);
                startActivity(intent);

            }
        });
        return view;
    }
}