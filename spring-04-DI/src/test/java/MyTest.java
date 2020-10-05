import com.hu.pojo.Student;
import com.hu.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author coderhu1
 * @create 2020-10-05 19:45
 */
public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student);
        /*
        Student{
            name='huzong',
            address=Address{address='null'},
            books=[红楼梦, 水浒传, 西游记, 三国演义],
            hobbys=[看书, 打游戏],
            card={driver=mysql.jdbc, username=root, password=123456},
            games=[Lol, PUBG, Bob],
            wife='null',
            info={status=hhh, driver=jdbc}
           }
         */
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");

        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user2", User.class);

        System.out.println(user);
        System.out.println(user2);

        System.out.println(user.equals(user2));
    }
}
