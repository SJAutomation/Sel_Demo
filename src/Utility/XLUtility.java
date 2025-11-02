package Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtility {
	public FileInputStream fis;
	public FileOutputStream fos;
	
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	String path;
	

	 public XLUtility(String path)
	{
		this.path=path;
	}
	
	public int getRowCount(String Sheetname) throws IOException
	{

		fis=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(Sheetname);
		int rowcnt=sheet.getLastRowNum();
		workbook.close();
		fis.close();
		return rowcnt;
	}
	
	public int getCellCount(String Sheetname,int rownum) throws IOException
	{

		fis=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(Sheetname);
		XSSFRow row=sheet.getRow(rownum);
		int cellcnt= row.getLastCellNum();
		workbook.close();
		fis.close();
		return cellcnt;
	}
	
	
	public String getCellData(String Sheetname,int rownum,int colnum) throws IOException
	{

		fis=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(Sheetname);
		 row=sheet.getRow(rownum);
		 cell=row.getCell(colnum);
		
		DataFormatter formatter=new DataFormatter();
		String data;
		try
		{
			data=formatter.formatCellValue(cell);
		}
		catch(Exception e)
		{
			data="";
		}
		
		workbook.close();
		fis.close();
		return data;
	}
	
	public String setCellData(String Sheetname,int rownum,int colnum,String data) throws IOException
	{

		fis=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(Sheetname);
		 row=sheet.getRow(rownum);
		 cell=row.createCell(colnum);
		cell.setCellValue(data);
		
		fos=new FileOutputStream(path);
		workbook.write(fos);
		workbook.close();
		

	    fis.close();
	    fos.close();
		return data;
		
	}
	
	
}
