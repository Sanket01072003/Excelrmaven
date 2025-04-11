package datadrivenff;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataupdate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\myproject\\src\\test\\resources\\TestDataCore.xlsx");
		//workbook--workbook is presnt in the file object
		XSSFWorkbook workbook=new XSSFWorkbook(file);
              
       //creating a Sheet object using the sheet Name
		XSSFSheet sheet=workbook.getSheet("Sheet1");
      
       //Create a row object to retrieve row at index 3
		XSSFRow row2=sheet.createRow(4);
      
       //create a cell object to enter value in it using cell Index
       row2.createCell(0).setCellValue("Diana");
       row2.createCell(1).setCellValue("Jane");
       row2.createCell(2).setCellValue("djanes@gmail.com");
      
      
       //write the data in excel using output stream
       FileOutputStream outputStream = new FileOutputStream("C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\myproject\\\\src\\\\test\\\\resources\\\\TestDataCore.xlsx");
       workbook.write(outputStream);
       workbook.close();
	}

}
