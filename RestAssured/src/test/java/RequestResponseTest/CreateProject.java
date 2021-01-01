package RequestResponseTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {
@Test
public void createNewProject()
{
	JSONObject obj=new JSONObject();
	   obj.put("createdBy", "Shwetansh");
	   obj.put("createdOn", "Dec");
	   obj.put("projectId", "Ty_105");
	   obj.put("projectName", "CRM");
	   obj.put("status", "Created");
	   obj.put("teamSize", "4");
	   RequestSpecification resp = RestAssured.given();
	                     resp.contentType(ContentType.JSON);
	                     resp.body(obj);
	                     Response response = resp.post("http://localhost:8084/addProject");
	                   System.out.println(response.getStatusCode());
}
}
