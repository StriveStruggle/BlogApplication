package com.blog.dao;

/**
 * Created by Snail Q
 * Date 2017/4/12.
 * Time 16:15
 */

import java.io.Serializable;
import java.util.List;

/**
 * ͨ���ӿڱ��
 *
 * @param <T> �������ڽ��ͬʱ�����ظ�����
 */
public interface BaseDAO<T> {
    /**
     * ���ĳ������
     *
     * @param t ����ӵĶ���
     * @return ��Ӱ�������
     */
    int add(T t);

    /**
     * ɾ��ĳ����������ҵ�����У�����һ�㲻������ɾ����ֻ�����ĳ���ֶζ������ݽ��п��ÿ���
     *
     * @param t ��ɾ���Ķ���
     * @return ������Ӱ�������
     */
    int del(T t);

    /**
     * ����ĳ������
     *
     * @param t �����¶���
     * @return ������Ӱ�������
     */
    int update(T t);

    /**
     * \
     * ͨ��Id����һ������
     *
     * @param Id ����ѯ�����Id
     * @return ���ظö����Ӧ��Id
     */
    T findOneById(Serializable Id);

    /**
     * ���Ҷ��󼯺�
     *
     * @return ���ض��󼯺�
     */
    List<T> findAll();
}