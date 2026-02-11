 #Author: Rashi

Feature: homepage_search
 

  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    Then user is navigated to sea rch results