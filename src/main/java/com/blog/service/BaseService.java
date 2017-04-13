package com.blog.service;

/**
 * Created by Snail Q
 * Date 2017/4/13.
 * Time 14:03
 */
//创建一个BaseService接口，用泛型解耦
public interface BaseService<T> {
    //添加用户的实例
    void add(T t) throws Exception;
}
