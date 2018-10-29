package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//a[normalize-space()='User Management']") public WebElement Usermanagement;
	@FindBy(xpath="//a[normalize-space()='User']") public  WebElement User;
	@FindBy(xpath="//span[normalize-space()='Add New']") public WebElement Addnew;
	@FindBy(xpath="//a[text()='Setup']") public WebElement Setup;
	@FindBy(xpath="//a[normalize-space()='Plant']") public WebElement plant;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
}
