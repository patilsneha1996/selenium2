package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class caseLogin {
	@FindBy(how=How.ID,using="userName")
	public static WebElement username;
	@FindBy(how=How.ID,using="password")
	public static WebElement password;
	@FindBy(how=How.NAME,using="Login")
	public static WebElement Login;
	@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/div[1]/button/span")
	public static WebElement AddProduct;
	@FindBy(how=How.NAME,using="categorydropname")
	public static WebElement CategoryName;
	@FindBy(how=How.ID,using="subcategorydropid")
	public static WebElement subcategoryname;
	@FindBy(how=How.ID,using="prodid")
	public static WebElement ProductName;
	@FindBy(how=How.NAME,using="pricename")
	public static WebElement Price;
	@FindBy(how=How.NAME,using="Quantity")
	public static WebElement Quantaty;
	@FindBy(how=How.NAME,using="Brand")
	public static WebElement Brand;
	@FindBy(how=How.NAME,using="Add Product")
    public static WebElement addproduct;
	@FindBy(how=How.NAME,using="description")
	public static WebElement Desciption;
}
