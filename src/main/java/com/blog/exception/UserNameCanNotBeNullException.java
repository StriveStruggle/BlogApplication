package com.blog.exception;

/**
 * Created by Snail Q
 * Date 2017/4/13.
 * Time 14:15
 */
public class UserNameCanNotBeNullException extends Exception {
    public UserNameCanNotBeNullException(String message) {
        super(message);
    }

    public UserNameCanNotBeNullException(String message, Throwable cause) {
        super(message, cause);
    }
}
