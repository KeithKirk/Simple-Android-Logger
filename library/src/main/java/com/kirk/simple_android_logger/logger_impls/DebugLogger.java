package com.kirk.simple_android_logger.logger_impls;

import com.kirk.simple_android_logger.Log;
import com.kirk.simple_android_logger.Logger;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Keith on 09/05/15.
 *
 * A Logger implementation which records all logs passed to it in  List for later analysis to allow
 * automated unit testing to examine logging facilities for correctness.
 */
public class DebugLogger implements Logger {

    private List<Log> mLogList;

    public DebugLogger(){
        mLogList = new LinkedList<Log>();
    }

    public void log(String message, String mode, Object object){
        Log log = new Log.Builder()
                .message(message)
                .mode(mode)
                .origin(object.getClass().getSimpleName())
                .build();
        mLogList.add(log);
    }

    public List<Log> getLogs(){
        return this.mLogList;
    }
}
