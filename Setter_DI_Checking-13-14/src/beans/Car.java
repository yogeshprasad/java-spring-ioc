package beans;

public class Car {
	private String carename;
	private Engine engine;
	
	public void setCarename(String carename) {
		this.carename = carename;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printData(){
		System.out.println("inside print method...");
		System.out.println(carename);
		System.out.println(engine.getModelyear());
	}
	
}
