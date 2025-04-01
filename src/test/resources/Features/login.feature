Feature: Login
  As a user
  I want to be able to login
  So that I can access my account

  Scenario: Successful login
    Given I navigate to the login page
    When I enter my username and password
    And I click the enter button
    Then I should see the homepage
