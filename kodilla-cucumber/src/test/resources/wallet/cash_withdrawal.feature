Feature: Wallet operations

  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited <deposit> in my wallet
    When I request <withdraw>
    Then <cash> should be dispensed
    And the balance of my wallet should be <balance>
    Examples:
      | deposit | withdraw | cash | balance |
      | 200     | 100      | 100  | 100     |
      | 1500    | 1500     | 1500 | 0       |
      | 1000    | 600      | 600  | 400     |
      | 0       | 0        | 0    | 0       |

  Scenario Outline: Failed withdrawal attempt
    Given I have deposited <deposit> in my wallet
    When I request <withdraw>
    Then <cash> should be dispensed
    And the balance of my wallet should be <balance>
    Examples:
      | deposit | withdraw | cash | balance |
      | 100     | 300      | 0    | 100     |
      | 0       | 200      | 0    | 0       |
      | 200     | 201      | 0    | 200     |
