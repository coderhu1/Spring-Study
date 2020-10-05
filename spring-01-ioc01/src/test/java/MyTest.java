import com.hu.dao.UserDaoMysqlImpl;
import com.hu.service.UserService;
import com.hu.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author coderhu1
 * @create 2020-10-05 15:47
 */
public class MyTest {

    @Test
    public void test1() {
        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoMysqlImpl());

        userService.getUser();
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");

        userServiceImpl.getUser();
    }
}
