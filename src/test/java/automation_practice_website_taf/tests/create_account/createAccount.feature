Feature: CreateAccount

  Scenario Outline: New user creates account successfully
    Given home page is opened
    Then  sign in button in home page should be displayed
    When  click on Sign in button in user info header
    Then  authentication page should be opened
    When  enter "<email>" address in create an account card in authentication page
    And   click on create an account button in create an account card in authentication page
    Then  create account page should be opened
    When  enter "<firstName>" in first name field in create account page
    And   enter "<lastName>" in last name field in create account page
    And   enter "<password>" in password field in create account page
    And   enter "<address>" in address field in create account page
    And   enter "<city>" in city field in create account page
    And   select "<state>" from state dropdown list in create account page
    And   enter "<zip>" in zip field in create account page
    And   enter "<mobile>" in mobile phone field in create account page
    And   enter "<alias>" in address alias field in create account page
    And   click on register button in create account page

    Examples:
    | email    | firstName | lastName | password  | address  | city   | state   | zip     | mobile      | alias        |
    | newEmail | Fname     | Lname    | pswrd     | addrss_1 | city_1 | state_1 | zipCode | mobilePhone | aliasAddress |