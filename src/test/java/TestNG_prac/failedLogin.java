package TestNG_prac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class failedLogin {
	static WebDriver driver;
	@Test(retryAnalyzer = retryanlyser.class)
	public static void login() {
		driver=new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement username1=driver.findElement(By.name("username"));
		username1.sendKeys("Admin");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("admin");
		WebElement login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		WebElement dash=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		
		Assert.assertTrue(dash.isDisplayed(),"login passed");
	}
}
