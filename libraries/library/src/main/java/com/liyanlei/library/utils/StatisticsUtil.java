package com.liyanlei.library.utils;

import android.content.Context;

import com.umeng.analytics.MobclickAgent;

/**
 * Created by lyl on 2016/4/19.
 */
public class StatisticsUtil {

    private static final String TAG = StatisticsUtil.class.getSimpleName();

    public static void onResume(Context context) {
        MobclickAgent.onPageStart(context.getClass().getSimpleName());
        MobclickAgent.onResume(context);
        LogUtil.d(TAG, context.getClass().getSimpleName());
    }

    public static void onPause(Context context) {
        MobclickAgent.onPageEnd(context.getClass().getSimpleName());
        MobclickAgent.onPause(context);
        LogUtil.d(TAG, context.getClass().getSimpleName());
    }
}
