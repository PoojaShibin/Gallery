package com.example.pm04.testing;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

class ImageAdapter extends BaseAdapter {
    private Context context;

    public Integer[] images = {
            R.drawable.a,
            R.drawable.d,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.j,
            R.drawable.k,
            R.drawable.kl,
            R.drawable.s,
            R.drawable.i,
            R.drawable.o,
            R.drawable.p,
            R.drawable.q,
            R.drawable.r,
            R.drawable.t,
            R.drawable.u,
            R.drawable.w,
            R.drawable.y,
            R.drawable.l1,
            R.drawable.l2,
            R.drawable.l3,
            R.drawable.l4,
            R.drawable.l5,
            R.drawable.l6,

    };

    public ImageAdapter(Context c)
    {
        context =c;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(240,240));
        return imageView;
    }
}
