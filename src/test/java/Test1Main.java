import com.spring.mode.bean.Product;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Object student = context.getBean("student");
        System.out.println(student);
        Product product = (Product) context.getBean("product");
        System.out.println(product);
    }
}
