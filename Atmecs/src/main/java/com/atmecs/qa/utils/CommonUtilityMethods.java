package com.atmecs.qa.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.atmecs.qa.logreports.LogReports;
import com.atmecs.qa.testbase.Base;
/**
 * This class is used to perform operations such as click, mouse over, get title, verify assert, navigate to, count read more button, count hyper link present 
 * @author Anne.Sivakumar
 *
 */
public class CommonUtilityMethods  {
	LogReports log=new LogReports();
	Base base = new Base();
	
	 //perform mouse over using actions class
	public void performMouseOver(WebDriver driver,String xpath)
	 {
		 Actions action = new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath(xpath))).build().perform();
	 }
	
	//return the title of the page
	public String getTitle(WebDriver driver,String xpath)
	{
		  return driver.findElement(By.xpath(xpath)).getText();
	}
	
	//verify with the actual and expected title is same
	public void verifyAssertTitle(String actual,String expected)
	{
		
		log.info("Actual Title of the page:"+actual);
		log.info("ExpectedTitle of the page:"+expected);
		Assert.assertEquals(actual,expected,"passed");
	}
	
	//count and print the number of read more button  by passing xpath as parameter
	public List<String> countReadMoreButton(WebDriver driver,String readmore_xpath)
	{
		List<String> read_more_content= new ArrayList<String>();
		List<WebElement> read_more_button= driver.findElements(By.xpath(readmore_xpath));

		for(WebElement CountOfReadMore:read_more_button)
		{
			read_more_content.add(CountOfReadMore.getText());
		}
		log.info("List of Read More content:"+read_more_content);
		log.info("Read More count:"+read_more_content.size());
		return read_more_content;
	}
	
	//count and print the number of hyper link button  by passing xpath as parameter
	public List<String> countNumberOfServices(WebDriver driver,String readmore_xpath)
	{
		List<String> hyperlink_content= new ArrayList<String>();
		List<WebElement> read_more_button= driver.findElements(By.xpath(readmore_xpath));
		
		for(WebElement CountOfReadMore:read_more_button)
		{
			hyperlink_content.add(CountOfReadMore.getText());
		    CountOfReadMore.getSize();
		}
		log.info("List of Hyper Link content:"+hyperlink_content);
		log.info("Hyper Link count:"+hyperlink_content.size());
		return hyperlink_content;
	}
	
	//verify with list of actual and expected title is same
   public void verifyAssertListOfText(List<String> actual, List<String> expected) 
    {
	   log.info("Actual Title of the page:"+actual);
	   log.info("Expected Title of the page:"+expected);
	   Assert.assertEquals(actual,expected,"passed");
	}
   
 //perform click operation by passing xpath as parameter
public void click(WebDriver driver,String clickxpath)
	{    
		 driver.findElement(By.xpath(clickxpath)).click();		 
	}
	
//navigate to the previous page
	public void navigateTo(WebDriver driver)
	{
		driver.navigate().back();
	}
	
}
