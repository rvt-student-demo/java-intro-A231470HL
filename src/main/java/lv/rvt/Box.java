package lv.rvt;

public class Box {
    
    private final double width;
    private final double height;
    private final double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * (width * height + width * length + height * length);
    }
    private double faceArea() {
        return width * height;
    }
    private double topArea() {
        return width * length;
    }
    private double sideArea() {
        return height * length;
    }
    public double length() {
        return length;
    }

    public double height() {
        return height;
    }

    public double width() {
        return width;
    }
}
