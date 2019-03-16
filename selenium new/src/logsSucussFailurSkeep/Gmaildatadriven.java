package logsSucussFailurSkeep;// reading the data from xlm

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Gmaildatadriven {
	public WebDriver driver;
	public FileInputStream f1;
	public Workbook wb;
	public Sheet sh1;
	public Sheet sh2;
  @Test
  public void gmaillogin() throws Exception {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\browser\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
 f1=new FileInputStream("C:\\Users\\admin\\Desktop\\iostreams\\gmailacessinggthrowxml.xls");
 wb=Workbook.getWorkbook(f1);
 sh1=wb.getSheet(0);
 sh2=wb.getSheet(1);
 driver.get("https://gmail.com");
 driver.findElement(By.id(sh1.getCell(0,1).getContents())).sendKeys(sh2.getCell(0,1).getContents());
 driver.findElement(By.xpath(sh1.getCell(1,1).getContents())).click();
 Thread.sleep(4000);
 driver.findElement(By.name(sh1.getCell(2,1).getContents())).sendKeys(sh2.getCell(1,1).getContents());
 driver.findElement(By.xpath(sh1.getCell(3,1).getContents())).click();
 driver.findElement(By.xpath(sh1.getCell(4,1).getContents())).click();
	  
		  
	  
  }
}
