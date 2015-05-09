package com.kirk.simple_android_logger.logger_impls;

import com.kirk.simple_android_logger.Logger;

/**
 * Created by Keith on 29/11/14.
 *
 * A Logger implementation which does not output any messages passed to it.
 */
public class NullLogger implements Logger {

    @Override
    public void log(String message, String mode, Object object){

    }
}