import com.zeng.appconfig.zengconfig;
import com.zeng.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void Test(){

       ApplicationContext ApplicationContext = new AnnotationConfigApplicationContext(zengconfig.class);
        User getUser = (User) ApplicationContext.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
