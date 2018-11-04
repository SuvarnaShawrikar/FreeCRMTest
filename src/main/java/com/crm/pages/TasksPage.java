package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.crm.base.TestBase;

public class TasksPage extends TestBase{

	WebElement newTaskLink;
	
	// (Page factory - Object repository (get xpaths for all the elements on the page)
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement TasksLink;
	
	public void clickOnNewTaskLink(){
		Actions action = new Actions(driver);
		action.moveToElement(TasksLink).build().perform();
		newTaskLink.click();
		
	}
}
