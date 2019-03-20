package com.moaadticket.moaadticket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AddDatesMatches extends AppCompatActivity {
    private EditText edtDate ,edtTime ,edtMatch;
    private TextView tvDate ,tvTime, tvMatch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dates_matches);

        edtDate = (EditText)findViewById(R.id.edtDate);
        edtTime = (EditText)findViewById(R.id.edtTime);
        edtMatch = (EditText)findViewById(R.id.edtMatch);

        tvDate=(TextView) findViewById(R.id.tvDate);
        tvTime=(TextView) findViewById(R.id.tvTime);
        tvMatch=(TextView) findViewById(R.id.tvMatch);


    }

    public void Details(){

        edtDate.getText();
        edtTime.getText();
        edtMatch.getText();
    }

}
