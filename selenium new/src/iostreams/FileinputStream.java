package iostreams;

import java.io.FileInputStream;//tooo read the data
import jxl.Sheet;
import jxl.Workbook;
//import jxl.ReadExcelData;

public class FileinputStream {
	public String[][] readexcel() throws Exception{
		FileInputStream f =new FileInputStream ("C:\\Users\\admin\\Desktop\\iostreams\\kiranbook1.xls");//fileinput stream not a class name
		Workbook obj1=Workbook.getWorkbook(f);
		Sheet sh=obj1.getSheet(0);
		String a[][]=new String[2][10];
		try{
			for(int j=0;j<=sh.getColumns();j++){
				for(int i=0;i<=sh.getRows();i++){
					a[j][i]=sh.getCell(j,i).getContents();
					System.out.println(j+" and "+i+" "+a[j][i]);//prints the cell contains
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	return a;
	}
public static void main(String args[])throws Exception{
	FileinputStream  mk=new FileinputStream ();
	mk.readexcel();
}
}
