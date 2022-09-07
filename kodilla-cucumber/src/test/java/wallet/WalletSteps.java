package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);


    public WalletSteps() {

        Given("I have deposited {int} in my wallet", (Integer int1) -> {
            wallet.deposit(int1);
        });

        When("I request {int}", (Integer int1) -> {
            cashier.withdrawal(wallet, int1);
        });

        Then("{int} should be dispensed", (Integer int1) -> {
            Assert.assertEquals(int1, cashSlot.getContest());
        });
        Then("the balance of my wallet should be {int}", (Integer int1) -> {
            Assert.assertEquals("Incorrect balance.", int1, wallet.getBalance());
        });

        Given("there is {int} in my wallet", (Integer int1) -> {
            wallet.deposit(int1);
        });

        When("I withdraw {int}", (Integer int1) -> {
            cashier.withdrawal(wallet, int1);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals((Integer) 0, cashSlot.getContest());
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, "You don't have enough money in my wallet");
        });

        When("I check the balance of my wallet", () -> {
            wallet.getBalance();
            Assert.assertNotNull(wallet.getBalance());
        });

        Then("I should see that the balance is {int}", (Integer int1) -> {
            Assert.assertEquals(int1, wallet.getBalance());
        });


    }
}

