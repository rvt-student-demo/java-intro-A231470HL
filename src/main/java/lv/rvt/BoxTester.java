package lv.rvt;

public class BoxTester {
    public static void main(String[] args) {
        Box box1 = new Box(2.5, 5.0, 6.0);
        System.out.println("Box 1 Area: " + box1.area() + " Volume: " + box1.volume());

        Box box2 = new Box(3.0);
        System.out.println("Box 2 Area: " + box2.area() + " Volume: " + box2.volume());

        Box box3 = new Box(2.5, 5.0, 6.0);
        System.out.println("Box 3 (Copy of Box 1) Area: " + box3.area() + " Volume: " + box3.volume());

        System.out.println("Box 1 - Length: " + box1.length() + " Height: " + box1.height() + " Width: " + box1.width());
        
        System.out.println("Box 3 - Length: " + box3.length() + " Height: " + box3.height() + " Width: " + box3.width());
    }
}
