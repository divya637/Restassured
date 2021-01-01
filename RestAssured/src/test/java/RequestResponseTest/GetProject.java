package RequestResponseTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetProject {
	@Test
	public void getProjectList()
	{
		Response resp = RestAssured.get("http://localhost:8084/projects");
		System.out.println(resp);
		System.out.println(resp.prettyPrint());
	}

}
