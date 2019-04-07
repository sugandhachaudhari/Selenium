package com.TestNG.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Googlesearch 
{

	WebDriver driver;
	   @Test
	   public void test1()
	   {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\chromedriver.exe");
		   driver.manage().window().maximize();
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com");
		   WebElement element = driver.findElement(By.name("q"));
		   element.sendKeys("Selenium");
	   }
	   @Test
	   public void test2()
	   {
		   driver.quit();
	   }

}
