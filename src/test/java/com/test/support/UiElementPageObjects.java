package com.test.support;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UiElementPageObjects {
    

      @FindBy(css = "button[class='btn btn-link pull-right']")
      public static WebElement AddUser;
      
    @FindBy(css = "input[name='FirstName']")
      public static WebElement fName;
    
     @FindBy(css = "input[name='LastName']")
      public static WebElement lName;
     
     @FindBy(css = "input[name='UserName']")
      public static WebElement uName;
     
      @FindBy(css = "input[name='Password']")
      public static WebElement pWord;
      
      @FindBy(css = "input[name='optionsRadios']")
      public static List<WebElement> customer;
      
      @FindBy(css = "select[name='RoleId']")
      public static List<WebElement> role;
      
       @FindBy(css = "option[value='0']")
      public static WebElement sales;
       
      @FindBy(css = "input[name='Email']")
      public static WebElement email;
      
       @FindBy(css = "input[name='Mobilephone']")
      public static WebElement mphone;
       
      @FindBy(css = "button[ng-click='save(user)']")
      public static WebElement save;
      
       @FindBy(css = "table[table-title='Smart Table example']")
       public static List<WebElement> table;
       
       @FindBy(css = "td")
       public static List<WebElement> columns;
        
}
