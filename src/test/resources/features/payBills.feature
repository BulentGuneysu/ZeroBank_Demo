@regression
Feature: Pay Bills Checks
  @positivePayBillTest
  Scenario: Positive Pay Bills Test
    Given User is on the login page
    When User taps on sign in button
    When User enters "username" and "password"
    When User taps on sign in button to login
    When User taps on back button
    When User taps on "Online Banking" tab
    When User taps on "Pay Bills" section
    Then Verify that Pay Bills title is correct
    When Fill out all necessary fields
    When Tap on pay button
    Then Verify that success message is appear

  @negativePayBillTest
  Scenario: Negative Pay Bills Test (empty date)
    Given User is on the login page
    When User taps on sign in button
    When User enters "username" and "password"
    When User taps on sign in button to login
    When User taps on back button
    When User taps on "Online Banking" tab
    When User taps on "Pay Bills" section
    When User sends amount to input box
    When Tap on pay button
    Then Validate that error message is visible on date box

  @negativePayBillTest2
  Scenario: Negative Pay Bills Test (empty amount)
    Given User is on the login page
    When User taps on sign in button
    When User enters "username" and "password"
    When User taps on sign in button to login
    When User taps on back button
    When User taps on "Online Banking" tab
    When User taps on "Pay Bills" section
    When User sends date to input box
    When Tap on pay button
    Then Validate that error message is visible on amount box

  @negativePayBillTest3
  Scenario: Negative Pay Bills Test (Date Invalid Character)
    Given User is on the login page
    When User taps on sign in button
    When User enters "username" and "password"
    When User taps on sign in button to login
    When User taps on back button
    When User taps on "Online Banking" tab
    When User taps on "Pay Bills" section
    When User sends invalid character to date box
    When Tap on pay button
    Then Validate that date box is still empty