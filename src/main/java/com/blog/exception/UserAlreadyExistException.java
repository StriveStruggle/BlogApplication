package com.blog.exception;

/**
 * Created by Snail Q
 * Date 2017/4/13.
 * Time 14:40
 */
public class UserAlreadyExistException extends Exception {
    public UserAlreadyExistException(String message) {
        super(message);
    }

    public UserAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
