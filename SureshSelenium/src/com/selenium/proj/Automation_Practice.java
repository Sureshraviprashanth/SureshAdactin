package com.selenium.proj;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation_Practice {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Prashanth\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("http://automationpractice.com/index.php");
		
		dri.manage().window().maximize();
		
		
		WebElement signin = dri.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		WebElement em = dri.findElement(By.xpath("//input[@name='email_create']"));
		em.sendKeys("sureshraviprashanth@gmail.com");
		
		WebElement cli = dri.findElement(By.xpath("(//button[@type='submit'])[2]"));
		cli.click();
		
		Actions act= new Actions(dri);
		dri.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		
		Thread.sleep(5000);
		WebElement gen = dri.findElement(By.xpath("(//input[@name='id_gender'])[1]"));
		gen.click();
		
		WebElement fname = dri.findElement(By.xpath("//input[@id='customer_firstname']"));
		fname.sendKeys("Suresh Prashanth");
		
		WebElement lname = dri.findElement(By.xpath("//input[@id='customer_lastname']"));
		lname.sendKeys("R");
		
		WebElement pword = dri.findElement(By.xpath("//input[@id='passwd']"));
		pword.sendKeys("Msdrsp07");
		
		WebElement bday = dri.findElement(By.xpath("(//select[@class='form-control'])[1]"));
		Select se = new Select(bday);
		se.selectByValue("11");
		
		WebElement bmon = dri.findElement(By.xpath("(//select[@class='form-control'])[2]"));
		Select sel = new Select(bmon);
		sel.selectByValue("6");
		
		WebElement byear = dri.findElement(By.xpath("(//select[@class='form-control'])[3]"));
		Select sely = new Select(byear);
		sely.selectByValue("1996");
		
		WebElement clic = dri.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		clic.click();
		
		WebElement fne = dri.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		fne.sendKeys("Suresh Prashanth");
		
		WebElement lne = dri.findElement(By.xpath("(//input[@class='form-control'])[2]"));
		lne.sendKeys("R");
		
		WebElement cname= dri.findElement(By.xpath("(//input[@class='form-control'])[3]"));
		cname.sendKeys("Tata Consultancy Services");
		
		WebElement fadd = dri.findElement(By.xpath("(//input[@class='form-control'])[4]"));
		fadd.sendKeys("5/18,kamarajar street");
		
		WebElement ladd = dri.findElement(By.xpath("(//input[@class='form-control'])[5]"));
		ladd.sendKeys("Mogappair West");
		
		WebElement cit = dri.findElement(By.xpath("(//input[@class='form-control'])[6]"));
		cit.sendKeys("Chennai");
		
		WebElement state = dri.findElement(By.xpath("(//select[@class='form-control'])[4]"));
		Select st = new Select(state);
		st.selectByValue("32");
		
		WebElement por = dri.findElement(By.xpath("(//input[@class='form-control uniform-input text'])"));
		por.sendKeys("00003");
		
		WebElement num = dri.findElement(By.xpath("(//input[@class='form-control'])[8]"));
	    num.sendKeys("9600031186");
	    
	   //WebElement but = dri.findElement(By.xpath("(//button[@class='btn btn-default button button-medium'])"));
	    //but.click();
	    
	}

}
