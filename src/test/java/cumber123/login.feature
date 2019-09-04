

Feature: This is login Test
The scenario is for login
 
@tag1
  Scenario: Successful login
  When i enter user id in "saru" the user id field
  And password in "234" the password field
  And i click on login button
  Then the homepage is displayed
 
  
  