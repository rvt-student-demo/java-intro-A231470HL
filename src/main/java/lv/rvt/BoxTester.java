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

        Box smallBox = new Box(2.0, 3.0, 4.0);
        Box largeBox = new Box(5.0, 6.0, 7.0);
        Box mediumBox = new Box(4.0, 5.0, 6.0);

        System.out.println("Does small box nest inside large box? " + smallBox.nests(largeBox));  // true
        System.out.println("Does small box nest inside medium box? " + smallBox.nests(mediumBox));  // true
        System.out.println("Does medium box nest inside large box? " + mediumBox.nests(largeBox));  // true
        System.out.println("Does large box nest inside small box? " + largeBox.nests(smallBox));  // false
    }
}
