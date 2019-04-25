package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tests.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstepdef {
	WebDriver driver;
	/*@Before
	public void before()
	{
		 driver=DriverUtility.getDriver("chrome");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/
	@After
	public void after()
	{
	driver.close();	
	}
	
	@Given("The URL of Test Me App")
	public void the_URL_of_Test_Me_App() {
	  
	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("user enters {word} as username")
	public void user_enters_as_username(String string) {
		driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("user enters {word} as password")
	public void user_enters_as_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
		driver.findElement(By.name("Login")).click();
	}
	
	   

	@Then("user is in (Home|Admin Home)")
	public void user_is_in_homepage() {
		
		Assert.assertTrue(driver.getTitle().contains("Home"));
	}
	



}
