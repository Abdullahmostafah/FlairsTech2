Feature: Users should be able to signup with their information

  @Test1 @smoke
  Scenario Outline: User register with their info
    Given User goes to home page
    And User closes popup
    And User clicks on Account
    And User clicks on sign in

    When User enters email address "<email>"
    And User clicks on first continue
    And User fills password "<password>"
    And User fills confirm password "<password>"
    And User clicks on second continue
    And User enters first name "<firstname>" and last name "<lastname>" and "<phonenumber>"
    And User clicks on third continue
    And User selects gender "<gender>"
    And User selects birthdate "<birthdate>"
    And User accepts terms and conditions
    And User clicks on fourth continue

    Then User logout from his account

    Examples:
      | email | password |  firstname | lastname | phonenumber | gender | birthdate |
      | abdullahtest03@hotmail.com | @Bdullah1234 | Abdullah | Mostafa | 01223344556 | M | 02-27-1992 |

# Change email to be able to signup successfully because this is used before