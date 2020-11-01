
@AnaraTest
Feature: As a user, I should be able to login to Library application
  Scenario: I need to validate that the users email is present in the list
    Given user on login page for library application
    Then user enters "library" and password and clicks login button
    And user clicks on user tab section




