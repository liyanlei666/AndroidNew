package com.liyanlei.library.base;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.umeng.analytics.MobclickAgent;

/**
 * Created by lyl on 2016/4/19.
 */
public class BaseApplication extends Application {

    private static int appCount = 0;

    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            }

            @Override
            public void onActivityStarted(Activity activity) {
                appCount++;
            }

            @Override
            public void onActivityResumed(Activity activity) {
                MobclickAgent.onPageStart(activity.getClass().getSimpleName());
                MobclickAgent.onResume(activity);
            }

            @Override
            public void onActivityPaused(Activity activity) {
                MobclickAgent.onPageEnd(activity.getClass().getSimpleName());
                MobclickAgent.onPause(activity);
            }

            @Override
            public void onActivityStopped(Activity activity) {
                appCount--;
            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }

    public int getAppCount() {
        return appCount;
    }

    public void setAppCount(int appCount) {
        this.appCount = appCount;
    }
}
