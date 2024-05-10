Feature: Sorting Product Z to A
  @TDD
  Scenario Outline: user success sorting saucedemo product to descending
    Given saucedemo login page
    When user input <username> as username
    And user input <password> as password
    And click login button
    Then user click dropdown filter
    Then user choose filter Z to A
    Then user verify sorting was successful

    Examples:
      | username      | password            |
      | standard_user | secret_sauce        |