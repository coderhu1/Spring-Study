import com.hu.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author coderhu1
 * @create 2020-10-06 10:36
 */
public class MyTest {
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);

        //测试@value注解
        System.out.println(user.getName());

        //测试@scope注解
        System.out.println(user == user2);
    }
}
