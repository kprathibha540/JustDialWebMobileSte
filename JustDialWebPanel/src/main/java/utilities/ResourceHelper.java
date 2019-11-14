package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import utilities.LoggerHelper;

public class ResourceHelper {

	public static Properties browser;
	public static Properties inputDataProperty;
	public static Properties error;
	public static Logger logs = LoggerHelper.getLogger(ResourceHelper.class);
	
    public static Properties intializeBrowserProperties() {
    	logs.info(" Inside Browser Properties ");
        browser=new Properties();
		try {
			browser.load(new FileInputStream(new File("./src/main/java/org/properties/browser.properties").getAbsolutePath()));
		} catch (Exception e) {
			
		}
		return browser; 
    }
    
    public static String getResourcePath(String path) {
        String basePath = System.getProperty("user.dir") + "\\";
        return basePath + path;
    }
    
    public static Properties intializeInputData()
    {
    	
    	try{
    		logs.info(" Inside Intialize Input Data Method ");
			inputDataProperty=new Properties();
			inputDataProperty.load(new FileInputStream(new File("src\\main\\java\\org\\properties\\inputData.properties").getAbsolutePath()));
			
			logs.info(" After Intializing input data method ");
		
			}
			catch (FileNotFoundException e) {
			logs.info(e.getMessage()+"\n Problem with loading properties file ");
			e.printStackTrace();
		} catch (IOException e) {
			logs.info(e.getMessage()+"\n Problem with loading properties file ");
			e.printStackTrace();
		}
    	
    	return inputDataProperty;
    }
    
}
