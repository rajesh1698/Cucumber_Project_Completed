package com.Cucumber_BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;
	private static String value;

	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rajes\\eclipse-workspace\\Maven_Project\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\rajes\\eclipse-workspace\\Maven_Project\\chromedriver\\chromedriver.exe");
			driver = new FirefoxDriver();
		} else if (type.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\rajes\\eclipse-workspace\\Maven_Project\\chromedriver\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void sleep(long mills) throws InterruptedException {
		Thread.sleep(mills);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void dropDown(String type, WebElement element, String value) {
		Select dd = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			dd.selectByIndex(index);
		} else if (type.equalsIgnoreCase("value")) {
			dd.selectByValue(value);
		} else if (type.equalsIgnoreCase("text")) {
			dd.selectByVisibleText(value);
		}
	}

	public static void scroll(String type, String value, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (type.equalsIgnoreCase("scrollby")) {
			js.executeScript(value);
		} else if (type.equalsIgnoreCase("scrollinto")) {
			js.executeScript("arguments[0].scrollIntoView()", element);
		}
	}

	public static void frame(String type, String value, WebElement element) {
		if (type.equalsIgnoreCase("index")) {
			int num = Integer.parseInt(value);
			driver.switchTo().frame(num);
		} else if (type.equalsIgnoreCase("id")) {
			driver.switchTo().frame(value);
		} else if (type.equalsIgnoreCase("name")) {
			driver.switchTo().frame(value);
		} else if (type.equalsIgnoreCase("element")) {
			driver.switchTo().frame(element);
		} else if (type.equalsIgnoreCase("defaultcontent")) {
			driver.switchTo().defaultContent();
		}
	}

	public static void actions(String type, String value, WebElement element) {
		Actions act = new Actions(driver);
		if (type.equalsIgnoreCase("click")) {
			act.click(element).build().perform();
		} else if (type.equalsIgnoreCase("doubleclick")) {
			act.doubleClick(element).build().perform();
		} else if (type.equalsIgnoreCase("rightclick")) {
			act.contextClick(element).build().perform();
		} else if (type.equalsIgnoreCase("movetoElement")) {
			act.moveToElement(element).build().perform();
		}
	}

	public static void explictwait(int sec, String type, WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver, sec);
		if (type.equalsIgnoreCase("visibleofelement")) {
			wait.until(ExpectedConditions.visibilityOf(webElement));
		} else if (type.equalsIgnoreCase("visibleofallelement")) {
			wait.until(ExpectedConditions.visibilityOfAllElements(webElement));
		} else if (type.equalsIgnoreCase("alert")) {
			wait.until(ExpectedConditions.alertIsPresent());
		}
	}

	public static void implictwait(int seconds, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds, format);
	}

	public static void screenShot(String pathname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(pathname);
		FileHandler.copy(src, des);
	}
	public static String particular_Data(String path, int row_Index, int cell_Index) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(row_Index);
		Cell cell = row.getCell(cell_Index);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			 value = cell.getStringCellValue();
		}
		else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int val = (int) numericCellValue;
			value = String.valueOf(val);	
		}
         return value;
	}
}
