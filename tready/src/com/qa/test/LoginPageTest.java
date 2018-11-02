package com.qa.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.Loginpage;
import com.qa.pages.PlantPage;
import com.qa.testbase.TestBase;

public class LoginPageTest extends TestBase {
	Loginpage login;
	
	
	public LoginPageTest(){
		super();
initial();
login=new Loginpage();

		}
	
	@Test
	public void LoginTest(){
		
		
		
login.username.sendKeys(prop.getProperty("username"));
		
		login.password.sendKeys(prop.getProperty("password"));
		login.LoginButton.click();
	}
	}

