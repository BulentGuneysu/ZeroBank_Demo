@regression
Feature: Add New Payee Checks

  @addAnewPayee
  Scenario: Add a new payee
    Given User is on the login page
    When User taps on sign in button
    When User enters "username" and "password"
    When User taps on sign in button to login
    When User taps on back button
    When User taps on "Online Banking" tab
    When User taps on "Pay Bills" section
    When User taps on "Add New Payee" pay bill subtitle
    When Creates new payee using following information
      | Payee Name    | The Law Offices of Hyde, Price & Scharks |
      | Payee Address | 100 Same st, Anytown, USA, 10001         |
      | Account       | Checking                                 |
      | Payee details | XYZ account                              |
    When Taps on add button
    Then message The new payee The Law Offices of Hyde, Price & Scharks was should successfully created. should be displayed