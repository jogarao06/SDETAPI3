package utileTyss;


import io.restassured.response.Response;

public class Jsonutile {
	/**
	 * @author jogarao
	 * @param jsonpath
	 * @param resp
	 * @return
	 */
  public String jsonPathFinder(String jsonpath,Response resp) 
  {
   String text=resp.jsonPath().get(jsonpath);
   return text;
  }

}

