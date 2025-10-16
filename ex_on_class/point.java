class point {
    private double x, y;
    private double x2, y2;
    public double a, b;

    public void init_point(double xVal, double yVal, double xVal2, double yVal2) {

        this.x = xVal;
        this.y = yVal;
        this.x2 = xVal2;
        this.y2 = yVal2;
        double a_parameter = (y2 - y) / (x2 - x);    
        double b_parameter = y - (a_parameter * x);
        this.a = a_parameter;
        this.b = b_parameter;

    }

    public double get_a() {
        return a;
    }
    
    public double get_b() {
        return b;
    }

    public static void main(String[] args) {

        point l1 = new point();
        point l2 = new point();
        l1.x = 2;
        l1.y = 4;
        l1.x2 = 7;
        l1.y2 = 5;

        l2.x = 3;
        l2.y = 6;
        l2.x2 = 1;
        l2.y2 = 9;


        if (l1.a == l2.a && l2.b != l1.b) {
            System.out.println("is Parallel");
        }
        else System.out.println("isn't Parallel");

    }
}