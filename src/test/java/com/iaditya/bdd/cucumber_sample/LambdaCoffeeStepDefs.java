package com.iaditya.bdd.cucumber_sample;

import cucumber.api.java8.En;

public class LambdaCoffeeStepDefs implements En {
	public LambdaCoffeeStepDefs() {
        Then(
        		"I got (\\d+) cups of coffee", 
        		(Integer coffeeCups) -> 
        		{
        			System.out.format("Coffee cups: %n\n", coffeeCups);
        		});
	}
}
