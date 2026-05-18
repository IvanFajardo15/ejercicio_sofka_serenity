Feature: Purchase on DemoBlaze page

  Scenario Outline: Successful purchase on the website
    Given As a demoblaze user i was on the website
    When i add products to the cart
    And i complete the purchase form
    Then i can see the <message> on screen
    Examples:
      | message                      |
      | Thank you for your purchase! |