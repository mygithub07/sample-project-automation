package com.test.support;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.MalformedURLException;

public abstract class DriverManager {
    
                protected abstract RemoteWebDriver createDriver() throws MalformedURLException;
                public abstract RemoteWebDriver getDriver() throws MalformedURLException;
}
