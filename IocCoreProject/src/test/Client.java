package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Client {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("resources/spring.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
		
		System.out.println("Found valid xml by sax parser");
		
		factory.getBean("single_obj");
		factory.getBean("single_obj");
		factory.getBean("single_obj");
	}

}
