package com.blog.service;

import com.blog.domain.User;

/**
 * Created by Snail Q
 * Date 2017/4/12.
 * Time 18:25
 */

public interface UserService extends BaseService<User> {
    //����һ��UserService�̳�BaseService����ָ�������ʵ������
    //ΪʲôҪ��дһ��UserService�ӿڣ���ͬ�����ҵ����ϵ��ͬ��BaseService��������ȫ�����ͬ����ľ�����Ϊ����
    void add(User user) throws Exception;

    User findUser(User user) throws Exception;
}
