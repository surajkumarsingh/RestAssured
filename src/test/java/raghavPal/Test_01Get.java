package raghavPal;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
public class Test_01Get {

	
	@Test
	
	public void getTest() {
		
		Response respone = get("https://reqres.in/api/users/2");
		
		System.out.println(respone);
		System.out.println("*****************************************");
		System.out.println(respone.contentType());
		System.out.println(respone.statusLine());
		System.out.println(respone.statusCode());
		System.out.println(respone.getHeader("content-type"));
		System.out.println(respone.getContentType());
		System.out.println(respone.getTime());
	}
	
	@Test 
	public void getTest2() {
		
		given().header("app-id", " 0JyYiOQXQQr5H9OEn21312").get("https://dummyapi.io/data/api/user?limit=10").then().log().all();
	}
}
