package com.moaadticket.moaadticket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TheTicket extends AppCompatActivity {
    private TextView tvGate,tvDate,tvStadium ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_ticket);
        tvGate = (TextView)findViewById(R.id.tvGate);
        tvStadium = (TextView)findViewById(R.id.tvStadium);
        Intent intent = getIntent();

        String Display_label = intent.getStringExtra("dd");

        tvGate.setText( " the seat num is : "+Display_label);
    }
}
