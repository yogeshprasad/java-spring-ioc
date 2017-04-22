package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;


public class Client {

	public static void main(String[] args) {
		
		String [] xmlfiles = new String[]{"resources/car.xml", "resources/engine.xml"};
		
		ApplicationContext ap = new ClassPathXmlApplicationContext(xmlfiles);

	}

}
