package Test;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


public class BookApiTest extends TestBase {

	
	@Test
	public void findBooksbyAPIs() {
		
		//String isbn= "isbn:9781451648546";
		
		request= RestAssured.given().log().all().param("q", "isbn:9781451648546");
		response= request.when().get();
		json=response.then().log().all().assertThat()
					 .statusCode(200)
					 .header("Content-Type", "application/json; charset=UTF-8")
					 .body("kind", equalTo("books#volumes"))
					 .body("totalItems", equalTo(1))
					 .body("items.volumeInfo.title", containsInAnyOrder("Steve Jobs"));
		
		
		
	}
	
	
	
	

}
