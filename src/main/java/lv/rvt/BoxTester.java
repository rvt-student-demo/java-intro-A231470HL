package lv.rvt;

public class BoxTester {
    public static void main(String[] args) {
        
        Box originalBox = new Box(2.5, 5.0, 6.0);
        System.out.println("Original Box: ");
        System.out.println("Area: " + originalBox.area() + " volume: " + originalBox.volume());
        System.out.println("length: " + originalBox.length() + " height: " + originalBox.height() + " width: " + originalBox.width());

        Box copiedBox = new Box(originalBox);
        System.out.println("\nCopied Box (Same as Original): ");
        System.out.println("Area: " + copiedBox.area() + " volume: " + copiedBox.volume());

        Box biggerBox = originalBox.biggerBox();
        System.out.println("\nBigger Box (25% larger): ");
        System.out.println("Area: " + biggerBox.area() + " volume: " + biggerBox.volume());

    }
}
