package com.demp.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginPageTest {
	
	WebDriver driver;
	@Test
	public void loginTest(){

        System.setProperty("webdriver.gecko.driver", "C:\\AllDrivers\\NewGeckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/");

		System.out.println("Login Test Successful !!!!!");
		
	}
}
