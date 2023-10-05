package Project_Pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import elements_Demo.BaseClass;

public class ExcelData{
	
	//Excepted Data
	String ExceptedWelcomePage  ="Demo Web Shop";
	String ExceptedLoginText = "Demo Web Shop. Login";
	String ExceptedHomePage ="Demo Web Shop";
	
	
	@DataProvider
	public String[][] Data() throws EncryptedDocumentException, IOException {
		FileInputStream FIS = new FileInputStream("./resourse/data.xlsx");
		
		Workbook workbook = WorkbookFactory.create(FIS);
		
		int NumRow = workbook.getSheet("Demo").getPhysicalNumberOfRows();
		int NumClm = workbook.getSheet("Demo").getRow(0).getPhysicalNumberOfCells();
		
		String arr[][]= new String[NumRow] [NumClm];
		
		for(int i = 0;i<NumRow;i++) {
			for(int j = 0;j<NumClm;j++) {
				arr[i][j]= workbook.getSheet("Demo").getRow(i).getCell(j).toString();
			}
		}
		return arr;
		
	}

	@Test(dataProvider = "Data")
	public void loginMultiUser(String[] cred) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//URL
		driver.get("https://demowebshop.tricentis.com/");
		String ActualWelcomePage = driver.getTitle();
	   Assert.assertEquals(ActualWelcomePage, ExceptedWelcomePage);
	   
	   driver.findElement(By.partialLinkText("Log in")).click();
	   
	   driver.findElement(By.id("Email")).sendKeys(cred[0]);
	   driver.findElement(By.id("Password")).sendKeys(cred[1]);
		
		
		driver.findElement(By.partialLinkText("Log out")).click();
		driver.quit();
	}
}
