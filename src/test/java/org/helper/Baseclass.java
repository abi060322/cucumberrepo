package org.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;
	public static Actions a;
	public static Select s;

	public static void browserlaunch() {
		driver = new ChromeDriver();

	}

	public static void lauchURL(String url) {
       driver.get(url);
	}
	
   public static  void maxwin() {
	 driver.manage().window().maximize();
	}

	public static void browserclose() {
		driver.quit();
	}

	public static void prntTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void prntUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void filltextbox(WebElement webeleref, String senddata) {
		webeleref.sendKeys(senddata);
	}

	public static void btnclick(WebElement webeleref) {
		webeleref.click();
	}

	public static void dragdrop(WebElement dragref, WebElement dropref) {
		a = new Actions(driver);
		a.dragAndDrop(dragref, dropref).perform();
	}

	public static void moveToEle(WebElement webeleref) {
		a.moveToElement(webeleref).perform();

	}

	public static void snap(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temfile = ts.getScreenshotAs(OutputType.FILE);
		File perfile = new File(
				"C:\\Users\\ABIMANI\\eclipse-workspace\\MavenConfiguration\\target//" + filename + ".png");
		FileUtils.copyFile(temfile, perfile);
	}

	public static void refreshpage() {
		driver.navigate().refresh();
	}

	public static void selectbyvalue(WebElement webref, String value) {
		s = new Select(webref);
		s.selectByValue(value);
	}

	public static void selectbyvisibletext(WebElement webref, String text) {
		s = new Select(webref);
		s.selectByVisibleText(text);
	}

	public static void selectbyindex(WebElement webref, int i) {
		s = new Select(webref);
		s.selectByIndex(i);

	}

	public static void gettext(WebElement webref) {
		String text = webref.getText();
		System.out.println(text);
	}

	public static String datadrivenread(String workbookname, String sheetname, int rowno, int cellno)
			throws IOException {

		File f = new File("C:\\Users\\ABIMANI\\eclipse-workspace\\Datadriven\\exl\\" + workbookname + ".xlsx");
		FileInputStream fis = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.getSheet(sheetname);

		Row row = sheet.getRow(rowno);

		Cell cell = row.getCell(cellno);

//	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//		
//		Row row1 = sheet.getRow(i);
//		
//		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//			Cell cell1 = row1.getCell(j);

		int Type = cell.getCellType();
		String value = "";

		if (Type == 1) {
			value = cell.getStringCellValue();
			System.out.println(value);
		}

		else if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();

			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			value = sdf.format(date);
			System.out.println(value);
		} else {
			double d = cell.getNumericCellValue();

			long l = (long) d;

			value = String.valueOf(l);
			System.out.println(value);

		}
		return value;

	}
}
