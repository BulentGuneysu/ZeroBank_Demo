@regression
Feature: Account Activity Checks

  @accountActivity
  Scenario: Account Activity Test
    Given User is on the login page
    When User taps on sign in button
    When User enters "username" and "password"
    When User taps on sign in button to login
    When User taps on back button
    When User taps on "Online Banking" tab
    When User taps on "Account Activity" section
    Then Validate that the account activity title is correct
    Then Validate that the default option is Savings
    Then Validate that dropDown menu has followings
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |
    Then Validate that the transaction subtitles contain the followings
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |