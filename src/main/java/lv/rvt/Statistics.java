package lv.rvt;

public class Statistics {
    private int total;

    public Statistics() {
        total = 0;
    }


    public void addNumber(int number) {
        total += number;
    }

    
    public int getSum() {
        return total;
    }
}