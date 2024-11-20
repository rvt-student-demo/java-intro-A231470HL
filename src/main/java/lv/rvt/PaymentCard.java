package lv.rvt;

public class PaymentCard {
    private double balance;

    // Constructor that initializes the card with a specific balance
    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to reduce balance by 2.60 euros for affordable eating
    public void eatAffordably() {
        this.balance -= 2.60;
    }

    // Method to reduce balance by 4.60 euros for hearty eating
    public void eatHeartily() {
        this.balance -= 4.60;
    }

    // Method to return a string representation of the card's balance
    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
