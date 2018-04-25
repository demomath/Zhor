package com.abc.zhor_main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ZhorMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhor_main_activity_main);
        Toast.makeText(this,"main",Toast.LENGTH_SHORT).show();
    }
}
