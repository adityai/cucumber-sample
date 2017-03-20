package com.iaditya.bdd.cucumber_sample;

import cucumber.api.java8.En;

public class LambdaStepDefs implements En {
	public LambdaStepDefs() {
        Then(
        		"I got (\\d+) cups of coffee", 
        		(Integer coffeeCups) -> 
        		{
        			System.out.format("Coffee cups: %n\n", coffeeCups);
        		});
	}
}
