Feature: demo blaze purchase items feature

  User Story:
    As a customer , I should be able to successfully purchase a laptop through this website.


@placeOrder
Scenario: Place the order in cart and capture order id and amount
  Given customer is on cart page
  When customer clicks on 'Place Order'
  And customer fill in all web form fields
  And customer clicks on 'Purchase'
  And customer takes screen shot of order id and amount
  And customer compare expected purchase amount and actual amount
  Then customer clicks on 'Ok'





