package com.test.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeManager extends DriverManager {

     protected WebDriver driver;
         @Override
         protected RemoteWebDriver createDriver() throws MalformedURLException {
        String hubURL = "http://localhost:65299/wd/hub";
             ChromeOptions options = new ChromeOptions();
             DesiredCapabilities capabilities = DesiredCapabilities.chrome();
             capabilities.setCapability(ChromeOptions.CAPABILITY, options);
             return (RemoteWebDriver) (driver = new RemoteWebDriver(new URL(hubURL), capabilities));
        }

        @Override
         public RemoteWebDriver getDriver() throws MalformedURLException {
                             this.createDriver();
                return (RemoteWebDriver) driver;
        }

}
