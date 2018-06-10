package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author bravo 
 * Basic Authentication test 
 * 1. open browser chrome 
 * 2. go to website http://newtours.demoaut.com/ 
 * 3. enter username: tutorial 
 * 4.enter password: tutorial 
 * 5. click Sign in button 
 * 6. Verify title
 *         contains: Expected : Find a Flight
 */
public class SonTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/bravo/Documents/selenium dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testing-ground.scraping.pro/login");
		
		// finds element on a page
//		locator --> is a way of finding element on a page used by selenium. locators are represended
		Thread.sleep(2000);
		driver.findElement(By.name("usr")).sendKeys("admin"); 
		driver.findElement(By.name("pwd")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();;
		Thread.sleep(2000);
		
		String expected = "welcome";
		String actual = driver.getTitle();
		
		
		if(actual.contains(expected)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
			System.out.println("Expected:\t" + expected);
			System.out.println("Actual:\t" + actual);
		}
		
	}

}
