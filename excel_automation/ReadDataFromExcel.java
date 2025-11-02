package excel_automation;

import java.io.FileInputStream;



import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import  org.apache.poi.xssf.usermodel.XSSFCell;


public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception
	{
		//path of excel file
		String loc="C:\\Users\\abc\\Desktop\\Excel OP SELENIUM\\READ_EXCEL.xlsx";
		FileInputStream fis=new FileInputStream(loc);
		
		//creating Workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		
		//navigating to sheet by index
		XSSFSheet sh=wb.getSheetAt(0);
		
		//navigating to row
		Row rw=sh.getRow(0);
		Row rw1=sh.getRow(1);
		Row rw2=sh.getRow(2);
		Row rw3=sh.getRow(3);
		 
		//navigation to cell
		Cell cl=rw.getCell(0);
		
		Cell cl1=rw.getCell(1);
		
	    Cell cl2=rw.getCell(2);
		
		Cell cl3=rw.getCell(3);
		
		System.out.print(sh.getRow(0).getCell(0));
		System.out.print("\t\t");
		System.out.println(sh.getRow(0).getCell(1));
		//System.out.print("\t");
		
		System.out.print(sh.getRow(1).getCell(0));
		System.out.print("\t\t");
		System.out.println(sh.getRow(1).getCell(1));
		//System.out.print("\t");
		
		System.out.print(sh.getRow(2).getCell(0));
		System.out.print("\t\t");
		System.out.println(sh.getRow(2).getCell(1));
		//System.out.print("\t");
		
		System.out.print(sh.getRow(3).getCell(0));
		System.out.print("\t\t");
		System.out.println(sh.getRow(3).getCell(1));
		//System.out.print("\t");
		
		
		
		
		
		
	}

}
