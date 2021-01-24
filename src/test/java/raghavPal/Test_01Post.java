package raghavPal;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
public class Test_01Post {

	
	
	@Test
	
	public void TestPost() {
		
		JSONObject json = new JSONObject();
		
		json.put("Name", "Suraj");
		json.put("Job", "QA");
		
		given().body(json.toJSONString()).post("https://reqres.in/api/users").then().statusCode(201).log().all();
		
	}
}
