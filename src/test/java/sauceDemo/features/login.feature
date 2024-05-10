Feature: Login to Sauce Demo
  @TDD
  Scenario Outline: User success login to saucedemo
    Given saucedemo login page
    When user input <username> as username
    And user input <password> as password
    And click login button
    Then user verify <status> login

    Examples:
    | username      | password            | status  |
    | standard_user | secret_sauce        | success |
    | standard_user | sacred_sauce        | failed  |