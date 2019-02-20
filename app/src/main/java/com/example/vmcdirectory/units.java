package com.example.vmcdirectory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vmcdirectory.Units.EastSouth;
import com.example.vmcdirectory.Units.North;
import com.example.vmcdirectory.Units.West;

public class units extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units);

        Button unitsbtn = (Button)findViewById(R.id.eastsouthbtn);
        unitsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), EastSouth.class);

                startActivity(startIntent);

            }});

        unitsbtn = (Button) findViewById(R.id.northbtn);
        unitsbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                 Intent startIntent = new Intent(getApplicationContext(), North.class);

                 startActivity(startIntent);

             }});

        unitsbtn = (Button) findViewById(R.id.westbtn);
        unitsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), West.class);

                startActivity(startIntent);

            }});

            }
        }
