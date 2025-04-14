package mini_project;

import java.awt.Desktop.Action;

import org.apache.poi.poifs.crypt.dsig.SignatureInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class mini_project {
	static WebDriver driver;
	
	@Given("Open the WebSite")
	public static void open() {
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
	}
	
	@Then("Enter Email {string}")
	public static void mail(String mailString) {
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys(mailString);
	}
	
	@And("Enter Password {string}")
	public static void password(String passString) {
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(passString);
	}
	
	@Then("Click SignIn")
	public static void signin() {
		WebElement signin = driver.findElement(By.id("send2"));
		signin.click();
	}

	
	@Given("Go to Gear and select Bags")
	public static void bags() {
		Actions actions = new Actions(driver);
		WebElement gear = driver.findElement(By.id("ui-id-6"));
		actions.moveToElement(gear).perform();
		WebElement bags = driver.findElement(By.id("ui-id-25"));
		actions.moveToElement(bags).click().perform();
	}
	
	@And("Filter any one of the features")
	public static void filter() {
		WebElement feature = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[4]/div[1]"));
		feature.click();
		WebElement waterproof = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[4]/div[2]/ol/li[5]/a"));
		waterproof.click();
	}
	
	@Then("Sort to any one of the options")
	public static void sort() {
		WebElement sort = driver.findElement(By.id("sorter"));
		Select select = new Select(sort);
		select.selectByValue("name");
	}
}
