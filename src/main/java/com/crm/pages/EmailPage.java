package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.crm.base.TestBase;

public class EmailPage extends TestBase{
	
	// (Page factory - Object repository (get xpaths for all the elements on the page)
	@FindBy(xpath="//a[contains(text(),'Email')]")
	WebElement EmailLink;
	
	@FindBy(xpath="//a[contains(text(),'New Email Campaign')]")
	WebElement newEmailLink;
	
	public void clickOnNewTaskLink(){
		Actions action = new Actions(driver);
		action.moveToElement(EmailLink).build().perform();
		newEmailLink.click();
		
	}

}
