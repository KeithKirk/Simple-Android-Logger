package com.kirk.simple_android_logger;

/**
 * Created by Keith on 09/05/15.
 */
public class Log {

    protected String mode;
    protected String message;
    protected String origin;

    protected Log(Init<?> init){
        this.mode = init.mode;
        this.message = init.message;
        this.origin = init.origin;
    }

    public String getMode(){
        return mode;
    }

    public String getMessage(){
        return message;
    }

    public String getOrigin(){
        return origin;
    }

    protected static abstract class Init<T extends Init<T>> {

        private String mode    = "";
        private String message = "";
        private String origin  = "";

        protected abstract T self();

        public T mode(final String mode) {
            this.mode = mode;
            return self();
        }

        public T message(final String message) {
            this.message = message;
            return self();
        }

        public T origin(final String origin) {
            this.origin = origin;
            return self();
        }

        public Log build() {
            return new Log(this);
        }
    }

    public static class Builder extends Init<Builder> {
        @Override
        protected Builder self() {
            return this;
        }
    }
}
