package com.atmecs.qa.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import com.atmecs.qa.helper.Helper;
import com.atmecs.qa.utils.CommonUtilityMethods;

/**
 * This class is used to validate digital life page navigation with data of each page navigated 
 * Perform click operation on read more button and validate pageb navigation is navigated  
 * Perform click operation on digital life icon and validate the digital life page is navigated back 
 * Perform click operation on service icon and validate the service page is navigated back 
 * Perform click operation on home icon and validate the home page is navigated back 
 * verify page navigation with the title of the page
 */
public class DigitalLifePage {
	Helper helperobject = Helper.getInstance();
	CommonUtilityMethods commmon_utility = new CommonUtilityMethods();
	ServicePage servicepageobject = new ServicePage();
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
		servicepageobject.verifyTitle(driver, helperobject.getValue("expected_digital_life_page_title"));

		List<String> actual_heading = commmon_utility.countNumberOfServices(driver, helperobject.getValue("digital_life_heading"));
		commmon_utility.verifyAssertListOfText(actual_heading, digitalLifepageHyperlink());

		List<String> actual_readmore = commmon_utility.countReadMoreButton(driver, helperobject.getValue("digital_lifepage_readmore_count"));
		commmon_utility.verifyAssertListOfText(actual_readmore, digitalLifepageReadmore());

		performClickReadMoreButton(driver,"artificial_intelligence_readmore_button",helperobject.getValue("expected_artificial_intelligence_page_title"));
		performClickReadMoreButton(driver,"virtual_reality_readmore_button",helperobject.getValue("expected_virtual_reality_page_title"));
		performClickReadMoreButton(driver,"blockchain_readmore_button",helperobject.getValue("expected_blockchain_page_title"));
		performClickReadMoreButton(driver,"robotic_readmore_button",helperobject.getValue("expected_robotic_page_title"));
		performClickReadMoreButton(driver,"internetofthings_readmore_button",helperobject.getValue("expected_internet_of_things_page_title"));
	
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}

	// add the list of elements into the list
	public List<String> digitalLifepageHyperlink() {
		List<String> hyperlink_content_expexted = new ArrayList<String>();
		hyperlink_content_expexted.add(helperobject.getValue("expected_artificial_intelligence_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_virtual_reality_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_blockchain_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_robotic_page_title"));
		hyperlink_content_expexted.add(helperobject.getValue("expected_internet_of_things_page_title"));
		return hyperlink_content_expexted;
	}

	// add the list of elements into the list
	public List<String> digitalLifepageReadmore() {
		List<String> readmore_content_expexted = new ArrayList<String>();
		for(int i=1;i<=5;i++)
		{
		readmore_content_expexted.add(helperobject.getValue("readmoretext"));
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
		commmon_utility.performMouseOver(driver, helperobject.getValue("servicemenu"));
	}


	//perform click operation for digital life icon 
	public void clickOnDigitalLifeText(WebDriver driver) {
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
		commmon_utility.performMouseOver(driver, helperobject.getValue("digital_life_submenu"));
		commmon_utility.performMouseOver(driver, helperobject.getValue("artificial_intelligence_submenu"));
		helperobject.explixitWait(driver,"artificial_intelligence_submenu");
		commmon_utility.click(driver, helperobject.getValue("artificial_intelligence_submenu"));
		servicepageobject.verifyTitle(driver, helperobject.getValue("expected_artificial_intelligence_page_title"));
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
		commmon_utility.performMouseOver(driver, helperobject.getValue("digital_life_submenu"));
		commmon_utility.performMouseOver(driver, helperobject.getValue("virtual_reality_submenu"));
		helperobject.explixitWait(driver,"virtual_reality_submenu");
		commmon_utility.click(driver, helperobject.getValue("virtual_reality_submenu"));
		servicepageobject.verifyTitle(driver, helperobject.getValue("expected_virtual_reality_page_title"));
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
		commmon_utility.performMouseOver(driver, helperobject.getValue("digital_life_submenu"));
		commmon_utility.performMouseOver(driver, helperobject.getValue("blockchain_submenu"));
		helperobject.explixitWait(driver, "blockchain_submenu");
		commmon_utility.click(driver, helperobject.getValue("blockchain_submenu"));
		servicepageobject.verifyTitle(driver, helperobject.getValue("expected_blockchain_page_title"));
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
		commmon_utility.performMouseOver(driver, helperobject.getValue("digital_life_submenu"));
		helperobject.explixitWait(driver,"robotic_submenu");
		commmon_utility.performMouseOver(driver, helperobject.getValue("robotic_submenu"));
		commmon_utility.click(driver, helperobject.getValue("robotic_submenu"));
		servicepageobject.verifyTitle(driver, helperobject.getValue("expected_robotic_page_title"));
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
		commmon_utility.performMouseOver(driver, helperobject.getValue("digital_life_submenu"));
		helperobject.explixitWait(driver,  "internetofthings_submenu");
		commmon_utility.performMouseOver(driver, helperobject.getValue("internetofthings_submenu"));
		commmon_utility.click(driver, helperobject.getValue("internetofthings_submenu"));
		servicepageobject.verifyTitle(driver,helperobject.getValue("expected_internet_of_things_page_title"));
		clickOnDigitalLifeText(driver);
		servicepageobject.clickOnServiceText(driver);
		servicepageobject.clickOnHomeText(driver);
	}
}
