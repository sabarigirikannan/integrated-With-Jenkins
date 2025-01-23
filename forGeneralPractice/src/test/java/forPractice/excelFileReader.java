package forPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class summa {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		
		XSSFWorkbook wbook=new XSSFWorkbook(new File(System.getProperty("user.dir"))+"\\src\\test\\resources\\sample.xlsx");
		XSSFSheet sheet=wbook.getSheetAt(0);
		
		for(Row row:sheet) {
			for(Cell cell:row) {
				
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case NUMERIC:
					System.out.print((long) cell.getNumericCellValue()+"\t");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue()+"\t");
					break;

				default:
					System.out.println("unknow data type");
					break;
					
				
				}
				
			}
			System.out.println();
		}
		

	}

}
