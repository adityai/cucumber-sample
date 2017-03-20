package com.iaditya.bdd.cucumber_sample;

import cucumber.api.java.en.Given;

public class AnnotatedStepDefs {
	
    @Given("I have (\\d+) cups of coffees in my belly")
    public void I_have_coffee_in_my_belly(int coffeeCups)
   		{
    			System.out.format("Coffee cups: %n\n", coffeeCups);
   		}

}
