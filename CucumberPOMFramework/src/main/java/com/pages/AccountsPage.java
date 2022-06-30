package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	
	private WebDriver driver;
	
	private By accountSection = By.cssSelector("div#center_column span");
	
	public AccountsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public int getAccountSectionsCount()
	{
		return driver.findElements(accountSection).size()-1;
		
	}

	public List<String> getAccountSectionList()
	{
		List<WebElement> accountsHeaderList= driver.findElements(accountSection);
		List<String> acountsList = new ArrayList<>();
		
		for(WebElement e : accountsHeaderList)
		{
			acountsList.add(e.getText());
			
		}
		return acountsList;
	}
	
	public String getAccountsPagetitle()
	{
		return driver.getTitle();
	}
}
