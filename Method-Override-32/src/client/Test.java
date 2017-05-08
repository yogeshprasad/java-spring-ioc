package client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bank;

public class Test {


	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Bank b = (Bank) ap.getBean("bank");
		b.deposite();
		b.withdrow();
		b.calInt();
	}
}
