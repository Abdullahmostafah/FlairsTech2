Feature: User could login Successfully to their accounts , shopping and add selected items to the cart

@Test2 @smoke
  Scenario Outline: User could login with valid data successfully
    Given User goes to home page
    And User clicks on Account
    And User clicks on sign in
    And User enters email address "<email>"
    And User clicks on first continue
    And User fills password "<password>"
    And User clicks on fifth continue

    Then User goes to home page
    And User hovers to SuperMarket
    And User selects Bakery
    And User adds first item to the cart "TODO"
    And User adds second item to the cart "Lino"
    And User goes to Cart page

    Then User checks for items availability
    And User check for price accuracy

  #Note that when automating for the second time , items are removed from the cart
  #Note that prices often change periodically so adjust the price with newly one
  #Note that sleep time needs to be increased

    Examples:
      | email | password |
      | abdullah29205@hotmail.com | @Bdullah1234 |

  #Change email address with newly signed up ones