package beans; 

public class Bus {

	private Engine engine;
	
	public Bus(Engine engine){
		System.out.println("Inside bus constructor");
		this.engine = engine;
	}
	
	public Bus(){
		System.out.println("Inside default constructor");
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printData(){
		
		System.out.println("Bus engine " + engine.getModelyear());
	}
}
