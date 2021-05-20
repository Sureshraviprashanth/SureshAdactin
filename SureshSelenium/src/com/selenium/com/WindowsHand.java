package com.selenium.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHand {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Prashanth\\eclipse-workspace\\SureshSelenium\\Driver\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://www.amazon.in/");
	
	Driver.manage().window().maximize();
	
	Actions act = new Actions(Driver);
	
	Robot rob = new Robot();
	
	WebElement mob = Driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[3]"));
	act.contextClick(mob).build().perform();
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement td = Driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));
	act.contextClick().build().perform();
	rob.keyPress(KeyEvent.VK_DOWN);
	rob.keyRelease(KeyEvent.VK_DOWN);
	
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	
	Set<String> windowHandles = Driver.getWindowHandles();
	for (String AllId : windowHandles) {
		String title = Driver.switchTo().window(AllId).getTitle();
		System.out.println(title);
	}
		
	}
		
}
