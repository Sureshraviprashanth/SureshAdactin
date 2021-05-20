package com.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateDrop {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Prashanth\\eclipse-workspace\\SureshSelenium\\Driver\\chromedriver.exe");
	
	WebDriver d=new ChromeDriver();
	
	d.get("https://www.facebook.com/");
	
	WebElement cr = d.findElement(By.xpath("(//a[@role='button'])[2]"));
	cr.click();
	Thread.sleep(5000);
	WebElement nm = d.findElement(By.name("firstname"));
	nm.sendKeys("Dhoni");
	
	WebElement lst = d.findElement(By.name("lastname"));
	lst.sendKeys("Suresh");
	  
	WebElement da = d.findElement(By.id("day"));
	Select s = new Select(da);
	s.selectByValue("11");
	
	WebElement mo = d.findElement(By.xpath("//select[@title='Month']"));
	Select E= new Select(mo);
	E.selectByValue("6");
	
	WebElement Y = d.findElement(By.xpath("//select[@title='Year']"));
	Select T= new Select(Y);
	T.selectByValue("1996");
	
	
}
}
