package sdet.BDDApproach;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_01_Put {

	
	public static JSONObject json = new JSONObject();

	@Test
	public void testPut() {
		json.put("email", "eve.holt@reqres.in");
		json.put("password", "pistssl");
		given().contentType("application/json").body(json.toJSONString()).put("https://reqres.in/api/users/2")
		    .then()
		    .statusCode(200)
			.body("email", equalTo("eve.holt@reqres.in"))
			.and()
			.body("password", equalTo("pistssl"))
			.log().all();
	}

}
