@AnaraTest
Feature: As a user, I should be able to login to Library application

  Background: login as librarian
    Given user on login page for library application
    Then user enters "library" and password and clicks login button

    @Navigate
  Scenario: I need to validate that the users email is present in the list
    And user clicks on user tab section


