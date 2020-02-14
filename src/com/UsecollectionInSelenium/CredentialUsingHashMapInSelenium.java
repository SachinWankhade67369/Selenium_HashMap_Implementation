package com.UsecollectionInSelenium;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CredentialUsingHashMapInSelenium {

	public static void main(String[] args) {

		System.getProperty("webdriver.chrome.driver", "D:\\Test WorkSpace\\Selenium_HashMap\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("file:///G:/JAVA%20Material/JavaByKiran_Offline%20Website/Offline%20Website/JBK%20Offline/index.html");

		WebElement classRoomExampleLink = driver.findElement(By.xpath("//a[@href=\"http://javabykiran.com/javabykiranfiles/\"]"));
		classRoomExampleLink.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@id=\"login_form_user\"]"));
		username.clear();
		username.sendKeys(getUsername("Admin"));
		
		WebElement password = driver.findElement(By.xpath("//input[@id=\"login_form_pass\"]"));
		username.clear();
		username.sendKeys(getPassword("Admin"));
		
		WebElement signInBut = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		signInBut.click();
		
		
//		System.out.println(getCredentials());
//		System.out.println(getCredentials().get("Admin").split(">>")[0]);
//		System.out.println(getCredentials().get("Admin").split(">>")[1]);
		
		System.out.println(getUsername("Admin"));

	}

	public static HashMap<String,String> getCredentials() {
		// key:Admin value: username>>password
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("Admin", "kiran@gmail.com>>123456");
		map.put("Student1", "sachin@gmail.com>>123456");
		map.put("Student2", "kishor@gmail.com>>123456");
		
		System.out.println(map);
		
		return map;
	}
	
	public static String getUsername(String roll) {
		return getCredentials().get(roll).split(">>")[0];
	}

	public static String getPassword(String roll) {
		return getCredentials().get(roll).split(">>")[1];
	}
}
