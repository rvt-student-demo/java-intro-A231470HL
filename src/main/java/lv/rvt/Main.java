package lv.rvt;

public class Main {

    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(5);
        System.out.println(card);

        card.eatHeartily();  // First attempt to eat heartily
        System.out.println(card);

        card.eatHeartily();  // Second attempt to eat heartily
        System.out.println(card);
    }
}

