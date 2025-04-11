package pom_pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class objclass {

	@FindBy(name="email")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(id="submitBTN")
	public static WebElement login;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[3]/a")
	public static WebElement drop;
//	Select drop_dn = new Select(drop);
//	drop_dn.selectByVisibleText("Profile");
	
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[3]/ul/li[3]/a")
	public static WebElement opt;
	
	@FindBy(id="Last Name")
	public static WebElement lastname;
	
	@FindBy(id="Address")
	public static WebElement address;
	
	@FindBy(xpath="//*[@id=\"profile\"]/div/div[6]/button")
	public static WebElement update;
}
