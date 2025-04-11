package datadrivenffPrac;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class keywordDataDriven {
	public static WebDriver driver;
	public static void openbrowser() {
		driver = new ChromeDriver();
	}
	public static void gotourl() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	public static void enterusername() {
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("Admin");
	}
	public static void enterpassword() {
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("admin123");
	}
	public static void clicklogin() {
		WebElement login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("C:\\Users\\sp475\\eclipse-workspace\\mymaven\\src\\main\\resources\\TestDataCore.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet");
		List<String> keywords = new ArrayList<String>();
		int rowcnt = sheet.getLastRowNum();
		int colcnt = sheet.getRow(0).getLastCellNum();
		for(int i = 1 ; i <= rowcnt ; i++) {
			XSSFRow currentrow = sheet.getRow(i);
			for(int j = 0 ; j < colcnt ; j++) {
				if(j == 2) {
					String data = currentrow.getCell(j).toString();
					keywords.add(data);
				}
			}
		}
		for(int i = 0 ; i < keywords.size() ; i++) {
			if(keywords.get(i).equals("openbrowser")) {
				openbrowser();
			}
			if(keywords.get(i).equals("gotourl")) {
				gotourl();
			}
			if(keywords.get(i).equals("enterusername")) {
				enterusername();
			}
			if(keywords.get(i).equals("enterpassword")) {
				enterpassword();
			}
			if(keywords.get(i).equals("clicklogin")) {
				clicklogin();
			}
		}
	}

}
