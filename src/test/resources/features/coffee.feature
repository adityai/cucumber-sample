@tester
Feature: Serve coffee
  Coffee should not be served until paid for
  Coffee should not be served until the button has been pressed
  If there is no coffee left then money should be refunded

Scenario: Order last coffee
  Given there are 1 coffees left in the machine
  And I have deposited 1 dollars
  When I press the coffee button
  Then I should be served a coffee
  
Scenario: Order last two coffees
  Given there are 2 coffees left in the machine
  And I have deposited 2 dollars
  When I press the coffee button
  Then I got 2 cups of coffee
  
Scenario Outline: Order specialty coffees
  Given The coffee machine serves latte, mocha and coffee
  And I have deposited "<dollars>" dollars
  When I press the "<specialtyCoffee>" button
  Then I got "<cups>" cups of "<specialtyCoffee>"
  
  Examples:
  |  dollars 	|	specialtyCoffee	|	cups	|
  |  2			|	latte			|	1		|
  |  4			|	mocha			|	1		|
  |  6			|	coffee			|	6		|
