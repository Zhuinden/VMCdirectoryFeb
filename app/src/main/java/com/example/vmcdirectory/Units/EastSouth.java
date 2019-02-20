package com.example.vmcdirectory.Units;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.vmcdirectory.R;

import com.example.vmcdirectory.Units.eastsouth.east2;
import com.example.vmcdirectory.Units.eastsouth.east3;
import com.example.vmcdirectory.Units.eastsouth.south1;
import com.example.vmcdirectory.Units.eastsouth.south2;
import com.example.vmcdirectory.Units.eastsouth.south3;

public class EastSouth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_east_south);

        Button eastsouthbtn = (Button)findViewById(R.id.south1btn);
        eastsouthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), south1.class);

                startActivity(startIntent);

            }});


        eastsouthbtn = (Button) findViewById(R.id.south2btn);
        eastsouthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), south2.class);

                startActivity(startIntent);

            }});

        eastsouthbtn = (Button) findViewById(R.id.south3btn);
        eastsouthbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), south3.class);

                startActivity(startIntent);

             }});

        eastsouthbtn = (Button) findViewById(R.id.east2btn);
        eastsouthbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                  Intent startIntent = new Intent(getApplicationContext(), east2.class);

                  startActivity(startIntent);

             }});

        eastsouthbtn = (Button) findViewById(R.id.east3btn);
        eastsouthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), east3.class);

                startActivity(startIntent);

            }});



            }
        }