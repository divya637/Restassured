package RequestResponseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteRequest {
	@Test
	public void deleteProject()
	{
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_002");
	
		System.out.println(resp.getStatusCode());
		 Assert.assertEquals(204,resp.getStatusCode());
	}

}
