import com.blog.dao.UserDAO;
import com.blog.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.Serializable;

/**
 * Created by Snail Q
 * Date 2017/4/12.
 * Time 17:28
 */

public class UserDaoTest extends BaseTest {
    @Autowired
    private UserDAO userDAO;    //初始化Dao层，面向接口编程

    /**
     * 添加用户的单元测试，添加成功与否会有对应的提示。
     * 当然按照我这个配置一般会正确，如果说出错就需要你一步一步的看错误的提示代码了。
     * 添加同样的LoginId的用户会添加失败，因为在上面把LoginId作为了数据库表的主键。
     */
    @Test
    public void testAdd() {
        User user = new User();
        user.setLoginId("pc13464433");
        user.setName("嘿嘿");
        user.setPwd("123456");
        user.setSex("男");
        int result = 0; //受影响的行数默认为0
        try {
            result = userDAO.add(user);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("添加用户失败");
        }
        if (result > 0)
            System.out.println("添加用户成功");
    }

    @Test
    public void testFindOneById() {
        User user = userDAO.findOneById("pc13464433");
        if (null != user) {
            System.out.println("存在这个用户");
        } else {
            System.out.println("不存在这个用户");
        }

    }

    @Test
    public void testDel() {
        User user = new User();
        user.setLoginId("pc13464433");
        user.setUsed(false);//删除
        int i = 0;
        i = userDAO.del(user);
        if (i > 0) {
            System.out.println("成功删除用户");
        } else {
            System.out.println("删除用户失败");
        }

    }

    @Test
    public void update() {
        User user = new User();
        user.setLoginId("pc13464433");
        user.setName("邓辉");
        user.setPwd("123456");
        user.setSex("未知");
        int i = 0;
        i = userDAO.update(user);
        if (i > 0) {
            System.out.println("更新用户信息成功");
        } else {
            System.out.println("更新用户失败");
        }
    }
}
