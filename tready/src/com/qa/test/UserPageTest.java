package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.qa.pages.HomePage;
import com.qa.pages.UserPage;
import com.qa.testbase.TestBase;

public class UserPageTest extends TestBase{
WebElement dr;
Actions act;
	HomePage home;
	UserPage user;
	LoginPageTest login;
	public UserPageTest(){
		login=new LoginPageTest();
		login.LoginTest();
	}
	@BeforeTest
	public void setUp(){
	home=new HomePage();
	user=new UserPage();
	
	}
	
	@org.testng.annotations.Test
	public void Test() throws InterruptedException{
		 act=new Actions(driver);
		act.moveToElement(home.Usermanagement).build().perform();
		home.User.click();
		home.Addnew.click();
		Select s=new Select(user.timeZone);
		s.selectByIndex(3);
		user.Name.sendKeys("Raja03");
		user.userid.sendKeys("Raja03");
		user.Email.click();
		Thread.sleep(6000);
		user.Email.sendKeys("raja03@gmail.com");
		user.usertype.click();
		user.BusinessEntity.click();
		Thread.sleep(6000);
		user.AddNew.click();
		Thread.sleep(6000);
		user.BE.click();
		user.EntityName.click();
		Thread.sleep(3000);
		for(int i=0;i<2;i++){
			try{
				user.Role.click();
			}
			catch(Exception e){
				e.printStackTrace();
		}
		}
	user.warehouse.click();
	WebDriverWait w2=new WebDriverWait(driver,50);
	try{
	w2.until(ExpectedConditions.elementToBeClickable(user.tickmark));}
	catch(Exception e){
		e.printStackTrace();
		
	}
	user.tickmark.click();
	Thread.sleep(10000);
	user.password.click();
	Thread.sleep(10000);
	user.password.sendKeys("1234");
	user.confirmpassword.sendKeys("1234");
	user.savebutton.click();
	Thread.sleep(15000);
	w2.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("btnOk"))));
	try{
	driver.findElement(By.id("btnOk")).click();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	Thread.sleep(7000);
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		act.moveToElement(driver.findElement(By.xpath("//span[@id='CurrentUserName']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
		Thread.sleep(15000);
		driver.quit();
	}
}
