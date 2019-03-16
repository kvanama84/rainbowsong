package yahoo;

//import org.openqa.selenium.By;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Yahoologin{ 
//private static Logger log=LogManager.getLogger(Yahoologin.class.getName());

	
	public static WebDriver driver;
	public static void main(String[] args) throws Exception{
	//	log.fatal("this is a fatal error");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\browser\\chromedriver_win32\\chromedriver - Copy.exe");
		driver=new ChromeDriver();
		driver.get("https://login.yahoo.com");
		//driver.findElement
	String	text=driver.findElement(By.id("login-ueserlname")).getAttribute("id");
	
			
			Thread.sleep(2000);
	//String	textname=text.getText();
	
	System.out.println("text..." +text);
		
	//	log.debug("this is a debugging statement");
		//driver.findElement(By.id("login-signin")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.id("login-passwd")).sendKeys("9704248789");
		//driver.findElement(By.id("login-signin")).click();
		
		
		
	}

}

