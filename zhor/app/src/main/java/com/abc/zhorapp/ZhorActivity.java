package com.abc.zhorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.abc.root_router.Router;

/**
 * Created by wudi on 2018/4/25.
 * 壳工程首页
 */
public class ZhorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhor_activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Router.build("/ZhorMainActivity")
                        .go(ZhorActivity.this);
            }
        });
        findViewById(R.id.btn_tools).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Router.build("/ZHorMaity")
                        .go(ZhorActivity.this);

            }
        });
        Toast.makeText(this,"zhor",Toast.LENGTH_SHORT).show();
    }
}
