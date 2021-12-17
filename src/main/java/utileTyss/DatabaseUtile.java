package utileTyss;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

import com.mysql.cj.jdbc.Driver;
import java.sql.ResultSet;
/**
 * 
 * @author jogarao
 * description: database utile Class 
 *
 */

public class DatabaseUtile {
	
	
	public Connection con;
	

	public void connetTODatabase() throws SQLException {
		
		try {
			Driver dref = new Driver();
			DriverManager.registerDriver(dref);
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void disconnectdb() throws SQLException {
		con.close();
	}
	
	public ResultSet executeQuerya(String query) throws Throwable {
	  Statement	state = con.createStatement();
	  ResultSet reslt = state.executeQuery(query);
	  return reslt;
	}

}
