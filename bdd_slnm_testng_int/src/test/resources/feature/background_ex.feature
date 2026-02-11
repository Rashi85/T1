Feature: Login to HRM Application
 
  Background:
    Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"
 
  @ValidCredentials
  Scenario: Login with valid credentials
 
    When User enters username as "Admin" and password as "admin123"
    Then User should be able to login successfully and new page open
 
  @MissingUsername
  Scenario: Login with blank username
 
    When User enters username as " " and password as "admin123"
    Then User should be able to see a message "Required" below Username
