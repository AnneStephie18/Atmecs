package com.atmecs.qa.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.qa.pages.ProductEngineeringPage;
import com.atmecs.qa.testbase.Base;
/**
 * 
 * @author Anne.Sivakumar
 *
 */
public class TestProductEngineeringPage extends Base{
	ProductEngineeringPage product_engineering_page= new ProductEngineeringPage();
	/**
	 * open the browser 
	 */
	@BeforeTest
	public void preSetup()
	{
		openBrowser();
	}
	
	/**
	 * call Product_Engineering_Menu method
	 */
	@Test
	public void testProductEngineeringClick()
	{
		
		product_engineering_page.ProductEngineeringMenu(driver);
	}
	
	/**
	 * quit the browser 
	 */
	@AfterTest
	public void tearDown()
	{
		quitBrowser();
	}
}
