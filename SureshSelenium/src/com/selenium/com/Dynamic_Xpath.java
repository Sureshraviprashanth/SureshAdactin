package com.selenium.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	WebDriver drive= new ChromeDriver();
	drive.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7");
	drive.manage().window().maximize();
	drive.manage().getCookies();
	
	List<WebElement> AllPrize = drive.findElements(By.xpath("()"));
	List<Integer> prize_List=new ArrayList<>(); 
	for (int i = 0; i < AllPrize.size(); i++) {
		String prize = AllPrize.get(i).getText().replace("Rs. ", "");
		int value = Integer.parseInt(prize);
		prize_List.add(value);
		
	}
	System.out.println(prize_List);
	int size = prize_List.size();
	System.out.println("size:"+size);
	System.out.println("Minimum value:" +Collections.min(prize_List));
}
}
