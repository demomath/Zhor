package com.abc.base;

import android.app.Activity;
import android.os.Bundle;

public class CoreActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core);
    }
}
