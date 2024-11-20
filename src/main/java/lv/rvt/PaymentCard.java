package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to reduce balance by 2.60 euros for affordable eating
    public void eatAffordably() {
        // Only deduct if there's enough balance
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    // Method to reduce balance by 4.60 euros for hearty eating
    public void eatHeartily() {
        // Only deduct if there's enough balance
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }

    // Method to return a string representation of the card's balance
    @Override
    public String toString() {
        return String.format("The card has a balance of %.2f euros", this.balance);
    }
}
