package com.android.internshipprogram.ui.home;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.android.internshipprogram.R;

class HomeViewPagerAdapter extends PagerAdapter {
    HomeModel[] images;
    Context context;
    HomeViewPagerAdapter(HomeModel[] images, Context context)
    {
        this.images=images;
        this.context=context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.view_pager_item,container,false);

        ImageView imageView=view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position].imageRes);
        TextView textView=(TextView)view.findViewById(R.id.textView);
        textView.setText(images[position].text);


        container.addView(view,0);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}