package baseatest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.sql.ResultSet;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojolib.PojoClassForCreatingPoroject;
import utileTyss.BaseAPIclss;
import utileTyss.EndPoint;
import utileTyss.Javautile;
import utileTyss.Jsonutile;

public class baseutlie extends BaseAPIclss implements EndPoint {
	/**
	 * @author Joga Rao
	 * description:End to End scenario
	 * @throws Throwable
	 */
	

	@Test
	public void endToEndScenario() throws Throwable {
	

		Javautile jUtil = new Javautile();

		PojoClassForCreatingPoroject pl = new PojoClassForCreatingPoroject("RANANANA", "TYSS" + jUtil.randamNumber(),
				"Created", 15);

		baseURI = "http://localhost";
		port = 8084;
      
		Response rsps = given().contentType(ContentType.JSON).body(pl).when().post(EndPoint.cratProj);
		Jsonutile jsonutile = new Jsonutile();
		String Projectid = jsonutile.jsonPathFinder("projectId", rsps);
		System.out.println(Projectid);

     	Response rsps1 = given().pathParam("ProId", Projectid).when().get(EndPoint.getALLProj);
     			//("http://localhost:8084/projects/{ProId}");
    	
		String projectName = jsonutile.jsonPathFinder("projectName", rsps1);
		System.out.println(projectName);
		ResultSet reslt = dautli.executeQuerya("select * from project");

		while (reslt.next()) {
			if (reslt.getString(4).equals(projectName)) {
				System.out.println(projectName + " is matching");
			}
		}

	}

}
