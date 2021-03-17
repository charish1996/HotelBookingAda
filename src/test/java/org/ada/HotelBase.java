package org.ada;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBase {
	static WebDriver driver;

	public void browserConfig() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\HotelBooking\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void openBrowser(String url) {
		driver.get(url);
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void typetext(WebElement element, String value) {
		element.sendKeys(value);
	}

	public String getText(WebElement element) {

		return element.getText();
	}

	public String getAttribute(WebElement element, String value) {
		return element.getAttribute(value);
	}

	public void click(WebElement element) {
		element.click();
	}

	public void dropDown(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public String readerExcel(String path,String sheetName, int rowNum, int colNum) {
		String data1="";
		try {
			File f = new File(path);
			FileInputStream fin = new FileInputStream(f);
			Workbook workbook = new XSSFWorkbook(fin);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(colNum);
			
			data1 = cell.getStringCellValue();
			System.out.println(data1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data1;
	}

	public void writeExcel(String path,String sheetName, int rowNum, int colNum, String value) {
		try {
			File f = new File(path);
			FileInputStream fin = new FileInputStream(f);
			Workbook workbook = new XSSFWorkbook(fin);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.createRow(rowNum);
			Cell createCell = row.createCell(colNum);
			createCell.setCellValue(value);
			FileOutputStream fout = new FileOutputStream(f);
			workbook.write(fout);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void scroll(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView("+data+")", element);
	}

	public void close() {
		driver.close();
	}

}
