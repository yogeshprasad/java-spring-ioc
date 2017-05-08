package client;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.DbConnect;

public class TestDB {


	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		DbConnect dbOps = (DbConnect)ap.getBean("conncet");
		
		Scanner sc = new Scanner(System.in);

		while(true){
			
			System.out.println("Enter 1 for save or 2 for exit");
			
			int choice = sc.nextInt();
			
			if(choice == 1){
				System.out.println("Enter id");
				int id = sc.nextInt();
				
				System.out.println("Enter name");
				String name = sc.next();
				
				System.out.println("Enter email");
				String email = sc.next();
				
				System.out.println("Enter address");
				String address = sc.next();

				dbOps.save(id, name, email, address);
				
				System.out.println("DATA Saved Successfully.");

			}else{
				dbOps.destroy();
				break;
			}
		}
	}
}
