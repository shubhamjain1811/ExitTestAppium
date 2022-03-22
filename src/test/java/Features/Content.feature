Feature: 

  @smoke 
  Scenario: To Test Content button
    Given The Applications is on Running Status
    And I Click on Content button
    And I Click on Assets
    When I click On Read Asset
    Then Read Asset Open
