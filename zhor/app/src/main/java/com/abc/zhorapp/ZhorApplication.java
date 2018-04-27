package com.abc.zhorapp;


import com.abc.root_router.RouterManager;

import android.app.Application;
import android.net.Uri;

import java.util.List;

/**
 * Created by wudi on 2018/4/23.
 */

public class ZhorApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //初始化路由哈希集合
        List<Uri> init = RouterManager.getInstance().init(this);
    }
}
