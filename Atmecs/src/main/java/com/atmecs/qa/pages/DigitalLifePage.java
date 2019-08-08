package com.atmecs.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.qa.constants.Constants;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;

/**
 * This class is used to validate digital life page navigation with data of each page navigated 
 * Perform click operation on read more button and validate pageb navigation is navigated  
 * Perform click operation on digital life icon and validate the digital life page is navigated back 
 * Perform click operation on service icon and validate the service page is navigated back 
 * Perform click operation on home icon and validate the home page is navigated back 
 * verify page navigation with the title of the page
 * 
 * @author Anne.Sivakumar
 *
 */
public class DigitalLifePage {
	public WebDriver driver;
	Helper helperobject = Helper.getInstance();
	CommonUtilityMethods commmon_utility = new CommonUtilityMethods();
	ServicePage servicepageobject = new ServicePage();
	public String propertyfilepath ;
	String reading_digital_life_xpath;
	

	/**
	 * validate digital life page navigation by verifying page digital life title 
	 * click read more button and validate page navigation by verifying each page title 
	 * Perform click operation on digital life icon and validate the digital life page is navigated back 
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * 
	 * @param driver
	 */
	public void digitalLifeMenu(WebDriver driver) {
		System.out.println(driver);
		mouseOverServiceMenu(driver);
		reading_digital_life_xpath = helperobject.getValue("digital_life_submenu");
		commmon_utility.click(driver, helperobject.getValue("digital_life_submenu"));

		servicepageobject.verifyTitle(driver, "Digital Life");

		//By heading = helperobject.loadProperty(driver, "digital_life_heading", propertyfilepath);
		List<String> actual_heading = commmon_utility.countNumberOfServices(driver, helperobject.getValue("digital_life_heading"));
		commmon_utility.verifyAssertListOfText(actual_heading, digitalLifepageHyperlink());

		//By readmore = helperobject.loadProperty(driver, "digital_lifepage_readmore_count", propertyfilepath);
		List<String> actual_readmore = commmon_utility.countReadMoreButton(driver, helperobject.getValue("digital_lifepage_readmore_count"));
		commmon_utility.verifyAssertListOfText(actual_readmore, digitalLifepageReadmore());

		performClickReadMoreButton(driver,"artificial_intelligence_readmore_button","Artificial Intelligence / Machine Learning");
		performClickReadMoreButton(driver,"virtual_reality_readmore_button","Augmented Reality / Virtual Reality");
		performClickReadMoreButton(driver,"blockchain_readmore_button","Blockchain");
		performClickReadMoreButton(driver,"robotic_readmore_button","Robotic Process Automation & ChatBOTs");
		performClickReadMoreButton(driver,"internetofthings_readmore_button","Internet of Things");
	
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}

	// add the list of elements into the list
	public List<String> digitalLifepageHyperlink() {
		List<String> hyperlink_content_expexted = new ArrayList<String>();
		hyperlink_content_expexted.add("Artificial Intelligence / Machine Learning");
		hyperlink_content_expexted.add("Augmented Reality / Virtual Reality");
		hyperlink_content_expexted.add("Blockchain");
		hyperlink_content_expexted.add("Robotic Process Automation & ChatBOTs");
		hyperlink_content_expexted.add("Internet of Things");
		return hyperlink_content_expexted;
	}

	// add the list of elements into the list
	public List<String> digitalLifepageReadmore() {
		List<String> readmore_content_expexted = new ArrayList<String>();
		for(int i=1;i<=5;i++)
		{
		readmore_content_expexted.add("Read More");
		}
		return readmore_content_expexted;
	}
	
	public void performClickReadMoreButton(WebDriver driver,String xpath,String expectedtitle)
	{
		servicepageobject.clickReadMoreButton(driver, xpath);
		servicepageobject.verifyTitle(driver, expectedtitle);
		clickOnDigitalLifeText(driver);
	}

	//perform mouse over operation in service menu
	public void mouseOverServiceMenu(WebDriver driver) {
		//By reading_service_xpath = helperobject.loadProperty(driver, "servicemenu", propertyfilepath);
		//helperobject.explixitWait(driver, "servicemenu");
		commmon_utility.performMouseOver(driver, helperobject.getValue("servicemenu"));
	}


	//perform click operation for digital life icon 
	public void clickOnDigitalLifeText(WebDriver driver) {
		//By backward_digital_life_xpath = helperobject.loadProperty(driver, "digital_lifepage_icon", propertyfilepath);
		commmon_utility.click(driver, helperobject.getValue("digital_lifepage_icon"));
	}

