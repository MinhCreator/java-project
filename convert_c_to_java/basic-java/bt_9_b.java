
import java.util.Scanner;

public class bt_9_b {
    public static void main(String[] args) {
        float x, y;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real number x and y: ");
        x = sc.nextFloat();
        y = sc.nextFloat();

        double numerator = Math.pow(Math.E, x + y) + Math.log(Math.abs(Math.pow(x, 2) - y) + 5);
        double denominator = Math.cos(x + y) - Math.sin(x) + 3;

        System.out.print("g(x, y) = " + numerator / denominator);
    }
}