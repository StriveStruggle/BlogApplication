package com.blog.exception;

/**
 * Created by Snail Q
 * Date 2017/4/13.
 * Time 14:26
 */
public class UserPwdCanNotBeNullException extends Exception {
    public UserPwdCanNotBeNullException(String message) {
        super(message);
    }

    public UserPwdCanNotBeNullException(String message, Throwable cause) {
        super(message, cause);
    }
}
