package com.qa.testbase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;



public class TestBase {

	

		

	public static WebDriver driver;
	 public static Properties prop;

	
	public  TestBase() {
		
		try{
			prop=new Properties();
			FileInputStream fii=new FileInputStream("C:\\Users\\Elcot\\workspace\\tready\\src\\config\\property\\Config.property");
			
					prop.load(fii);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		String browsername=prop.getProperty("browser");
		System.out.println(browsername);
		}
	
	public  static void initial(){
	
	String browsername=prop.getProperty("browser");
	if(browsername.contains("firefox")){
		driver=new FirefoxDriver();
		
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.MINUTES);
	driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
	//driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("url"));
	
	
	}
	
	

}
