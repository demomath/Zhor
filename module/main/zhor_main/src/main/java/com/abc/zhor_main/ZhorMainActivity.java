package com.abc.zhor_main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.abc.root_router.annotation.RouterAction;

@RouterAction(path = "/ZhorMainActivity")
public class ZhorMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhor_main_activity_main);
        Toast.makeText(this,"Main",Toast.LENGTH_SHORT).show();
    }
}
