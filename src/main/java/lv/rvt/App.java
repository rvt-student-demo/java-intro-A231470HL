package lv.rvt;

public class App {

    public static void main(String[] args) {
        Person ada = new Person("Ada");
        Person antti = new Person("Antti");
        Person martin = new Person("Martin");
        Product Banana = new Product("Banana", 1.1, 13);

        ada.printPerson();
        antti.printPerson();
        martin.printPerson();
        Banana.printProduct();
    }

}


