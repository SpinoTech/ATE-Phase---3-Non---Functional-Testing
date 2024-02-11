package restAssure.restAssure;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class test001 {

	public static void main(String[] args) throws InterruptedException {
	        RestAssured.baseURI = "https://reqres.in/";
	        // Send a GET request to the endpoint
	        Response response = RestAssured.get("/api/user/2");
	        Thread.sleep(1500);
	        System.out.println(response.getStatusCode());
	        Thread.sleep(1500);
	        System.out.println(response.getBody().asString());


	}

}
