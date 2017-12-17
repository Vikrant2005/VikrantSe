package com.VikrantSe.automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HowToSelectWindowsInSelenium_4 {
	
	WebDriver driver;
	
	@Test
	public void howToSelectWindowsInSelenium_4() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/htdocs/common/onlineservices/netbankingloginsafe_nri.htm");
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div[1]/ul/li[1]/a")).click();
		Set<String> window = driver.getWindowHandles(); // Return Set
		Iterator<String> itr = window.iterator();  //Returns Type Iterator type string
		String parentWindow=itr.next();
		String childWindow=itr.next();
		System.out.println("parentWindow"+parentWindow);
		System.out.println("childWindow"+childWindow);
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath(".//*[@id='netbanking']")).click();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentWindow);
		boolean homePage = driver.findElement(By.xpath(".//*[@id='element1']/div[4]/a/img")).isDisplayed();
		Assert.assertEquals(homePage, true);
		driver.quit();
	}
	
	

}
