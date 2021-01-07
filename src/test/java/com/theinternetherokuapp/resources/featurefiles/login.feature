Feature: Login Functionality
  As a user
  I want to visit the-internet.herokuapp website
  So I can visit login page


  Scenario: Verify user click on Form Authentication feature
    Given I am on the internet herokuapp home page
    When I click on Form authentication feature
    Then I should be on Login page successfully


  Scenario Outline: Verify user should not login with correct username and wrong password
    When I enter correct username in username field "<username>"
    And I enter incorrect password in password field "<password>"
    And I click on Login in feature
    Then I should be not login to system and verify errorMessage
    Examples:
      | username | password    |
      | tomsmith | 1234@       |
      | tomsmith | 123fghem@   |
      | tomsmith | sdfvgg1234@ |

  Scenario Outline: Verify user should not login with incorrect username and correct password
    When I enter incorrect username in username field "<username>"
    And I enter correct password in password field "<password>"
    And I click on Login in feature
    Then I should be not login to system and verify errorMessages
    Examples:
      | username      | password             |
      | jackstas      | SuperSecretPassword! |
      | monikablack   | SuperSecretPassword! |
      | romankurhajec | SuperSecretPassword! |


  Scenario Outline: Verify user can log in on Form Authentication and logout
    Given I am on the internet herokuapp home page
    When I click on Form authentication feature
    And I enter correct username in username fields "<username>"
    And I enter correct password in password fields "<password>"
    And I click on Login in feature
    Then I should be on Login successfully and logout successfully

    Examples:
      | username | password             |
      | tomsmith | SuperSecretPassword! |


