package com.blog.exception;

/**
 * Created by Snail Q
 * Date 2017/4/13.
 * Time 14:33
 */
public class OtherThingsException extends Exception {
    public OtherThingsException(String message) {
        super(message);
    }

    public OtherThingsException(Throwable cause) {
        super(cause);
    }

    public OtherThingsException(String message, Throwable cause) {
        super(message, cause);
    }
}
