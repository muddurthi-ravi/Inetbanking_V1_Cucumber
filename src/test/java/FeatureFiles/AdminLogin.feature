@tag
Feature: Admin Login Feature
  I want to use this template for Admin Login Feature test

  @tag1
  Scenario: Admin Login Feature test
    Given user open browser with url "https://demo.guru99.com/V4/"
    When user should see the loginpage
    Then user enter "mngr550908" and "bUbuvYm"
    Then user click login
    When user should see admin page
    Then user click logout
    And user close browser

