package lv.rvt;

public class Main {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(10);
        System.out.println(card);

        card.addMoney(15);  // Add 15 euros
        System.out.println(card);

        card.addMoney(10);  // Add 10 euros
        System.out.println(card);

        card.addMoney(200);  // Add 200 euros (will cap the balance at 150)
        System.out.println(card);
    }
}

