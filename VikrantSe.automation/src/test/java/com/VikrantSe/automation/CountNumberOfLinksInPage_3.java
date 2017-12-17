package com.VikrantSe.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class CountNumberOfLinksInPage_3 {
	WebDriver driver;
	
  @Test
  public void countNumberOfLinksInPage() {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  
	  List<WebElement> link = driver.findElements(By.xpath("//div[@ id='reg_form_box']/div"));
	int actual=link.size(); //List.size is used for counting links
	 Assert.assertEquals(9, actual);
	  
	  driver.quit();
	  
  }
}
