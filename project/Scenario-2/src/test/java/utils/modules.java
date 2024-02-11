package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class modules {
	public void init(String url) {
		RestAssured.baseURI = url;
	}
    public void getEmpData(String path) throws InterruptedException {
    	Response response = RestAssured.get(path);
    	Thread.sleep(1000);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
    }
    public void getEmpDataByID(String path , int id) throws InterruptedException {
    	Response response = RestAssured.get(path+"/"+String.valueOf(id));
    	Thread.sleep(1000);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().asString());
    }
    
    public void updateByID(String path , int id , String body) throws InterruptedException {
    	RequestSpecification request = RestAssured.given();
        request.body(body);
        Response response = request.put(path+"/"+String.valueOf(id));
        Thread.sleep(1000);
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
    
    public void DeleteByID(String path , int id ) throws InterruptedException {
    	 RequestSpecification request = RestAssured.given();
         Response response = request.delete(path+"/"+String.valueOf(id));
         Thread.sleep(1000);
         System.out.println("Status Code: " + response.getStatusCode());
         System.out.println("Response Body: " + response.getBody().asString());
    }
    
}
