import com.hu.config.MyConfig;
import com.hu.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author coderhu1
 * @create 2020-10-06 11:04
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = (User) context.getBean("user");

        System.out.println(user.getName());
    }
}
