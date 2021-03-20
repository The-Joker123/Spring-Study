import com.zeng.Service.UserService;
import com.zeng.Service.UserServiceImpl;
import com.zeng.dao.UserDao;
import com.zeng.dao.UserDaoImpl;
import com.zeng.dao.UserDaoMySqlImpl;

public class MyTest {
    public static void main(String[] args) {
        UserService userService=new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserDaoMySqlImpl());
        userService.getUsers();
    }

}
