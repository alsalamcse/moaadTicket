package com.moaadticket.moaadticket;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BuyTickets extends AppCompatActivity {
    private EditText et;
    private TextView tvPrice;
    private EditText etEmail;
    private Button btnNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_tickets);
        et = (EditText)findViewById(R.id.et);
        tvPrice = (TextView) findViewById(R.id.tvPrice);
        etEmail = (EditText)findViewById(R.id.etEmail);
        btnNow = (Button) findViewById(R.id.btnNow);
        btnNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toTheTicket=new Intent(BuyTickets.this,TheTicket.class);
                startActivity(toTheTicket);
            }
        });

    }
}
