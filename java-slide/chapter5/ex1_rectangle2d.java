public class ex1_rectangle2d {
    
    private point2d vertex1;
    private point2d vertex2;
    private point2d vertex3;

    public ex1_rectangle2d(point2d v1, point2d v2, point2d v3) {
        this.vertex1 = v1;
        this.vertex2 = v2;
        this.vertex3 = v3;
    }

    public void details() {
        System.out.println("Rectangle from " + "vertex1: " + (vertex1.getX() + ", " + vertex1.getY()) + "\n vertex2: "
                + (vertex2.getX() + ", " + vertex2.getY()) + "\n vertex3: " + (vertex3.getX() + ", " + vertex3.getY()));
    }

    public double area() {
        return (vertex2.getX() - vertex1.getX()) * (vertex3.getY() - vertex1.getY())
                - (vertex3.getX() - vertex1.getX()) * (vertex2.getY() - vertex1.getY());
    }

    public double perimeter() {
        return (vertex2.getX() - vertex1.getX()) * 2 + (vertex3.getY() - vertex1.getY()) * 2;
    }

    public void display() {
        System.out.println("Rectangle from " + "vertex1: " + (vertex1.getX() + ", " + vertex1.getY()) + "\n vertex2: "
                + (vertex2.getX() + ", " + vertex2.getY()) + "\n vertex3: " + (vertex3.getX() + ", " + vertex3.getY()));
    }
    
    public static void main(String[] args) {
        
    }
}