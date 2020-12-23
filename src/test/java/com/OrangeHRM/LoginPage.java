package com.OrangeHRM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPage {

	@Test
	public void LoginwithValidCredentials() {
		//
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElementByName("txtUsername").sendKeys("Admin");
		driver.findElementByName("txtPassword").sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//Checkpoint ( Verifying the Exp vs Act result)
		driver.findElementByLinkText("Dashboard").isDisplayed();
		//driver.close();//Close will close current browser opened by WebDriver
		driver.quit(); //Quit will close all browser opened by WebDriver
		
	}

}
