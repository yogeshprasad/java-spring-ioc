package beans;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean{
	
	private String carname;
	
	public void setCarname(String carname) {
		this.carname = carname;
	}

	@Override
	public Object getObject() throws Exception {

		return (Car) Class.forName(carname).newInstance();
	}

	@Override
	public Class getObjectType() {
		
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}


	

}
