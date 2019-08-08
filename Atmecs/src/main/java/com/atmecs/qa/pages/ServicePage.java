package com.atmecs.qa.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.testbase.Base;
import com.atmecs.qa.utils.CommonUtilityMethods;

/**
 * This class is used to validate services page navigation with data of each page navigated  
 * Perform click operation on hyper link and validate page navigation is navigated 
 * Perform click operation on read more button and validate page navigation is navigated  
 * Perform click operation on home icon validate the home page is navigated back  
 * verify page navigation with the title of the page
 * 
 * @author Anne.Sivakumar
 *
 */
public class ServicePage
{

	Base base = new Base();
	public WebDriver driver;
	public WebElement servicemenuxpath;
	public WebElement servicepagetitle;
	CommonUtilityMethods commmon_utility = new CommonUtilityMethods();
	String propertyfilepath;
	Helper helperobject=Helper.getInstance();
	

	/**
	 * validate service page navigation by verifying page service title
	 * click read more button and validate page navigation by verifying each page title
	 * click hyper link and validate page navigation by verifying each page title
	 * Perform click operation on home icon validate the home page is navigated back  
	 * @param driver
	 */
	public void ServiceMenu(WebDriver driver) 
	{
		
		//By reading_services_xpath = helperobject.loadProperty(driver, "servicemenu", propertyfilepath);
		//commmon_utility.click(driver, reading_services_xpath);helperobject.getValue("cloud_services_submenu")
		commmon_utility.click(driver, helperobject.getValue("servicemenu"));
		verifyTitle(driver, "Services");

		//By hyperlink = helperobject.loadProperty(driver, "servicepage_hyperlink_count", propertyfilepath);
		List<String> actual_hyperlink = commmon_utility.countNumberOfServices(driver, helperobject.getValue("servicepage_hyperlink_count"));
		commmon_utility.verifyAssertListOfText(actual_hyperlink, serviceTextlink());

		//By readmore = helperobject.loadProperty(driver, "servicepage_readmore_count", propertyfilepath);
		List<String> actual_readmore = commmon_utility.countReadMoreButton(driver, helperobject.getValue("servicepage_readmore_count"));
		commmon_utility.verifyAssertListOfText(actual_readmore, servicepageReadmore());
		
		performClickNumberOfServices(driver,"enterprise-anlaytics-hyperlink","Enterprise Analytics");
		performClickNumberOfServices(driver,"cloud-services-hyperlink","Cloud Services");
		performClickNumberOfServices(driver,"product-engineering-hyperlink","Product Engineering");
		performClickNumberOfServices(driver,"automation-engineering-hyperlink","Quality Engineering");
		performClickNumberOfServices(driver,"mobile-computing-hyperlink","Mobile Computing");
		performClickNumberOfServices(driver,"digital-life-hyperlink","Digital Life");
		performClickNumberOfServices(driver,"infrastructure-services-hyperlink","Infrastructure Services");
		
		performClickReadMoreButton(driver,"enterprise-anlaytics_readmore_button", "Enterprise Analytics");
		performClickReadMoreButton(driver,"cloud-services_readmore_button", "Cloud Services");
		performClickReadMoreButton(driver,"product-engineering_readmore_button", "Product Engineering");
		performClickReadMoreButton(driver,"automation-engineering_readmore_button", "Quality Engineering");
		performClickReadMoreButton(driver,"mobile-computing_readmore_button", "Mobile Computing");
		performClickReadMoreButton(driver,"digital-life_readmore_button", "Digital Life");
		performClickReadMoreButton(driver,"infrastructure_services_readmore_button", "Infrastructure Services");
		
		clickOnHomeText(driver);
	}

	//perform click operation for service icon 
	public void clickOnServiceText(WebDriver driver) 
	{
		//By servicestext_xpath = helperobject.loadProperty(driver, "services_text", propertyfilepath);
		//commmon_utility.click(driver, servicestext_xpath);
		commmon_utility.click(driver, helperobject.getValue("services_text"));
	}

	//perform click operation for home icon 
	public void clickOnHomeText(WebDriver driver) 
	{
		//By homepagetext_xpath = helperobject.loadProperty(driver, "home_text", propertyfilepath);
		//commmon_utility.click(driver, homepagetext_xpath);
		commmon_utility.click(driver, helperobject.getValue("home_text"));
	}

	//add the list of elements into the list 
	public List<String> serviceTextlink() 
	{
		List<String> hyperlink_content_expexted = new ArrayList<String>();
		hyperlink_content_expexted.add("Enterprise Analytics");
		hyperlink_content_expexted.add("Cloud Services");
		hyperlink_content_expexted.add("Product Engineering");
		hyperlink_content_expexted.add("Automation Engineering");
		hyperlink_content_expexted.add("Mobile Computing");
		hyperlink_content_expexted.add("Digital Life");
		hyperlink_content_expexted.add("Infrastructure Services");
		hyperlink_content_expexted.add("Sitemap");
		hyperlink_content_expexted.add("Services");
		hyperlink_content_expexted.add("Careers");
		hyperlink_content_expexted.add("Contact Us");
		return hyperlink_content_expexted;
	}

	//add the list of elements into the list 
	public List<String> servicepageReadmore() 
	{
		List<String> readmore_content_expexted = new ArrayList<String>();
		for(int i=1;i<=7;i++)
		{
		readmore_content_expexted.add(helperobject.getValue("readmoretext"));
		}
		return readmore_content_expexted;
	}

	//perform click operation
	public void clickReadMoreButton(WebDriver driver, String key_xpath) 
	{
		//By click_readmore = helperobject.loadProperty(driver, key_xpath, propertypath);
		//commmon_utility.click(driver, click_readmore);
		commmon_utility.click(driver, helperobject.getValue(key_xpath));

	}

	// verify title of the page
	public void verifyTitle(WebDriver driver, String expectedtitle) 
	{
		//By reading_title_xpath = helperobject.loadProperty(driver, "servicetitle", propertyfilepath);
		String servicepagetitle = commmon_utility.getTitle(driver, helperobject.getValue("servicetitle"));
		commmon_utility.verifyAssertTitle(servicepagetitle, expectedtitle);
	}
	
	//perform click operation on read more button
	public void performClickReadMoreButton(WebDriver driver,String xpath,String expectedtitle)
	{
		clickReadMoreButton(driver, xpath);
		verifyTitle(driver, expectedtitle);
		clickOnServiceText(driver);
	}
	//perform click operation on number of services
	public void performClickNumberOfServices(WebDriver driver,String xpath,String expectedtitle)
	{
		//By reading_enterprise_anlaytics_xpath = helperobject.loadProperty(driver,xpath,propertyfilepath);
		//commmon_utility.click(driver, reading_enterprise_anlaytics_xpath);
		commmon_utility.click(driver, helperobject.getValue(xpath));
		verifyTitle(driver,expectedtitle);
		clickOnServiceText(driver);

	}
}
