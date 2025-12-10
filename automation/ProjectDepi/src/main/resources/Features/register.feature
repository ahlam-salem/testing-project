Feature: Register Feature

  Scenario: Register User
    Given home page is visible successfully
    When  Click on Signup / Login button
    Then  New User Signup is visible
    When  Enter name and email address
    And   Click Signup button
    Then ENTER ACCOUNT INFORMATION is visible
    When Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox Sign up for our newsletter
    And Select checkbox Receive special offers from our partners
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And Click Create Account button
    Then  ACCOUNT CREATED is visible
    When Click Continue button
    Then Logged in as username is visible
    When Click Delete Account button
    Then ACCOUNT DELETED is visible and click Continue button
  Scenario: Register User2
    Given home page is visible successfullyy
    When  Click on Signup / Login buttonn
    Then  New User Signup is visiblee
    When  Enter name and email addresss
    And   Click Signup buttonn
    Then ENTER ACCOUNT INFORMATION is visiblee
