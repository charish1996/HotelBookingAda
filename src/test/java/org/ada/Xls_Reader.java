package org.ada;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader extends HotelBase  {
	public String path;
	public FileInputStream fin = null;
	public FileOutputStream fout = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;
	public String getPath() {
		return path;
	}
	public FileInputStream getFin() {
		return fin;
	}
	public FileOutputStream getFout() {
		return fout;
	}
	public XSSFWorkbook getWorkbook() {
		return workbook;
	}
	public XSSFSheet getSheet() {
		return sheet;
	}
	public XSSFRow getRow() {
		return row;
	}
	public XSSFCell getCell() {
		return cell;
	}
	
	
	
	

}
