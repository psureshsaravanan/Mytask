package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.testbase.TestBase;

public class Inbound extends TestBase  {
	
	@BeforeMethod
	public void setUp(){
		LoginPageTest login=new LoginPageTest();
	login.LoginTest();	
	}
	@Test
	public void Verify() throws InterruptedException{
		
		
		WebElement utils=driver.findElement(By.xpath("//a[text()='Utils']"));
		Actions act=new Actions(driver);
		act.moveToElement(utils).build().perform();
		driver.findElement(By.xpath("//a[normalize-space()='RF Terminal']")).click();
		Thread.sleep(3000);
		WebElement E1=driver.findElement(By.xpath("//object[@id='RFObj']"));
		System.out.println(E1);
driver.switchTo().frame(E1);

driver.findElement(By.xpath("//*[@id='navsettings']/span/span[1]")).click();

	}
	

	
}
