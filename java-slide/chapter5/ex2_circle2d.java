import java.awt.Color;

public class ex2_circle2d {

    private double radius;
    private Color color;
    private point2d center;

    public ex2_circle2d(double radius, Color color, point2d center) {
        this.radius = radius;
        this.color = color;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public point2d getCenter() {
        return center;
    }

    public void setCenter(point2d center) {
        this.center = center;
    }
    


    public static void main(String[] args) {
 
    }
}