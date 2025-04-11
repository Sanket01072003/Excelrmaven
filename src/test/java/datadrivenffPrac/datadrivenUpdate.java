package datadrivenffPrac;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class datadrivenUpdate {
	public static void update() throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\sp475\\eclipse-workspace\\mymaven\\src\\main\\resources\\TestDataCore.xlsx");
		XSSFWorkbook workbook =  new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(0);
		cell.setCellValue("User2");
		FileOutputStream outputStream = new FileOutputStream("C:\\\\Users\\\\sp475\\\\eclipse-workspace\\\\mymaven\\\\src\\\\main\\\\resources\\\\TestDataCore.xlsx");
		workbook.write(outputStream);
		workbook.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			update();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
