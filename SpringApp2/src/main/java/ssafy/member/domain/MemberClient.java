package ssafy.member.domain;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ssafy.member.bis.MemberService;

public class MemberClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory fac = new AnnotationConfigApplicationContext(MemberConfig.class);
		MemberService ser = (MemberService) fac.getBean("memberser");
		ser.memberInsert("홍길동", "21");
		ArrayList<MemberDTO>list = ser.memberSelectList();
		ser.memberUpdate("홍길동", "31");
		ser.memberDelete("홍길동");
	}

}
