package waitcomands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;


public class Sample {
	public static WebDriver driver;
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
			
			 driver=new ChromeDriver();
			driver.get("http://facebook.com");
			driver.findElement(By.id("email")).sendKeys("kiran.vanama789@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("******");
			driver.findElement(By.id("u_0_2")).click();

		}}
