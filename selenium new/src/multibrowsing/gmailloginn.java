package multibrowsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class gmailloginn {
	WebDriver driver;
	@BeforeTest 
public void setup(){
System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\browser\\geckodriver-v0.21.0-win64\\geckodriver.exe");
driver=new FirefoxDriver();
driver.get("http://gmail.com");
driver.manage().window().maximize();
	}
  @Test(dataProvider = "kiran")
  public void f(String username, String password)throws InterruptedException {
	WebElement e =driver.findElement(By.id("identifierId"));
	e.sendKeys(username);
 WebElement ki =driver.findElement(By.xpath("//span[text()='Next']"));
 ki.click();
 Thread.sleep(2000);
 WebElement pssword=driver.findElement(By.name("password"));
 
 pssword.sendKeys("password");
 
 Thread.sleep(1000);
 WebElement ka =driver.findElement(By.xpath("//span[text()='Next']"));
 ka.click();
 System.out.println("login successfull");
	}
  

  @DataProvider(name="kiran")
  public static Object[][] getdatafromdataprovider() {
    return new Object[][] {
    		{"kiran.vanama789@gmail.com","kiran7896"}
     // new Object[] { 1, "a" },
      //new Object[] { 2, "b" },
    };
  }
}
