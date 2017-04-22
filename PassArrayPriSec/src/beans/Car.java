package beans;

public class Car {
	
	private String[] carename;
	private Engine[] egine;
	
	public Car(){
		System.out.println("Inside car");
	}

	public String[] getCarename() {
		return carename;
	}

	public void setCarename(String[] carename) {
		this.carename = carename;
	}

	public Engine[] getEgine() {
		return egine;
	}

	public void setEgine(Engine[] egine) {
		this.egine = egine;
	}


}
