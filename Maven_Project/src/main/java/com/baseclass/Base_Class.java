package com.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static void launchurl(WebDriver driver, String url) {
		driver.get(url);

	}

	public static void title(WebDriver d, String title) {

		d.getTitle();

	}

	public static void Switchto(WebDriver d, String url) {

		d.switchTo();

	}

	public static void getpagesource(WebDriver d, String pagesource) {

		d.getPageSource();

	}

	public static void close(WebDriver d, String url) {

		d.close();

	}
	// Navigation Commands

	public static void navigateto(WebDriver d, String url) {
		d.navigate().to(url);
	}

	public static void navigateback(WebDriver d) {
		d.navigate().back();
	}

	public static void navigatefwd(WebDriver d) {
		d.navigate().forward();
	}

	public static void navigaterefresh(WebDriver d) {
		d.navigate().refresh();
	}

	// Manage Commands

	public static void maximize(WebDriver d) {

		d.manage().window().maximize();

	}

	public static void fullscreen(WebDriver d) {
		d.manage().window().fullscreen();

	}

	public static void getsize(WebDriver d, String url) {
		d.manage().window().getSize();

	}

	public static void deleteallcookies(WebDriver d, String url) {
		d.manage().deleteAllCookies();

	}

	// Webelement Methods

	public static void click(WebElement e) {

		e.click();

	}

	public static void sendkeys(WebElement e) {
		e.sendKeys(null);

	}

	public static void clear(WebElement e) {
		e.clear();

	}

	public static void gettext(WebElement e) {
		e.getText();

	}

	public static void isdisplayed(WebElement e) {
		e.isDisplayed();

	}

	public static void isenabled(WebElement e) {
		e.isEnabled();

	}

	public static void isselected(WebElement e) {
		e.isSelected();

	}

	public static void getattributename(WebElement e, String Name) {
		e.getAttribute(Name);

	}

	public static void gettagname(WebElement e) {
		e.getTagName();

	}

	public static void getlocation(WebElement e) {
		e.getLocation();

	}

	public static void getsize(WebElement e) {
		e.getSize();

	}

	public static void cssvalue(WebElement e, String value) {
		e.getCssValue(value);

	}
	// Dropdown methods

	public static void selectbyindex(WebElement e) {

		Select s = new Select(e);
		s.selectByIndex(0);

	}

	public static void selectbyvalue(WebElement e, String value) {

		Select s = new Select(e);
		s.selectByValue(value);

	}

	public static void selectbyvisibletext(WebElement e, String text) {

		Select s = new Select(e);
		s.selectByVisibleText(text);

	}

	public static void ismultiple(WebElement e) {

		Select s = new Select(e);
		s.isMultiple();

	}

	public static void getoption(WebElement e) {

		Select s = new Select(e);
		s.getOptions();

	}

	public static void getallselectedoptions(WebElement e) {

		Select s = new Select(e);
		s.getAllSelectedOptions();

	}

	public static void Firstselectedoptions(WebElement e) {

		Select s = new Select(e);
		s.getFirstSelectedOption();

	}

	public static void deselectbyindex(WebElement e) {

		Select s = new Select(e);
		s.getFirstSelectedOption();

	}

	public static void deselectbyvalue(WebElement e, String value) {

		Select s = new Select(e);
		s.deselectByValue(value);

	}

	public static void deselectbyvisibletest(WebElement e, String text) {

		Select s = new Select(e);
		s.deselectByVisibleText(text);

	}

	public static void deselectall(WebElement e) {

		Select s = new Select(e);
		s.deselectAll();

	}

// Alert

	public static void alertdismiss(WebDriver d) {

		d.switchTo().alert().dismiss();

	}

	public static void alertaccept(WebDriver d) {

		d.switchTo().alert().accept();

	}

	public static void alertgettext(WebDriver d) {

		d.switchTo().alert().getText();

	}

	public static void alertsendkeys(WebDriver d, String value) {

		d.switchTo().alert().sendKeys(value);

	}

// Frames

	public static void framebyindex(WebDriver d, int index) {
		d.switchTo().frame(index);

	}

	public static void framebyid(WebDriver d, String id) {
		d.switchTo().frame(id);

	}

	public static void framebyname(WebDriver d, String name) {
		d.switchTo().frame(name);

	}

	public static void framebyelement(WebDriver d, WebElement e) {
		d.switchTo().frame(e);

	}

	public static void framedefaultcontent(WebDriver d) {
		d.switchTo().defaultContent();

	}

	public static void parentframe(WebDriver d) {
		d.switchTo().parentFrame();

	}

	// Javascriptexecutor

	public static void jsexecutearg(WebDriver d, String key, String argument) {

		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript(key, argument);

	}

	public static void jsclick(WebDriver d, WebElement e) {

		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].click()", e);

	}

	public static void jssendkeys(WebDriver d, WebElement e) {

		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("argumets[0].value='mail'", e);

	}

	private void highlightjs(WebDriver d, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeAsyncScript("arguments[0].setAttribute('style','color:pink'", e);

	}

	// Scroll option,jS alert, os Alert,

	// robot class
	// Waits
	// WIndow HAndling

	// Mouse Action

	public static void move_to_element(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.click(e).build().perform();

	}

	public static void msclicktarg(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.click(e).build().perform();

	}

	public static void click(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.click(e).build().perform();

	}

	public static void contextclicktarget(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.click(e).build().perform();

	}

	public static void contextclick(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.contextClick(e).build().perform();

	}

	public static void doubleclicktarg(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.doubleClick(e).build().perform();

	}

	public static void doubleclick(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.doubleClick(e).build().perform();

	}

	public static void Clickandhold(WebDriver d, WebElement e) {

		Actions a = new Actions(d);
		a.doubleClick(e).build().perform();

	}

	// Screen Shot
	public static void Screenshot(WebDriver driver, String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File Src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(Src, des);

	}
	
	

}
