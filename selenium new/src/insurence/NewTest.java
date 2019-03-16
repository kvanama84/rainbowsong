package insurence;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
  @Test()
  public void f() throws Exception{
	  driver.findElement(By.linkText("Life Insurance")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@id='termName']")).sendKeys("hiii");
	   WebDriverWait obj=new WebDriverWait(driver,60);
	   obj.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
	   }
  @BeforeTest
  public void loginpage(){
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\browser\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	 // driver.get("https://www.policybazaar.com/");
	  
	 // String nm=driver.getPageSource();
	 // System.out.println(nm);
  }
  
}
