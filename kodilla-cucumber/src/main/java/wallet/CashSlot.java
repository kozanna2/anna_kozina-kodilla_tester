package wallet;

public class CashSlot {
    private Integer contest;

    public Integer getContest() {
        return contest;
    }
    public void dispense(int amount) {
        this.contest = amount;
    }
}
