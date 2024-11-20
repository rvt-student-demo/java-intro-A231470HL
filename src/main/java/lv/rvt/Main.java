package lv.rvt;

public class Main {
    public static void main(String[] args) {
        // Create the cards for Paul and Matt
        PaymentCard paulsCard = new PaymentCard(20); // Paul's card starts with 20 euros
        PaymentCard mattsCard = new PaymentCard(30); // Matt's card starts with 30 euros

        // Paul eats heartily (4.60 euros deducted)
        paulsCard.eatHeartily();
        // Matt eats affordably (2.60 euros deducted)
        mattsCard.eatAffordably();

        // Print the cards' values after these actions
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        // Paul tops up 20 euros
        paulsCard.addMoney(20);

        // Matt eats heartily (4.60 euros deducted)
        mattsCard.eatHeartily();

        // Print the cards' values after these actions
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        // Paul eats affordably twice (2.60 euros deducted each time)
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        // Matt tops up 50 euros
        mattsCard.addMoney(50);

        // Print the cards' values after these actions
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}
