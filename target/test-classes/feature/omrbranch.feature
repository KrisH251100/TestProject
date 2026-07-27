Feature: Verifying omrbranch login module
Scenario: Verifying omrbrand login with valid credentials
Given User is on omrbranch page
When User gives username and password
And User click the login button
Then User should verify success message after login
