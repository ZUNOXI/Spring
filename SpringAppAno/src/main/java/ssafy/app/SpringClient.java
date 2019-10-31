package ssafy.app;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringClient {
    public static void main(String[] args) {
//        BeanFactory fac = new ClassPathXmlApplicationContext("경로");
    	BeanFactory fac = new AnnotationConfigApplicationContext(config.class);
        IMember mem = (IMember) fac.getBean("mem");
        System.out.println(mem.toString());
    }
}