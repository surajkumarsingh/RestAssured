package sdet.BDDApproach;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_01_Post {

	public static JSONObject json = new JSONObject();

	@Test
	public void testPost() {
		json.put("email", "eve.holt@reqres.in");
		json.put("password", "pistssl");
		given().contentType("application/json").body(json.toJSONString()).post("https://reqres.in/api/register")
		    .then()
		    .statusCode(200)
			.body("id", equalTo(4))
			.and()
			.body("token", equalTo("QpwL5tke4Pnpja7X4"));
	}

	@Test
	public void errorMsgPost() {
		json.put("email", "ee.holt@reqres.in");
		json.put("password", "pistssl");
		given().contentType("application/json").body(json.toJSONString()).post("https://reqres.in/api/register")
	    .then()
	    .statusCode(400)
	    .body("error", equalTo("Note: Only defined users succeed registration"));
		
	}
}
