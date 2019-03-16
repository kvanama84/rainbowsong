package pagefactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.testng.annotations.Test;

public class MercuryToursHomePage {
	WebDriver driver;
 // @Test
//  public void f() {
	//  @FindBy(css="input[name='userName']")WebElement username;
//  }

	  @FindBy(css="input[name='userName']")WebElement username;
	  @FindBy(css="input[name='password']")WebElement password;
	  @FindBy(css="input[name='login']")WebElement login;
	  @FindBy(css="input[linktext='REGISTER']")WebElement Register;
	  public MercuryToursHomePage(WebDriver driver){
		  this.driver=driver;
	  }
public void openmercurytour(){
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
}
public void login(){
	username.sendKeys("mq1234");
	password.sendKeys("123654");
	login.click();
	System.out.println(driver.getTitle());
}
public void register(){
	Register.click();
}

}