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
     * @param object The object from which the log originated.
     * @param mode A value to distinguish how to process the given. Mode values with each
     *             implementing class, see class documentation for options.
     * @param message The message to be logged.
     */
    public void log(Object object, String mode, String message);

    /**
     *
     *
     * @param object The object from which the log originated.
     * @param mode A value to distinguish how to process the given. Mode values with each
     *             implementing class, see class documentation for options.
     * @param format The format of the message to be logged.
     * @param args The arguments to insert into the format to complete the message.
     */
    public void logFormat(Object object, String mode, String format, Object... args);

}
