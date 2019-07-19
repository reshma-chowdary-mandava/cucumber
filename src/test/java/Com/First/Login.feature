
Feature: Login feature
  
  Scenario: Successful Login
    Given User enters"abcd123@gmail" in the email field
    And Enter 123 in the password feild
    When Click on login button
    Then The home page is dispalyed
    
    #Scenario: Successful Login
    #Given User enters"efgh456@gmail" in the email field
    #And Enter 456 in the password feild
    #When Click on login button
    #Then The home page is dispalyed
    
     #Scenario: UnSuccessful Login
    #Given User enters invalid email in the email feild
    #And Enter invalid password in the password feild
    #When Click on login button
    #Then The home page is not dispalyed