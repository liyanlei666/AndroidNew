package com.liyanlei.library.utils;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

/**
 * Created by liyanlei on 2016/4/19.
 */
public class LogUtil {

    public static void init() {
        Logger.init("LogUtil").logLevel(LogLevel.FULL);
    }

    public static void d(String tag, Object... obj) {
        try {
            Logger.d(tag, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void i(String tag, Object... obj) {
        try {
            Logger.i(tag, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void w(String tag, Object... obj) {
        try {
            Logger.w(tag, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void e(String tag, Object... obj) {
        try {
            Logger.e(tag, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void v(String tag, Object... obj) {
        try {
            Logger.v(tag, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void json(Object obj) {
        try {
            Logger.json(obj.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void xml(Object obj) {
        try {
            Logger.xml(obj.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void stack() {
        Thread.dumpStack();
    }
}
