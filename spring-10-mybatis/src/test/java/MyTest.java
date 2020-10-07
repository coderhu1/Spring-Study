import com.hu.mapper.UserMapper;
import com.hu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author coderhu1
 * @create 2020-10-07 16:46
 */
public class MyTest {
    //未整合前，测试Mybatis环境
    @Test
    public void test01() throws IOException {
        String resource = "Mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();

        for (User user : users) {
            System.out.println(user);
        }
    }

    //整合后，测试Spring-Mybatis环境，整合方式一
    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);

        for (User user : mapper.selectUser()) {
            System.out.println(user);
        }
    }

    //整合方式二
    @Test
    public void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper2 = context.getBean("userMapper2", UserMapper.class);

        List<User> users = mapper2.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
