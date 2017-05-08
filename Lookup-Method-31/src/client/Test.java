package client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bus;
import beans.Car;
import beans.Truck;

public class Test {


	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Car c = (Car) ap.getBean("car");
		
		System.out.println(c.myCarEngine().getEngineName());
		

		Bus b = (Bus) ap.getBean("bus");
		
		System.out.println(b.myBusEngine().getEngineName());
		
		Truck t = (Truck) ap.getBean("truck");
		
		System.out.println(t.myTruckEngine().getEngineName());

	}
}
