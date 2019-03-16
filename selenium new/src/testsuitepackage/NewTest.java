package testsuitepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	private WebDriver driver;
	
	 @Parameters("browser")
	
  @Test
  public void setup()throws InterruptedException {
	  driver.get("http://epaper.eenadu.net");
	  
  }
  @BeforeMethod
 
  public void brforemethod(String browser) {
	  if(browser.equalsIgnoreCase("firefox")){
		  
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\browser\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		   driver=new FirefoxDriver();
		  System.out.println("firefox testinng");
	  }
	  else if(browser.equalsIgnoreCase("chrome")){
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  System.out.println("chrome is testing");
	  }
		  
	driver.manage().window().maximize();	  
	  
  }
	
  @AfterMethod
  public void f2() {
  }
	
}
