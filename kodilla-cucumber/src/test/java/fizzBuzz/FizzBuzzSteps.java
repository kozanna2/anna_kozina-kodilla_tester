package fizzBuzz;

import FizzBuzz.FizzBuzz;
import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {
    private int value;
    private String answer;
    public FizzBuzzSteps(){
        Given("number is {int}", (Integer int1) -> {
            this.value = int1;
        });

        When("I ask whether it's Fizz or Buzz or FizzBuzz", () -> {
          FizzBuzz fizzBuzz = new FizzBuzz();
          this.answer = fizzBuzz.fizzBuzz(this.value);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }

}
