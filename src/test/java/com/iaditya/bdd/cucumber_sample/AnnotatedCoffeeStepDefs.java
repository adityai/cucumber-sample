package com.iaditya.bdd.cucumber_sample;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AnnotatedCoffeeStepDefs {
	
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
    	System.out.println("I press the coffee button\n");
    }
    
    @Then("^I should be served a coffee$")
    public void iShouldBeServedACoffee() {
    	System.out.println("I should be served coffee\n");
    }

//	Commented out because it is implemented in the LambdaCoffeeStepDefs class as an example
//    @Then("^I got (\\d+) cups of coffee$")
//    public void iGotNCupsOfCoffee(int cups) {
//		System.out.format("I got %n cups of coffee\n", cups);
//    }

    @Given("^The coffee machine serves latte, mocha and coffee$")
    public void theCoffeeMachineServesLatteMochaAndCoffee() {
    	System.out.println("The coffee machine serves latte, mocha and coffee\n");
    }

    @And("^I have deposited \"(\\d+)\" dollars$")
    public void iHaveDepositedNDollars(float dollars) {
		System.out.format("I have deposited %n dollars\n", dollars);
    }    
    
    @When("^I press the \"([^\"]*)\" button$")
    public void iPressTheSpecialtyCoffeeButton(String specialtyCoffee) {
    	System.out.format("I press the %s button\n", specialtyCoffee);
    }
    
    @Then("^I got \"(\\d+)\" cups of \"([^\"]*)\"$")
    public void iGotNParameterizedCupsOfCoffee(int cups, String specialtyCoffee) {
    	System.out.format("I got %n cups of %s\n", cups, specialtyCoffee);
    }

}
