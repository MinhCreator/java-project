import java.util.Scanner;

public class bt_5_volume_cube {
    public static void main(String[] args) {
        float radius, area, volume;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");

        radius = sc.nextFloat();

        volume = 4 * (float) (Math.PI * Math.PI * Math.PI) / 3;
        area = 4 * (float) Math.PI * radius * radius;

        System.out.println("the volume and area of cube: " + volume + " " + area);
    }
}
