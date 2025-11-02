package Utility;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	

	@DataProvider(name="LoginData2")
	public static String[][] getData() throws IOException
	{
		/*  return new String[][]
				  
			{
					{"Admin","admin123","Valid"},
					{"admin","adm","Invalid"},
					{"adm","admin123","Invalid"},
					{"admin12","admin1234","Invalid"}
					
					
			};
			
			*/
	
			
		String path=".\\Excel Files\\User_Login_input.xlsx";
		XLUtility xlutil=new XLUtility(path);
	
		int totalrows=xlutil.getRowCount("Sheet4");
		int totalcols=xlutil.getCellCount("Sheet4", 2);
		
		
		String loginData[][]=new String[totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				loginData[i-1][j]=xlutil.getCellData("Sheet4", i, j);
				
			}
			
		}
		
		
		return loginData;
		
	}
	

//}

}
