package com.amazon.qa.util;

import java.io.File;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.amazon.qa.base.TestBase;

public class TestUtil extends TestBase {
	public static long PAGE_LOAD_TIMEOUT=20;
	 public static long IMPLICIT_WAIT=10;
	 
public void takescreenshoot(){
	
File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
String directery =System.getProperty("user.dir")+"\\screenshoot\\";
//FileUtils.copyFile(scr, new File(directery)+".png");
//FileUtils.copyFile(scr, new File(directery)+".png");
}
}
