Feature: demo blaze remove items from cart feature
  User Story: As a customer , I should be able to remove items from cart.

  @deleteDell
  Scenario: Delete 'dell i7 8gb' from cart
    Given customer is on home page
    When customer navigates to cart
    And click 'delete' on 'dell i7 8gb'
    Then 'dell i7 8gb' should be removed from cart