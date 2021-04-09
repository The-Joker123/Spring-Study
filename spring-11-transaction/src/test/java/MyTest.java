import com.zeng.mapper.UserMapper;
import com.zeng.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void selectuser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = applicationContext.getBean("userMapper", UserMapper.class);


        for (User user1 : userMapper.selectuser()) {
            System.out.println(user1);
        }
    }

    @Test
    public void addUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = applicationContext.getBean("userMapper", UserMapper.class);
        User user=new User(5,"小红","1314");

        int result=userMapper.addUser(user);
        if(result>0){
            System.out.println("插入成功！");
        }
    }

    @Test
    public void deleteUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper userMapper = applicationContext.getBean("userMapper", UserMapper.class);


        int result=userMapper.deleteUser(5);
        if(result>0){
            System.out.println("删除成功！");
        }
    }
}
