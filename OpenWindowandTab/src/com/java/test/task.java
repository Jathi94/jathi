package com.java.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task {

	public static void main(String[] args) {
		ChromeOptions ops = new ChromeOptions();

		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Smartphones");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
	}
}
