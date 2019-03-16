package com.amazon.qa.testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.Drivers;
import com.amazon.qa.pages.Homepage;
import com.amazon.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	
public 	Homepage hm;//=new HomePage();

	//TestUtil tu;
	
	public HomePageTest()
	{
		super();
	}
  @Test
  public void f() throws Exception{
		Drivers.getDriver("chrome");
		initialization();
		hm=new Homepage();
		hm.homepage();
		
		
	
		
  }
}
