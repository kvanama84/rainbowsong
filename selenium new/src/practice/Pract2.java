package practice;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pract2 {
	public static WebDriver driver;
	public static void main(String args[]){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\browser\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
		//driver.get("https://Ebay.com");
		try{
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\Desktop\\iostreams\\practise.xls");
		Workbook wwb=Workbook.getWorkbook(file);
		Sheet sh1=wwb.getSheet(0);
		driver.get("https://Ebay.com");
		driver.findElement(By.linkText(sh1.getCell(0,1).getContents())).click();
		driver.findElement(By.id(sh1.getCell(1,1).getContents())).sendKeys(sh1.getCell(0,2).getContents());
		
		}
	catch (Exception e){
		System.out.println(e);
		
	}

}}
