package com.lao.helloworld;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\ADMIN\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/buttons");


		//1.Find the positions
		WebElement positions = driver.findElement(By.id("position"));
		org.openqa.selenium.Point xypoint=positions.getLocation();
		int xvalue=	xypoint.getX();
		int yvalue=xypoint.getY();
		System.out.println("X value is"+xvalue+"Y value is"+yvalue);


		//2.Find the colours

		WebElement colourButton=driver.findElement(By.id("color"));
		String colour=	colourButton.getCssValue("background-color");
		System.out.println("Button colour is"+colour);
		
		

		//3.Height of the Button 
		
		WebElement heightofthebutton= driver.findElement(By.id("property"));
		
		int height=	heightofthebutton.getSize().getHeight();
		int width=	heightofthebutton.getSize().getWidth();
		System.out.println("Height is:"+height+"Width is:"+width);

		//4.go to home page
		WebElement gohome=driver.findElement(By.id("home"));
		gohome.click();



	}

}
