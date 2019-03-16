package com.amazon.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.util.TestUtil;


public class Homepage extends TestBase {
	//static Homepage kir;
@FindBy(xpath="//*[@id='nav-link-yourAccount']")WebElement navigationyourlink;
	
@FindBy(id="nav-link-prime")WebElement navigationprimelink;
	
@FindBy(id="twotabsearchtextbox")WebElement textbox;
public Homepage() 

{
	
	PageFactory.initElements(driver, this);
}

public void homepage()throws Exception{
	
	
	Actions action=new Actions(driver);
	System.out.println("enter into home page");
	
	action.moveToElement(navigationyourlink).build().perform();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	action.moveToElement(navigationprimelink).build().perform();
	Thread.sleep(3000);
	action.contextClick(textbox).build().perform();
	
}


}