package com.moaadticket.moaadticket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class matches_date extends AppCompatActivity {
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches_date);
        lv1 = (ListView)findViewById(R.id.lv1);

    }
}
