package com.iaditya.bdd.cucumber_sample;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AnnotatedStepDefs {
	
    @Given("^there are (\\d+) coffees left in the machine$")
    public void thereAreNCoffeesLeftInTheMachine(int coffeeCups)
	{
		System.out.format("There are %n coffees left in the machine\n", coffeeCups);
	}
    
    @And("^I have deposited (\\d+) dollars$")
    public void iHaveDepositedNDollars(Double dollars) {
		System.out.format("I have deposited %n dollars\n", dollars);
    	
    }
    
    @When("^I press the coffee button$")
    public void iPressTheCoffeeButton() {
    	System.out.println("I press the coffee button");
    }
    
    @Then("^I should be served a coffee$")
    public void iShouldBeServedACoffee() {
    	System.out.println("I should be served coffee");
    }

}
