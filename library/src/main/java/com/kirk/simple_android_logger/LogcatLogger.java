package com.kirk.simple_android_logger;

import android.util.Log;

/**
 * Created by Keith on 29/11/14.
 *
 * A Logger implementation which outputs messages to Android Logcat. Mode represents the log level,
 * levels are:
 * <li> v = verbose
 * <li> d = debug
 * <li> i = info
 * <li> w = warn
 * <li> e = error
 * Values outside this range are ignored.
 */
public class LogcatLogger implements Logger {

    @Override
    public void log(String message, String mode, Object object){
        String tag = object.getClass().getSimpleName();
        if (mode.equals("v")){
            Log.v(tag, message);
        }
        if (mode.equals("d")){
            Log.d(tag, message);
        }
        if (mode.equals("i")){
            Log.i(tag, message);
        }
        if (mode.equals("w")){
            Log.w(tag, message);
        }
        if (mode.equals("e")){
            Log.e(tag, message);
        }
    }
}
