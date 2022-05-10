# Sample Automation Project


### Project Objective:
 - Run sample UI tests for a web table to add user and verify that user has been added
 - Run sample API tests for a public API to retrieve employee by id and assert on responses

### Technologies used in this project are below :
 - Java, TestNG , maven , cucumber-jvm , courgette-jvm , selenium webdriver, RestAssured , docker , azure yaml pipeline

### Key decision points
 - Used cucumber framework in project as it combines living documentation(gherkin) with executable specifications (step definitions)
 - Used cucumber-jvm as it has wide support , cucumber-jvm supports popular dependency injection frameworks . cucumber-guice is used in this project
 - Used docker for scaling up and running parallel tests as docker containers use less resources than virtual machines
 - Used cucumber-guice for dependency injection because static variables tend to make tests unstable
 - Project uses some key cucumber features such as scenario outline, tags , cucumber table to make it modular and easily readable. It also uses  page objects approach and  pagefactory .
 - AssertJ assertThat is used for better readable assertions and better failure messages.
 - Project utilizes azure devops yaml build pipeline for full end  to end solution 
 - Used restAssured library for API tests as it is less verbose than other similar libraries
 - Cucumber report is implemented in project and also published in azure pipeline. Location of report is build→ courgette-report →  index.html 

### Run Project:
 
 - On a terminal window from root of the project run this docker command ( docker desktop should be installed)
           ``` docker-compose -f /path/to/docker-compose.yml  up ```
 - In an IDE run this maven command after downloading and setting up the project
           ``` mvn clean verify -P acceptanceTests ```

