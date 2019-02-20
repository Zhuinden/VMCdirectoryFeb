package com.example.vmcdirectory.Units;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vmcdirectory.R;
import com.example.vmcdirectory.Units.north.micu;
import com.example.vmcdirectory.Units.north.miu;
import com.example.vmcdirectory.Units.north.nsicu;
import com.example.vmcdirectory.Units.north.nsiu;
import com.example.vmcdirectory.Units.north.sicu;
import com.example.vmcdirectory.Units.north.siu;

public class North extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north);

        Button northbtn = (Button)findViewById(R.id.micubtn);
        northbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), micu.class);

                startActivity(startIntent);

            }});

        northbtn = (Button)findViewById(R.id.miubtn);
        northbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), miu.class);

                startActivity(startIntent);

            }});

        northbtn = (Button)findViewById(R.id.nsicubtn);
        northbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), nsicu.class);

                startActivity(startIntent);

            }});


        northbtn = (Button)findViewById(R.id.nsiubtn);
        northbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), nsiu.class);

                startActivity(startIntent);

            }});

        northbtn = (Button)findViewById(R.id.sicubtn);
        northbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), sicu.class);

                startActivity(startIntent);

            }});


        northbtn = (Button)findViewById(R.id.siubtn);
        northbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), siu.class);

                startActivity(startIntent);

            }});
    }
}
