
Feature: Title of your feature
 @sanity @uat
   Scenario Outline: Title of your scenario outline
    Given User enters outline "<email>" in the email field
    And Enter outline <password> in the password feild
    When Click on login 
    Then The home page is visible
        
    Examples:
       | email         | password | 
       | abcd123@gmail |     123  |

@uat
 Scenario Outline: Title of your scenario outline
    Given User enters outline "<email>" in the email field
    And Enter outline <password> in the password feild
    When Click on login 
    Then The home page is visible
    
    Examples: 
      | email         | password | 
      | abcd123@gmail |     123  |
      | efgh456@gmail |     456  |

