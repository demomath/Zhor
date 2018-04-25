package com.abc.thor_home;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class ZhorHomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhor_home_activity_home);
        Toast.makeText(this,"Home",Toast.LENGTH_SHORT).show();
    }
}
