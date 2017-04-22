package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		// class.forname("class name").newintance
		// Spring can create the instance for a class with private constructor also


	}

}
