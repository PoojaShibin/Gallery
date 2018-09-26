package com.example.pm04.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ProgressBar pb;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //pb=findViewById(R.id.progress_bar);
        pb=findViewById(R.id.progress_bar);
        textview=findViewById(R.id.textView3);
        pb.setMax(100);
        pb.setScaleY(3f);
        progressAnimation();

       /* Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);*/


    }
    public void progressAnimation()
    {
        // ProgressBar amin=new ProgressBar(this,pb,textview,0f,100f);
        ProgressBarAnimation amin=new ProgressBarAnimation(this,pb,textview,0f,100f);

        amin.setDuration(8000);
        pb.setAnimation(amin);
    }
}
