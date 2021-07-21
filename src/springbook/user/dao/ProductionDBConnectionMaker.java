package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProductionDBConnectionMaker implements ConnectionMaker{

	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(
					"jdbc:mysql://52.78.54.248:3306/sakila","devdcm","devdcm!Q@W!");
			return c;
		
		
	
	}
	
	
}
