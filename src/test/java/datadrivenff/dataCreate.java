package datadrivenff;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class dataCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Step 1: Create a new workbook
	       Workbook workbook = new Workbook();
	       // Step 2: Create a sheet
	       Sheet sheet = workbook.createSheet("Sheet1");
	       // Step 3: Create a row at index 0 (first row)
	       Row row = sheet.createRow(0);
	       // Step 4: Create a cell at column 0 (A1)
	       Cell cell = row.createCell(0);
	       // Step 5: Set a value in the cell
	       cell.setCellValue("Hello Excel!");
	       // Step 6: Write the data to an Excel file
	       try (FileOutputStream outputStream = new FileOutputStream("SimpleData.xlsx")) {
	           workbook.write(outputStream);
	           System.out.println("Excel file created successfully!");
	       } catch (IOException e) {
	           e.printStackTrace();
	       } finally {
	           try {
	               workbook.close();
	           } catch (IOException e) {
	               e.printStackTrace();
	           }
	       }

	}

}
