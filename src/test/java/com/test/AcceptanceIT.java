package com.test;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.CucumberOptions;
import courgette.api.testng.TestNGCourgette;
import org.testng.annotations.Test;

@Test
@CourgetteOptions(
        runLevel = CourgetteRunLevel.SCENARIO,
        rerunFailedScenarios = true,
        rerunAttempts = 1,
        showTestOutput = true,
        reportTitle = "sample-project report",
        reportTargetDir = "build",
        environmentInfo = "browser=chrome; git_branch=master",
        cucumberOptions = @CucumberOptions(
                features = "src/test/resources/com/test/",
                glue = "com.test.stepdefs",
                tags = {"@firefox or @chrome"},
                publish = true,
                plugin = {
                        "pretty",
                        "json:target/cucumber-report/cucumber.json",
                        "html:target/cucumber-report/cucumber.html",
                        "junit:target/cucumber-report/cucumber.xml"}
        ))
class AcceptanceIT extends TestNGCourgette {
}

