package com.abc.root_router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.abc.core.utils.LogUtil;
import com.abc.root_router.annotation.RouterAction;
import com.abc.root_router.exception.PathNullException;
import com.abc.root_router.interf.IRouter;

import java.util.Enumeration;
import java.util.HashSet;

import dalvik.system.DexFile;

/**
 * Created by wudi on 2018/4/25.
 * 路由控制
 */

public class RouterManager implements IRouter {

    private volatile static RouterManager sRouterManager;

    private HashSet<Uri> mSet = new HashSet();

    private RouterManager() {}

    public static RouterManager getInstance () {
        if (sRouterManager == null) {
            synchronized (RouterManager.class) {
                if (sRouterManager == null) {
                    sRouterManager = new RouterManager();
                }
            }
        }
        return sRouterManager;
    }

    public void initActivitySet (Context context) {
        try {
            //通过资源路径获得DexFile
            DexFile e = new DexFile(context.getPackageResourcePath());
            Enumeration entries = e.entries();
            //遍历所有元素
            while(entries.hasMoreElements()) {
                String entryName = (String)entries.nextElement();
                //匹配Activity包名与类名
                if(entryName.contains("Activity")) {
                    //通过反射获得Activity类
                    Class entryClass = Class.forName(entryName);
                    if(entryClass.isAnnotationPresent(RouterAction.class)) {
                        RouterAction action = (RouterAction)entryClass.getAnnotation(RouterAction.class);

                        String from = action.from();

                        String scheme = action.scheme();
                        String host = action.host();
                        String path = action.path();
                        if (TextUtils.isEmpty(path)) {
                            LogUtil.e(entryName+"don't has path",new PathNullException());
                            continue;
                        }
                        String uriStr = scheme+"://"+host+path;
                        this.mSet.add(Uri.parse(uriStr));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void startActivity(@NonNull Context context,@NonNull String path) {
        for (Uri uri : mSet) {
            if ( uri != null && uri.getPath().equals(path)) {
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                context.startActivity(intent);
                break;
            }
        }
    }

    @Override
    public void startActivity(@NonNull Context context,@NonNull String path, Bundle bundle) {
        for (Uri uri : mSet) {
            if ( uri != null && uri.getPath().equals(path)) {
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                context.startActivity(intent,bundle);
                break;
            }
        }
    }

    @Override
    public void startActivityForResult(@NonNull Context context, @NonNull String path,int requestCode) {
        Activity activity;
        try {
            activity = (Activity) context;
        } catch (Exception e) {
            LogUtil.e("param context should be activity's context",e);
            return;
        }
        for (Uri uri : mSet) {
            if ( uri != null && uri.getPath().equals(path)) {
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                activity.startActivityForResult(intent,requestCode);
                break;
            }
        }
    }

    @Override
    public void startActivityForResult(@NonNull Context context, @NonNull String path,int requestCode,Bundle bundle) {
        Activity activity;
        try {
            activity = (Activity) context;
        } catch (Exception e) {
            LogUtil.e("param context should be activity's context",e);
            return;
        }
        for (Uri uri : mSet) {
            if ( uri != null && uri.getPath().equals(path)) {
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                activity.startActivityForResult(intent,requestCode,bundle);
                break;
            }
        }
    }

}
