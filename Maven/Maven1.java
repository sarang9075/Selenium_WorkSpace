
package com.tka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Maven1 {

	public static void main(String[] args) throws Exception {

		// EdgeDriver Path
		System.setProperty("webdriver.edge.driver", "C:\\Tools & Software\\edgedriver_win64\\msedgedriver.exe");

		// Launch Browser
		WebDriver driver = new EdgeDriver();

		// Maximize Browser
		driver.manage().window().maximize();

		// Open Registration Page
		driver.get("https://javabykiran.com/liveproject/pages/examples/register.html");

		Thread.sleep(2000);

		// Name
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		name.clear();
		name.sendKeys("Sarang");

		// Mobile
		WebElement mobile = driver.findElement(By.xpath("//input[@placeholder='Mobile']"));
		mobile.clear();
		mobile.sendKeys("9876543210");

		// Email
		WebElement email = driver.findElement(By.xpath("//*[@id='form']/div[3]//input"));
		email.clear();
		email.sendKeys("test@example.com");

		// Password
		WebElement password = driver.findElement(By.xpath("//*[@id='form']/div[4]//input"));
		password.clear();
		password.sendKeys("Test@123");

		// Register Button
		WebElement register = driver.findElement(By.xpath("//button[normalize-space()='Register']"));
		register.click();

		Thread.sleep(2000);

		System.out.println("Registration Test Executed");

		// Close Browser
		driver.quit();
	}
}
