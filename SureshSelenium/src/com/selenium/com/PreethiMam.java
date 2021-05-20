package com.selenium.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreethiMam {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Prashanth\\eclipse-workspace\\SureshSelenium\\Driver\\chromedriver.exe");
		
		WebDriver dri = new ChromeDriver();
		
		dri.get("https://www.facebook.com/");
		
		WebElement Email = dri.findElement(By.name("email"));
		Email.sendKeys("sureshprashanth7@gmail.com");
		
		WebElement pass = dri.findElement(By.id("pass"));	
		pass.sendKeys("Msdrsp07");
		
		WebElement xp2 = dri.findElement(By.xpath("//button[@name='login']"));
		xp2.click();
	    Thread.sleep(3000);
		TakesScreenshot ss = (TakesScreenshot) dri;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Suresh Prashanth\\eclipse-workspace\\SureshSelenium\\Screenshot\\facebook.png");	
	    FileUtils.copyFile(source, destination);
	
	
	
	}
	}
