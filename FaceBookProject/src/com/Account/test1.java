package com.Account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class test1 {
	
	//testing
	//testing by srini
	public static WebDriver driver=null;
	
	@BeforeMethod
	public static void openBrowser(){
		
		driver= new ChromeDriver();
		
		
	}
	

}
