package beans;

public class CarFactory{

	private static String careName;
	
	public static void setCareName(String careName) {
		CarFactory.careName = careName;
	}
	
	// Static Factory Approach
	
	public static Car getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		// No need to write singleton logic spring will make it singleton

		return (Car)Class.forName(careName).newInstance();

	}
	

}
