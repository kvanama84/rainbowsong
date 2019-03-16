package multisheetwithoutexcell;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Mercuryreg {
	public static WebDriver driver;
	public static WebElement ele;
	public static WebElement reg_reg(WebDriver driver){
		ele=driver.findElement(By.linkText("REGISTER"));
		return ele;
	}

	public static WebElement firstname_reg(WebDriver driver){
		ele=driver.findElement(By.name("firstName"));
		return ele;
	}
	public static WebElement last_reg(WebDriver driver){
		ele=driver.findElement(By.name("lastName"));
		return ele;
	}
	public static WebElement phone_reg(WebDriver driver){
		ele=driver.findElement(By.name("phone"));
		return ele;
	}
	public static WebElement email_reg(WebDriver driver){
		ele=driver.findElement(By.name("userName"));
		return ele;
	}
	public static WebElement address_reg(WebDriver driver){
		ele=driver.findElement(By.name("address1"));
		return ele;

	}
	public static WebElement address1_reg(WebDriver driver){
		ele=driver.findElement(By.name("address2"));
		return ele;
	}
	public static WebElement city_reg(WebDriver driver){
		ele=driver.findElement(By.name("city"));
		return ele;
	}
	public static WebElement state_reg(WebDriver driver){
		ele=driver.findElement(By.name("state"));
		return ele;
	}
	public static WebElement postalcode_reg(WebDriver driver){
		ele=driver.findElement(By.name("postalCode"));
		return ele;
	}
	public static Select country_reg(WebDriver driver){
		Select ele= new Select (driver.findElement(By.name("country")));
		return ele;
	}
	public static WebElement name_reg(WebDriver driver){
		ele=driver.findElement(By.id("email"));
		return ele;
	}
	public static WebElement password_reg(WebDriver driver){
		ele=driver.findElement(By.id("password"));
		return ele;
	}
	
	      }
