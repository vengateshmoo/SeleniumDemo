package com.lao.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefoxdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\ADMIN\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/edit");
		/*
		 * WebElement username=driver.findElement(By.id("identifierId"));
		 * username.sendKeys("vengatesh"); WebElement click=
		 * driver.findElement(By.xpath("//*[text()='Next']")); click.click();
		 */

	}

}
