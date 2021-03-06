package com.crm.comcast.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
@FindBy(xpath = "//img[@title='Create Contact...']")
private WebElement createConElementLookUpImg;



public ContactsPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}



public WebElement getCreateConElementLookUpImg() {
	return createConElementLookUpImg;
}



public void clickOnCreateContactImg()
{
	createConElementLookUpImg.click();
}
}
