package com.moaadticket.moaadticket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class TheTicket extends AppCompatActivity {
    private TextView tvGate,tvDate,tvStadium ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_ticket);
        tvGate = (TextView)findViewById(R.id.tvGate);
        tvDate = (TextView)findViewById(R.id.tvDate);
        tvStadium = (TextView)findViewById(R.id.tvStadium);
    }
}
