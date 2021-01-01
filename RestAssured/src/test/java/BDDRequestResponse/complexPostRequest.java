package BDDRequestResponse;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class complexPostRequest {
	@Test
	public void createRequest()
	{
    File fis=new File("./data.json");
    given()
    .contentType(ContentType.JSON)
    .body(fis)
    .when()
    .post("http://localhost:8084/addProject")
    .then()
    .assertThat().statusCode(201)
    .log().all();
    
   
}
}
