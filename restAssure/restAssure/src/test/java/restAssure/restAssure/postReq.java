package restAssure.restAssure;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class postReq {

	public static void main(String[] args) {
			String exp_StatusValue = "201 Created";
			        RestAssured.baseURI = "https://reqres.in/";
			        String requestbody = "{\"name\":\"morpheus\",\"job\":\"leader\"}";
			        Response response = RestAssured.given().contentType(ContentType.JSON).body(requestbody).post("/api/users");
			        int statusCode = response.getStatusCode();
			        System.out.println("Status Code: " + statusCode);
			        String act_StatusValue = response.getStatusLine();
			        if (act_StatusValue.contains("Created")) {
			            System.out.println("Data has been inserted:");
			        }
			        else {
			            System.out.println("Failed execution");
			        }
			        System.out.println(response.statusCode());
			        System.out.println(response.getTime());

	}

}
