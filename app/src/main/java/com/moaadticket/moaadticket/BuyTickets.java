package com.moaadticket.moaadticket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class BuyTickets extends AppCompatActivity {
    private EditText et;
    private EditText et2;
    private EditText etEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_tickets);
        et = (EditText)findViewById(R.id.et);
        et2 = (EditText)findViewById(R.id.et2);
        etEmail = (EditText)findViewById(R.id.etEmail);

    }
}
