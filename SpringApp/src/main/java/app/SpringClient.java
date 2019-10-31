package app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Member m = new Member();
//		System.out.println(m.toString());
		BeanFactory cxt = new ClassPathXmlApplicationContext("/applicationContext.xml");
		System.out.println("getbean 하기");
		Member mem1 = cxt.getBean(Member.class);
		System.out.println("Member가져오기");
		System.out.println(mem1.toString());
		mem1.setName("로이스");
		IMember mem2 = (IMember) cxt.getBean("mem");
		System.out.println(mem2.toString());
	}

}
