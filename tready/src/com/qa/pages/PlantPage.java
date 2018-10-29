package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class PlantPage extends TestBase {

	@FindBy(xpath="//span[normalize-space()='Add New']") public WebElement Addnew;
	@FindBy(xpath="//input[@id='middleContentHolder_txtEntityCode']") public WebElement EntityCode;
	@FindBy(xpath="//input[@id='middleContentHolder_txtPlantCode']") public WebElement Plantcode;
	@FindBy(xpath="//input[@id='middleContentHolder_txtPlantName']") public WebElement Plantname;
	@FindBy(xpath="//input[@id='middleContentHolder_txtContactPerson']") public WebElement ContactPerson;
	@FindBy(xpath="//input[@id='middleContentHolder_chkIsActive']") public WebElement Isactive;
	@FindBy(xpath="//input[@id='middleContentHolder_txtWarehouse']") public WebElement Warehouse;
	@FindBy(xpath="//img[@id='middleContentHolder_btnGeography']") public WebElement BusinessLocationicon;
	@FindBy(xpath="//a[normalize-space()='United States']") public WebElement UnitedStates;
	@FindBy(xpath="//input[@id='middleContentHolder_txtDeptCode']") public WebElement Deptcode;
	@FindBy(xpath="//input[@id='btnSaveBottom']") public WebElement Savebutton;
	@FindBy(xpath="//input[@id='btnViewBottom']") public WebElement ViewButton;
	
	public PlantPage(){
		PageFactory.initElements(driver, this);
	}
}
