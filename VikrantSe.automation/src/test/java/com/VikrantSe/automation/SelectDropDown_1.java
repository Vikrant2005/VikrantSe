package com.VikrantSe.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class SelectDropDown_1 {
	
	WebDriver driver;
	
	@Test
	public void dropDownSelectionFacebook() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/**
		 * For Selection of DropDown ,identify is it is list or menu 
		 * List has Select in HTML
		 * Create object of Select which accept WebElement
		 * use visibleBy Id, Value,Visible text methods
		 */
		//Thread.sleep(2000);
		Select selectDay=new Select(driver.findElement(By.id("day")));
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		Select selectYear=new Select(driver.findElement(By.id("year")));
		
		selectDay.selectByIndex(20);
		selectMonth.selectByValue("5");
		selectYear.selectByVisibleText("1985");  //used where Data is Dynamic
		Thread.sleep(2000);
		driver.quit();
	}
	

}
