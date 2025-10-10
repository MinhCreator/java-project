
import java.util.Scanner;

public class bt_10_trapezium {
    public static void main(String[] args) {
        float large_bottom, small_bottom, height_line;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the large_bottom, small_bottom, height_line: ");
        large_bottom = sc.nextFloat();
        small_bottom = sc.nextFloat();
        height_line = sc.nextFloat();

        System.out.print("Area of the trapezium: " + ((large_bottom + small_bottom) * height_line) / 2);
        
    }
}