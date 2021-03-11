Feature: Tesco Website Application Test
  Scenario: Validate Tesco Login Page
    Given User is on Login Page after clicking on SignIn
    When User enters username and password
    And User clicks on SignIn button
    Then User navigates to HomePage


