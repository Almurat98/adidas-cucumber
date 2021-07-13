  Feature: demo blaze add items to cart feature

    User Story: As a customer, I should be able to add laptops to the cart.

    @sonyVauiI5
    Scenario: Add laptop 'Sony vaio i5' to cart
      Given customer is on the home page
      When customer navigates to laptop
      And customer clicks 'Sony vaio i5'
      And customer clicks on 'Add to cart'
      Then customer accept pop up confirmation

    @dellI78gb
    Scenario: Add laptop 'dell i7 8gb' to cart
      Given customer is on the home page
      When customer navigates to laptop
      And customer clicks 'dell i7 8gb'
      And customer clicks on 'Add to cart'
      Then customer accept pop up confirmation