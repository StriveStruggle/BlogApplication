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
    private UserDAO userDAO;    //��ʼ��Dao�㣬����ӿڱ��

    /**
     * ����û��ĵ�Ԫ���ԣ���ӳɹ������ж�Ӧ����ʾ��
     * ��Ȼ�������������һ�����ȷ�����˵�������Ҫ��һ��һ���Ŀ��������ʾ�����ˡ�
     * ���ͬ����LoginId���û������ʧ�ܣ���Ϊ�������LoginId��Ϊ�����ݿ���������
     */
    @Test
    public void testAdd() {
        User user = new User();
        user.setLoginId("pc13464433");
        user.setName("�ٺ�");
        user.setPwd("123456");
        user.setSex("��");
        int result = 0; //��Ӱ�������Ĭ��Ϊ0
        try {
            result = userDAO.add(user);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("����û�ʧ��");
        }
        if (result > 0)
            System.out.println("����û��ɹ�");
    }

    @Test
    public void testFindOneById() {
        User user = userDAO.findOneById("pc13464433");
        if (null != user) {
            System.out.println("��������û�");
        } else {
            System.out.println("����������û�");
        }

    }

    @Test
    public void testDel() {
        User user = new User();
        user.setLoginId("pc13464433");
        user.setUsed(false);//ɾ��
        int i = 0;
        i = userDAO.del(user);
        if (i > 0) {
            System.out.println("�ɹ�ɾ���û�");
        } else {
            System.out.println("ɾ���û�ʧ��");
        }

    }

    @Test
    public void update() {
        User user = new User();
        user.setLoginId("pc13464433");
        user.setName("�˻�");
        user.setPwd("123456");
        user.setSex("δ֪");
        int i = 0;
        i = userDAO.update(user);
        if (i > 0) {
            System.out.println("�����û���Ϣ�ɹ�");
        } else {
            System.out.println("�����û�ʧ��");
        }
    }
}
