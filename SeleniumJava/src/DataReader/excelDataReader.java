package DataReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelDataReader {

	public static void main(String[] args) throws IOException {

		//Create an object of FIS(File import Streamer)
		
		FileInputStream FIS = new FileInputStream("./resourse/data.xlsx");
		
		//Create an Object of excel File
		
		Workbook workbook = WorkbookFactory.create(FIS);
		
		//Fetch the data from the Excel 
		System.out.println(workbook.getSheet("Sheet1").getRow(0).getCell(0));
		
		System.out.println(workbook.getSheet("Sheet1").getRow(0).getCell(1));
		
		
		
	}

}
