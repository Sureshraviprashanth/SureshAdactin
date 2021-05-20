package com.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Prashanth\\eclipse-workspace\\SureshSelenium\\Driver\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		driv.get("http://demo.automationtesting.in/Frames.html");
		driv.manage().window().maximize();
		Thread.sleep(3000);
		
		//Single Frame
		
		WebElement sf = driv.findElement(By.id("singleframe"));
		driv.switchTo().frame(sf);
		WebElement et = driv.findElement(By.xpath("(//input[@type='text'])[1]"));
		et.sendKeys("Suresh Prashanth R");
		driv.switchTo().defaultContent();
		
		//multiple Frame
		
		WebElement mul = driv.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		mul.click();
		
		WebElement first = driv.findElement(By.xpath("(//iframe[@src='MultipleFrames.html'])"));
		driv.switchTo().frame(first);
		WebElement secound = driv.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])"));
		driv.switchTo().frame(secound);
		WebElement tex = driv.findElement(By.xpath("(//input[@type='text'])"));
		tex.sendKeys("Its me suresh prashanth");
		driv.switchTo().defaultContent();
	}

}
