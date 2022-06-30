package com.qa.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> tDriver = new ThreadLocal<>();

	/**
	 * This method is used to initialize the threadLocal driver on the basis of
	 * given browser
	 * 
	 * @param browser
	 * @return
	 */
	public WebDriver init_driver(String browser) {
		System.out.println("browser value is " + browser);

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tDriver.set(new ChromeDriver());
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tDriver.set(new FirefoxDriver());
		} else {
			System.out.println("Please pass the correct browser value: " + browser);
		}

		getWebDriver().manage().deleteAllCookies();
		getWebDriver().manage().window().maximize();
		getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return getWebDriver();
	}

	public static synchronized WebDriver getWebDriver() {
		return tDriver.get();
	}

}
