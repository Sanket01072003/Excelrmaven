
Feature: OrangHRM


  Scenario: Login scenario
    Given Open the browser
    Then Enter Username "<Username>"
    Then Enter password "<password>"
    And Click on login button
    Then Close the browser

Examples:

|Username|password|    
|Admin|Admin123|
|Admin|admin123|
|User|user123|
|Admin|user123|
    
    