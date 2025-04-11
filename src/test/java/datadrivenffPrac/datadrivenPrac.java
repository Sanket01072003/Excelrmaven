package datadrivenffPrac;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadrivenPrac {
	public static List<String> username = new ArrayList<String>();
	public static List<String> password = new ArrayList<String>();
	public static void read() throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\sp475\\eclipse-workspace\\mymaven\\src\\main\\resources\\TestDataCore.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowcnt = sheet.getLastRowNum();
		int colcnt = sheet.getRow(0).getLastCellNum();
		for(int i = 0 ; i < rowcnt ; i++) {
			XSSFRow currentrow = sheet.getRow(i);
			for(int j = 0 ; j < colcnt ; j++) {
				if(j % 2 == 0) {
					String uname = currentrow.getCell(j).toString();
					System.out.println("The username id : " + uname);
					username.add(uname);
				}
				else {
					String pass = currentrow.getCell(j).toString();
					System.out.println("The password  : " + pass);
					password.add(pass);
				}
			}
		}
		System.out.println(username);
		System.out.println(password);
	}

	public static void login(String name , String pas) {
		String link = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get(link);
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys(name);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(pas);
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read();
		for(int i = 0 ; i < username.size() ; i++) {
			login(username.get(i) , password.get(i));
		}
	}
}
