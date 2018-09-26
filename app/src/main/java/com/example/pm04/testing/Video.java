package com.example.pm04.testing;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends  ListViewActivity {
    MediaController media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);
/*  b1=(Button)findViewById(R.id.button2);
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
        imageView.setImageResource(adapter.images[position]); */
        Button buttonPlayvideo2=(Button)findViewById(R.id.button1);
        getWindow().setFormat(PixelFormat.UNKNOWN);
        VideoView myVideoView2=(VideoView)findViewById(R.id.videoView1);
        media=new MediaController(this);
        /*Intent i = getIntent();
        int position=i.getExtras().getInt("id");
        String urlPath2="";
        if(position == 0)
        {
             urlPath2="android.resource://com.example.pm04.gallery/"+ R.raw.sa;
        }
        else if(position==1)
        {
            urlPath2="android.resource://com.example.pm04.gallery/"+R.raw.ar;
        }
        else if(position==2)
        {
             urlPath2="android.resource://com.example.pm04.gallery/"+R.raw.e1;
        }
        else if(position==3)
        {
             urlPath2="android.resource://com.example.pm04.gallery/"+R.raw.e6;
        }
        else if(position==4)
        {
           urlPath2="android.resource://com.example.pm04.gallery/"+R.raw.e7;
        }
        else if(position==5)
        {
            urlPath2="android.resource://com.example.pm04.gallery/"+R.raw.e4;
        }
        else if(position==6)
        {
            urlPath2="android.resource://com.example.pm04.gallery/"+R.raw.e2;
        }
        else if(position==7)
        {
             urlPath2="android.resource://com.example.pm04.gallery/"+R.raw.e1;
        }*/
        String urlPath2="android.resource://com.example.pm04.testing/"+ R.raw.sa;
        Uri uri2=Uri.parse(urlPath2);
        myVideoView2.setVideoURI(uri2);
        myVideoView2.setMediaController(media);
        media.setAnchorView(myVideoView2);


        buttonPlayvideo2.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                VideoView mVideoView2=(VideoView)findViewById(R.id.videoView1);
                String uriPath ="android.resource://com.example.pm04.testing/"+R.raw.sa;
                Uri uri2=Uri.parse(uriPath);
                mVideoView2.setVideoURI(uri2);
                mVideoView2.requestFocus();
                mVideoView2.start();
            }
        });

    }
}
