package com.test;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class sepet {

	@Test
	public void Test() throws InterruptedException {
		
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.trendyol.com/butik/liste/kadin");
	    Thread.sleep(500);	
	    driver.findElement(By.className("search-box")).sendKeys("Bilgisayar", Keys.ENTER);
		  Thread.sleep(2000);
	    driver.findElement(By.cssSelector("[data-id='39601687']")).click();
	      Thread.sleep(2000);
	    driver.findElement(By.className("add-to-bs-tx")).click();
        driver.findElement(By.className("basket-button-container")).click();
     
}
}