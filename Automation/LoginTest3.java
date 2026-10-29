package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest3 {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://javabykiran.com/liveproject/index.html");

		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");

		driver.findElement(By.id("password")).sendKeys("123456");

		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

	}

}
