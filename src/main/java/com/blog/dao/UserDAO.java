package com.blog.dao;

import com.blog.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Snail Q
 * Date 2017/4/12.
 * Time 16:38
 */
@Repository("userDAO")
public interface UserDAO extends BaseDAO<User> {
    int add(User user);

    int del(User user);

    int update(User user);

    User findOneById(Serializable Id);

    List<User> findAll();
}
