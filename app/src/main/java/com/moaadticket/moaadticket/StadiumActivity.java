package com.moaadticket.moaadticket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class StadiumActivity extends AppCompatActivity {
    private ListView LvStadium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stadium);
        LvStadium = (ListView)findViewById(R.id.LvStadium);
    }
}
