package lv.rvt;

public class Main {

    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);  // Initial balance

        card.eatAffordably();  // Deduct 2.60
        System.out.println(card);  // After eatAffordably

        card.eatHeartily();  // Deduct 4.60
        card.eatAffordably();  // Deduct another 2.60
        System.out.println(card);  // After eatHeartily and second eatAffordably
    }
}

