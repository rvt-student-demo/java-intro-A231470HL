package lv.rvt;

public class Main {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(10);
        System.out.println("Paul: " + card);

        card.addMoney(-15);  // Attempt to add a negative amount
        System.out.println("Paul: " + card);
    }
}

