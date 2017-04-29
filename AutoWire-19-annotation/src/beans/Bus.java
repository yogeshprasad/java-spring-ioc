package beans; 

public class Bus {

	private Engine engine;
	
	public Bus(Engine engine){
		System.out.println("Inside bus constructor");
		this.engine = engine;
	}
	
	public void printData(){
		
		System.out.println("Bus engine " + engine.getModelyear());
	}
}
