package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWrite {
	public static void writeData() throws IOException {
		File f = new File("C:\\Users\\Suresh Prashanth\\Desktop\\DataWrite.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet createSheet = wb.createSheet("Player_Details");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Player Name");
		wb.getSheet("Player_Details").getRow(0).createCell(1).setCellValue("IPL_Team");
		wb.getSheet("Player_Details").createRow(1).createCell(0).setCellValue("Mahendra_Singh_Dhoni");
		wb.getSheet("Player_Details").getRow(1).createCell(1).setCellValue("Chennai_Super_Kings");
		wb.getSheet("Player_Details").createRow(2).createCell(0).setCellValue("Sachin_Tendulkar");
		wb.getSheet("Player_Details").getRow(2).createCell(1).setCellValue("Mumbai_Indians");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("---------Completed_DataDriven(Write)-----------");

	}
public static void main(String[] args) throws IOException {
	writeData();
}
}
