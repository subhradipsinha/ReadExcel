package readFileData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		File src = new File("E:/sw/Homework1/Readfiledata/Driver/test.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//HSSF use only for .xls file
		XSSFSheet sheet1= wb.getSheetAt(0);
		
		//Read data from excel
		String data =sheet1.getRow(0).getCell(0).getStringCellValue();
		String data1 =sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);
		System.out.println(data1);
		
		//Excel data write
		sheet1.createRow(0).createCell(2).setCellValue("Pass");
		System.out.println("Data enter");
		FileOutputStream fout= new FileOutputStream(src);
		wb.write(fout);
		System.out.println("Data written");
		wb.close();

	}

}
