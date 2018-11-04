package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.crm.base.TestBase;

public class DocsPage extends TestBase{
WebElement newDocsLink;
	
	// (Page factory - Object repository (get xpaths for all the elements on the page)
	@FindBy(xpath="//a[contains(text(),'Docs')]")
	WebElement DocsLink;
	
	public void clickOnNewTaskLink(){
		Actions action = new Actions(driver);
		action.moveToElement(DocsLink).build().perform();
		newDocsLink.click();
		
	}

}
