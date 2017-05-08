package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DbConnect{


	private String url, username,driver;
	private Connection con;

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public void setDriver(String driver) {
		this.driver = driver;
	}

	@PostConstruct
	public void afterPropertiesSet() throws Exception {

		Class.forName(driver);
		con = DriverManager.getConnection(url, username,"");
		System.out.println("Connection Oppened.");
	}
	
	public void save(int id, String name, String email, String address) throws SQLException{
		PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4,address);
		
	    ps.executeUpdate();
	    
	    System.out.println("Insertion Completed.");
		
	}

	@PreDestroy
	public void destroy() throws Exception {
		con.close();
		System.out.println("Connection Closed.");
		
	}





}
