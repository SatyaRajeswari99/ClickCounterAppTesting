Feature: Counter Functionality
  As a user of clickCounter website
  I want to click the counter button
  So that I can count the clicking Functionality

  Scenario: Successful Clicking Counter
    Given I am on the clickCounter home page
    When I click on the clickMe Button
    Then verifying the counter text
