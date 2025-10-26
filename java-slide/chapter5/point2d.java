class point2d {
    private double x;
    private double y;

    public point2d(double xVal, double yVal) {
        this.x = xVal;
        this.y = yVal;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}

class Line2D {
    private point2d p1;
    private point2d p2;

    public Line2D(point2d head, point2d tail) {
        this.p1 = head;
        this.p2 = tail;
    }

    
    public void details() {
        System.out.println("Line from " + "head: " + (p1.getX() + ", " + p1.getY()) + "\n tail: "
                + (p2.getX() + ", " + p2.getY()));
    }
    
    public boolean isParallel(Line2D line) {
        double slope1 = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        double slope2 = (line.p2.getY() - line.p1.getY()) / (line.p2.getX() - line.p1.getX());
        return slope1 == slope2;
    }

    public double length() {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
}