package com.abc.zhorapp;


import com.abc.common.CommonApplication;
import com.abc.root_router.RouterManager;

/**
 * Created by wudi on 2018/4/23.
 */

public class ZhorApplication extends CommonApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        RouterManager.getInstance().initActivitySet(this);
    }
}
