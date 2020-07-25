package com.test;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class anasayfa {

	@Test
	public void Test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.trendyol.com/butik/liste/kadin");
		Thread.sleep(500);	
}
}