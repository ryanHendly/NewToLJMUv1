package com.example.ryan.newtoljmuv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.example.ryan.newtoljmuv1.R.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(id.toolbar);
        setSupportActionBar(toolbar);


        // Create instances for each button in the main menu
        ImageButton btn = (ImageButton) findViewById(id.imageButton);
        ImageButton btn2 = (ImageButton) findViewById(id.imageButton2);
        ImageButton btn3 = (ImageButton) findViewById(id.imageButton3);
        ImageButton btn4 = (ImageButton) findViewById(id.imageButton4);
        ImageButton btn5 = (ImageButton) findViewById(id.imageButton5);
        ImageButton btn6 = (ImageButton) findViewById(id.imageButton6);
        ImageButton btn7 = (ImageButton) findViewById(id.imageButton7);
        ImageButton btn8 = (ImageButton) findViewById(id.imageButton8);
        Button logout = (Button) findViewById(id.button3);


        // Set which page each button should be linked to
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, CampusActivity.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, BarsActivity.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, EventsActivity.class));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, GymsActivity.class));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, ClubActivity.class));
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, RestaurantActivity.class));
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, TouristActivity.class));
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, WildCardActivity.class));
            }
        });

        logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

    }

}
