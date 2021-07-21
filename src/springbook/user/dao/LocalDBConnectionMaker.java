package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LocalDBConnectionMaker implements ConnectionMaker{

	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/toby","root","rlaxhgus33!");
			return c;
		
		
	
	}

}
