import com.hu.mapper.UserMapper;
import com.hu.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author coderhu1
 * @create 2020-10-07 19:40
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = (UserMapper) context.getBean("userMapper");

        List<User> users = userMapper.selectUser();

        for (User user : users) {
            System.out.println(user);
        }
    }
}
