import com.hu.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author coderhu1
 * @create 2020-10-06 9:09
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        People people = context.getBean("people", People.class);

        people.getCat().shout();
        people.getDog().shout();
    }

    //通过注解装配
    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");

        People people = context.getBean("people", People.class);

        people.getDog().shout();
        people.getCat().shout();
    }
}
