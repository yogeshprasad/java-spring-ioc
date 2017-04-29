package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Autowired
	@Qualifier("eng1")
	private Engine engine;
		

	public void printData(){

		System.out.println("Model-Year " + engine.getModelyear());
		
	}
}
