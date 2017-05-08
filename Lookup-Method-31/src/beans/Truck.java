package beans;

public abstract class Truck {
	public Engine myTruckEngine(){
		Engine e = new Engine();
		
		e.setEngineName("Truck-eng");
		
		return e;
	}
}
