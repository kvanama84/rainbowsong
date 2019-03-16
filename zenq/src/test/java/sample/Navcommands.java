package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

	public class Navcommands {
		public static WebDriver driver;
	  @Test
	  public void f() throws Exception{ 
		  driver.findElement(By.id("lst-ib")).sendKeys("selenium");
			driver.findElement(By.name("btnK")).submit();
			Thread.sleep(4000);
			
			driver.navigate().back();
			Thread.sleep(4000);
			driver.navigate().forward();
			Thread.sleep(4000);
			driver.navigate().refresh();
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("opening browser");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\softwares for mindQ\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			  driver=new FirefoxDriver();
			driver.get("https://www.google.com/");
		  
	  }

	  @AfterTest
	  public void afterTest() {
		 // driver.quit();
	  }

	}



