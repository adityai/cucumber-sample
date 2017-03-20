@tester
Feature: Serve coffee
  Coffee should not be served until paid for
  Coffee should not be served until the button has been pressed
  If there is no coffee left then money should be refunded

Scenario: Buy last coffee
  Given there are 1 coffees left in the machine
  And I have deposited 1 dollars
  When I press the coffee button
  Then I should be served a coffee
  
Scenario: Buy last two coffees
  Given there are 2 coffees left in the machine
  And I have deposited 2 dollars
  When I press the coffee button
  Then I should be served a coffee
  Then I should be served a coffee
  