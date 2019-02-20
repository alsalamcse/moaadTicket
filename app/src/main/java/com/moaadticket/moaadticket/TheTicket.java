package com.moaadticket.moaadticket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class TheTicket extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private EditText et3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_ticket);
        et1 = (EditText)findViewById(R.id.et2);
        et2 = (EditText)findViewById(R.id.et2);
        et3 = (EditText)findViewById(R.id.et2);

    }
}
