Feature: UI Tests

   @chrome
    Scenario Outline: Add a user to webtable and validate that user has been added
      
     Given I open the site "http://www.way2automation.com/angularjs-protractor/webtables/"
        When I add  user with the following information <FirstName> <LastName> <username> <password> <Email> <CellPhone>
        Then user <FirstName> exists in table
      Examples:
        |FirstName|LastName|username| password|Email|CellPhone|
        |"TestFirstName" |"TestLastName" | "testusername"  |"test12345"|"testuser@testcompany.com"|"123-456-7890"|
        |"TestFirstName1" |"TestLastName1" | "testusername1"  |"test123456"|"testuser1@testcompany.com"|"123-456-1000"|