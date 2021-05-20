package com.selenium.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {

	
	public static WebDriver driver;
	
	@FindBy(xpath="(//input[@name='email'])[1]")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name='passwd']")
	private WebElement password ;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement login ;
	
	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return password;
	}

	
	public WebElement getLogin() {
		return login;
	}

	 public PomClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
}
