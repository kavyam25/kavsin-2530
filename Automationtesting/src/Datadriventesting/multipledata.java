package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class multipledata
{
  public static void main(String[] args) throws IOException
  {
	FileInputStream fis = new FileInputStream("./Testdata/facebook.xlsx");
	XSSFWorkbook book = new XSSFWorkbook(fis);
	XSSFSheet sheet = book.getSheet("Sheet1");
	int lr = sheet.getLastRowNum();
	for(int i=0;i<=lr;i++)
	{
		XSSFRow row = sheet.getRow(i);
		XSSFCell cell = row.getCell(0);
		String clval = cell.getStringCellValue();
		XSSFCell cel2 =row.getCell(1);
		String clval2 = cel2.getStringCellValue();		
	    System.out.println(clval+" "+" "+clval2);	
	}
	book.close();
	fis.close();
}	

}
