package pom_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class baseclass {

	public static WebDriver driver;
	public static String uname = "user@phptravels.com";
	public static String addrs = "New York , USA";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.phptravels.net/login");
		PageFactory.initElements(driver, objclass.class);
		objclass.username.sendKeys(uname);
		objclass.password.sendKeys("demouser");
		objclass.login.click();
		Thread.sleep(3000);
		objclass.drop.click();
		objclass.opt.click();
		objclass.lastname.sendKeys("Roy");
		objclass.address.sendKeys(addrs);
		objclass.update.click();
}
}