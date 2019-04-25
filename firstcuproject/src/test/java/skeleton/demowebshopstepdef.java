package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tests.DriverUtility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.Registrationpage;

public class demowebshopstepdef {
	WebDriver driver;
	/*@Before
	public void init()
	{

		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, Registrationpage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/
/*	@After
	public void last()
	{
		driver.close();
	}*/
	@Given("url of demoshop")
	public void url_of_demoshop() {
	 driver.get("http://demowebshop.tricentis.com/register");
	}

	@When("user enters data for registration")
	public void user_enters_data_for_registration() {
		
		   Registrationpage.gender.click();
		   Registrationpage.firstname.sendKeys("sneha");
		   Registrationpage.lastname.sendKeys("Patil");
		   Registrationpage.email.sendKeys("sneha@test.com");
		   Registrationpage.password.sendKeys("abc123");
		   Registrationpage.confirmpassword.sendKeys("abc123");
		   Registrationpage.registerbutton.click();
	}

	@Then("user is registered successfull")
	public void user_is_registered_successfull() {
	// Assert.assertTrue( Registrationpage.);
	}



}
