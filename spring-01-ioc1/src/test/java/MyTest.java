import com.zeng.Service.UserService;
import com.zeng.Service.UserServiceImpl;
import com.zeng.dao.UserDao;
import com.zeng.dao.UserDaoImpl;
import com.zeng.dao.UserDaoMySqlImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("UserServiceImpl");
        userServiceImpl.getUsers();
    }

}
