package com.lao.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\ADMIN\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/edit");
		WebElement fullname=driver.findElement(By.id("fullName"));
		fullname.sendKeys("vengatesh");
		WebElement appendbox=	driver.findElement(By.xpath("//*[@id='join']"));
		appendbox.sendKeys("hi");

		WebElement value=driver.findElement(By.id("getMe"));
		String values=value.getAttribute("value");
		System.out.println(values);

		WebElement clear=	driver.findElement(By.id("clearMe"));
		clear.clear();
		WebElement disabledbox=driver.findElement(By.id("noEdit"));
		boolean enable=disabledbox.isEnabled();
		System.out.println(enable);
	}

}
