import com.blog.domain.User;
import com.blog.exception.*;
import com.blog.service.UserService;
import com.blog.service.serviceImpl.UserServiceImpl;
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

    //此处直接使用UserService的实现类，主要是方便抛出异常，然后异常出现时候可以针对性的处理
    @Test
    public void testAdd() {
        User user = new User();
        try {
            userService.add(user);
        } catch (UserCanNotBeNullException e) {
            //用户不能为空异常抛出
            e.printStackTrace();
        } catch (UserNameCanNotBeNullException e) {
            //用户名不能为空
            e.printStackTrace();
        } catch (UserPwdCanNotBeNullException e) {
            //用户密码不能为空
            e.printStackTrace();
        } catch (UserAlreadyExistException e) {
            //用户存在抛出
            e.printStackTrace();
        } catch (OtherThingsException e) {
            //其他综合异常或是不能处理的异常
            e.printStackTrace();
        }
    }
}
