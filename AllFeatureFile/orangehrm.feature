Feature: Test Orange HRM application

  Scenario: validate login functionality
    Given user is on loginpage
    When user enter valid credentials
    Then user validate home page title
