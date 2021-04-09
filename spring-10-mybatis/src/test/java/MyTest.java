import com.mysql.cj.result.SqlDateValueFactory;
import com.zeng.mapper.UserMapper;
import com.zeng.pojo.User;
import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.List;

public class MyTest {
    @Test
    public void test() {
//        String resources ="mybatis-config.xml";
////        InputStream in =Resources.getResourceAsStream(resources);
////        SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(in);
////        SqlSession  sqlSession=sqlSessionFactory.openSession(true);
////
////        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
////        List<User> userList=mapper.selectuser();
////        for (User user : userList) {
////            System.out.println(userList);
////        }

       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = applicationContext.getBean("userMapper2", UserMapper.class);
        for (User user : userMapper.selectuser()) {
            System.out.println(user);
        }


    }
}
