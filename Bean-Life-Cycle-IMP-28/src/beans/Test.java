package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean, DisposableBean{

	private String url, username,passwoed,driver;
	private Connection con;

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPasswoed(String passwoed) {
		this.passwoed = passwoed;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	
		Class.forName(driver);
		con = DriverManager.getConnection(url, username, passwoed);
		System.out.println("Connection Oppened.");
	}
	
	public void save(int id, String name, String email, String address) throws SQLException{
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4,address);
		
	    ps.executeUpdate();
	    
	    System.out.println("Insertion Completed.");
		
	}

	@Override
	public void destroy() throws Exception {
		con.close();
		System.out.println("Connection Closed.");
		
	}



}
