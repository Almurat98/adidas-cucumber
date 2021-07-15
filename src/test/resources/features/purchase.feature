Feature: demo blaze purchase items feature

  User Story:
    As a customer , I should be able to successfully purchase a laptop through this website.

  Scenario: Placing a successful order
    Given User is on the Home Page
    When User adds "Sony vaio i5" from "Laptops"
    And User adds "Dell i7 8gb" from "Laptops"
    And User removes "Dell i7 8gb" from cart
    And User places order and captures and logs purchase ID and Amount
    Then User verifies purchase amount equals expected






