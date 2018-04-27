package com.abc.root_router.interf;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;

import com.abc.root_router.Router;

/**
 * Created by wudi on 2018/4/25.
 */

public interface IRouter {

    void go (Activity context);

    void go (Activity context, RouterCallBack callBack);

}
