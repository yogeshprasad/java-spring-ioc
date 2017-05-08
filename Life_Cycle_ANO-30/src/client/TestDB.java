package client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDB {


	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");

	}
}
