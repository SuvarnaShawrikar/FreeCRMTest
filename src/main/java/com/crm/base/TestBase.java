package com.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import com.crm.util.TestUtil;
import com.crm.util.WebEventListener;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver event_driver;
	public static WebEventListener eventListener;

	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/Suvarna/eclipse-selenium-workspace/FreeCRMTest/src/main/java/com/crm/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialse() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			// Set the property for chrome driver
     		System.setProperty("webdriver.chrome.driver", "/Users/Suvarna/Downloads/chromedriver");
     		// Launch Chrome
     		driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "/Users/Suvarna/Downloads/geckodriver");	
			driver = new FirefoxDriver(); 
		}
		
		event_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		event_driver.register(eventListener);
		driver = event_driver;
		
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		  driver.get(prop.getProperty("url"));
	}

		
	}
	
