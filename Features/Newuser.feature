Feature: Checking the New User funtionality

Scenario: check the new user funtionality by passing the details
    Given Launch the Browser and click on New register user
    When Pass the details
    And click the register button
    Then validate whether the new user is able to create or not

Scenario Outline:check the new user funtionality by passing the details
    Given Launch the Browser and click on New register user
    When Enter<username> and <password> and <confirmpassword> and <FullName> and <Email ID>
    And click the register button
    Then validate whether the new user is able to create or not
    
    Examples:
    
    |username|password|confirmpassword|FullName|Email ID|
    |Kavya|Kavya@2021|Kavya@2021|Kavya M B|kavyashreemb@gmail.com|

