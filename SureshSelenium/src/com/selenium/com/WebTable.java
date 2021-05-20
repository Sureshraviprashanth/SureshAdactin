package com.selenium.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Prashanth\\eclipse-workspace\\SureshSelenium\\Driver\\chromedriver.exe");
	WebDriver DriveR = new ChromeDriver();
	DriveR.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	
	DriveR.manage().window().maximize();
	
	Actions act = new Actions(DriveR);
	Robot rob = new Robot();
	
	WebElement tab = DriveR.findElement(By.xpath("(//a[@class='dropdown-toggle'])[3]"));
	
	Thread.sleep(3000);
	
	tab.click();	
	Thread.sleep(3000);
	
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	
	List<WebElement> column = DriveR.findElements(By.xpath("//table//tbody//td[2]"));
	System.out.println("***COLUMN***");
	for (WebElement AllClm : column) {
		String Cnum = AllClm.getText();
		System.out.println(Cnum);
		
	}
	
	WebElement particular = DriveR.findElement(By.xpath("//table//tbody//tr[2]//td[6]"));
	System.out.println(particular.getText());
}
}
