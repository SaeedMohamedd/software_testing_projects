package com.qacart.todo.utils;

import org.testng.internal.ConfigurationGroupMethods;

import java.util.Properties;

public class ConfigUtils {
    private static Properties prop ;

    public static ConfigUtils getInstance()
    {
        if(prop==null)
        {
            prop =PropertiesUtils.loadproperties("src/test/java/com/qacart/todo/config/production.properties");

        }
        return new ConfigUtils();
    }
    public String getUrl()
    {
        return prop.getProperty("baseUrl");
    }
    public String getEmail()
    {
        return prop.getProperty("email");
    }
    public String getPassword()
    {
        return prop.getProperty("password");
    }

}
