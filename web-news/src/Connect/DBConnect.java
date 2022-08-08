package Connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	public Connection getConnection() throws Exception {
	    String userName = "root";
	    String password = "1234";
		String connectionURL = "jdbc:mysql://localhost:3306/demo";
	     Connection conn = DriverManager.getConnection(connectionURL, userName,
	             password);
	     Class.forName("com.mysql.cj.jdbc.Driver");
	     return conn;
	}
	
    
   
}
