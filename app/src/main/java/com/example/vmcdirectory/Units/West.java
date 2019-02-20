package com.example.vmcdirectory.Units;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vmcdirectory.R;

import com.example.vmcdirectory.Units.west.west1;

public class West extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west);

        Button westbtn = (Button)findViewById(R.id.west1btn);
        westbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), west1.class);

                startActivity(startIntent);

            }});


    }
}
