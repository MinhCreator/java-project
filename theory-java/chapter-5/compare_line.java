class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}

class Line implements Comparable<Line> {
    private Point p1, p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
    
    @Override
    public int compareTo(Line other) {
        if (this.getLength() > other.getLength())
            return 1;
        else if (this.getLength() < other.getLength())
            return -1;
        else
            return 0;
    }

}


class rectangle implements Comparable<rectangle> {
    private double width, height;

    public rectangle(double widths, double heights) {
        this.width = widths;
        this.height = heights;
    }

    public double getArea() {
        return width * height;
    }
    
    public double getPerimeter() {
        return 2 * (width + height);
    }
    
    @Override
    public int compareTo(rectangle other) {
        if (this.getArea() > other.getArea())
            return 1;
        else if (this.getArea() < other.getArea())
            return -1;
        else
            return 0;
    }

    
    public int compareToPerimeter(rectangle other) {
        if (this.getPerimeter() > other.getPerimeter())
            return 1;
        else if (this.getPerimeter() < other.getPerimeter())
            return -1;
        else
            return 0;
    }
}


public class compare_line {
    public static void main(String[] args) {
        
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p1, p2);
        System.out.println(l1.compareTo(l2));

    }
}