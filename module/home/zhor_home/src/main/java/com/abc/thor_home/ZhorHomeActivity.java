package com.abc.thor_home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.abc.base.rxtools.view.RxToast;
import com.abc.root_router.annotation.RouterAction;

@RouterAction(path = "/ZhorHomeActivity")
public class ZhorHomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhor_home_activity_home);
        RxToast.info(this,"HOME", Toast.LENGTH_SHORT,true).show();
    }
}
