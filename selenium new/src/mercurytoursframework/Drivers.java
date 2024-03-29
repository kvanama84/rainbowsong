package mercurytoursframework ;

import java.io.File;
import java.io.IOException;


//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {
	
	public static WebDriver getDriver(String browser){
		WebDriver driver = null;
		
		if (browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\browser\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			   driver=new FirefoxDriver();

			driver = new FirefoxDriver();
		}else if (browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", "D:\\lib\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else if (browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}//else{
		//	System.out.println("you have supplied wrong keyword(keywords are: 'firefoox, 'chrome', 'ie'); hence i am running on htmlunit browser");
			//driver = new HtmlUnitDriver();
	//	}
		
		return driver;
		
	}
	
	public static void takeScreenshot(WebDriver driver, String filePath, String fileName) throws IOException{
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(screenshot, new File(filePath + fileName + ".png"));
	}

}
