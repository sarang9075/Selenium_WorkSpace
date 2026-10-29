package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test_Login {
	public static void main(String[] args) throws Exception {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://javabykiran.com/liveproject/index.html");

		System.out.println("-------Positive Scenario with valid Details--------------");

		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("kiran@gmail.com");

		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("123456");

		WebElement signinbutton = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		signinbutton.click();

		Thread.sleep(1000);

		driver.navigate().back();
		// WebElement logout =
		// driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[7]/a/span"));
		// logout.click();
		username.clear();
		pwd.clear();
		Thread.sleep(1000);

		System.out.println("-------Negative Scenario with invalid email--------------");

		WebElement username1 = driver.findElement(By.id("email"));
		username1.sendKeys("kirangmail.com");

		WebElement pwd1 = driver.findElement(By.id("password"));
		pwd1.sendKeys("123456");

		WebElement signinbutton1 = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		signinbutton1.click();

		Thread.sleep(1000);
		username1.clear();
		pwd1.clear();

		System.out.println("-------Negative Scenario with invalid password--------------");

		WebElement username2 = driver.findElement(By.id("email"));
		username2.sendKeys("kiran@gmail.com");

		WebElement pwd2 = driver.findElement(By.id("password"));
		pwd2.sendKeys("123");

		WebElement signinbutton2 = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		signinbutton2.click();

		Thread.sleep(1000);

	}

}
