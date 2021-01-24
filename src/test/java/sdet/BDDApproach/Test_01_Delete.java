package sdet.BDDApproach;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_01_Delete {
	
	@Test
	public void testDelete() {
	
		given().delete("https://reqres.in/api/users/2")
		    .then()
		    .statusCode(204)
			.log().all();
	}
}
