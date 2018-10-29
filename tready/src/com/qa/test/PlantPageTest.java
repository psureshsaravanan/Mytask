package com.qa.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.PlantPage;
import com.qa.testbase.TestBase;

public class PlantPageTest extends TestBase {
	
	
	LoginPageTest login;
	HomePage home;
	PlantPage plant;
	Actions act;
	
	@BeforeMethod
public void setUp(){

	login=new LoginPageTest();
	login.LoginTest();
	
	home=new HomePage();
	 plant=new PlantPage();

}
	
	@Test
	public void plantPageTest() throws InterruptedException{
		 
		act=new Actions(driver);
		act.moveToElement(home.Setup).build().perform();
		home.plant.click();
		plant.Addnew.click();
		//------------------------------------------------
	try{
		plant.BusinessLocationicon.click();
		for(int i=0;i<3;i++){
			Set<String> set=driver.getWindowHandles();
	Iterator<String> it=set.iterator();
	String parent=it.next();
	driver.switchTo().window(parent);
	driver.quit();
		
		break;
		
		}
		}
	catch(Exception e){
	System.out.println(e.getMessage());}
	System.out.println("done=================");
//		driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.MINUTES);
//		Thread.sleep(4000);
//		WebDriverWait w2=new WebDriverWait(driver,50);
//		w2.until(ExpectedConditions.elementToBeClickable(plant.UnitedStates));
//
//		plant.UnitedStates.click();
//
//Set<String> set=driver.getWindowHandles();
//Thread.sleep(4000);
//	it=set.iterator();
//	Thread.sleep(4000);
//String parent=it.next();
//Thread.sleep(4000);
//String child=it.next();
//Thread.sleep(4000);
//driver.switchTo().window(child);
//String chi=driver.getCurrentUrl();
//System.out.println(chi);
////WebDriverWait w2=new WebDriverWait(driver,50);
////w2.until(ExpectedConditions.elementToBeClickable(plant.UnitedStates));
//
////plant.UnitedStates.click();
//Thread.sleep(4000);
//driver.switchTo().window(parent);
////----------------------------------
//		plant.EntityCode.sendKeys("4321");
//		plant.Plantcode.click();
//		Thread.sleep(4000);
//		plant.Plantcode.sendKeys("4356");
//		plant.Plantname.sendKeys("UAS");
//		plant.ContactPerson.sendKeys("Raja");
//		plant.Isactive.click();
//		plant.Warehouse.sendKeys("ware");
//		Thread.sleep(4000);
//		
//		plant.BusinessLocationicon.click();
//		driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.MINUTES);
//		Thread.sleep(4000);
////Set<String> set=driver.getWindowHandles();
////Thread.sleep(4000);
////	it=set.iterator();
////	Thread.sleep(4000);
////String parent=it.next();
////Thread.sleep(4000);
////String child=it.next();
////Thread.sleep(4000);
////driver.switchTo().window(child);
////String chi=driver.getCurrentUrl();
////System.out.println(chi);
////WebDriverWait w2=new WebDriverWait(driver,50);
////w2.until(ExpectedConditions.elementToBeClickable(plant.UnitedStates));
//
//plant.UnitedStates.click();
//Thread.sleep(4000);
//driver.switchTo().window(parent);
//
		
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
