package com.lao.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\ADMIN\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/radio");

		//1.Select any one
		WebElement firstbutton=driver.findElement(By.id("yes"));

		firstbutton.click();
		//2.Cofirm you can select only one radio button

		WebElement secondbutton=driver.findElement(By.id("one"));
		boolean second=	secondbutton.isSelected();
		System.out.println(second);

		//3.Find which one is selected

		WebElement checked1=driver.findElement(By.id("foo"));
		WebElement checked2=driver.findElement(By.id("notfoo"));

		boolean box1=	checked1.isSelected();
		boolean box2=checked2.isSelected();
		System.out.println(box1);
		System.out.println(box2);

		//4.Confirm last field is disabled
		WebElement fourthbox=driver.findElement(By.id("maybe"));
		boolean bx=fourthbox.isEnabled();
		System.out.println("last box is disabled:"+bx);

		//5.checkbox
		WebElement checkbox=driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]"));
		boolean ckbox1=checkbox.isSelected();
		System.out.println("check box is selected or not:"+ckbox1);

	}

}
