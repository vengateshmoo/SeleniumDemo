package com.lao.helloworld;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\ADMIN\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/alert");

		// 1.Accept the Alert

		WebElement alertBox = driver.findElement(By.id("accept"));
		alertBox.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		// 2.Dismiss the Alert & print the alert text

		WebElement confirmBox = driver.findElement(By.id("confirm"));
		confirmBox.click();

		Alert confirmAlert = driver.switchTo().alert();
		String alertmessage = confirmAlert.getText();
		System.out.println("simple alert message is:" + alertmessage);
		confirmAlert.accept();

		// 3.Type your name & accept

		WebElement promptBox = driver.findElement(By.id("prompt"));
		promptBox.click();
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("VENGATESH");
		promptalert.accept();
		WebElement name = driver.findElement(By.id("myName"));
		String name1 = name.getText();
		System.out.println("my name is" + name1);

		/*
		 * //4.Sweet Alert WebElement sweetalert=driver.findElement(By.id("modern"));
		 * sweetalert.click();
		 * 
		 * Thread.sleep(3000); Alert sweetAlert =driver.switchTo().alert();
		 * sweetAlert.dismiss();
		 * 
		 */
	}

}
