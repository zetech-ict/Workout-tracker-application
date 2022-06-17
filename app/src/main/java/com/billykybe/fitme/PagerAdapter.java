package com.billykybe.fitme;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class PagerAdapter extends androidx.viewpager.widget.PagerAdapter {

    Context context;
    int images[];
    String titles[];

    PagerAdapter(Context context, int images[], String titles[]){
        this.context = context;
        this.images = images;
        this.titles = titles;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((RelativeLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View item = LayoutInflater.from(container.getContext()).inflate(R.layout.item_slider, container, false);
        ImageView imageView = item.findViewById(R.id.mainimg);
        TextView textView = item.findViewById(R.id.fi_text);

        imageView.setImageResource(images[position]);
        textView.setText(titles[position]);
        container.addView(item);

        return item;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout) object);
    }
}
