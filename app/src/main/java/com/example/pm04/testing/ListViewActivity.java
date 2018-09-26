package com.example.pm04.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends  Login {
    ListView lst;
    AdapterView adapter;
    String[] fruitname={"Gallery","Video"};
    String[] desc={"This is Gallery section","This is Video section"};
    Integer[] imgid={R.drawable.ll,R.drawable.vv};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        lst=(ListView)findViewById(R.id.listview);
        CustomListView customListview=new CustomListView(this,fruitname,desc,imgid);
        lst.setAdapter(customListview);


        lst.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String cities = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(ListViewActivity.this, cities, Toast.LENGTH_LONG).show();

                        if (position == 0) {
                            //code specific to first list item

                            Intent intent=new Intent(ListViewActivity.this,Gallery.class);
                            startActivity(intent);

                        }
                        else if (position == 1) {
                            //code specific to second list item
                            Intent intent=new Intent(ListViewActivity.this,Video.class);
                            startActivity(intent);



                        }
                    }


                });
        /*new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                String cities = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(ListViewActivity.this, cities, Toast.LENGTH_LONG).show();

                if (position == 1)
                {
                    //code specific to first list item
                    Intent myIntent = new Intent(view.getContext(), Gall.class);
                    startActivityForResult(myIntent, 0);


                }
                else
                    {
                    //code specific to first list item
                    Intent myIntent = new Intent(view.getContext(), Video.class);
                    startActivityForResult(myIntent, 0);


                }
            }




};*/
    }
}

