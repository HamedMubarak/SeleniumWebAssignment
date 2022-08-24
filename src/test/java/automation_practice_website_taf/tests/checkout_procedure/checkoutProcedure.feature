Feature: Checkout Procedure

  Scenario Outline: Follow Checkout Procedure
    Given home page is opened
    When  click on Sign in button in user info header
    And   enter "<email>" address in email address field in already registered card in authentication page
    And   enter "<password>" in password field in already registered card in authentication page
    And   click on sign in button in authentication page
    And   hoover on women category
    And   click on blouses subcategory in women category
    And   hoover on resulted product image in blouses subcategory page
    And   click on add to cart button in blouses subcategory page
    Then  proceed to check out button in blouses subcategory page should be displayed
    When  click on proceed to checkout button in blouses subcategory page
    Then  "<yourShoppingCart>" summary tab in checkout procedure should be opened
    When  click proceed to checkout button in summary tab in checkout procedure should be displayed
    Then  "<addressTab>" address tab in checkout procedure should be opened
    When  click on proceed to checkout button in address tab in checkout procedure
    Then  "<shippingTab>" shipping tab in check out procedure should be opened
    When  select terms of service checkbox in shipping tab in checkout procedure
    And   click on proceed to checkout button in shipping tab in checkout procedure
    Then  "<paymentTab>" payment tab in checkout procedure should be opened
    When  click on pay by bank wire card in shipping tab in checkout procedure
    Then  "<bankWirePayment>" bank wire payment confirmation tab in checkout procedure should be opened
    When  click on i confirm my order button in payment tab in checkout procedure
    Then  "<orderConfirmation>" order confirmation tab in checkout procedure should be opened


    Examples:
      | email        | password | yourShoppingCart   | addressTab | shippingTab | paymentTab          | bankWirePayment    | orderConfirmation  |
      | createdEmail | pswrd    | your_shopping_cart | Address    | Shipping    | your_payment_method | bank_wire_payment  | order_confirmation |

