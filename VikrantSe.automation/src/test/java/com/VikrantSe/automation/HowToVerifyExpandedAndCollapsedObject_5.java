package com.VikrantSe.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HowToVerifyExpandedAndCollapsedObject_5 {
WebDriver driver;

@Test
public void howToVerifyExpandedAndCollapsedObject_5() throws InterruptedException
{	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	driver=new ChromeDriver();
	driver.get("https://www.hdfcbank.com/nri_banking/payments/BillPay/BillPay.htm");
	WebElement link = driver.findElement(By.xpath("//div[@id='nre_savings_acc']/ul/li[2]/h3"));
	String style = link.getCssValue("background-image");
	System.out.println("Before Click"+style);	
	if(style.contains("bg_collapsed_panel"))
{
	Assert.assertTrue(true, style);
}
	else
	{
		Assert.assertTrue(false, style);
	}
	link.click();
	Thread.sleep(5000);
	style=link.getCssValue("background-image");
	
	if(style.contains("bg_expanded_panel"))
{
	Assert.assertTrue(true, style);
}
	else
	{
		Assert.assertTrue(false, style);
	}
	System.out.println("After Click"+style);
	
	//Before Clickurl("https://www.hdfcbank.com/htdocs/nri_banking/product_page/images/bg_collapsed_panel.gif")
	//After Clickurl("https://www.hdfcbank.com/htdocs/nri_banking/product_page/images/bg_expanded_panel
	
	//"https://www.hdfcban...g_collapsed_panel.gif")
	//g_expanded_panel.gif
	
	driver.quit();
}


}
