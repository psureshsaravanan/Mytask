package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class Loginpage extends TestBase {
	
	//

	@FindBy(xpath="//*[@id='lgnDMS_Div6']/table/tbody/tr[1]/td/input[2]") public WebElement username;
	@FindBy(xpath="//*[@id='lgnDMS_Div6']/table/tbody/tr[2]/td/input[2]") public WebElement password;
	@FindBy(id="ibtnLogin") public WebElement LoginButton;

	
	public Loginpage(){
		PageFactory.initElements(driver, this);
	}
	
}
