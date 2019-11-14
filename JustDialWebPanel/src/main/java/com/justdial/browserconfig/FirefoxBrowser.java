package com.justdial.browserconfig;


//import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxBrowser {

    public FirefoxOptions getFirefoxOptions() {
    	System.out.println(" Inside Firefox options ");
        DesiredCapabilities firefox = DesiredCapabilities.firefox();
        FirefoxProfile profile = new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);
        profile.setAssumeUntrustedCertificateIssuer(true);
        firefox.setCapability(FirefoxDriver.PROFILE, profile);
        firefox.setCapability("marionette", true);
        FirefoxOptions firefoxOptions = new FirefoxOptions(firefox);
        System.out.println(firefoxOptions);
        //Linux
        if (System.getProperty("os.name").contains("Linux"))
            firefoxOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
        return firefoxOptions;
    }

    public WebDriver getFirefoxDriver(FirefoxOptions firefoxOptions) {
    
//        if (System.getProperty("os.name").contains("Mac")) {
//        	 
//            return new FirefoxDriver(firefoxOptions);
//        } else if (System.getProperty("os.name").contains("Window")) {
//        	
//            return new FirefoxDriver(firefoxOptions);
//        } else if (System.getProperty("os.name").contains("Linux")) {
//        	
//            return new FirefoxDriver(firefoxOptions);
//        }
    	System.setProperty("webdriver.gecko.driver", "./DriverExecutable/geckodriver.exe");
        return new FirefoxDriver(firefoxOptions);
    }
}
