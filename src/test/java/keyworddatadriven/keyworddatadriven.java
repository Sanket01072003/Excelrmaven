package keyworddatadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyworddatadriven {

	static WebDriver driver;
	//openbrowser()
	public static void openbrowser()
	
	{driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		
		
	}
	
	//gotourl()
	public static void gotourl()
	{
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}	
	//enterusername()
	public static void enterusername() {
		
		WebElement username1=driver.findElement(By.name("username"));
		username1.sendKeys("Admin");
	}
	
	//enterpassword()
	
	public static void enterpassword() {
		
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("admin123");
	}
	
	//clicklogin()
	public static void clicklogin() {
		
		WebElement login=driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		
		System.out.println("run complete");
		
	}

	static List<String> Keywords=new ArrayList<String>();
	@Test
public static void readexcelfilemethod() throws IOException {
FileInputStream file=new FileInputStream("C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\myproject\\\\src\\\\test\\\\resources\\\\TestDataCore.xlsx");
XSSFWorkbook workbook=new XSSFWorkbook(file);
XSSFSheet sheet=workbook.getSheet("Sheet");
//no.of rows
		int rowcnt=sheet.getLastRowNum();
		System.out.println(rowcnt);
		
		//to focus on row inorder to get the column numbers
		int colcnt=sheet.getRow(0).getLastCellNum();
		System.out.println(colcnt);
		
		//to read the values from excel sheet
		for (int i=1;i<=rowcnt;i++){
			XSSFRow currentrow=sheet.getRow(i);
			//to read the cell values from the current row the below for loop is given
			for(int j=0;j<colcnt;j++){
				
				if(j==2) {
					String keyword=currentrow.getCell(j).toString();
					//String cellvalue=currentrow.getCell(j).
					System.out.println("   "+keyword);
					Keywords.add(keyword);
				}
				System.out.println("keywords:"+Keywords);
				}
			workbook.close();
			}
}
	@Test
public static void keywordcomparision()  {
	for(int i=0;i<Keywords.size();i++) {
		if(Keywords.get(i).equals("openbrowser")) {
			keyworddatadriven.openbrowser();
		}
		if(Keywords.get(i).equals("gotourl")) {
			keyworddatadriven.gotourl();
		}
		if(Keywords.get(i).equals("enterusername")) {
			keyworddatadriven.enterusername();
		}
		if(Keywords.get(i).equals("enterpassword")) {
			keyworddatadriven.enterpassword();
		}
		if(Keywords.get(i).equals("clicklogin")) {
			keyworddatadriven.clicklogin();
		}
	}
	
}
public static void main(String[] args) throws IOException{
	
	keyworddatadriven.readexcelfilemethod();
	keyworddatadriven.keywordcomparision();
}	

}
