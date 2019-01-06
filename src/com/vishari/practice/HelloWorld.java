package com.vishari.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
		
		String URL = "https://www.facebook.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
	
		driver.close();
		
		
	}

}
