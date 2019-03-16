package testngGroups;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testgroup {
	WebDriver driver;
  @Test(groups="regreation testing",priority=3)
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\browser\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	  driver.get("https://google.com");
  }
  @Test(groups="blackboxtesting",priority=0)
  public void k(){
	  System.out.println("blackbox testing open");
  }
  @Test(groups="re-testing",priority=1)
	  public void n(){
	  System.out.println("retesing");  
	  }
  @Test(groups="performance testing",priority=2)
  public void a(){
	  System.out.println("performance");
  }
  }



