
package com.test.stepdefs;

import com.google.inject.Inject;
import com.test.support.Global;
import com.test.support.UiElementPageObjects;
import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.assertj.core.api.Assertions.assertThat;

public class UiTests {
    
         @Inject
        Global global;
         
        @Given("I open the site {string}")
        public void open_site(String site)  {
            global.uiPageObjects.gotourl(site , global.driver);
       }
       
       @When("I add  user with the following information {string} {string} {string} {string} {string} {string}")
        public void add_user(String fn,String ln,String uname,String pwd, String em, String cellphone) {
              global.uiPageObjects.waitforelement(UiElementPageObjects.AddUser , global.wait);
               global.uiPageObjects.addUser(fn,ln,uname,pwd,em,cellphone);
       }
       
       @Then("user {string} exists in table") 
        public void verif_yuser(String user)  {
             assertThat(global.uiPageObjects.isUserAdded(UiElementPageObjects.table, user)).isEqualTo(true);
        }
           @After
        public void close_browser() {
             global.uiPageObjects.quit(global.driver);
      }
}
