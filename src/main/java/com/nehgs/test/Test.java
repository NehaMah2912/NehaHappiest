package com.nehgs.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neha\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		driver.quit();
		
	

	}

}
