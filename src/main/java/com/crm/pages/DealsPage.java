package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.crm.base.TestBase;

public class DealsPage extends TestBase{
	
WebElement newDealsLink;
	
	// (Page factory - Object repository (get xpaths for all the elements on the page)
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement DealsLink;
	
	public void clickOnNewTaskLink(){
		Actions action = new Actions(driver);
		action.moveToElement(DealsLink).build().perform();
		newDealsLink.click();
		
	}

}
