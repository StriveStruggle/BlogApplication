package com.blog.service;

/**
 * Created by Snail Q
 * Date 2017/4/13.
 * Time 14:03
 */
//����һ��BaseService�ӿڣ��÷��ͽ���
public interface BaseService<T> {
    //����û���ʵ��
    void add(T t) throws Exception;
}
