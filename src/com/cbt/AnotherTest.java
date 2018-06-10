package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherTest {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"/Users/bravo/Documents/selenium dependencies/drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("http://www.amazon.com");
			Thread.sleep(2000);
//			driver.close(); // closes the current tab
			driver.quit();

	}

}
