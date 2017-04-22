package beans;

public class Car {
	
	private String carename;
	private Engine egine;
	
	public Car(){
		System.out.println("Inside car");
	}

	public void setCarename(String carename) {
		this.carename = carename;
	}

	public void setEgine(Engine egine) {
		this.egine = egine;
	}

	public void printCarInfo(){
		System.out.println(carename + " " + egine.getModelyear());
		
	}
}
