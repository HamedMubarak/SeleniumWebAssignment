
Feature: My Account

  Scenario Outline: Choose Blouses SubCategory
    Given home page is opened
    When  click on Sign in button in user info header
    Then  authentication page should be opened
    When  enter "<email>" address in email address field in already registered card in authentication page
    And   enter "<password>" in password field in already registered card in authentication page
    And   click on sign in button in authentication page
    Then  my account page should be opened
    When  hoover on women category
    Then  blouses subcategory in women category should be displayed
    When  click on blouses subcategory in women category
    Then  blouses subcategory page should be opened

    Examples:
      | email        | password |
      | createdEmail | pswrd    |

  Scenario Outline: Select resulted product
    Given home page is opened
    When  click on Sign in button in user info header
    And   enter "<email>" address in email address field in already registered card in authentication page
    And   enter "<password>" in password field in already registered card in authentication page
    And   click on sign in button in authentication page
    And   hoover on women category
    And   click on blouses subcategory in women category
    And   hoover on resulted product image in blouses subcategory page
    Then  add to cart button in blouses subcategory page should be displayed
    When  click on add to cart button in blouses subcategory page
    Then  proceed to check out button in blouses subcategory page should be displayed
    When  click on proceed to checkout button in blouses subcategory page
    Then  shopping cart page should be opened

    Examples:
      | email        | password |
      | createdEmail | pswrd    |

