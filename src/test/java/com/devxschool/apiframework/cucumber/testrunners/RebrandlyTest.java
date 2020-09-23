package com.devxschool.apiframework.cucumber.testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/features/rebrandly.feature"
        },
        glue = {
                "com.devxschool.apiframework.cucumber.steps"
        },
        tags = {
                "@Rebrandly"
        },
        dryRun = false
)
public class RebrandlyTest {}
