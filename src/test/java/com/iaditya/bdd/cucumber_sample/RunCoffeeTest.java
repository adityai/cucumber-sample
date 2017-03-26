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
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"})
public class RunCoffeeTest {
	
}
