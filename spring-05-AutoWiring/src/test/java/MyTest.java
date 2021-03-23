import com.zeng.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        People people = (People) context.getBean("people");
        System.out.println(people.toString());
    }

}
