package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class UserPage extends TestBase {

	@FindBy(name="ctl00$middleContentHolder$ddlTimeZone") public WebElement timeZone;
	@FindBy(id="txtBusinessUserName") public WebElement Name;
	@FindBy(id="txtUserId") public WebElement userid;
	@FindBy(id="txtEmail") public WebElement Email;
	@FindBy(xpath="//img[@id='middleContentHolder_Image1']") public WebElement usertype;
	@FindBy(xpath="//input[@id='chkBusinessEntityUser']") public WebElement BusinessEntity;
	@FindBy(xpath="//a[normalize-space()='Add New']") public WebElement AddNew;
	@FindBy(xpath="//input[@name='ctl00$middleContentHolder$rgrdBusinessEntity$ctl00$ctl02$ctl02$drpBEID']")public WebElement BE;
	@FindBy(xpath="//span[normalize-space()='traceREADY/Navitas/Edge']") public WebElement EntityName;
	@FindBy(xpath="//input[@id='ctl00_middleContentHolder_rgrdBusinessEntity_ctl00_ctl02_ctl02_drpRoleID_Input']") public  WebElement Role;
	@FindBy(xpath="//li[normalize-space()='Warehouse User']") public WebElement warehouse;
	@FindBy(xpath="//input[@id='ctl00_middleContentHolder_rgrdBusinessEntity_ctl00_ctl02_ctl02_btnInsert']") public WebElement tickmark;
	@FindBy(id="txtPassword") public WebElement password;
	@FindBy(id="txtConfirmPwd") public  WebElement confirmpassword;
	@FindBy(id="btnSaveBottom") public WebElement savebutton;

	public UserPage(){
		PageFactory.initElements(driver, this);
	}
	
	
}
