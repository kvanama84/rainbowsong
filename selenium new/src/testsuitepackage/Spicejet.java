package testsuitepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {
	public static WebDriver driver;
  @Test
  public  void f() throws Exception {
	//  Thread.sleep(4000);
	  //System.out.println("what is going");
//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//driver.findElement(By.xpath("//a[test()='Hyderabad (HYD)']")).click();
//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
	  	  
	  
  }
  @BeforeTest
  public  void beforeTest()throws Exception {
	  
System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\browser\\geckodriver-v0.21.0-win64\\geckodriver.exe");
FirefoxDriver driver=new FirefoxDriver();
driver.get("https://www.spicejet.com/");

Thread.sleep(4000);
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//driver.findElement(By.xpath("//a[test()='Hyderabad (HYD)']")).click();
driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[2]/li[3]/a")).click();
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[4]/li[9]/a")).click();
driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[5]/td[2]/a")).click();
driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[5]/button")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a/span")).click();
driver.findElement(By.linkText("7")).click();
////*[@id="ctl00_mainContent_btn_FindFlights"]
driver.findElement(By.id("divpaxinfo")).click();
driver.findElement(By.id("hrefIncAdt")).click();
driver.findElement(By.id("btnclosepaxoption")).click();//for donebutton
Thread.sleep(4000);
driver.findElement(By.id("ctl00$mainContent$DropDownListCurrency")).click();
Select dropdown=new Select(driver.findElement(By.id("ctl00$mainContent$DropDownListCurrency")));
dropdown.selectByValue("AED");
////*[@id="ctl00_mainContent_btn_FindFlights"]
Thread.sleep(2000);
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
Thread.sleep(1000);
driver.findElement(By.id("popUpConverter")).click();
Thread.sleep(15000);
driver.switchTo().window("");
new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"))).selectByValue("AED");
new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency"))).selectByVisibleText("Indian Rupee(INR)");
driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("200");
driver.findElement(By.id("CurrencyConverterCurrencyConverterView$ButtonConvert")).click();
driver.findElement(By.id("ButtonCloseWindow")).click();
driver.close();

	  	  


  }

  @AfterTest
  public void afterTest() {
  }

}
