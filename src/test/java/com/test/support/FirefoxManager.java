package com.test.support;
import org.openqa.selenium.Platform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;


public class FirefoxManager extends DriverManager{
    
        protected WebDriver driver;
        
         @Override
         protected RemoteWebDriver createDriver() throws MalformedURLException    {

                  System.out.println("hubport from sys prop var.."+System.getProperty("hub.port"));
                String hubURL = "http://localhost:65299/wd/hub";  //docker selenium hub running on 65299
                    FirefoxProfile profile = new FirefoxProfile();
                    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                    capabilities.setCapability(FirefoxDriver.PROFILE, profile);
                    capabilities.setPlatform(Platform.ANY);
                    FirefoxOptions options = new FirefoxOptions();
                    options.merge(capabilities);
                 return (RemoteWebDriver) (driver = new RemoteWebDriver(new URL(hubURL), options));

        }

        @Override
         public RemoteWebDriver getDriver()  throws MalformedURLException{
             this.createDriver();
                return (RemoteWebDriver) driver;
        }
}
