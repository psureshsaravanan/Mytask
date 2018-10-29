package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class Loginpage extends TestBase {

	@FindBy(xpath="//td/input[contains(@name,'lgnDMS$UserName')]") public WebElement username;
	@FindBy(xpath="//input[@id='lgnDMS_Password']") public WebElement password;
	@FindBy(id="ibtnLogin") public WebElement LoginButton;

	
	public Loginpage(){
		PageFactory.initElements(driver, this);
	}
	
}
