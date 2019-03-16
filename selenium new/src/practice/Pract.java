package practice;


import java.io.FileOutputStream;
import jxl.write.Label;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

//import org.apache.poi.xssf.usermodel.examples.CreateCell;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Pract {
	//public static WebDriver driver;
	
	public static void main(String args[])throws Exception{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
		//driver=new ChromeDriver();
		//driver.get("https://Ebay.com");
		
		FileOutputStream f1=new FileOutputStream("C:\\Users\\admin\\Desktop\\iostreams\\writenew1.xls");
		WritableWorkbook book=Workbook.createWorkbook(f1);
		WritableSheet sh1=book.createSheet("new",0);
		Label k1=new Label(1,0,"username");
		Label k2=new Label(2,0,"usernae");
		sh1.addCell(k1);
		sh1.addCell(k2);
		book.close();
	}}		
		
	


