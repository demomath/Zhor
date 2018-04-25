package com.abc.root_router.interf;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;

/**
 * Created by wudi on 2018/4/25.
 */

public interface IRouter {
    /**
     * 根据path跳转
     * @param context
     * @param path
     */
    void startActivity(@NonNull Context context, @NonNull String path);

    /**
     * 根据path跳转  携带参数
     * @param context
     * @param path
     * @param bundle
     */
    void startActivity(@NonNull Context context,@NonNull String path, Bundle bundle);

    /**
     * 根据path跳转 回调监听返回值
     * @param context
     * @param path
     * @param requestCode
     */
    void startActivityForResult(@NonNull Context context, @NonNull String path,int requestCode);

    /**
     * 根据path跳转 回调监听返回值  携带参数
     * @param context
     * @param path
     * @param requestCode
     * @param bundle
     */
    void startActivityForResult(@NonNull Context context, @NonNull String path,int requestCode,Bundle bundle);
}
