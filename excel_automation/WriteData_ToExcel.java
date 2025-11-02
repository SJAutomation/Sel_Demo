package excel_automation;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData_ToExcel {

	
	public static void main(String[] args) throws Exception 
	{
		//File location
		String loc="C:\\Users\\abc\\Desktop\\Excel OP SELENIUM\\Write_Excel.xlsx";
		FileInputStream fis=new FileInputStream(loc);
		
		//Workbook
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		//Sheet by name
		XSSFSheet sh1=workbook.getSheet("Compose_TC");
		XSSFSheet sh2=workbook.getSheet("Inbox_TC");
		XSSFSheet sh3=workbook.getSheet("TC_template");
		
		//create a new Row
//		Row row0=sh.createRow(0);
//		
//		Row row1=sh.createRow(1);
//		
//		Row row2=sh.createRow(2);
//		
		
		Row row0=sh3.createRow(0);
		
		Row row1=sh3.createRow(1);
		
		Row row2=sh3.createRow(2);

		Row row3=sh3.createRow(3);
		
		Row row4=sh3.createRow(4);
		
		//create a new Cell
		Cell cell0=row0.createCell(0);
		Cell cell1=row1.createCell(0);
		Cell cell2=row2.createCell(0);
		Cell cell3=row3.createCell(0);
		
		Cell cell4=row4.createCell(0);
		Cell cell5=row4.createCell(1);
		Cell cell6=row4.createCell(2);
		Cell cell7=row4.createCell(3);
		Cell cell8=row4.createCell(4);
		Cell cell9=row4.createCell(5);
		Cell cell10=row4.createCell(6);
		
		
		Cell cell11=row0.createCell(6);
		Cell cell12=row1.createCell(6);
		Cell cell13=row2.createCell(6);
		Cell cell14=row3.createCell(6);
		
		
		
		//set cell values
//		cell0.setCellValue("Software Testing");
//		cell1.setCellValue("AUTOMATION");
//		cell2.setCellValue("API");
		
		cell0.setCellValue("Scenario name");
		cell1.setCellValue("TC name");
		cell2.setCellValue("Pre-conditions");
		cell3.setCellValue("Severity & Priority");
		
		cell4.setCellValue("Sr No");
		cell5.setCellValue("Description");
		cell6.setCellValue("Input");
		cell7.setCellValue("Expected Result");
		cell8.setCellValue("Actual Result");
		cell9.setCellValue("Status");
		cell10.setCellValue("Remarks");
		
		cell11.setCellValue("Tested BY");
		cell12.setCellValue("Tested Date");
		cell13.setCellValue("Author");
		cell14.setCellValue("Cycle");
		
		//Printing output in Excel file
		FileOutputStream fos=new FileOutputStream(loc);
		
		workbook.write(fos);
		
		fos.close();
		
		System.out.println("************Writing data To Excel SUCCESS!!****************");
	}

}
