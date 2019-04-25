package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel
{
	
	public  static Object[][] testReadExcel(String sheetname) 
	{
		
		File file=new File("src\\test\\resources\\Book2.xlsx");
		Object[][] obj=null;
		try {
			InputStream is=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(is);
			XSSFSheet sheet1=workbook.getSheet("sheet1");
			obj=new Object[sheet1.getLastRowNum()][];
			for(int i=1;i<=sheet1.getLastRowNum();i++)
			{
				obj[i-1]=new Object[sheet1.getRow(i).getPhysicalNumberOfCells()];
				for(int j=0;j<sheet1.getRow(i).getPhysicalNumberOfCells();j++)
				{
					//System.out.println(sheet1.getRow(i).getCell(j).getStringCellValue());
					obj[i-1][j]=sheet1.getRow(i).getCell(j).getStringCellValue();
			
					
				}
				//to write data in excel 
				//sheet1.getRow(i).createCell(2).setCellValue("valid user");
				//
			//	System.out.println("");
				
		   } 
			//to write in Excel sheet is.close
			is.close();
			//to write in worksheet use workbook and outputstream
			//OutputStream os=new FileOutputStream(file);
			//workbook.write(os);
			//close for reading the data in Excel
		
			workbook.close();
		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	

}
}
