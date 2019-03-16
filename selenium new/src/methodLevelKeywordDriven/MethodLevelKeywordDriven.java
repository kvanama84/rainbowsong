package methodLevelKeywordDriven;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import mercurytoursframework.MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodLevelKeywordDriven  {
	//public MethodLevelKeywordDriven(WebDriver driver) {
	//	super(driver);
		// TODO Auto-generated constructor stub
	
	public static WebDriver driver;
	public static void main(String args[])throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\browser\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		try{
			FileInputStream file=new FileInputStream("C:\\Users\\admin\\Desktop\\iostreams\\keyworddriven.xls");	
		Workbook wwb=Workbook.getWorkbook(file);
		Sheet sh1=wwb.getSheet(0);
		int row=sh1.getRows();
		for(int i=0;i<row;i++){
		 String	Tc_name=sh1.getCell(0,i).getContents().toString();
		 Execute(Tc_name);
		
		}
		quitdriver();
		}

		catch(BiffException e){
			System.out.println(e);
			
		}
		catch(IOException e){
			System.out.println(e);
			}}
			
		public static void Execute(String casename)throws Exception{
			String option=casename.trim();
			MethodLevelKeywordDriven obj=new MethodLevelKeywordDriven();
		
		
		if(option.equalsIgnoreCase("TC_login")){
			obj.Login();
		}
		else if(option.equalsIgnoreCase("TC_Compose")){
		    obj.Compose();
		}
		else if(option.equalsIgnoreCase("TC_logout")){
			obj.Logout();
		}}
		public static void Login()throws Exception{
			driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys ("kiran.vanama789@gmail.com");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys ("kiran789654");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(30000);}
		public static void Compose()throws Exception{
			driver.findElement(By.xpath("//div[text()='Compose']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("kiran.vanama789@gmail.com");
			driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("helllooooooo");
			//driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("message box");
			driver.findElement(By.xpath("//div[contains(@aria-label,'Message Body')]")).sendKeys("welcome");
}
		public static void Logout() {

driver.findElement(By.xpath("//div [text()='Send']")).click();
driver.findElement(By.xpath("//html/body/div[7]/div[3]/div/div[1]/div[4]/header/div[2]/div[3]/div/div[2]/div/a/span")).click();
driver.findElement(By.xpath("//a[@id='gb_71'] ")).click();
driver.findElement(By.xpath("//a[text()='Sign out']")).click();
}
				 

	public static void quitdriver()
	{
		driver.quit();
	
}}
		
		
		
		
	
	
		
	


