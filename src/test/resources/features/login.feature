@regression
Feature: Login Functionality

  @positiveLoginTest
  Scenario: Positive Login Test
    Given User is on the login page
    When User taps on sign in button
    When User enters "username" and "password"
    When User taps on sign in button to login
    When User taps on back button
    Then Validate that username is visible on the board

  @negativeLoginTest
  Scenario Outline: Negative Login Tests
    Given User is on the login page
    When User taps on sign in button
    When User enters "<USERNAMEFORINPUTBOX>" and "<PASSWORDFORINPUTBOX>"
    When User taps on sign in button to login
    Then Verify that user is not logged in and error message appears
    Examples:
      | USERNAMEFORINPUTBOX | PASSWORDFORINPUTBOX |
      | username            | wrong               |
      | wrong               | password            |
      |                     | password            |
      | username            |                     |
