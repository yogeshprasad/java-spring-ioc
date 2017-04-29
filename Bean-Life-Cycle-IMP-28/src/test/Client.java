package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		ap.getBean("conncet");


	}

}
