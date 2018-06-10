package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/bravo/Documents/selenium dependencies/drivers/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.cybertekschool.com");
////		driver.get("https://www.cybertekschool.com");
//		
//		String expected = "cybertekschool";
//		String actual = driver.getCurrentUrl();
//		
//		if(actual.contains(expected)) {
//			System.out.println("pass");
//		}else {
//			System.out.println("fail");
//			System.out.println("Expected:\t" + expected);
//			System.out.println("Actual:\t" + actual);
//		}
		WebDriver driver2 = new ChromeDriver();
		driver2.navigate().to("https://www.google.com");
		
		String expected2 = "google";
		String actual2 = driver2.getCurrentUrl();
		
//		verifyweb(expected2, actual2);
		
		if(actual2.contains(expected2)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
			System.out.println("Expected:\t" + expected2);
			System.out.println("Actual:\t" + actual2);
		}
		driver2.navigate().to("https://www.google.com");
		Thread.sleep(1000);
		driver2.navigate().back(); // goes back to previous page
		Thread.sleep(1000);
		driver2.navigate().forward(); // goes forward in browsing history
		Thread.sleep(1000);
		driver2.navigate().refresh(); // refreshed the current page
		Thread.sleep(1000);

	}
	
//	public static String verifyweb(String ex, String ac) {
//		if(ac.contains(ex)) {
//			return "pass";
//		}else {
//		return "fail" + "Expected:\t" + ex + "Actual:\t" + ac;
//		}
//	}

}
