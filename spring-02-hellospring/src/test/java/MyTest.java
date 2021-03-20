import com.zeng.pojo.Hello;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取Spring对象上下文
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象都在Spring中的管理了，我们要使用，直接去里面去就可以了
        Hello hello=(Hello)context.getBean("hello");
        System.out.println(hello.toString());
    }
}
