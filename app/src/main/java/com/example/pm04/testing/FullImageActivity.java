package com.example.pm04.testing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.chrisbanes.photoview.PhotoView;

public class FullImageActivity  extends AppCompatActivity
{
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);
        b1=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FullImageActivity.this, Gallery.class));
            }
        });
        Intent i = getIntent();
        int position=i.getExtras().getInt("id");
        ImageAdapter adapter = new ImageAdapter(this);


        PhotoView imageView=(PhotoView) findViewById(R.id.imageView);
        imageView.setImageResource(adapter.images[position]);


    }
}