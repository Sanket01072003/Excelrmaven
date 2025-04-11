package TestNG_prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_after_before {
	static WebDriver driver;
	@BeforeTest()
	public static void before() {
		driver = new ChromeDriver();
	}
	
	@Test(priority = 1)
	public static void priority1 () {
		System.out.println("Priority 1");
	}
	
	@Test(priority = 2)
	public static void priority2 () {
		System.out.println("Priority 2");
	}
	
	@AfterTest()
	public static void after () {
		driver.close();
		
	}
}
