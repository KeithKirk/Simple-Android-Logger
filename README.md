# Simple-Android-Logger
A lightweight logging framework for Android applications.

This library is intended to be included in android projects as a module in Android studio.

The framework is built around the Logger interface which individual Logging classes must implement and the LoggerFactory which returns concrete implementations of Loggers based on the passed product id.

Using this framework a project can easily be swapped from a debug logging mode to a production logging mode. This is best accomplished by using an integer resource to represent the required logging mode, activities can then create an instance of Logger using this resource and pass this instance of Logger to other components that require the ability to Log.
