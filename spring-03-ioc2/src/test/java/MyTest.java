import com.zeng.pojo.User;
import com.zeng.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext ApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
       UserT user = (UserT) ApplicationContext.getBean("userT");
       user.show();
    }
}
