Feature: Order Validation

  Scenario Outline: order is placed in order history page
    Given home page is opened
    When  click on Sign in button in user info header
    And   enter "<email>" address in email address field in already registered card in authentication page
    And   enter "<password>" in password field in already registered card in authentication page
    And   click on sign in button in authentication page
    And   click on order history and details card in my account page
    Then  order history page should be opened
    And   order reference column header in order history page is displayed

    Examples:
      | email        | password |
      | createdEmail | pswrd    |
