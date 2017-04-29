package beans;

public class Car {

	private static Car c;
	
	public static Car getInstance(){
		
		if(c==null){
			c = new Car();
			return c;
		}else{
			return c;
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	private Car(){
		System.out.println("Inside private constructor Car");
	}

}
