package com.lao.helloworld;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\ADMIN\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/dropdowns");

		//1.Select using visibleText
		

		WebElement dropdown1=driver.findElement(By.id("fruits"));
		Select select = new Select(dropdown1);
		select.selectByVisibleText("Apple");

		//2.Select your super hero's

		WebElement dropdown2=driver.findElement(By.id("superheros"));
		Select select1 = new Select(dropdown2);
		select1.selectByIndex(3);


		//3.Select the last programming language and print all the options
		WebElement dropdown3= driver.findElement(By.id("lang"));
		Select select3= new Select(dropdown3);
		dropdown3.sendKeys("C#");
		List<WebElement> list =select3.getOptions();
		int totalsize=	list.size();
		String listoflist=list.toString();
		System.out.println(totalsize);
		System.out.println(listoflist);

		//4.Select India using value & print the selected value
		Thread.sleep(5000);
		WebElement dropdown4=driver.findElement(By.id("country"));

		Select select4 = new Select(dropdown4);
		select4.selectByVisibleText("India");


	}

}
