package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import utilities.ResourceHelper;

public class ConfigPropertyReader {
    private static Properties prop;

    public ConfigPropertyReader() {
        try {
            String filepath = ResourceHelper.getResourcePath("src\\main\\java\\resources\\config.properties");
            FileInputStream file = new FileInputStream(new File(filepath));
            prop = new Properties();
            prop.load(file);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getImplicitWait() {
        return Integer.parseInt(prop.getProperty("implicitWait"));
    }

    public int getExplicitWait() {
        return Integer.parseInt(prop.getProperty("explicitWait"));
    }

    public int pageLoadTime() {
        return Integer.parseInt(prop.getProperty("pageLoadTime"));
    }

    //================================ API Config ===========================================



    public String getLoginApi() {
        return prop.getProperty("LoginApi");
    }

    public String getPlatformApi() {
        return prop.getProperty("platformApi");
    }

    public String getBuildingApi() {
        return prop.getProperty("buildingApi");
    }

    public String getRoleApi() {
        return prop.getProperty("roleApi");
    }

    public String getUserApi() {
        return prop.getProperty("userApi");
    }

    public String getVisitApi() {
        return prop.getProperty("visitApi");
    }

    public String getReportingApi() {
        return prop.getProperty("reportingApi");
    }

    public String getAmenityApi() {
        return prop.getProperty("amenityApi");
    }

    public String getBuildingCode() {
        return prop.getProperty("buildingCode");
    }

    public String getBuildingName() {
        return prop.getProperty("buildingName");
    }

    public String getEmailId() {
        return prop.getProperty("emailId");
    }

    public String getPassword() {
        return prop.getProperty("password");
    }

    public String getClientId() {
        return prop.getProperty("clientId");
    }

    public String getGrantType() {
        return prop.getProperty("grantType");
    }

    public String getAudience() {
        return prop.getProperty("audience");
    }

    public String getScope() {
        return prop.getProperty("scope");
    }



    public String getCompanyCode() {
        return prop.getProperty("companyCode");
    }

    public String getCompanyName() {
        return prop.getProperty("companyName");
    }

    public String getCompanyId() {
        return prop.getProperty("companyId");
    }

    public String getRoleId() {
        return prop.getProperty("roleId");
    }

    public String getUserId() {
        return prop.getProperty("userId");
    }

    public String getNotificationApi() {
        return prop.getProperty("notificationApi");
    }

    public String getCompanyApi() {
        return prop.getProperty("companyApi");
    }

    //================================ Database Config ===========================================

    public String getDBHost() {
        return prop.getProperty("db.host");
    }

    public String getPort() {
        return prop.getProperty("db.port");
    }

    public String getDBName() {
        return prop.getProperty("db.name");
    }

    public String getDBUserName() {
        return prop.getProperty("db.username");
    }

    public String getDBPassword() {
        return prop.getProperty("db.password");
    }

    public String getServiceRequestApi() {
        return prop.getProperty("serviceRequestAPI");
    }

    public String getparkingRequestApi() {
        return prop.getProperty("parkingRequestApiAPI");
    }

}
