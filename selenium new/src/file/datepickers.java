package file;

import java.util.List;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;


public class datepickers {
public static WebDriver driver;

	public static void main(String args[])throws Exception{
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\browser\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.abhibus.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement dateWidget = driver.findElement(By.id("datepicker1"));
	List <WebElement> columns=dateWidget.findElements(By.tagName("a"));

	for (WebElement cell: columns){
	   //Select 13th Date 
	   if (cell.getText().equals("27")){
		   System.out.println("datepickers open");
	      cell.findElement(By.linkText("27")).click();
	      break;
	 }
	}
}}
