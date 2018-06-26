package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class AppTest {
	
	private WebDriver driver;
	
	@BeforeClass
	public void TestSetup()
	{
		System.setProperty("webdriver.chrome.driver", "C://Selenium/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
		
	@Test
	public void SeleniumTest() throws InterruptedException
	{
	
		driver.navigate().to("http://store.demoqa.com/");
		System.out.println("Successfully opened the web page");
		//wait for 20 seconds	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//click on my account link to navigate to login page
		driver.findElement(By.className("account_icon")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//send text to the username field
		driver.findElement(By.id("log")).sendKeys("shaik");
		//send text to the password field
		driver.findElement(By.id("pwd")).sendKeys("shaik123");
		//click the login button
		driver.findElement(By.id("login")).click();			
		
	}
	
	@AfterClass
	public void CloseDriver()
	{
		//driver.quit();		
	}

}
