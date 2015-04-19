package com.kirk.simple_android_logger;

import android.content.Context;

/**
 * Created by Keith on 29/11/14.
 *
 * A factory object to return implementations of Logger.
 */
public class LoggerFactory {

    public static final int NULL_LOGGER = 0;
    public static final int LOGCAT_LOGGER = 1;

    /**
     * Returns a Logger implementation based on a given product id.
     * Current Products are:
     * <li> 0 = Null Logger
     * <li> 1 = Logcat Logger
     * Values outside this range will return a null Logger.
     *
     * @param id The id of the desired Logger implementation.
     * @param context The current Application Context.
     * @return The desired Logger implementation or a Null Logger if an invalid id was passed.
     */
    public static Logger getLogger(Context context, int id){
        switch(id){
            case NULL_LOGGER:
                return new NullLogger();
            case LOGCAT_LOGGER:
                return new LogcatLogger();
            default:
                return new NullLogger();
        }
    }
}
