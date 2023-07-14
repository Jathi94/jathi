package com.java.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonCheckbox  {
	public static void main(String[] args) {

		ChromeOptions ops = new ChromeOptions();

		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.amazon.com/");

		//WebElement dont_Change = driver.findElement(By.xpath("(//span[@class='a-button-text'])[1]"));
		//dont_Change.click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Smartphones");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement datas = driver.findElement(By.xpath("//span[text()='Brands']"));
		System.out.println(datas.getText());
		//WebElement Check_Box = driver.findElement(By.xpath("//li[@aria-label='Xiaomi']/span/a/div"));
		//Check_Box.click();
		
		
		

	}

}
