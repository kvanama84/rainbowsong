package testsuitepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Waitcommands {
	WebDriver driver;
  @Test
  public void f()throws Exception {
 WebElement id=driver.findElement(By.id("identifierId"));
	 id.sendKeys("kiran.vanama789@gmail.com");
WebElement nextbutton=driver.findElement(By.xpath("//span[text()='Next']"));
     nextbutton.click();
 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
 WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
     password.sendKeys("kiran789654");
     Thread.sleep(1000);
  WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
     next.click();
 WebDriverWait wait=new WebDriverWait(driver,60);
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Compose')]")));
driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
 
	  
  }
  @BeforeTest
  public void beforeTest() {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.get("http://gmail.com");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	 // driver.quit();
  }

}
