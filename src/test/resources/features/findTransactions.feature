@regression
Feature: Find Transaction Checks

  @searchDescriptionTest
  Scenario: Search Description Test
    Given User is on the login page
    When User taps on sign in button
    When User enters "username" and "password"
    When User taps on sign in button to login
    When User taps on back button
    When User taps on "Online Banking" tab
    When User taps on "Account Activity" section
    When Tap on Find Transactions
    When Send "ONLINE" keyword into description input box
    When Tap on find button
    Then Verify that all description results contains "ONLINE"