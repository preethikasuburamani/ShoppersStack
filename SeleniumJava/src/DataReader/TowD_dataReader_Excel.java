package DataReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TowD_dataReader_Excel {
	
		
	@DataProvider
	public String[][] data() throws EncryptedDocumentException, IOException  {
	FileInputStream FIS = new FileInputStream("./resourse/data.xlsx");
	
	Workbook workbook = WorkbookFactory.create(FIS);
	
	int NumRow = workbook.getSheet("ActiTime").getPhysicalNumberOfRows();
	int NumClm = workbook.getSheet("ActiTime").getRow(0).getPhysicalNumberOfCells();
	System.out.println(NumRow);
	
	String[][] arr= new String [NumRow][NumClm]; 
	
	for(int i = 0;i<NumRow;i++) {
		for(int j = 0;j<NumClm; j++) {
			arr [i][j]= workbook.getSheet("ActiTime").getRow(i).getCell(j).toString();
		}
	
	}
	return arr;
	}
	
	
	@Test(dataProvider = "data")
	public void ABC(String[] cred) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(cred[0]);
		driver.findElement(By.name("username")).sendKeys(cred[1]);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(cred[2]);
	}
	

	
	}

