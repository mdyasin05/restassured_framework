package Test;

import org.junit.Before;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class TestBase {
	
	public RequestSpecification request;
	public Response response;
	public ValidatableResponse json;
	
	@Before
	public void initTest() {
		RestAssured.baseURI="";
		RestAssured.basePath="";
		RestAssured.baseURI="https://www.googleapis.com";
		RestAssured.basePath="/books/v1/volumes";
		//String url= "https://www.googleapis.com/books/v1/volumes";
		
	}
	
}
