import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Snail Q
 * Date 2017/4/13.
 * Time 14:55
 */
@RunWith(SpringJUnit4ClassRunner.class) //spring�ĵ�Ԫ����
@ContextConfiguration({"classpath:spring/spring-*.xml"})    //����������
public class BaseTest {
}
