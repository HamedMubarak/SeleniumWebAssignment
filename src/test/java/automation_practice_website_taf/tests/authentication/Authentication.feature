Feature: Authentication

  Scenario Outline: Sign Up with already created account
    Given home page is opened
    When  click on Sign in button in user info header
    Then  authentication page should be opened
    When  enter "<email>" address in create an account card in authentication page
    And   click on create an account button in create an account card in authentication page
    Then  "<message>" already registered error message should be appeared

    Examples:
    | email        | message                   |
    | createdEmail | registeredAccountErrorMsg |

  Scenario Outline: trying to login with  wrong password
    Given home page is opened
    When  click on Sign in button in user info header
    And   enter "<email>" address in email address field in already registered card in authentication page
    And   enter "<password>" in password field in already registered card in authentication page
    And   click on sign in button in authentication page
    Then  "<message>" invalid password error message should be appeared
    Examples:
      | email        | password       | message                 |
      | createdEmail | invld_pswrd    | invalidPasswordErrorMsg |