package com.test;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class hesapgiriþ {


	@Test
	public void Test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.trendyol.com/butik/liste/kadin");
		Thread.sleep(500);	
		driver.findElement(By.id("accountBtn")).click();
		Thread.sleep(4000);	
		driver.findElement(By.id("email")).sendKeys("testohesap@hotmail.com");
	    driver.findElement(By.id("password")).sendKeys("Testhesap123");
	    Thread.sleep(2000);
	    driver.findElement(By.id("loginSubmit")).click();
	
	}
}
