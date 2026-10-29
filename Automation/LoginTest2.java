package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest2 {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://javabykiran.com/liveproject/index.html");

		WebElement username = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement signinbutton = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));

		System.out.println("-------Positive Scenario with valid Details--------------");

		username.sendKeys("kiran@gmail.com");
		pwd.sendKeys("123456");
		signinbutton.click();

		Thread.sleep(1000);

		driver.navigate().back();
		username.clear();
		pwd.clear();
		Thread.sleep(1000);

		System.out.println("-------Negative Scenario with invalid email--------------");

		username.sendKeys("kirangmail.com");

		pwd.sendKeys("123456");

		signinbutton.click();

		Thread.sleep(1000);
		username.clear();
		pwd.clear();

		System.out.println("-------Negative Scenario with invalid password--------------");

		username.sendKeys("kiran@gmail.com");

		pwd.sendKeys("123");

		signinbutton.click();

		Thread.sleep(1000);

	}

}
