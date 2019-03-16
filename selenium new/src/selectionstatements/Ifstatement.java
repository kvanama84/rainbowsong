package selectionstatements;

//import java.util.Set;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ifstatement {
	public static WebDriver driver;
	public static void main(String[] args)throws Exception{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\browser\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("http://google.com");
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	System.out.println(driver.getTitle());
	String kl=driver.getTitle();
if(kl.contentEquals(driver.getTitle())){
	System.out.print("google is present");
}
else{
	System.out.print("google is not present");
}
	
}
}