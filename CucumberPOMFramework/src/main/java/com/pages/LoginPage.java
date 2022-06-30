package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By email = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By forgotPaswordLink = By.linkText("Forgot your password?");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean isForgotPasswordLinkPresent()
	{
		return driver.findElement(forgotPaswordLink).isDisplayed();
	}

	public void enterUserName(String username)
	{
		driver.findElement(email).sendKeys(username);
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin()
	{
		driver.findElement(signInButton).click();
	}
	
	public AccountsPage login(String username,String pwd)
	{
		enterUserName(username);
		enterPassword(pwd);
		clickOnLogin();
		return new AccountsPage(driver);

	}
}
