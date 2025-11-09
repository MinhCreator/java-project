abstract class Shape {
    public abstract double area();

    public abstract double perimeter();

    public abstract void draw();

    @Override
    public String toString() {
        return "the area is " + area();
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public void draw() {
        System.out.println("draw a square");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("draw a circle");
    }
}

class EquilateralTriangle extends Shape {
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public double perimeter() {
        return 3 * side;
    }

    @Override
    public void draw() {
        System.out.println("draw a triangle");
    }
}


public class ex_6_1 {
    public static void main(String[] args) {
    }
}