package com.example.pm04.testing;

import android.content.Context;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import android.widget.TextView;

class ProgressBarAnimation  extends Animation {
    private Context context;
    private ProgressBar pb;
    private TextView textview;
    private float from;
    private float to;


    public ProgressBarAnimation(Context context,ProgressBar pb,TextView textview,float from ,float to)
    {
        this.context=context;
        this.textview=textview;
        this.pb=pb;
        this.from=from;
        this.to=to;


    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float value = from + (to - from) * interpolatedTime;
        pb.setProgress((int) value);
        textview.setText((int) value+" %");


        if (value == to) {
            context.startActivity(new Intent(context, Login.class));
        }
    }

}
