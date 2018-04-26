package com.abc.zhorapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.abc.root_router.RouterManager;

/**
 * Created by wudi on 2018/4/25.
 */

public class ZhorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhor_activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RouterManager.getInstance().startActivity(ZhorActivity.this,"/ZhorMainActivity");
            }
        });
        findViewById(R.id.btn_tools).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RouterManager.getInstance().startActivity(ZhorActivity.this,"/ToolDemoActivity");
            }
        });
        Toast.makeText(this,"zhor",Toast.LENGTH_SHORT).show();
    }
}
