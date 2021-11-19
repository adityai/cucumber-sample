package com.iaditya.bdd.cucumber_sample;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Run cucumber test suite
 * 
 * @author adityai
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = {"src/test/resources/features"},
        glue = {"com.iaditya.bdd.cucumber_sample"}
)public class RunCoffeeTest {
	
}
