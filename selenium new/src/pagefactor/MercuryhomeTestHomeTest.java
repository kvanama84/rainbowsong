package pagefactor;

import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.apache.commons.io.FileUtils;
public class MercuryhomeTestHomeTest {
	WebDriver driver;
@Test
public void home(){
	MercuryToursHomePage mtp=PageFactory.initElements(driver, MercuryToursHomePage.class);
	mtp.openmercurytour();
	mtp.login();
	//mtp.register();
	}
	//Registerpage reg=PageFactory.initElements(driver,Registerpage.class);
	//some thing is ther
	@BeforeTest
	public  void before()throws InterruptedException{
		driver=Drivers.getDriver("chrome");
		
		
	}
		}
