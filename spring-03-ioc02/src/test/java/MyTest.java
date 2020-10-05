import com.hu.pojo.User;
import com.hu.pojo.UserT;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author coderhu1
 * @create 2020-10-05 18:19
 */
public class MyTest {
    //无参构造
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");

        System.out.println(user == user2);
    }

    //有参测试
    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user2 = (User) context.getBean("user2");
        System.out.println(user2);

        User user3 = (User) context.getBean("user3");
        System.out.println(user3);

        User user4 = (User) context.getBean("user4");
        System.out.println(user4);

        UserT userT = (UserT) context.getBean("userT5");
        System.out.println(userT);
    }
}
