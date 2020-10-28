import com.spring.mode.bean.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        //String path="classpath:spring-context.xml";
        String path="spring-context.xml";
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
        User user = context.getBean("user", User.class);
        Object user1 = context.getBean("user");

        System.out.println(user1);
        //System.out.println(user);
        System.out.println(user.toString());

        Object student = context.getBean("student");
        System.out.println(student);
        context.close();
    }
}
