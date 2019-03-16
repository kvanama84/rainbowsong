package multisheetwithoutexcell;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bsh.org.objectweb.asm.Label;

public class NegativeScenerios  {
	public WebDriver driver;

  @Test
  public void f() {
 try{     //get file path
		  FileInputStream fileread=new  FileInputStream("C:\\Users\\admin\\Desktop\\iostreams\\multisheets.xls");
		  //open workbook
		  Workbook book=Workbook.getWorkbook(fileread);
		  //open sheet in above workbook
		//  Sheet sh=book.getSheet("Sheet3");
		//create output file
          FileOutputStream filewrite=new FileOutputStream("C:\\Users\\admin\\Desktop\\iostreams\\multisheets.xls");
		  //copey workdata to outputfile
		  WritableWorkbook book1=Workbook.createWorkbook(filewrite,book);
		 // sh.getCell(Columnnumber,Rownumber).getContents();
		  Sheet sht3=book.getSheet("Sheet3");
		  //count number of rows in a sheet
		  int rcount=sht3.getRows();
		  //
		  for(int i=1;i<rcount;i++)
		  {
			  String userid=sht3.getCell(0,i).getContents();
			 
			  String passw=sht3.getCell(1,i).getContents();
			
			  mercurysignin.username_signin(driver).clear();
			  mercurysignin.username_signin(driver).sendKeys(userid);
			  
			  mercurysignin.password_signin(driver).clear();
			  mercurysignin.password_signin(driver).sendKeys(passw);
			  
			  mercurysignin.login_signin(driver).click();
			//  System.out.println (driver.getTitle());
			  if(driver.getTitle().contains("Sign-on: Mercury Tours"))
			  {
				  WritableSheet ws =book1.getSheet("Sheet3");
			ws.addCell(new jxl.write.Label(2, i, "Login not Succuessful with" +i+ "row input"));  
			 
				  }
			  }
				  book1.write();
				  book1.close();
	 }
			  catch(Exception e){
				  System.out.println(e.getMessage());
			  }
			   }
	 
	  @BeforeTest
	  public void launchwinow(){
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com");
		  
 }
}
