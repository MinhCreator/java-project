
import java.util.Scanner;

public class bt_8_b {
    public static void main(String[] args) {
    
        float x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        x = sc.nextFloat();

        double tu = Math.pow(x, 3) + (Math.log(Math.abs(x - 3) + 2) / Math.log(5));
        // System.out.println(tu);
        double mau = Math.pow(Math.atan(x - 5), 2) + 1;
        // double mau2 = Math.atan(x - 5) * Math.atan(x - 5) + 1;

        System.out.print("g(x) = " + tu / mau);
    }
}