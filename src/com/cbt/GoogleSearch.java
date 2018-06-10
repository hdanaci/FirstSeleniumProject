package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) {
/*
 * open chrome
 * go to url www.google.com
 * verify title
 * 	expected : Google
 */
		System.setProperty("webdriver.chrome.driver",
				"/Users/bravo/Documents/selenium dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String expected = "Google";
		String actual = driver.getTitle();
		
		if(expected.equals(actual)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
			System.out.println("Expected:\t" + expected);
			System.out.println("Actual:\t" + actual);
		}
	}
}
