package com.kirk.simple_android_logger;

/**
 * Created by Keith on 29/11/14.
 *
 * An interface to be implemented by classes intended for logging purposes.
 */
public interface Logger {

    /**
     * Process the given message and log appropriately.
     *
     * @param message The message to be logged
     * @param mode A value to distinguish how to process the given. Mode values with each
     *             implementing class, see class documentation for options.
     * @param object The object from which the log originated.
     */
    public void log(String message, String mode, Object object);

}
