@regression
Feature: Account Summary Checks

  @accountSummaryTest
  Scenario: Account Summary Test
    Given User is on the login page
    When User taps on sign in button
    When User enters "username" and "password"
    When User taps on sign in button to login
    When User taps on back button
    When User taps on "Online Banking" tab
    When User taps on "Account Summary" section
    Then Validate that title is correct
    Then Validate account types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
    Then Validate credit account columns
      | Account     |
      | Credit Card |
      | Balance     |