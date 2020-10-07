import com.hu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author coderhu1
 * @create 2020-10-06 20:49
 */
public class MyTest {
    //Spring内置API接口实现测试
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");

        userService.add();
    }

    //自定义切面测试
    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }

    @Test
    public void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
