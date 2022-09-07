package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdrawal(Wallet wallet, int amount) {
        if (amount <= wallet.getBalance()) {
            cashSlot.dispense(amount);
            wallet.debit(amount);
        } else {
            cashSlot.dispense(0);
            wallet.debit(0);
            System.out.println("You do not have sufficient funds in your account.");
        }
    }
}
