package com.selenium.proj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.selenium.com.PomClass;

public class Minproj_Purchase extends Base_Class {
WebElement Driver;
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Prashanth\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");		
		//WebDriver dr = new ChromeDriver();		
		//dr.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Website("chrome");
		//dr.manage().window().maximize();
		get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		//dr.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		implicitWait();
		
		PomClass pm = new PomClass(driver);
		WebElement email = pm.getEmail();
		//WebElement em = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		//em.sendKeys("suresh11prashanth@gmail.com");
		sendKeys(email,"suresh11prashanth@gmail.com");
		
		WebElement password = pm.getPassword();
		//WebElement pw = driver.findElement(By.xpath("//input[@name='passwd']"));
	    //pw.sendKeys("msdrsp07");
		sendKeys(password,"msdrsp07");
		
		WebElement login = pm.getLogin();
		//WebElement submit = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
	    //submit.click();
		clickElement(login);
		
		WebElement wo = driver.findElement(By.xpath("//a[@title='Women']"));
		//Actions ac = new Actions(dr);
		//ac.moveToElement(wo).build().perform();
		moveTo(wo);
		
		WebElement eve = driver.findElement(By.xpath("//a[@title='Evening Dresses']"));
	    //ac.click(eve).build().perform();
		clickElement(eve);
		
		WebElement dres = driver.findElement(By.xpath("//div[@class='product-container']"));
		//ac.moveToElement(dres).build().perform();
		moveTo(dres);
		
		WebElement adc = driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']"));
		//adc.click();		
		clickElement(adc);

		
		//Frames(By.xpath("//div[@class='clearfix']"));
		//WebElement frame = dr.findElement(By.xpath("//div[@class='clearfix']"));
		
		implicitWait();
		//dr.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		//checkout.click();
		clickElement(checkout);
		
		
		WebElement cho = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickElement(cho);
		//cho.click();
		
		WebElement clii = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickElement(clii);		
		//clii.click();
		
		
		WebElement ter = driver.findElement(By.xpath("//input[@type='checkbox']"));
		clickElement(ter);
		//ac.click(ter).build().perform();
		
		WebElement ckk = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//ckk.click();
		clickElement(ckk);
		
		
		

	}
	

}
