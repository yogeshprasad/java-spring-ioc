package test;

import java.lang.reflect.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {
		
		//create object of a class having private constructor using reflection
		
		try{
			//get the class ref
			Class cls = Class.forName("beans.PrivateTest");
			
			//get all constructor
			Constructor con[] = cls.getDeclaredConstructors();
			
			//change the visibility of the constructor
			con[0].setAccessible(true);
			
			//Create new instance
			con[0].newInstance();
			
		}catch (Exception e){}
		
		//ApplicationContext apc = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		// class.forname("class name").newintance
		// Spring can create the instance for a class with private constructor also

		
		/*
		 * Container tasks
		 *
		 * 1. Create instances for pojo/beans
		 * 2. Manage life cycle
		 * 3. DI - dependency inj
		 * 
		 */		
		

	}

}
