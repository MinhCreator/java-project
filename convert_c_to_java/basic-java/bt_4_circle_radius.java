import java.util.* ;

public class bt_4_circle_radius {
    public static void main(String[] args) {
        float radius, area, L;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        radius = sc.nextFloat();

        area = radius * radius * (float) Math.PI;
        L = 2 * (float) Math.PI * radius;

        System.out.println("Area of circle and perimeter : " + area + ", " + L);
    }
}