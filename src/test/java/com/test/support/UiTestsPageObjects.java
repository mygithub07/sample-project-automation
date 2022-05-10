package com.test.support;

import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class UiTestsPageObjects {
    
    boolean isAdded;
    
       public void gotourl(String url,  RemoteWebDriver d){
           d.get(url);
           d.manage().window().maximize();
        }   
        
        public void waitforelement(WebElement elem, WebDriverWait wait){
           wait.until(ExpectedConditions.visibilityOf(elem));
        }
        
       public boolean isUserAdded(List<WebElement> tb, String user){
        isAdded = false;
        tb.forEach((row) -> {
                      List<WebElement> columns = UiElementPageObjects.columns ;
                      columns.forEach((col) -> {
                          if (col.getText().equals(user)){
                              isAdded=true;
                          }
                      });
             });
        return isAdded;
    }
    
    public void addUser(String fn,String ln,String uname,String pwd, String em, String cellphone){
        
                UiElementPageObjects.AddUser.click();
                UiElementPageObjects.fName.sendKeys(fn);
                UiElementPageObjects.lName.sendKeys(ln);
                UiElementPageObjects.uName.sendKeys(uname);
                UiElementPageObjects.pWord.sendKeys(pwd);
                UiElementPageObjects.customer.get(0).click();
                UiElementPageObjects.role.get(0).click();
                UiElementPageObjects.sales.click();
                UiElementPageObjects.email.sendKeys(em);
                UiElementPageObjects.mphone.sendKeys(cellphone);
                UiElementPageObjects.save.click();
    }
    
    public void quit(RemoteWebDriver driver){
         driver.quit();
    }
}
