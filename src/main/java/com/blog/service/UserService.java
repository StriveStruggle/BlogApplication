package com.blog.service;

import com.blog.domain.User;

/**
 * Created by Snail Q
 * Date 2017/4/12.
 * Time 18:25
 */

public interface UserService extends BaseService<User> {
    //创建一个UserService继承BaseService，并指定具体的实体类型
    //为什么要再写一个UserService接口？不同对象的业务体系不同，BaseService并不能完全替代不同对象的具体行为表现
    void add(User user) throws Exception;

    User findUser(User user) throws Exception;
}