	/**
	 * validate artificial intelligence page navigation by verifying page artificial intelligence title
	 * Perform click operation on digital life icon and validate the digital life page is navigated back  
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void artificialIntelligenceSubmenu(WebDriver driver) {
		mouseOverServiceMenu(driver);
		//By reading_artificial_intelligence_xpath = helperobject.loadProperty(driver, "artificial_intelligence_submenu",propertyfilepath);
		//helperobject.explixitWait(driver, "digital_life_submenu");
		commmon_utility.performMouseOver(driver, helperobject.getValue("digital_life_submenu"));
		commmon_utility.performMouseOver(driver, helperobject.getValue("artificial_intelligence_submenu"));
		helperobject.explixitWait(driver, "artificial_intelligence_submenu");
		commmon_utility.click(driver, helperobject.getValue("artificial_intelligence_submenu"));
		servicepageobject.verifyTitle(driver, "Artificial Intelligence / Machine Learning");
		clickOnDigitalLifeText(driver);
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
	/**
	 * validate virtual reality page navigation by verifying page virtual reality title
	 * Perform click operation on digital life icon and validate the digital life page is navigated back  
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void virtualRealitySubmenu(WebDriver driver) {
		mouseOverServiceMenu(driver);
		//By reading_virtual_reality_xpath = helperobject.loadProperty(driver, "virtual_reality_submenu", propertyfilepath);
		//helperobject.explixitWait(driver, "digital_life_submenu");
		commmon_utility.performMouseOver(driver, helperobject.getValue("digital_life_submenu"));
		commmon_utility.performMouseOver(driver, helperobject.getValue("virtual_reality_submenu"));
		helperobject.explixitWait(driver, "virtual_reality_submenu");
		commmon_utility.click(driver, helperobject.getValue("virtual_reality_submenu"));
		servicepageobject.verifyTitle(driver, "Augmented Reality / Virtual Reality");
		clickOnDigitalLifeText(driver);
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
	/**
	 * validate blockchain page navigation by verifying page blockchain title
	 * Perform click operation on digital life icon and validate the digital life page is navigated back  
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void blockchainSubmenu(WebDriver driver) {
		mouseOverServiceMenu(driver);
		//By reading_blockchain_xpath = helperobject.loadProperty(driver, "blockchain_submenu", propertyfilepath);
		//helperobject.explixitWait(driver, "digital_life_submenu");
		commmon_utility.performMouseOver(driver, helperobject.getValue("digital_life_submenu"));
		commmon_utility.performMouseOver(driver, helperobject.getValue("blockchain_submenu"));
		helperobject.explixitWait(driver, "blockchain_submenu");
		commmon_utility.click(driver, helperobject.getValue("blockchain_submenu"));
		servicepageobject.verifyTitle(driver, "Blockchain");
		clickOnDigitalLifeText(driver);
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
	/**
	 * validate robotic page navigation by verifying page robotic title
	 * Perform click operation on digital life icon and validate the digital life page is navigated back  
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void roboticSubmenu(WebDriver driver) {
		mouseOverServiceMenu(driver);
		//By reading_robotic_xpath = helperobject.loadProperty(driver, "robotic_submenu", propertyfilepath);
		//helperobject.explixitWait(driver, "digital_life_submenu");
		commmon_utility.performMouseOver(driver, helperobject.getValue("digital_life_submenu"));
		commmon_utility.performMouseOver(driver, helperobject.getValue("robotic_submenu"));
		helperobject.explixitWait(driver, "robotic_submenu");
		commmon_utility.click(driver, helperobject.getValue("robotic_submenu"));
		servicepageobject.verifyTitle(driver, "Robotic Process Automation & ChatBOTs");
		clickOnDigitalLifeText(driver);
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
	/**
	 * validate internet of things page navigation by verifying page internet of things title
	 * Perform click operation on digital life icon and validate the digital life page is navigated back  
	 * Perform click operation on service icon and validate the service page is navigated back 
	 * Perform click operation on home icon and validate the home page is navigated back
	 * @param driver
	 */
	public void internetofthingsSubmenu(WebDriver driver) {
		mouseOverServiceMenu(driver);
		//By reading_internetofthings_xpath = helperobject.loadProperty(driver, "internetofthings_submenu",propertyfilepath);
		//helperobject.explixitWait(driver, "digital_life_submenu");
		commmon_utility.performMouseOver(driver, helperobject.getValue("digital_life_submenu"));
		commmon_utility.performMouseOver(driver, helperobject.getValue("internetofthings_submenu"));
		helperobject.explixitWait(driver, "internetofthings_submenu");
		commmon_utility.click(driver, helperobject.getValue("internetofthings_submenu"));
		servicepageobject.verifyTitle(driver, "Internet of Things");
		clickOnDigitalLifeText(driver);
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
}
