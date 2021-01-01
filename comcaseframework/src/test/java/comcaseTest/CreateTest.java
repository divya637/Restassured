package comcaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateTest {
	WebDriver driver;
	@Test(groups="smokeTest")
	public void test()
	{
		System.out.println("launch browser");
		String browser=System.getProperty("browser");
		 String url=System.getProperty("url");
		
	
		
		System.out.println("launch browser suscessfully");
	}
	@Test
	public void test2()
	{   driver.close();
		System.out.println("close browser");

}
	@Test(groups="smokeTest")
	public void test3()
	{   
		System.out.println("close browser");

}
	
}