package com.justdial.browserconfig;


import java.util.TreeMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {

    public ChromeOptions getChromeOptions() {
    	
        ChromeOptions options = new ChromeOptions();
        TreeMap<String, String> mobileEmulation = new TreeMap<>(); //Creating Map for emulating the browser
        mobileEmulation.put("deviceName", "iPhone X");//Device will be iPhone X
        options.addArguments("--test-type");
        options.addArguments("--enable-popup-blocking");
        options.addArguments("--start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--disable -extensions");
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("mobileEmulation", mobileEmulation);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setJavascriptEnabled(true);

        options.setCapability(ChromeOptions.CAPABILITY, capabilities);
        //Linux
        if (System.getProperty("os.name").contains("Linux"))
            options.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
        return options;
    }

    public WebDriver getChromeDriver(ChromeOptions opt) {
   
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\blrsoft\\Downloads\\ui-master\\JustDailWebAuto\\DriverExecutable\\chromedriver.exe");
            return new ChromeDriver(opt);
    }
}
