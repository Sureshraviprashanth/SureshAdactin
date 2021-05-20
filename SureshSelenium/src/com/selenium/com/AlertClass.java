package com.selenium.com;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Prashanth\\eclipse-workspace\\SureshSelenium\\Driver\\chromedriver.exe");
	
	WebDriver driv = new ChromeDriver();
	
	driv.get("http://demo.automationtesting.in/Alerts.html");
	//simple alert
		WebElement sim = driv.findElement(By.xpath("//button[@class='btn btn-danger']"));
	
	sim.click();
	
	Alert ok = driv.switchTo().alert();
	ok.accept();
	
	//confirm alert
	WebElement acc = driv.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	acc.click();
	
	WebElement al = driv.findElement(By.xpath("(//button[@class='btn btn-primary'])"));
	al.click();
	driv.switchTo().alert().accept();
	
	//prompt alert
	WebElement te = driv.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	te.click();
	WebElement cl = driv.findElement(By.xpath("(//button[@class='btn btn-info'])"));
	cl.click();
	Alert xt = driv.switchTo().alert();	
	xt.sendKeys("SURESH");
	xt.accept();
}
}
