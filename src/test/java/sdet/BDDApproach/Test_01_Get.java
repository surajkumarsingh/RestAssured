package sdet.BDDApproach;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;





public class Test_01_Get {

	
	@Test
	
	public void get_01() {
		
		given()
	    .when()
	     .get("https://reqres.in/api/users/2")
		 .then()
		  .statusCode(200)
		  .statusLine("HTTP/1.1 200 OK")
		  .assertThat().body("data.id", equalTo(2))
		  .header("Content-Type", "application/json; charset=utf-8");
	}
	
}
