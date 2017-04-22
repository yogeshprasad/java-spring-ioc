package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

@SuppressWarnings("deprecation")
public class Client {
	public static void main(String args[]){
		Resource res = new ClassPathResource("resources/spring.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
		
		// It only create object once --> one constructor call
		Object obj = factory.getBean("single_obj");
		Object obj2 = factory.getBean("single_obj");
		Object obj3 = factory.getBean("single_obj");
		
		// Check the object ref
		
		System.out.println(obj2==obj3);
		
		Object Mobj1 = factory.getBean("multiple_obj");
		Object Mobj2 = factory.getBean("multiple_obj");
		
		System.out.println(Mobj1==Mobj2);
		
/*	use this in bean <bean id="multiple_obj2" class="beans.Test" singleton="false"></bean>	
 * Object SMobj1 = factory.getBean("multiple_obj2");
		Object SMobj2 = factory.getBean("multiple_obj2");
		
		System.out.println(SMobj1==SMobj2);*/
		
		Test testObj = (Test)obj;
		
		testObj.hello();
		
		
		
	}
}
