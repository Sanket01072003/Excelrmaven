package TestNG_prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTestNG {

	@Test(dataProvider = "login")
	public static void login(String username , String password) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username1=driver.findElement(By.name("username"));
		username1.sendKeys(username);
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys(password);
		WebElement login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertTrue(element.isDisplayed(), "Passed Successfully");
		Assert.assertTrue(element.isDisplayed(), "Passed Successfully");
	}
	
	@DataProvider(name = "login")
	public static String[][] logindata(){
		String[][] data = new String[3][2];
		data[0][0] = "admin";
		data[0][1] = "admin@123";
		data[1][0] = "Admin";
		data[1][1] = "admin123";
		data[2][0] = "ADMIN";
		data[2][1] = "Admin@123";
		return data;
	}

}
