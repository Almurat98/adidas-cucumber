Feature: demo blaze purchase items feature

  User Story:
    As a customer , I should be able to successfully purchase a laptop throw this website.


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

    @deleteDell
    Scenario: Delete 'dell i7 8gb' from cart
      Given customer is on home page
      When customer navigates to cart
      And click 'delete' on 'dell i7 8gb'
      Then 'dell i7 8gb' should be removed from cart

@placeOrder
Scenario: Place the order in cart and capture order id and amount
  Given customer is on cart page
  When customer clicks on 'Place Order'
  And customer fill in all web form fields
  And customer clicks on 'Purchase'
  And customer takes screen shot of order id and amount
  And customer compare expected purchase amount and actual amount
  Then customer clicks on 'Ok'





