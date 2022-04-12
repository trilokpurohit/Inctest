package com.INC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Init.AbstractPage;
import com.Init.Common;

public class HomeUiVerification extends AbstractPage{

	public HomeUiVerification(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[contains(@style,'grid-column-start:1;grid-column-end:7;z-index:1')]//a[@href='/']//*[local-name()='svg']")
	private WebElement eleLogo;

	@FindBy(xpath="//ul[@class='nav-sidebar__list'][count(.//li)>0]")
	private WebElement eleSideBarList;

	
	public boolean VerifyIfLogoPresent() {
		Common.waitForElementVisibility(driver, eleLogo);
		return Common.isElementDisplayed(eleLogo);

	}

	public boolean VerifyNavigationListItems() {
		Common.waitForElementVisibility(driver, eleSideBarList);
		return Common.isElementDisplayed(eleSideBarList);
	}

}
