Feature: Key presses functionality
  As a user
  I want to click on key presses
  so i can click on four keys

  Scenario: Verify user is able to click on four keys
    Given I am on the internet herokuapp home page
    And I click on key presses link
    When I press A keys in field "A"
    Then System should shows displayed A successfully
    And I press B keys in field "B"
    And  System should shows displayed B successfully
    And I press C keys in field "C"
    And System should shows displayed C successfully
    And  And I press D keys in field "D"
    Then System should shows displayed D successfully


