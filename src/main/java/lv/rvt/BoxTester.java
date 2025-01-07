package lv.rvt;

public class BoxTester {

    public static void main(String[] args) {
        Box box1 = new Box(2.5, 5.0, 6.0);
        System.out.println("Box 1 Area: " + box1.area() + " Volume: " + box1.volume());

        Box box2 = new Box(3.0);
        System.out.println("Box 2 Area: " + box2.area() + " Volume: " + box2.volume());


    }
    
}
