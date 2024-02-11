package restAssure2.restAssure2;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getReq {

	public static void getRequest() throws InterruptedException {
		RestAssured.baseURI = "https://reqres.in/";
        // Send a GET request to the endpoint
        Response response = RestAssured.get("/api/user/2");
        Thread.sleep(1500);
        System.out.println(response.getStatusCode());
        Thread.sleep(1500);
        System.out.println(response.getBody().asString());

	}

}
