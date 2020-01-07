package com.example.ryan.newtoljmuv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CampusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus);

        ImageButton btn = (ImageButton) findViewById(R.id.imageButton9);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(CampusActivity.this, CityCampus.class));
            }
        });

        ImageButton btn2 = (ImageButton) findViewById(R.id.imageButton10);

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(CampusActivity.this, PleasantCampus.class));
            }
        });

        ImageButton btn3 = (ImageButton) findViewById(R.id.imageButton11);

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(CampusActivity.this, MarshCampus.class));
            }
        });
    }
}
