Feature: Prevent users from taking out more money than their wallet contains

  Scenario Outline: User tries to take out more money than their balance
    Given there is <deposit> in my wallet
    When I withdraw <withdraw>
    Then nothing should be dispensed
    And I should be told <feedback>
    Examples:
      | deposit | withdraw | feedback                                   |
      | 200     | 300      | "You don't have enough money in my wallet" |
      | 200     | 201      | "You don't have enough money in my wallet" |
      | 0       | 100      | "You don't have enough money in my wallet" |