package com.example.pm04.testing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends MainActivity {
    EditText e1;
    EditText e2;
    TextView tx1;
    Button b1;
    String a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        b1 = (Button)findViewById(R.id.button);
        e1 = (EditText)findViewById(R.id.editText);
        e2 = (EditText)findViewById(R.id.editText2);
        tx1 = (TextView)findViewById(R.id.textView4);
        tx1.setVisibility(View.GONE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("admin") &&
                        e2.getText().toString().equals("admin")) {
                    Intent intent=new Intent(Login.this,ListViewActivity.class);
                    startActivity(intent);



                }else{
                    Toast.makeText(getApplicationContext(),
                            "Wrong  Username or Password",Toast.LENGTH_SHORT).show();

                    tx1.setVisibility(View.VISIBLE);

                }
            }
        });
    }
}