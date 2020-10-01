package com.devxschool.apiframework.cucumber.testrunners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/features/gorestproducts.feature",
                "src/test/resources/features/gorestproductsNegative.feature"
        },
        glue = {
                "com.devxschool.apiframework.cucumber.steps.gorestproduct",
                "com.devxschool.apiframework.cucumber.steps.common"
        },
        tags = {
                "@createProductWithDiscountAmountGreaterThanPrice"
        }
)
public class GorestProductTest {
}
