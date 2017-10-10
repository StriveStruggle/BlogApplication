package com.blog.service.impl;

import com.blog.dao.UserDAO;
import com.blog.domain.User;
import com.blog.exception.*;
import com.blog.service.UserService;
import com.blog.utils.StringUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Snail Q
 * Date 2017/4/12.
 * Time 18:26
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    /**
     * ����û���һ����˵��Ҫ����û�Ϊ�գ��û���Ϊ�գ�����Ϊ��
     *
     * @param user
     * @throws UserCanNotBeNullException
     * @throws UserNameCanNotBeNullException
     */
    public void add(User user) throws UserCanNotBeNullException, UserNameCanNotBeNullException, UserPwdCanNotBeNullException, OtherThingsException, UserAlreadyExistException {
        //�ȼ���û��Ƿ����
        if (null == user) {
            throw new UserCanNotBeNullException("User can not be Null");
        }
        //�û�����Ϊ�ռ��
        if (StringUtils.isEmpty(user.getLoginId())) {
            //�׳��û���Ϊ�յ��Զ����쳣
            throw new UserNameCanNotBeNullException("User name can not be Null");
        }
        //�û����벻��Ϊ�ռ��
        if (StringUtils.isEmpty(user.getPwd())) {
            throw new UserPwdCanNotBeNullException("User password can not be Null");
        }
        //����������ǲֿ����ϵͳ�����ҵ��������˵�����ǵ��û�����Ϣ���ǲ���Ϊ�յ�
        //����Ϣ�������������䡢�û������롢�Ա��ֻ�š��������18
        if (StringUtils.isEmpty(user.getDuty()) || StringUtils.isEmpty(user.getSex()) || (user.getAge() > 18) || StringUtils.isEmpty(user.getCellNumber())) {
            throw new OtherThingsException("Some Users' base info can not be null");
        }
        //TODO
        //���޸�----�޸Ĳ�������ͬ�û���Ĳ���ע�ᣬ��������loginId��ΪuserName
        //�Ѿ�������ͬ���û�
        if (null != userDAO.findOneById(user.getLoginId())) {
            throw new UserAlreadyExistException("Register User Failed,Because the user Already exist");
        }
        int result = 0;//��Ӱ�������Ĭ��Ϊ0
        try {
            result = userDAO.add(user);
        } catch (Exception e) {
            System.out.println("����û�ʧ�ܣ��û��Ѿ�����");
            //�����û����ʧ���쳣
            throw new OtherThingsException(e);
        }
        if (result > 0) {
            System.out.println("����û��ɹ�");
        }
    }

    public User findUser(User user) throws Exception {
        return userDAO.findOneById(user.getLoginId());
    }
}
