Feature: Sorting Product Price Ascending
  @TDD
  Scenario Outline: user success sorting saucedemo product price to ascending
    Given saucedemo login page
    When user input <username> as username
    And user input <password> as password
    And click login button
    Then user click dropdown filter
    Then user choose filter price ascending
    Then user verify sorting price ascending was successful

    Examples:
      | username      | password            |
      | standard_user | secret_sauce        |