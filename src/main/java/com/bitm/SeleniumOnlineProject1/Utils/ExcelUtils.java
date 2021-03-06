package com.bitm.SeleniumOnlineProject1.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.bitm.SeleniumOnlineProject1.DTO.LoginDTO;


public class ExcelUtils {

	public static FileInputStream inputStream = null;
	public static Workbook workbook = null;

	public static Sheet getSheet (int sheetNo) throws IOException{

		//open file from local location
		File f = new File("C:\\Users\\Start\\OneDrive\\Desktop\\TestSelenium.xlsx");
		inputStream = new FileInputStream(f);

		workbook = new XSSFWorkbook(inputStream );
		Sheet sheet = workbook.getSheetAt(sheetNo);
		return sheet;
	}

	//LoginData
	public static List<LoginDTO>  getLoginData() throws IOException
	{
		List<LoginDTO> logindata = new ArrayList <LoginDTO>();
		DataFormatter formater = new DataFormatter();

		Iterator<Row> rowiterator = ExcelUtils.getSheet(0).iterator();

		while (rowiterator.hasNext()) {

			Row nextrow = rowiterator.next();

			Iterator<Cell> celliterator = nextrow.cellIterator();

			LoginDTO login = new LoginDTO();
			byte cellCounter = 0;

			while (celliterator.hasNext())	{

				Cell cell = celliterator.next();

				switch (cellCounter)
				{
				case 0: 
					login.setUsername(formater.formatCellValue(cell));
					cellCounter++;
					break;
				case 1: 
					login.setPassword(formater.formatCellValue(cell));
					cellCounter++;
					break;
				case 2: 
					login.setUsername(formater.formatCellValue(cell));
					cellCounter++;
					break;
				case 3: 
					login.setPassword(formater.formatCellValue(cell));	
					break;

				}

			}

			logindata.add(login);
		}
		close();
		return logindata;

	}
	private static void close() throws IOException{

		workbook.close();
		inputStream.close();
	}
}

