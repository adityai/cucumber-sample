package com.iaditya.bdd.cucumber_sample;

import cucumber.api.java8.En;

public class LambdaStepDefs implements En {
	public LambdaStepDefs() {
        Given(
        		"I have (\\d+) cups of coffee in my belly", 
        		(Integer coffeeCups) -> 
        		{
        			System.out.format("Coffee cups: %n\n", coffeeCups);
        		});
	}
}
