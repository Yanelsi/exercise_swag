Feature: Products from Swag Lab

  Description: Exercise 1B. Automate a test case for a website using Selenium WebDriver or equivalent.
               Web site selected: Swag Labs.

  Scenario: 01_Product_List
    Given an standard user "standard_user"
    When user do login successfully
    Then Swag lab products should be displayed