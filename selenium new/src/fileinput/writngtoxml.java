package fileinput;

import java.io.FileOutputStream;
//import java.io.FileOutputStream;
import jxl.Workbook;
import jxl.write.Label;
//import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.Test;

public class writngtoxml {
	public FileOutputStream kl;
  @Test
  public void write() throws Exception {
	  kl=new FileOutputStream("C:\\Users\\admin\\Desktop\\iostreams\\writeinexcell12.xls");
	WritableWorkbook  wb=Workbook.createWorkbook(kl);
	WritableSheet sh=wb.createSheet("a3", 0);
	Label un=new Label(0,0,"username");
	Label pass=new Label(1,0,"password");
	Label res=new Label(2,0,"result");
	sh.addCell(un);
	sh.addCell(pass);
	sh.addCell(res);
	wb.write();
	wb.close();
	
	  
	  
	  
  }
}
