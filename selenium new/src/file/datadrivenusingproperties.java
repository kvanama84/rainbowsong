package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datadrivenusingproperties {
public	WebDriver driver;
  @Test
  public void f() {
	  try{
		  Properties prop=new Properties();//creating property
		  prop.load(new FileInputStream("C:\\Users\\admin\\Desktop\\iostreams\\yahoo.properties"));
		  System.out.println("properties file is opened");
		  driver.findElement(By.id(prop.getProperty("username"))).sendKeys(prop.getProperty("uidinput"));
		  driver.findElement(By.xpath(prop.getProperty("next"))).click();
		  Thread.sleep(4000);
		  driver.findElement(By.name(prop.getProperty("password"))).sendKeys(prop.getProperty("pwdinput"));
		  driver.findElement(By.xpath(prop.getProperty("nexte"))).click();
		  
		  prop.setProperty("Result",driver.getTitle());
		  prop.store(new FileOutputStream("C:\\Users\\admin\\Desktop\\iostreams\\op.properties"), null);
		  
	  }
	  catch(Exception e){
		  System.out.print(e.getMessage());
	  }
  }
	  @BeforeTest
	  public void b() throws Exception {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\browser\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
 driver.get("https://gmail.com");}
		  
	    }
 

