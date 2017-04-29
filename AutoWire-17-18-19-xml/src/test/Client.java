package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring_by_autodetect.xml");
		
		Bus c = (Bus) ap.getBean("bus");
		
		c.printData();
	}

}
