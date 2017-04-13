package com.blog.service.serviceImpl;

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
     * 添加用户，一般来说需要检查用户为空，用户名为空，密码为空
     *
     * @param user
     * @throws UserCanNotBeNullException
     * @throws UserNameCanNotBeNullException
     */
    public void add(User user) throws UserCanNotBeNullException, UserNameCanNotBeNullException, UserPwdCanNotBeNullException, OtherThingsException, UserAlreadyExistException {
        //先检查用户是否存在
        if (null == user) {
            throw new UserCanNotBeNullException("User can not be Null");
        }
        //用户名不能为空检查
        if (StringUtils.isEmpty(user.getLoginId())) {
            //抛出用户名为空的自定义异常
            throw new UserNameCanNotBeNullException("User name can not be Null");
        }
        //用户密码不能为空检查
        if (StringUtils.isEmpty(user.getPwd())) {
            throw new UserPwdCanNotBeNullException("User password can not be Null");
        }
        //由于我这个是仓库管理系统，根据业务需求来说，我们的用户基本信息都是不能为空的
        //基本信息包括：姓名、年龄、用户名、密码、性别、手机号、年龄大于18
        if (StringUtils.isEmpty(user.getDuty()) || StringUtils.isEmpty(user.getSex()) || (user.getAge() > 18) || StringUtils.isEmpty(user.getCellNumber())) {
            throw new OtherThingsException("Some Users' base info can not be null");
        }
        //TODO
        //待修改----修改不存在相同用户名的才能注册，即将参数loginId改为userName
        //已经存在相同的用户
        if (null != userDAO.findOneById(user.getLoginId())) {
            throw new UserAlreadyExistException("Register User Failed,Because the user Already exist");
        }
        int result = 0;//受影响的行数默认为0
        try {
            result = userDAO.add(user);
        } catch (Exception e) {
            System.out.println("添加用户失败，用户已经存在");
            //其他用户添加失败异常
            throw new OtherThingsException(e);
        }
        if (result > 0) {
            System.out.println("添加用户成功");
        }
    }

    public User findUser(User user) throws Exception {
        return userDAO.findOneById(user.getLoginId());
    }
}
