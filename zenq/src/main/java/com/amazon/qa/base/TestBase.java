package com.amazon.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.amazon.qa.pages.Drivers;
import com.amazon.qa.pages.Homepage;
import com.amazon.qa.util.TestUtil;
import com.listeners.listeners;


public class TestBase {
public static WebDriver driver;
public static Properties prop;
public static EventFiringWebDriver e_driver;
public static listeners eventlis;


public TestBase(){
	{
			try
			{
				prop=new Properties();
				
				prop.load(new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\amazon\\qa\\config\\config.properties"));		
		
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
				}}
			

		}
		
		public static void initialization()
		{
			
			e_driver=new EventFiringWebDriver(driver);
			eventlis=new listeners();
			e_driver.register(eventlis);
			driver=e_driver;
			driver.get(prop.getProperty("url"));

		
		//	Actions action=new Actions(driver);
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			
		}

		
		
		

	}
