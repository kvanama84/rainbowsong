package multisheetwithoutexcell;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class Multipletestcases {
//public static WebDriver driver;
//public static WebElement ele;
public static void verifysignin(WebDriver driver){
	 mercurysignin.username_signin (driver).sendKeys("kiran");
	 mercurysignin.password_signin(driver).sendKeys("kir456123");
	 mercurysignin.login_signin(driver).click();
}
public static void verifyreg(WebDriver driver){
	Mercuryreg.reg_reg(driver).click();
	Mercuryreg.firstname_reg(driver).sendKeys("kiran");
	Mercuryreg.last_reg(driver).sendKeys("vanama");
	Mercuryreg.phone_reg(driver).sendKeys("9704245456");
	Mercuryreg.email_reg(driver).sendKeys("kjssk@143");
	Mercuryreg.address1_reg(driver).sendKeys("hello pathi street");
	Mercuryreg.address_reg(driver).sendKeys("beside mindQ");
	Mercuryreg.city_reg(driver).sendKeys("hyd");
	Mercuryreg.state_reg(driver).sendKeys("telangana");
	Mercuryreg.country_reg(driver).selectByValue("92");
	Mercuryreg.name_reg(driver).sendKeys("unknown");
	Mercuryreg.password_reg(driver).sendKeys("hacked");
	Mercuryreg.postalcode_reg(driver).sendKeys("321654");
	
	


}






}
	

