package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {

	 public static WebDriver driver;
	
	@BeforeMethod
	public void openBrowser(){
		
		driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void login(){
	
		
	
	}

}
