import com.blog.domain.User;
import com.blog.exception.*;
import com.blog.service.UserService;
import com.blog.service.impl.UserServiceImpl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Snail Q
 * Date 2017/4/13.
 * Time 14:53
 */
public class UserServiceTest extends BaseTest {
    @Autowired
    private UserServiceImpl userService;

    //�˴�ֱ��ʹ��UserService��ʵ���࣬��Ҫ�Ƿ����׳��쳣��Ȼ���쳣����ʱ���������ԵĴ���
    @Test
    public void testAdd() {
        User user = new User();
        try {
            userService.add(user);
        } catch (UserCanNotBeNullException e) {
            //�û�����Ϊ���쳣�׳�
            e.printStackTrace();
        } catch (UserNameCanNotBeNullException e) {
            //�û�����Ϊ��
            e.printStackTrace();
        } catch (UserPwdCanNotBeNullException e) {
            //�û����벻��Ϊ��
            e.printStackTrace();
        } catch (UserAlreadyExistException e) {
            //�û������׳�
            e.printStackTrace();
        } catch (OtherThingsException e) {
            //�����ۺ��쳣���ǲ��ܴ�����쳣
            e.printStackTrace();
        }
    }
}
