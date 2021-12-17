package utileTyss;

import java.sql.SQLException;
/**
 * 
 * @author Joga Rao
 * description:baseClass DB Connect and DB notConnect
 *
 */


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseAPIclss {
	
	
	public DatabaseUtile dautli=new DatabaseUtile();
	@BeforeSuite
	public void connectdbs() throws SQLException {
	dautli.connetTODatabase();
	}
	
	@AfterSuite
	public void disconnectdbs() throws SQLException {
		dautli.disconnectdb();
	}

}
