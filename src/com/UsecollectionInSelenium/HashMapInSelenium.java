package com.UsecollectionInSelenium;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapInSelenium {

	public static void main(String[] args) {

		System.getProperty("webdriver.chrome.driver", "D:\\Test WorkSpace\\Selenium_HashMap\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("file:///G:/JAVA%20Material/Testing%20Material/Selenium%20Software/Offline%20Website/index.html");

		System.out.println(getConfidential());
		
		System.out.println(getConfidential().get("Admin"));
		
		// spilt() method of string which returns String[] and takes input as Regex
		//System.out.println(getConfidential().get("Admin").split(" >> ")[0]);
		//System.out.println(getConfidential().get("Admin").split(" >> ")[1]);

		/*
		 * WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		 * email.sendKeys(getConfidential().get("Admin").split(" >> ")[0]);//HardCoded
		 * 
		 * 
		 * WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		 * email.sendKeys(getConfidential().get("Admin").split(" >> ")[1]);
		 * 
		 * driver.findElement(By.xpath("//button[@type='submit']")).click();
		 */

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(getUsername("Admin"));

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(getPassword("Admin"));

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.quit();

	}

	public static HashMap<String, String> getConfidential() {
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("Admin", "kiran@gmail.com >> 123456");
		map.put("Student1", "sachin@gmail.com >> 123456");
		map.put("Student2", "nilesh@gmail.com >> nilesh654");
		map.put("Student3", "kishor@gmail.com >> kishor123");

		return map;
	}

	public static String getUsername(String roll) {
		
		String username = getConfidential().get(roll).split(" >> ")[0];
		
		return username;
	}

	public static String getPassword(String roll) {
		
		String password = getConfidential().get(roll).split(" >> ")[1];
		
		return password;
	}

}
