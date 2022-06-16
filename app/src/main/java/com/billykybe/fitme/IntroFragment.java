package com.billykybe.fitme;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
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


        transparentStatusAndNavigation();

        return view ;
    }





    private void transparentStatusAndNavigation() {
        //make full transparent statusBar
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    , true);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

            );
        }
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,true);
            getWindow().setStatusBarColor(Color.TRANSPARENT);

        }
    }

    private Window getWindow() {
return  getActivity().getWindow();
    }

    private void setWindowFlag(final int bits, boolean on) {
        Window win = getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }
}