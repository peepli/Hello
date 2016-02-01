package com.example.vandana.intent2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

    }


    public void initialize()
    {

        b1= (Button) findViewById(R.id.button);
        b2= (Button) findViewById(R.id.button2);
        b3= (Button) findViewById(R.id.button3);


    }

    @Override
    public void onClick(View v) {
        if(v==b1)
        {
            Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("www.google.com"));
            startActivity(i);


        }
        if(v==b2)
        {
            Intent i1=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:9695719649"));
            startActivity(i1);

        }

        if(v==b3)
        {
Intent i2=new Intent(Intent.ACTION_CALL, Uri.parse("tel:9695719649"));
            startActivity(i2);
        }


    }
}
