package beans;

public class CarFactory{

	private  String careName;
	
	public  void setCareName(String careName) {
		this.careName = careName;
	}
	
	// Non-Static/instance Factory Approach
	
	public  Car getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		// No need to write singleton logic spring will make it singleton

		return (Car)Class.forName(careName).newInstance();

	}
	

}
