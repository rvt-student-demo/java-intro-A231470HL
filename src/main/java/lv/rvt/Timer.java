package lv.rvt;

public class Timer {
    private int hundredths;
    private int seconds;

    public Timer() {
        this.hundredths = 0;
        this.seconds = 0;
    }

    public String toString() {

        return String.format("%02d:%02d", seconds, hundredths);
    }

    public void advance() {
        hundredths++;
        if (hundredths == 100) {
            hundredths = 0;
            seconds++;
            if (seconds == 60) {
                seconds = 0;
            }
        }
    }
}