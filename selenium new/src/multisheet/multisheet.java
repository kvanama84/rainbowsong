package multisheet;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class multisheet {
	public WebDriver driver;
  @Test
  public void f() {
	  try{
		  FileInputStream kiran=new FileInputStream("C:\\Users\\admin\\Desktop\\iostreams\\multisheets.xls");
		  Workbook wb=Workbook.getWorkbook(kiran);
		  Sheet sh=wb.getSheet(1);
		  int rcount=sh.getRows();//to find how many rows in a sheet
		 for(int i=1;i<rcount;i++){
			String objrep=sh.getCell(1,i).getContents();
			System.out.println(objrep);
		String objtyp=sh.getCell(2,i).getContents();
		System.out.println(objtyp);
		String testtype=sh.getCell(3,i).getContents();
		switch(objtyp){
		case "Link":
			driver.findElement(By.linkText(objrep)).click();
		break;
	
		case "Text":
			driver.findElement(By.name(objrep)).sendKeys(testtype);
		break;
		case "Button":
			driver.findElement(By.name(objrep)).click();
		break;
		case "Radio":
			driver.findElement(By.id(objrep)).click();
		break;
		case "Checkbox":
			driver.findElement(By.id(objrep)).click();
		break;
		case "DropDown":
			new Select(driver.findElement(By.name(objrep))).selectByVisibleText(testtype);
		break;
		default:break;
			
		}
		
		 }
	  }
  catch(Exception e){
	  System.out.println(e);
  }}
@BeforeTest
public void launch()throws Exception{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://newtours.demoaut.com");
	  Thread.sleep(4000);
	
}
}
