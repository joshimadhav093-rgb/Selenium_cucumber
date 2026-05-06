Feature: check calculator functionality

  Scenario: Check that sum of the two number is pallindrome
    Given User is on calculator page
    When User enter first value
    And Click on the plus sign
    Then User enter second value
    Then Check number is pallindrome
    Then Close application

