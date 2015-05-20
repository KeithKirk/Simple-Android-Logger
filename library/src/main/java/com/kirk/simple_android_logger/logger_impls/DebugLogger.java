package com.kirk.simple_android_logger.logger_impls;

import com.kirk.simple_android_logger.Log;
import com.kirk.simple_android_logger.Logger;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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

    @Override
    public void log(Object object, String mode, String message){
        Log log = new Log.Builder()
                .message(message)
                .mode(mode)
                .origin(object.getClass().getSimpleName())
                .build();
        mLogList.add(log);
    }

    @Override
    public void logFormat(Object object, String mode, String format, Object... args){
        log(object, mode, String.format(format, args));
    }

    public List<Log> getLogs() {
        return this.mLogList;
    }

    public List<Log> getFilteredLogs(Set<String> filters) {
        List<Log> returnList = new LinkedList<Log>();
        for (Log currentLog: this.mLogList){
            if (filters.contains(currentLog.getMode())){
                returnList.add(currentLog);
            }
        }
        return returnList;
    }
}
