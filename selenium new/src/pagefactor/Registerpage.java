package pagefactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import org.testng.annotations.Test;

public class Registerpage {
	WebDriver driver;
	@FindBy(name="firstName")WebElement regfirstName;
	@FindBy(name="lastName")WebElement reglastName;
	@FindBy(name="phone")WebElement regphone;
	@FindBy(name="userName")WebElement reguserName;
	@FindBy(name="address1")WebElement regaddress1;
	@FindBy(name="address2")WebElement regaddress2;
	@FindBy(name="city")WebElement regcity;
	@FindBy(name="state")WebElement regstate;
	@FindBy(name="country")WebElement regcountry;
	@FindBy(id="email")WebElement email;
	@FindBy(id="password")WebElement password;


public Registerpage(WebDriver driver){
	this.driver=driver;
} 
public void data_regestiration(){
	regfirstName.sendKeys("kiygghjj");
	reglastName.sendKeys("125463");
	regphone.sendKeys("9704248789");
	reguserName.sendKeys("lkjhgf");
	regaddress1.sendKeys("123");
	regaddress2.sendKeys("adehdk");
	regcity.sendKeys("hyd");
	regstate.sendKeys("ap");
	email.sendKeys("skksks@123");
	password.sendKeys("pass");
	
	
}

}

