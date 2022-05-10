package com.test.support;

import com.test.stepdefs.DriverFactory;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.guice.ScenarioScoped;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

@ScenarioScoped

      public class Global {
      public RemoteWebDriver driver;
       public WebDriverWait wait;
       public UiTestsPageObjects uiPageObjects;
       public ApiTestsPageObjects apiPageObjects; 
       
      public Global() throws MalformedURLException {
            driver = new DriverFactory().getManager();
            wait = new WebDriverWait(driver, 3000);
            PageFactory.initElements(driver, UiElementPageObjects.class );
            uiPageObjects = new UiTestsPageObjects();
            apiPageObjects=new ApiTestsPageObjects();
           
      }

}  
