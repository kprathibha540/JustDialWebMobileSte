package utilities;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{

	public static String getData(String File_path,String sheetName,int rn,int cn)
	{
		try
		{
			FileInputStream fis =new FileInputStream(File_path);
			Sheet sh = WorkbookFactory.create(fis).getSheet(sheetName);
			String data = sh.getRow(rn).getCell(cn).getStringCellValue();
			return data;	
		}
		catch (Exception e) 
		{
		return "";	
		}
	}
	public static int getRowCount(String File_path, String sheetName, int cellIndex)
	{
		try
		{
			int rowCount=0;
			FileInputStream fis =new FileInputStream(File_path);
			Sheet sh = WorkbookFactory.create(fis).getSheet(sheetName);
			int rc = sh.getLastRowNum();
			for(int i=1;i<=rc;i++)
			{
				
					Cell value=sh.getRow(i).getCell(cellIndex);
					if(!(value==null))
					{
						rowCount++;
						System.out.println( " {{{{{{{{{{{{{{{{{{{{{{{{{  Row Count }}}}}}}}}}}}}}}} "+rowCount);
					}
				
			}
			
			System.out.println( " {{{{{{{{{{{{{{{{{{{{{{{{{  Row Count +++ }}}}}}}}}}}}}}}}"+rowCount);
			return rowCount;
		}
		catch (Exception e) 
		{
		   e.printStackTrace();
		   return 0;
		}
	}
	public static int getCellCount(String File_path, String sheetName, int rn)
	{
		try
		{
			FileInputStream fis =new FileInputStream(File_path);
			Sheet sh = WorkbookFactory.create(fis).getSheet(sheetName);
			int cc = sh.getRow(rn).getLastCellNum();
			return cc;
		}	
		catch (Exception e) 
		{
		return 0;	
		}
		
	}	

}

