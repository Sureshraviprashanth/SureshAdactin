package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead {
	public static void particularData() throws IOException {
		File f= new File("C:\\Users\\Suresh Prashanth\\eclipse-workspace\\DataDriven\\target\\ph.no of csk players.xlsx");
		FileInputStream  fis = new FileInputStream(f);
		Workbook wb  = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(6);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);			
		}
		else if (cellType.equals(CellType.NUMERIC)) {
			double num = cell.getNumericCellValue();
			int value = (int) num;
			System.out.println(value);
			
		}

	}
	
	public static void allData() throws IOException {
		
		File f  = new File("C:\\Users\\Suresh Prashanth\\eclipse-workspace\\DataDriven\\target\\ph.no of csk players.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		int sizeOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i <sizeOfRows ; i++) {
			Row row = sheetAt.getRow(i);
			
			
			int sizeOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < sizeOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				 else if (cellType.equals(CellType.NUMERIC)) {
					 double numericCellValue = cell.getNumericCellValue();
					 int value = (int) numericCellValue;
					 System.out.println(value);
					
				} 
			}
			
		}

	}
	
public static void rowData() throws Exception {
	File f = new File("C:\\Users\\Suresh Prashanth\\eclipse-workspace\\DataDriven\\target\\ph.no of csk players.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(0);
	
	for (int i = 0; i < 1; i++) {
		Row row = sheetAt.getRow(i);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		for (int j = 0; j <physicalNumberOfCells ; j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			
			
			if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
			else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
			    int value = (int) numericCellValue;
			    System.out.println(value);
				
			} 
		}
		
	}
	
}
public static void coloumnData() throws Exception {
	File f = new File("C:\\Users\\Suresh Prashanth\\eclipse-workspace\\DataDriven\\target\\ph.no of csk players.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(0);

	for (int i = 0; i < 11; i++) {
		Row row = sheetAt.getRow(i);
		for (int j = 0; j < 1; j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			}
			else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;
				System.out.println(value);
			}
			}
		}
	

	
	
	

}


public static void main(String[] args) throws Exception {
		System.out.println("----------ParticularData----------");
		particularData();
		System.out.println("-------------AllData-------------");
		allData();
		System.out.println("-------------RowData-------------");
		rowData();
		System.out.println("-------------CollData-------------");
		coloumnData();

	}

}
