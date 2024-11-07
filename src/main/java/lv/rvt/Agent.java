package lv.rvt;

public class Agent {
    private String name;
    private String lastname;

    public Agent (String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }
    @Override
    public String toString() {
        return "My name is " + lastname + ", " + name + " " + lastname;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Agent bond = new Agent("James", "Bond");
        System.out.println(bond);  // Output: My name is Bond, James Bond

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);  // Output: My name is Bond, Ionic Bond
    }
}
