package com.abc.zhorapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by wudi on 2018/4/25.
 */

public class ZhorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhor_activity_main);
        Toast.makeText(this,"zhor",Toast.LENGTH_SHORT).show();
    }
}
