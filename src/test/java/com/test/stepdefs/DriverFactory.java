package com.test.stepdefs;

import com.test.support.ChromeManager;
import com.test.support.FirefoxManager;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.util.Collection;

public class DriverFactory {
    
      public static Collection tagList;
     public static String sc;
     
    @Before
        public void getScenarioTags(Scenario scenario) {
            tagList =  scenario.getSourceTagNames();
         }

  
        public RemoteWebDriver getManager() throws MalformedURLException {
 
        if (tagList.contains("@firefox")){
               return new FirefoxManager().getDriver();
                }
          else if (tagList.contains("@chrome")){
              return new ChromeManager().getDriver();
             }
            else{
                return null;
              }
        } 
        
}
