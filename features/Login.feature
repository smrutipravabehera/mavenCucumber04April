@Facebook
Feature: Title of your feature
			I want to use this template for my feature file


@Login
  Scenario: Login Functionality
    Given User should be able to open Facebook Application
    When User enter Username
    And User enter Password
    And User click on Login button
    And User click on confirm button
    Then User should be able to login successfully
    
    
  @SignUp
    Scenario: SignUp Functionality
    Given User should be able to open Facebook Application
    When User click on create new account
    Then User Should be able to signup Sucessfully



  