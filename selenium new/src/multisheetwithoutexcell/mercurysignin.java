package multisheetwithoutexcell;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class mercurysignin {
	public static WebDriver driver;
public static WebElement ele;
  @Test
  public static WebElement username_signin (WebDriver driver) {
	  ele=driver.findElement(By.name("userName"));
	  return ele;
  }
  public static WebElement password_signin (WebDriver driver) {
	  ele=driver.findElement(By.name("password"));
	  return ele;
  }
  public static WebElement login_signin (WebDriver driver) {
	  ele=driver.findElement(By.name("login"));
	  return ele;
  }

          }








