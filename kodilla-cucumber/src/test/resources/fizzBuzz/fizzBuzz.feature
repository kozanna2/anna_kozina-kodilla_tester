Feature:  Is it FizzBuzz?

  Scenario Outline: Number is Fizzbuzz

    Given number is <value>
    When  I ask whether it's Fizz or Buzz or FizzBuzz
    Then  I should be told <answer>
    Examples:
      | value | answer |
      | 3 | "Fizz"|
      | 5 | "Buzz"|
      | 7 | "None"|
      | 15 | "FizzBuzz"|
      | 50 | "Buzz"|
      | 18 | "Fizz"|