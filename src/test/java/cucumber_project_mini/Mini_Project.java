package cucumber_project_mini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Mini_Project {
	static WebDriver driver;
	
	public Mini_Project() {
		PageFactory.initElements(driver, pom_miniproject.class);
	}
	@Given("Open the Browser")
	public static void open_browser() {
		driver = new ChromeDriver();
		driver.get("https://o2.openmrs.org/openmrs/login.htm");
	}
	
	@Then("Enter Username {string}")
	public static void username(String uname) {
		pom_miniproject.username.sendKeys(uname);
	}
	
	@And("Enter Password {string}")
	public static void password(String pass) {
		pom_miniproject.password.sendKeys(pass);
	}
	
	@Then("Click on Login Button")
	public static void login() {
		pom_miniproject.session.click();
	}
	
	@Given("Click on Registration button")
	public static void registration() {
		pom_miniproject.registration.click();
	}
	
	@Then("Enter Name {string} {string} {string}")
	public static void name(String fnameString , String mnameString , String lname) {
		pom_miniproject.fname.sendKeys(fnameString);
		pom_miniproject.mname.sendKeys(mnameString);
		
	}
	
	@And("Enter Gender")
	public static void gender() {
		
	}
	
	@Then("Enter Birthdate")
	public static void birthdate() {
		
	}
	
	@And("Enter Address {string} {string}")
	public static void address() {
		
	}
	
	@Then("Enter Phone Number {int}")
	public static void number() {
		
	}
	
	@And("Enter Relatives")
	public static void realtives() {
		
	}
	
	@Then("Click on Confirm button")
	public static void confirm() {
		
	}
}
