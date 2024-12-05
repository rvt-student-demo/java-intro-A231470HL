package lv.rvt;



public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();

        for (int i = 0; i < 500; i++) {
            System.out.println(timer);
            timer.advance();
        }
    }
}
