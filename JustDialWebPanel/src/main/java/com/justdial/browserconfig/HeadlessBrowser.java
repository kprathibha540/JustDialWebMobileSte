package com.justdial.browserconfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {
	
	 public ChromeOptions getChromeOptions() {
		    	
		        ChromeOptions options = new ChromeOptions();
		        options.addArguments("--test-type");
		        options.addArguments("--enable-popup-blocking");
		        options.addArguments("--start-maximized");
		        options.addArguments("disable-infobars");
		        options.addArguments("--ignore-certificate-errors");
		        options.addArguments("--disable -extensions");
		        
		        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		        capabilities.setJavascriptEnabled(true);

		        options.setCapability(ChromeOptions.CAPABILITY, capabilities);
		        options.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
		        return options;
		    }

		    public WebDriver getHeadLessChromeDriver(ChromeOptions opt) {
		    	
		        if (System.getProperty("os.name").contains("Mac")) {
		        	 WebDriverManager.chromedriver().setup();
		            return new ChromeDriver(opt);
		        } else if (System.getProperty("os.name").contains("Window")) {
		        	WebDriverManager.chromedriver().setup();
		            return new ChromeDriver(opt);
		        } else if (System.getProperty("os.name").contains("Linux")) {
		            System.setProperty("webdriver.chrome.driver", "drivers\\chrome");
		            return new HtmlUnitDriver();
		        }
		        return null;
		    }
	 }


