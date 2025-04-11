package pom_pageobjmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elementsclass {
	public static WebElement username(WebDriver driver) {
	return driver.findElement(By.name("email"));}
	
	public static WebElement password(WebDriver driver) {
	return driver.findElement(By.name("password"));}
	
	public static WebElement login(WebDriver driver) {
	return driver.findElement(By.id("submitBTN"));}
}
