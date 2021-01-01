package BDDRequestResponse;

import org.testng.annotations.Test;

import BasicLib.Project;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;

import static  io.restassured.RestAssured.*;

import java.util.Random;

public class Pojo_Class_BDD {


@Test
public void createProject()
{  Random rm= new Random();
          rm.nextInt(1000);
	Project poj=new Project("Muni_"+rm, "Dec","104","swager", "Completed", 10);
	given()
	.contentType(ContentType.JSON)
	 .body(poj, ObjectMapperType.JACKSON_1)
     .when()
       .post("http://localhost:8084/addProject")
     .then()
       .log().all()
       .assertThat().statusCode(201);
	}

	
}


