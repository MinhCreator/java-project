import java.util.Scanner;

public class bt_6_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float length, width;

        System.out.println("Enter l and w of the rectangle: ");
        length = sc.nextFloat();
        width = sc.nextFloat();

        float D = length * width;
        float C = 2 * (length + width);

        System.out.println("Area and perimeter of rectangle: " + D + " " + C);
    }
}