package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tests.DriverUtility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.caseLogin;

public class caselogin {
	WebDriver driver;
	@Before
	public void init() {

		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, caseLogin.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@After
	public void after()
	{
		driver.close();
	}
	@Given("URL of TestMeApp")
	public void url_of_TestMeApp() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		//driver.findElement(By.partialLinkText("SignIn")).click();
	}

	@When("login credientials")
	public void login_credientials() {
		caseLogin.username.sendKeys("admin");
		caseLogin.password.sendKeys("Password456");
		caseLogin.Login.click();
		caseLogin.AddProduct.click();

	}

	@When("user adds new product")
	public void user_adds_new_product() {
		caseLogin.CategoryName.sendKeys("electronics");
		caseLogin.subcategoryname.sendKeys("laptop");
		caseLogin.ProductName.sendKeys("Hp laptop");
		caseLogin.Price.sendKeys("400");
		caseLogin.Brand.sendKeys("Hp");
		caseLogin.Quantaty.sendKeys("1");
		caseLogin.Desciption.sendKeys("Laptop");
		caseLogin.addproduct.click();
	}

	@Then("product is added successfully")
	public void product_is_added_successfully() {
		String a=driver.findElement(By.cssSelector("i[style='font-size: 20px']")).getText();
        Assert.assertTrue(a.contains(" Hp laptop is added Succesfully"));
}


}
