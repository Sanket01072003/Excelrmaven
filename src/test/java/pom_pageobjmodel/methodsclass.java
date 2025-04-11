package pom_pageobjmodel;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class methodsclass {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.phptravels.net/login");
		
		
		elementsclass.username(driver).sendKeys("user@phptravels.com");

		elementsclass.password(driver).sendKeys("demouser");
		
		elementsclass.login(driver).click();
		
	}

}
