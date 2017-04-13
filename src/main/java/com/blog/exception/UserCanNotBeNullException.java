package com.blog.exception;

/**
 * Created by Snail Q
 * Date 2017/4/13.
 * Time 14:10
 */
public class UserCanNotBeNullException extends Exception {
    public UserCanNotBeNullException(String message) {
        super(message);
    }

    public UserCanNotBeNullException(String message, Throwable cause) {
        super(message, cause);
    }
}
